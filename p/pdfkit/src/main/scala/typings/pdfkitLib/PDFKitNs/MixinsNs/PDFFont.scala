package typings
package pdfkitLib.PDFKitNs.MixinsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFFont[TDocument] extends js.Object {
  def currentLineHeight(): scala.Double = js.native
  def currentLineHeight(includeGap: scala.Boolean): scala.Double = js.native
  def font(buffer: nodeLib.Buffer): TDocument = js.native
  def font(src: java.lang.String): TDocument = js.native
  def font(src: java.lang.String, family: java.lang.String): TDocument = js.native
  def font(src: java.lang.String, family: java.lang.String, size: scala.Double): TDocument = js.native
  def fontSize(size: scala.Double): TDocument = js.native
  def registerFont(name: java.lang.String): TDocument = js.native
  def registerFont(name: java.lang.String, src: java.lang.String): TDocument = js.native
  def registerFont(name: java.lang.String, src: java.lang.String, family: java.lang.String): TDocument = js.native
}

