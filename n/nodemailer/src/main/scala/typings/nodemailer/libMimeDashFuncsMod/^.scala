package typings.nodemailer.libMimeDashFuncsMod

import typings.node.Buffer
import typings.nodemailer.nodemailerStrings.B
import typings.nodemailer.nodemailerStrings.Q
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/mime-funcs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def buildHeaderParam(key: String, data: String): js.Array[ParsedHeaderParam] = js.native
  def buildHeaderParam(key: String, data: String, maxLength: Double): js.Array[ParsedHeaderParam] = js.native
  def buildHeaderParam(key: String, data: Buffer): js.Array[ParsedHeaderParam] = js.native
  def buildHeaderParam(key: String, data: Buffer, maxLength: Double): js.Array[ParsedHeaderParam] = js.native
  def buildHeaderValue(structured: HeaderValue): String = js.native
  def detectExtension(mimeType: String): String = js.native
  def detectMimeType(extension: String): String = js.native
  def encodeURICharComponent(chr: String): String = js.native
  def encodeWord(data: String): String = js.native
  def encodeWord(data: Buffer): String = js.native
  @JSName("encodeWord")
  def encodeWord_B(data: String, mimeWordEncoding: B): String = js.native
  @JSName("encodeWord")
  def encodeWord_B(data: String, mimeWordEncoding: B, maxLength: Double): String = js.native
  @JSName("encodeWord")
  def encodeWord_B(data: Buffer, mimeWordEncoding: B): String = js.native
  @JSName("encodeWord")
  def encodeWord_B(data: Buffer, mimeWordEncoding: B, maxLength: Double): String = js.native
  @JSName("encodeWord")
  def encodeWord_Q(data: String, mimeWordEncoding: Q): String = js.native
  @JSName("encodeWord")
  def encodeWord_Q(data: String, mimeWordEncoding: Q, maxLength: Double): String = js.native
  @JSName("encodeWord")
  def encodeWord_Q(data: Buffer, mimeWordEncoding: Q): String = js.native
  @JSName("encodeWord")
  def encodeWord_Q(data: Buffer, mimeWordEncoding: Q, maxLength: Double): String = js.native
  def encodeWords(value: String): String = js.native
  @JSName("encodeWords")
  def encodeWords_B(value: String, mimeWordEncoding: B): String = js.native
  @JSName("encodeWords")
  def encodeWords_B(value: String, mimeWordEncoding: B, maxLength: Double): String = js.native
  @JSName("encodeWords")
  def encodeWords_Q(value: String, mimeWordEncoding: Q): String = js.native
  @JSName("encodeWords")
  def encodeWords_Q(value: String, mimeWordEncoding: Q, maxLength: Double): String = js.native
  def foldLines(str: String): String = js.native
  def foldLines(str: String, lineLength: Double): String = js.native
  def foldLines(str: String, lineLength: Double, afterSpace: Boolean): String = js.native
  def hasLongerLines(str: String, lineLength: Double): Boolean = js.native
  def isPlainText(value: String): Boolean = js.native
  def parseHeaderValue(str: String): ParsedHeaderValue = js.native
  def safeEncodeURIComponent(str: String): String = js.native
  def splitMimeEncodedString(str: String): js.Array[String] = js.native
  def splitMimeEncodedString(str: String, maxlen: Double): js.Array[String] = js.native
}

