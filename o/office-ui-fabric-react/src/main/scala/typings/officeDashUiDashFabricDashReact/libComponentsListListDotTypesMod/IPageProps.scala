package typings.officeDashUiDashFabricDashReact.libComponentsListListDotTypesMod

import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPageProps[T]
  extends HTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  /**
    * The allocation data for the page.
    */
  var page: IPage[T]
}

object IPageProps {
  @scala.inline
  def apply[T](
    page: IPage[T],
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    role: String = null
  ): IPageProps[T] = {
    val __obj = js.Dynamic.literal(page = page)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[IPageProps[T]]
  }
}

