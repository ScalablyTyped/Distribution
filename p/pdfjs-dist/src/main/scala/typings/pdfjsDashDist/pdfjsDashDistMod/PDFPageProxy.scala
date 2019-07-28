package typings.pdfjsDashDist.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFPageProxy extends js.Object {
  /**
    * Page number of the page.  First page is 1.
    **/
  var pageNumber: Double = js.native
  /**
    * The reference that points to this page.
    **/
  var ref: PDFRef = js.native
  /**
    * The number of degrees the page is rotated clockwise.
    **/
  var rotate: Double = js.native
  /**
    * @return An array of the visible portion of the PDF page in the user space units - [x1, y1, x2, y2].
    **/
  var view: js.Array[Double] = js.native
  /**
    * marked as future feature
    **/
  //getOperationList(): PDFPromise<>;
  /**
    * Destroyes resources allocated by the page.
    **/
  def destroy(): Unit = js.native
  /**
    * A promise that is resolved with an array of the annotation objects.
    **/
  def getAnnotations(): PDFPromise[PDFAnnotations] = js.native
  /**
    * A promise that is resolved with the string that is the text content frm the page.
    **/
  def getTextContent(): PDFPromise[TextContent] = js.native
  /**
    * @param scale The desired scale of the viewport.
    * @param rotate Degrees to rotate the viewport.  If omitted this defaults to the page rotation.
    * @param dontFlip
    * @return
    **/
  def getViewport(scale: Double): PDFPageViewport = js.native
  def getViewport(scale: Double, rotate: Double): PDFPageViewport = js.native
  def getViewport(scale: Double, rotate: Double, dontFlip: Boolean): PDFPageViewport = js.native
  /**
    * Begins the process of rendering a page to the desired context.
    * @param params Rendering options.
    * @return An extended promise that is resolved when the page finishes rendering.
    **/
  def render(params: PDFRenderParams): PDFRenderTask = js.native
}

