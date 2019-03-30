package typings
package mzLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "ECDH")
@js.native
class ECDH protected ()
  extends nodeLib.cryptoMod.ECDH

/* static members */
@JSImport("mz/crypto", "ECDH")
@js.native
object ECDH extends js.Object {
  def convertKey(key: nodeLib.cryptoMod.BinaryLike, curve: java.lang.String): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.base64,
    format: mzLib.mzLibStrings.compressed
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.base64,
    format: mzLib.mzLibStrings.hybrid
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.base64,
    format: mzLib.mzLibStrings.uncompressed
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.hex,
    format: mzLib.mzLibStrings.compressed
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.hex,
    format: mzLib.mzLibStrings.hybrid
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.hex,
    format: mzLib.mzLibStrings.uncompressed
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.latin1,
    format: mzLib.mzLibStrings.compressed
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.latin1,
    format: mzLib.mzLibStrings.hybrid
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.latin1,
    format: mzLib.mzLibStrings.uncompressed
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_base64(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.base64
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_hex(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.hex
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_latin1(
    key: nodeLib.cryptoMod.BinaryLike,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.latin1
  ): nodeLib.Buffer | java.lang.String = js.native
}

