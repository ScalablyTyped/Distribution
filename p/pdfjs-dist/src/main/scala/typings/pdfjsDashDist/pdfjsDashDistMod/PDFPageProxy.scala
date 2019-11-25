package typings.pdfjsDashDist.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFPageProxy extends js.Object {
  /**
    * Page number of the page.  First page is 1.
    **/
  var pageNumber: Double
  /**
    * The reference that points to this page.
    **/
  var ref: PDFRef
  /**
    * The number of degrees the page is rotated clockwise.
    **/
  var rotate: Double
  /**
    * @return An array of the visible portion of the PDF page in the user space units - [x1, y1, x2, y2].
    **/
  var view: js.Array[Double]
  /**
    * marked as future feature
    **/
  //getOperationList(): PDFPromise<>;
  /**
    * Destroyes resources allocated by the page.
    **/
  def destroy(): Unit
  /**
    * A promise that is resolved with an array of the annotation objects.
    **/
  def getAnnotations(): PDFPromise[PDFAnnotations]
  /**
    * A promise that is resolved with the string that is the text content frm the page.
    **/
  def getTextContent(): PDFPromise[TextContent]
  /**
    * @param params viewport options
    * @return
    **/
  def getViewport(params: ViewportParameters): PDFPageViewport
  /**
    * Begins the process of rendering a page to the desired context.
    * @param params Rendering options.
    * @return An extended promise that is resolved when the page finishes rendering.
    **/
  def render(params: PDFRenderParams): PDFRenderTask
}

object PDFPageProxy {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getAnnotations: () => PDFPromise[PDFAnnotations],
    getTextContent: () => PDFPromise[TextContent],
    getViewport: ViewportParameters => PDFPageViewport,
    pageNumber: Double,
    ref: PDFRef,
    render: PDFRenderParams => PDFRenderTask,
    rotate: Double,
    view: js.Array[Double]
  ): PDFPageProxy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getAnnotations = js.Any.fromFunction0(getAnnotations), getTextContent = js.Any.fromFunction0(getTextContent), getViewport = js.Any.fromFunction1(getViewport), pageNumber = pageNumber.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), rotate = rotate.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PDFPageProxy]
  }
}

