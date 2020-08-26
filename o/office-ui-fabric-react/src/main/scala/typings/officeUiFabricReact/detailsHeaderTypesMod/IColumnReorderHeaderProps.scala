package typings.officeUiFabricReact.detailsHeaderTypesMod

import typings.officeUiFabricReact.anon.DropLocation
import typings.officeUiFabricReact.detailsListTypesMod.IColumnReorderOptions
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnReorderHeaderProps extends IColumnReorderOptions {
  /** Callback to notify the column dragEnd event to List
    * Need this to check whether the dragEnd has happened on
    * corresponding list or outside of the list
    */
  var onColumnDragEnd: js.UndefOr[js.Function2[/* props */ DropLocation, /* event */ MouseEvent, Unit]] = js.native
}

object IColumnReorderHeaderProps {
  @scala.inline
  def apply(): IColumnReorderHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnReorderHeaderProps]
  }
  @scala.inline
  implicit class IColumnReorderHeaderPropsOps[Self <: IColumnReorderHeaderProps] (val x: Self) extends AnyVal {
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
    def setOnColumnDragEnd(value: (/* props */ DropLocation, /* event */ MouseEvent) => Unit): Self = this.set("onColumnDragEnd", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnColumnDragEnd: Self = this.set("onColumnDragEnd", js.undefined)
  }
  
}

