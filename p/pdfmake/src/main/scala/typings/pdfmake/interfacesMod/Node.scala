package typings.pdfmake.interfacesMod

import typings.pdfmake.anon.HorizontalRatio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var canvas: js.UndefOr[CanvasElement] = js.native
  var columns: js.UndefOr[js.Array[Column]] = js.native
  var headlineLevel: js.UndefOr[Double] = js.native
  var id: js.UndefOr[String] = js.native
  var image: js.UndefOr[String] = js.native
  var ol: js.UndefOr[js.Array[OrderedListElement]] = js.native
  var pageBreak: js.UndefOr[PageBreak] = js.native
  var pageNumbers: js.Array[Double] = js.native
  var pageOrientation: js.UndefOr[PageOrientation] = js.native
  var pages: Double = js.native
  var qr: js.UndefOr[String] = js.native
  var stack: Boolean = js.native
  var startPosition: HorizontalRatio = js.native
  var style: js.UndefOr[String | js.Array[String] | Style] = js.native
  var svg: js.UndefOr[String] = js.native
  var table: js.UndefOr[Table] = js.native
  var text: js.UndefOr[Content] = js.native
  var ul: js.UndefOr[js.Array[UnorderedListElement]] = js.native
}

object Node {
  @scala.inline
  def apply(pageNumbers: js.Array[Double], pages: Double, stack: Boolean, startPosition: HorizontalRatio): Node = {
    val __obj = js.Dynamic.literal(pageNumbers = pageNumbers.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
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
    def setPageNumbersVarargs(value: Double*): Self = this.set("pageNumbers", js.Array(value :_*))
    @scala.inline
    def setPageNumbers(value: js.Array[Double]): Self = this.set("pageNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setPages(value: Double): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: Boolean): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartPosition(value: HorizontalRatio): Self = this.set("startPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanvas(value: CanvasElement): Self = this.set("canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvas: Self = this.set("canvas", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setHeadlineLevel(value: Double): Self = this.set("headlineLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadlineLevel: Self = this.set("headlineLevel", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setOlVarargs(value: OrderedListElement*): Self = this.set("ol", js.Array(value :_*))
    @scala.inline
    def setOl(value: js.Array[OrderedListElement]): Self = this.set("ol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOl: Self = this.set("ol", js.undefined)
    @scala.inline
    def setPageBreak(value: PageBreak): Self = this.set("pageBreak", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageBreak: Self = this.set("pageBreak", js.undefined)
    @scala.inline
    def setPageOrientation(value: PageOrientation): Self = this.set("pageOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageOrientation: Self = this.set("pageOrientation", js.undefined)
    @scala.inline
    def setQr(value: String): Self = this.set("qr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQr: Self = this.set("qr", js.undefined)
    @scala.inline
    def setStyleVarargs(value: String*): Self = this.set("style", js.Array(value :_*))
    @scala.inline
    def setStyle(value: String | js.Array[String] | Style): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSvg(value: String): Self = this.set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
    @scala.inline
    def setTable(value: Table): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setText(value: Content): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setUlVarargs(value: UnorderedListElement*): Self = this.set("ul", js.Array(value :_*))
    @scala.inline
    def setUl(value: js.Array[UnorderedListElement]): Self = this.set("ul", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUl: Self = this.set("ul", js.undefined)
  }
  
}

