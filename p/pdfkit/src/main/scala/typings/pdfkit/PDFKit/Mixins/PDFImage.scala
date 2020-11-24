package typings.pdfkit.PDFKit.Mixins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFImage extends js.Object {
  
  /**
    * Draw an image in PDFKit document.
    */
  def image(src: js.Any): this.type = js.native
  def image(src: js.Any, options: ImageOption): this.type = js.native
  def image(src: js.Any, x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], options: ImageOption): this.type = js.native
  def image(src: js.Any, x: js.UndefOr[scala.Nothing], y: Double): this.type = js.native
  def image(src: js.Any, x: js.UndefOr[scala.Nothing], y: Double, options: ImageOption): this.type = js.native
  def image(src: js.Any, x: Double): this.type = js.native
  def image(src: js.Any, x: Double, y: js.UndefOr[scala.Nothing], options: ImageOption): this.type = js.native
  def image(src: js.Any, x: Double, y: Double): this.type = js.native
  def image(src: js.Any, x: Double, y: Double, options: ImageOption): this.type = js.native
}
