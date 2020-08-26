package typings.pdfkit.PDFKit.Mixins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFText extends js.Object {
  def heightOfString(text: String): Double = js.native
  def heightOfString(text: String, options: TextOptions): Double = js.native
  def lineGap(lineGap: Double): this.type = js.native
  def list(list: js.Array[String | _]): this.type = js.native
  def list(list: js.Array[String | _], options: TextOptions): this.type = js.native
  def list(
    list: js.Array[String | _],
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    options: TextOptions
  ): this.type = js.native
  def list(list: js.Array[String | _], x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
  def list(list: js.Array[String | _], x: js.UndefOr[scala.Nothing], y: Double, options: TextOptions): this.type = js.native
  def list(list: js.Array[String | _], x: Double): this.type = js.native
  def list(list: js.Array[String | _], x: Double, y: js.UndefOr[scala.Nothing], options: TextOptions): this.type = js.native
  def list(list: js.Array[String | _], x: Double, y: Double): this.type = js.native
  def list(list: js.Array[String | _], x: Double, y: Double, options: TextOptions): this.type = js.native
  def moveDown(): this.type = js.native
  def moveDown(line: Double): this.type = js.native
  def moveUp(): this.type = js.native
  def moveUp(line: Double): this.type = js.native
  def text(text: String): this.type = js.native
  def text(text: String, options: TextOptions): this.type = js.native
  def text(text: String, x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], options: TextOptions): this.type = js.native
  def text(text: String, x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
  def text(text: String, x: js.UndefOr[scala.Nothing], y: Double, options: TextOptions): this.type = js.native
  def text(text: String, x: Double): this.type = js.native
  def text(text: String, x: Double, y: js.UndefOr[scala.Nothing], options: TextOptions): this.type = js.native
  def text(text: String, x: Double, y: Double): this.type = js.native
  def text(text: String, x: Double, y: Double, options: TextOptions): this.type = js.native
  def widthOfString(text: String): Double = js.native
  def widthOfString(text: String, options: TextOptions): Double = js.native
}

