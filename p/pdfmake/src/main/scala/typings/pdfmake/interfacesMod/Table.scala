package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.Asterisk
import typings.pdfmake.pdfmakeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  var body: js.Array[js.Array[TableCell]] = js.native
  var dontBreakRows: js.UndefOr[Boolean] = js.native
  var headerRows: js.UndefOr[Double] = js.native
  var heights: js.UndefOr[Double | js.Array[Double] | DynamicRowSize] = js.native
  var keepWithHeaderRows: js.UndefOr[Double] = js.native
  var layout: js.UndefOr[TableLayout] = js.native
  var widths: js.UndefOr[Asterisk | auto | js.Array[Size]] = js.native
}

object Table {
  @scala.inline
  def apply(body: js.Array[js.Array[TableCell]]): Table = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  @scala.inline
  implicit class TableOps[Self <: Table] (val x: Self) extends AnyVal {
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
    def setBodyVarargs(value: js.Array[TableCell]*): Self = this.set("body", js.Array(value :_*))
    @scala.inline
    def setBody(value: js.Array[js.Array[TableCell]]): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setDontBreakRows(value: Boolean): Self = this.set("dontBreakRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDontBreakRows: Self = this.set("dontBreakRows", js.undefined)
    @scala.inline
    def setHeaderRows(value: Double): Self = this.set("headerRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderRows: Self = this.set("headerRows", js.undefined)
    @scala.inline
    def setHeightsVarargs(value: Double*): Self = this.set("heights", js.Array(value :_*))
    @scala.inline
    def setHeightsFunction1(value: /* row */ Double => Double | auto): Self = this.set("heights", js.Any.fromFunction1(value))
    @scala.inline
    def setHeights(value: Double | js.Array[Double] | DynamicRowSize): Self = this.set("heights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeights: Self = this.set("heights", js.undefined)
    @scala.inline
    def setKeepWithHeaderRows(value: Double): Self = this.set("keepWithHeaderRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepWithHeaderRows: Self = this.set("keepWithHeaderRows", js.undefined)
    @scala.inline
    def setLayout(value: TableLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setWidthsVarargs(value: Size*): Self = this.set("widths", js.Array(value :_*))
    @scala.inline
    def setWidths(value: Asterisk | auto | js.Array[Size]): Self = this.set("widths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidths: Self = this.set("widths", js.undefined)
  }
  
}

