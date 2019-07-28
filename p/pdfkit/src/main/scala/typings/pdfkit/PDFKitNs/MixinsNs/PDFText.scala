package typings.pdfkit.PDFKitNs.MixinsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFText[TDocument] extends js.Object {
  def heightOfString(text: String): Double = js.native
  def heightOfString(text: String, options: TextOptions): Double = js.native
  def lineGap(lineGap: Double): TDocument = js.native
  def list(list: js.Array[String | _]): TDocument = js.native
  def list(list: js.Array[String | _], options: TextOptions): TDocument = js.native
  def list(list: js.Array[String | _], x: Double): TDocument = js.native
  def list(list: js.Array[String | _], x: Double, y: Double): TDocument = js.native
  def list(list: js.Array[String | _], x: Double, y: Double, options: TextOptions): TDocument = js.native
  def moveDown(): TDocument = js.native
  def moveDown(line: Double): TDocument = js.native
  def moveUp(): TDocument = js.native
  def moveUp(line: Double): TDocument = js.native
  def text(text: String): TDocument = js.native
  def text(text: String, options: TextOptions): TDocument = js.native
  def text(text: String, x: Double): TDocument = js.native
  def text(text: String, x: Double, y: Double): TDocument = js.native
  def text(text: String, x: Double, y: Double, options: TextOptions): TDocument = js.native
  def widthOfString(text: String): Double = js.native
  def widthOfString(text: String, options: TextOptions): Double = js.native
}

