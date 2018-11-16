package typings
package mzLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "ECDH")
@js.native
class ECDH ()
  extends nodeLib.cryptoMod.ECDH

@JSImport("mz/crypto", "ECDH")
@js.native
object ECDH extends js.Object {
  def convertKey(
    key: java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.latin1 | mzLib.mzLibStrings.hex | mzLib.mzLibStrings.base64,
    format: mzLib.mzLibStrings.uncompressed | mzLib.mzLibStrings.compressed | mzLib.mzLibStrings.hybrid
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(key: java.lang.String, curve: java.lang.String): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: java.lang.String,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(key: nodeLib.Buffer, curve: java.lang.String): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.Buffer,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(key: nodeLib.NodeJSNs.TypedArray, curve: java.lang.String): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: nodeLib.NodeJSNs.TypedArray,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding
  ): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(key: stdLib.DataView, curve: java.lang.String): nodeLib.Buffer | java.lang.String = js.native
  def convertKey(
    key: stdLib.DataView,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_base64(
    key: java.lang.String,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.base64
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_base64(
    key: nodeLib.Buffer,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.base64
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_base64(
    key: nodeLib.NodeJSNs.TypedArray,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.base64
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_base64(
    key: stdLib.DataView,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.base64
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_hex(
    key: java.lang.String,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.hex
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_hex(
    key: nodeLib.Buffer,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.hex
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_hex(
    key: nodeLib.NodeJSNs.TypedArray,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.hex
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_hex(
    key: stdLib.DataView,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.hex
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_latin1(
    key: java.lang.String,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.latin1
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_latin1(
    key: nodeLib.Buffer,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.latin1
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_latin1(
    key: nodeLib.NodeJSNs.TypedArray,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.latin1
  ): nodeLib.Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_latin1(
    key: stdLib.DataView,
    curve: java.lang.String,
    inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    outputEncoding: mzLib.mzLibStrings.latin1
  ): nodeLib.Buffer | java.lang.String = js.native
}

