package typings.mz.cryptoMod

import typings.mz.mzStrings.base64
import typings.mz.mzStrings.compressed
import typings.mz.mzStrings.hex
import typings.mz.mzStrings.hybrid
import typings.mz.mzStrings.latin1
import typings.mz.mzStrings.uncompressed
import typings.node.Buffer
import typings.node.cryptoMod.BinaryLike
import typings.node.cryptoMod.HexBase64Latin1Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "ECDH")
@js.native
class ECDH protected ()
  extends typings.node.cryptoMod.ECDH

/* static members */
@JSImport("mz/crypto", "ECDH")
@js.native
object ECDH extends js.Object {
  def convertKey(key: BinaryLike, curve: String): Buffer | String = js.native
  def convertKey(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: compressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: hybrid
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: uncompressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: compressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: hybrid
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: uncompressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: compressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: hybrid
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: uncompressed
  ): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: base64): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: hex): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: latin1): Buffer | String = js.native
}

