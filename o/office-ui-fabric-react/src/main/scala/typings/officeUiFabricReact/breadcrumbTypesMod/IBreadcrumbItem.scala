package typings.officeUiFabricReact.breadcrumbTypesMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.a
import typings.officeUiFabricReact.officeUiFabricReactStrings.h1
import typings.officeUiFabricReact.officeUiFabricReactStrings.h2
import typings.officeUiFabricReact.officeUiFabricReactStrings.h3
import typings.officeUiFabricReact.officeUiFabricReactStrings.h4
import typings.officeUiFabricReact.officeUiFabricReactStrings.h5
import typings.officeUiFabricReact.officeUiFabricReactStrings.h6
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBreadcrumbItem extends js.Object {
  /**
    * Optional prop to render the item as a heading of your choice.
    *
    * You can also use this to force items to render as links instead of buttons (by default,
    * any item with a `href` renders as a link, and any item without a `href` renders as a button).
    * This is not generally recommended because it may prevent activating the link using the keyboard.
    */
  var as: js.UndefOr[h1 | h2 | h3 | h4 | h5 | h6 | a] = js.native
  /**
    * Url to navigate to when this breadcrumb item is clicked.
    */
  var href: js.UndefOr[String] = js.native
  /**
    * Whether this is the breadcrumb item the user is currently navigated to.
    * If true, `aria-current="page"` will be applied to this breadcrumb item.
    */
  var isCurrentItem: js.UndefOr[Boolean] = js.native
  /**
    * Arbitrary unique string associated with the breadcrumb item.
    */
  var key: String = js.native
  /**
    * Callback issued when the breadcrumb item is selected.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* item */ js.UndefOr[this.type], 
      Unit
    ]
  ] = js.native
  /**
    * Text to display to the user for the breadcrumb item.
    */
  var text: String = js.native
}

object IBreadcrumbItem {
  @scala.inline
  def apply(key: String, text: String): IBreadcrumbItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBreadcrumbItem]
  }
  @scala.inline
  implicit class IBreadcrumbItemOps[Self <: IBreadcrumbItem] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: h1 | h2 | h3 | h4 | h5 | h6 | a): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setIsCurrentItem(value: Boolean): Self = this.set("isCurrentItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCurrentItem: Self = this.set("isCurrentItem", js.undefined)
    @scala.inline
    def setOnClick(
      value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* item */ js.UndefOr[IBreadcrumbItem]) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

