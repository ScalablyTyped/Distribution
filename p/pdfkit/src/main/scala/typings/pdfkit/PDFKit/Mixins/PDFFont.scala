package typings.pdfkit.PDFKit.Mixins

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFFont extends js.Object {
  def currentLineHeight(): Double = js.native
  def currentLineHeight(includeGap: Boolean): Double = js.native
  def font(buffer: Buffer): this.type = js.native
  def font(src: String): this.type = js.native
  def font(src: String, family: String): this.type = js.native
  def font(src: String, family: String, size: Double): this.type = js.native
  def fontSize(size: Double): this.type = js.native
  def registerFont(name: String): this.type = js.native
  def registerFont(name: String, src: String): this.type = js.native
  def registerFont(name: String, src: String, family: String): this.type = js.native
}

