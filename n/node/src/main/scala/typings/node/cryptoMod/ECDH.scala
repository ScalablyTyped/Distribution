package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.NodeJS.ArrayBufferView
import typings.node.nodeStrings.base64
import typings.node.nodeStrings.compressed
import typings.node.nodeStrings.hex
import typings.node.nodeStrings.hybrid
import typings.node.nodeStrings.latin1
import typings.node.nodeStrings.uncompressed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "ECDH")
@js.native
/* private */ class ECDH () extends StObject {
  
  def computeSecret(other_public_key: String, input_encoding: HexBase64Latin1Encoding): Buffer = js.native
  def computeSecret(
    other_public_key: String,
    input_encoding: HexBase64Latin1Encoding,
    output_encoding: HexBase64Latin1Encoding
  ): String = js.native
  def computeSecret(other_public_key: ArrayBufferView): Buffer = js.native
  def computeSecret(other_public_key: ArrayBufferView, output_encoding: HexBase64Latin1Encoding): String = js.native
  
  def generateKeys(): Buffer = js.native
  def generateKeys(encoding: HexBase64Latin1Encoding): String = js.native
  def generateKeys(encoding: HexBase64Latin1Encoding, format: ECDHKeyFormat): String = js.native
  
  def getPrivateKey(): Buffer = js.native
  def getPrivateKey(encoding: HexBase64Latin1Encoding): String = js.native
  
  def getPublicKey(): Buffer = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding): String = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding, format: ECDHKeyFormat): String = js.native
  
  def setPrivateKey(private_key: String, encoding: HexBase64Latin1Encoding): Unit = js.native
  def setPrivateKey(private_key: ArrayBufferView): Unit = js.native
}
object ECDH {
  
  @JSImport("crypto", "ECDH")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def convertKey(key: BinaryLike, curve: String): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: base64, format: compressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: base64, format: hybrid): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: base64, format: uncompressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: hex, format: compressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: hex, format: hybrid): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: hex, format: uncompressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: latin1, format: compressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: latin1, format: hybrid): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: latin1, format: uncompressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: compressed
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: hybrid
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: uncompressed
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: compressed
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: hybrid
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: uncompressed
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: compressed
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: hybrid
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: uncompressed
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  
  inline def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: base64): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: base64): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  
  inline def convertKey_compressed(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: Unit, format: compressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey_compressed(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: Unit,
    format: compressed
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  
  inline def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: hex): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: hex): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  
  inline def convertKey_hybrid(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: Unit, format: hybrid): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey_hybrid(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: Unit,
    format: hybrid
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  
  inline def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: latin1): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: latin1): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  
  inline def convertKey_uncompressed(key: BinaryLike, curve: String, inputEncoding: Unit, outputEncoding: Unit, format: uncompressed): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
  inline def convertKey_uncompressed(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: Unit,
    format: uncompressed
  ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
}
