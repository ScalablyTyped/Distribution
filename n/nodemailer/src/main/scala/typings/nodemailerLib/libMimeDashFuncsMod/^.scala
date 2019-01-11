package typings
package nodemailerLib.libMimeDashFuncsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/mime-funcs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def buildHeaderParam(key: java.lang.String, data: java.lang.String): js.Array[nodemailerLib.libMimeDashFuncsMod.ParsedHeaderParam] = js.native
  def buildHeaderParam(key: java.lang.String, data: java.lang.String, maxLength: scala.Double): js.Array[nodemailerLib.libMimeDashFuncsMod.ParsedHeaderParam] = js.native
  def buildHeaderParam(key: java.lang.String, data: nodeLib.Buffer): js.Array[nodemailerLib.libMimeDashFuncsMod.ParsedHeaderParam] = js.native
  def buildHeaderParam(key: java.lang.String, data: nodeLib.Buffer, maxLength: scala.Double): js.Array[nodemailerLib.libMimeDashFuncsMod.ParsedHeaderParam] = js.native
  def buildHeaderValue(structured: nodemailerLib.libMimeDashFuncsMod.HeaderValue): java.lang.String = js.native
  def detectExtension(mimeType: java.lang.String): java.lang.String = js.native
  def detectMimeType(extension: java.lang.String): java.lang.String = js.native
  def encodeURICharComponent(chr: java.lang.String): java.lang.String = js.native
  def encodeWord(data: java.lang.String): java.lang.String = js.native
  def encodeWord(data: nodeLib.Buffer): java.lang.String = js.native
  @JSName("encodeWord")
  def encodeWord_B(data: java.lang.String, mimeWordEncoding: nodemailerLib.nodemailerLibStrings.B): java.lang.String = js.native
  @JSName("encodeWord")
  def encodeWord_B(
    data: java.lang.String,
    mimeWordEncoding: nodemailerLib.nodemailerLibStrings.B,
    maxLength: scala.Double
  ): java.lang.String = js.native
  @JSName("encodeWord")
  def encodeWord_B(data: nodeLib.Buffer, mimeWordEncoding: nodemailerLib.nodemailerLibStrings.B): java.lang.String = js.native
  @JSName("encodeWord")
  def encodeWord_B(
    data: nodeLib.Buffer,
    mimeWordEncoding: nodemailerLib.nodemailerLibStrings.B,
    maxLength: scala.Double
  ): java.lang.String = js.native
  @JSName("encodeWord")
  def encodeWord_Q(data: java.lang.String, mimeWordEncoding: nodemailerLib.nodemailerLibStrings.Q): java.lang.String = js.native
  @JSName("encodeWord")
  def encodeWord_Q(
    data: java.lang.String,
    mimeWordEncoding: nodemailerLib.nodemailerLibStrings.Q,
    maxLength: scala.Double
  ): java.lang.String = js.native
  @JSName("encodeWord")
  def encodeWord_Q(data: nodeLib.Buffer, mimeWordEncoding: nodemailerLib.nodemailerLibStrings.Q): java.lang.String = js.native
  @JSName("encodeWord")
  def encodeWord_Q(
    data: nodeLib.Buffer,
    mimeWordEncoding: nodemailerLib.nodemailerLibStrings.Q,
    maxLength: scala.Double
  ): java.lang.String = js.native
  def encodeWords(value: java.lang.String): java.lang.String = js.native
  @JSName("encodeWords")
  def encodeWords_B(value: java.lang.String, mimeWordEncoding: nodemailerLib.nodemailerLibStrings.B): java.lang.String = js.native
  @JSName("encodeWords")
  def encodeWords_B(
    value: java.lang.String,
    mimeWordEncoding: nodemailerLib.nodemailerLibStrings.B,
    maxLength: scala.Double
  ): java.lang.String = js.native
  @JSName("encodeWords")
  def encodeWords_Q(value: java.lang.String, mimeWordEncoding: nodemailerLib.nodemailerLibStrings.Q): java.lang.String = js.native
  @JSName("encodeWords")
  def encodeWords_Q(
    value: java.lang.String,
    mimeWordEncoding: nodemailerLib.nodemailerLibStrings.Q,
    maxLength: scala.Double
  ): java.lang.String = js.native
  def foldLines(str: java.lang.String): java.lang.String = js.native
  def foldLines(str: java.lang.String, lineLength: scala.Double): java.lang.String = js.native
  def foldLines(str: java.lang.String, lineLength: scala.Double, afterSpace: scala.Boolean): java.lang.String = js.native
  def hasLongerLines(str: java.lang.String, lineLength: scala.Double): scala.Boolean = js.native
  def isPlainText(value: java.lang.String): scala.Boolean = js.native
  def parseHeaderValue(str: java.lang.String): nodemailerLib.libMimeDashFuncsMod.ParsedHeaderValue = js.native
  def safeEncodeURIComponent(str: java.lang.String): java.lang.String = js.native
  def splitMimeEncodedString(str: java.lang.String): js.Array[java.lang.String] = js.native
  def splitMimeEncodedString(str: java.lang.String, maxlen: scala.Double): js.Array[java.lang.String] = js.native
}

