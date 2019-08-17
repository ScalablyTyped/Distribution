package typings.officeDashUiDashFabricDashReact.libComponentsBreadcrumbBreadcrumbDotTypesMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBreadcrumbItem extends js.Object {
  /**
    * Url to navigate to when this breadcrumb is clicked.
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * If this breadcrumb item is the item the user is currently on, if set to true, aria-current="page" will be applied to this
    * breadcrumb link
    */
  var isCurrentItem: js.UndefOr[Boolean] = js.undefined
  /**
    * Arbitrary unique string associated with the breadcrumb
    */
  var key: String
  /**
    * Callback issued when the breadcrumb is selected.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* item */ js.UndefOr[IBreadcrumbItem], 
      Unit
    ]
  ] = js.undefined
  /**
    * Text to display to the user for the breadcrumb
    */
  var text: String
}

object IBreadcrumbItem {
  @scala.inline
  def apply(
    key: String,
    text: String,
    href: String = null,
    isCurrentItem: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* item */ js.UndefOr[IBreadcrumbItem]) => Unit = null
  ): IBreadcrumbItem = {
    val __obj = js.Dynamic.literal(key = key, text = text)
    if (href != null) __obj.updateDynamic("href")(href)
    if (!js.isUndefined(isCurrentItem)) __obj.updateDynamic("isCurrentItem")(isCurrentItem)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    __obj.asInstanceOf[IBreadcrumbItem]
  }
}

