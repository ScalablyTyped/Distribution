package typings
package pdfkitLib.PDFKitNs.MixinsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFImage[TDocument] extends js.Object {
  /**
    * Draw an image in PDFKit document.
    */
  def image(src: js.Any): TDocument = js.native
  def image(src: js.Any, options: ImageOption): TDocument = js.native
  def image(src: js.Any, x: scala.Double): TDocument = js.native
  def image(src: js.Any, x: scala.Double, y: scala.Double): TDocument = js.native
  def image(src: js.Any, x: scala.Double, y: scala.Double, options: ImageOption): TDocument = js.native
}

