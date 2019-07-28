package typings.pdfkit.PDFKitNs.MixinsNs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFFont[TDocument] extends js.Object {
  def currentLineHeight(): Double = js.native
  def currentLineHeight(includeGap: Boolean): Double = js.native
  def font(buffer: Buffer): TDocument = js.native
  def font(src: String): TDocument = js.native
  def font(src: String, family: String): TDocument = js.native
  def font(src: String, family: String, size: Double): TDocument = js.native
  def fontSize(size: Double): TDocument = js.native
  def registerFont(name: String): TDocument = js.native
  def registerFont(name: String, src: String): TDocument = js.native
  def registerFont(name: String, src: String, family: String): TDocument = js.native
}

