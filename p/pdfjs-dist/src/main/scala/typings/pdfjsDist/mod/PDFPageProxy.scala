package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFPageProxy extends js.Object {
  /**
    * Page index of the page.  First page is 0.
    */
  var pageIndex: Double = js.native
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
    * @param params viewport options
    * @return
    **/
  def getViewport(params: ViewportParameters): PDFPageViewport = js.native
  /**
    * Begins the process of rendering a page to the desired context.
    * @param params Rendering options.
    * @return An extended promise that is resolved when the page finishes rendering.
    **/
  def render(params: PDFRenderParams): PDFRenderTask = js.native
}

object PDFPageProxy {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getAnnotations: () => PDFPromise[PDFAnnotations],
    getTextContent: () => PDFPromise[TextContent],
    getViewport: ViewportParameters => PDFPageViewport,
    pageIndex: Double,
    pageNumber: Double,
    ref: PDFRef,
    render: PDFRenderParams => PDFRenderTask,
    rotate: Double,
    view: js.Array[Double]
  ): PDFPageProxy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getAnnotations = js.Any.fromFunction0(getAnnotations), getTextContent = js.Any.fromFunction0(getTextContent), getViewport = js.Any.fromFunction1(getViewport), pageIndex = pageIndex.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), rotate = rotate.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFPageProxy]
  }
  @scala.inline
  implicit class PDFPageProxyOps[Self <: PDFPageProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAnnotations(value: () => PDFPromise[PDFAnnotations]): Self = this.set("getAnnotations", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTextContent(value: () => PDFPromise[TextContent]): Self = this.set("getTextContent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetViewport(value: ViewportParameters => PDFPageViewport): Self = this.set("getViewport", js.Any.fromFunction1(value))
    @scala.inline
    def setPageIndex(value: Double): Self = this.set("pageIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageNumber(value: Double): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: PDFRef): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRender(value: PDFRenderParams => PDFRenderTask): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewVarargs(value: Double*): Self = this.set("view", js.Array(value :_*))
    @scala.inline
    def setView(value: js.Array[Double]): Self = this.set("view", value.asInstanceOf[js.Any])
  }
  
}

