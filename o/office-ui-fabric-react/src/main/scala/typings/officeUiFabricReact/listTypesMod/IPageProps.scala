package typings.officeUiFabricReact.listTypesMod

import typings.react.mod.ClassAttributes
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPageProps[T]
  extends HTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  /**
    * The allocation data for the page.
    */
  var page: IPage[T] = js.native
}

object IPageProps {
  @scala.inline
  def apply[T](page: IPage[T]): IPageProps[T] = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPageProps[T]]
  }
  @scala.inline
  implicit class IPagePropsOps[Self <: IPageProps[_], T] (val x: Self with IPageProps[T]) extends AnyVal {
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
    def setPage(value: IPage[T]): Self = this.set("page", value.asInstanceOf[js.Any])
  }
  
}

