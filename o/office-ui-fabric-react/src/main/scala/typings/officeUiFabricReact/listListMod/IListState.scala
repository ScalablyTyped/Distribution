package typings.officeUiFabricReact.listListMod

import typings.officeUiFabricReact.listTypesMod.IPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListState[T] extends js.Object {
  var isScrolling: js.UndefOr[Boolean] = js.native
  /** The last versionstamp for  */
  var measureVersion: js.UndefOr[Double] = js.native
  var pages: js.UndefOr[js.Array[IPage[T]]] = js.native
}

object IListState {
  @scala.inline
  def apply[T](): IListState[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListState[T]]
  }
  @scala.inline
  implicit class IListStateOps[Self <: IListState[_], T] (val x: Self with IListState[T]) extends AnyVal {
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
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsScrolling: Self = this.set("isScrolling", js.undefined)
    @scala.inline
    def setMeasureVersion(value: Double): Self = this.set("measureVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasureVersion: Self = this.set("measureVersion", js.undefined)
    @scala.inline
    def setPagesVarargs(value: IPage[T]*): Self = this.set("pages", js.Array(value :_*))
    @scala.inline
    def setPages(value: js.Array[IPage[T]]): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
  }
  
}

