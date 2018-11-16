package typings
package pdfkitLib.PDFKitNs.MixinsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFText[TDocument] extends js.Object {
  def heightOfString(text: java.lang.String): scala.Double = js.native
  def heightOfString(text: java.lang.String, options: TextOptions): scala.Double = js.native
  def lineGap(lineGap: scala.Double): TDocument = js.native
  def list(list: js.Array[java.lang.String | _]): TDocument = js.native
  def list(list: js.Array[java.lang.String | _], options: TextOptions): TDocument = js.native
  def list(list: js.Array[java.lang.String | _], x: scala.Double): TDocument = js.native
  def list(list: js.Array[java.lang.String | _], x: scala.Double, y: scala.Double): TDocument = js.native
  def list(list: js.Array[java.lang.String | _], x: scala.Double, y: scala.Double, options: TextOptions): TDocument = js.native
  def moveDown(): TDocument = js.native
  def moveDown(line: scala.Double): TDocument = js.native
  def moveUp(): TDocument = js.native
  def moveUp(line: scala.Double): TDocument = js.native
  def text(text: java.lang.String): TDocument = js.native
  def text(text: java.lang.String, options: TextOptions): TDocument = js.native
  def text(text: java.lang.String, x: scala.Double): TDocument = js.native
  def text(text: java.lang.String, x: scala.Double, y: scala.Double): TDocument = js.native
  def text(text: java.lang.String, x: scala.Double, y: scala.Double, options: TextOptions): TDocument = js.native
  def widthOfString(text: java.lang.String): scala.Double = js.native
  def widthOfString(text: java.lang.String, options: TextOptions): scala.Double = js.native
}

