package typings.officeUiFabricReact.gridCellTypesMod

import typings.officeUiFabricReact.baseButtonClassNamesMod.IButtonClassNames
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridCellProps[T] extends js.Object {
  /**
    * Optional, the CSS class used for when the cell is disabled
    */
  var cellDisabledStyle: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional, the CSS class used for when the cell is selected
    */
  var cellIsSelectedStyle: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional, className(s) to apply
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Optional, if the this option should be diabled
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Method to provide the classnames to style a button.
    * The default value for this prop is the getClassnames func
    * defined in BaseButton.classnames.
    */
  var getClassNames: js.UndefOr[
    js.Function9[
      /* theme */ ITheme, 
      /* className */ String, 
      /* variantClassName */ String, 
      /* iconClassName */ js.UndefOr[String], 
      /* menuIconClassName */ js.UndefOr[String], 
      /* disabled */ Boolean, 
      /* checked */ Boolean, 
      /* expanded */ Boolean, 
      /* isSplit */ js.UndefOr[Boolean], 
      IButtonClassNames
    ]
  ] = js.native
  /**
    * Arbitrary unique string associated with this option
    */
  var id: String = js.native
  /**
    * Index for this option
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * The option that will be made available to the user
    */
  var item: T = js.native
  /**
    * The label for this item.
    * Visible text if this item is a header,
    * tooltip if is this item is normal
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The on click handler
    */
  var onClick: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.native
  /**
    * Optional, the onFocus handler
    */
  var onFocus: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.native
  /**
    * Optional, the onHover handler
    */
  var onHover: js.UndefOr[js.Function1[/* item */ js.UndefOr[T], Unit]] = js.native
  /**
    * Optional, onkeydown handler
    */
  var onKeyDown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent[HTMLButtonElement], Unit]] = js.native
  /**
    * Optional, mouseEnter handler.
    * @returns true if the event should be processed, false otherwise
    */
  var onMouseEnter: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Boolean]] = js.native
  /**
    * Optional, mouseLeave handler
    */
  var onMouseLeave: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.native
  /**
    * Optional, mouseMove handler
    * @returns true if the event should be processed, false otherwise
    */
  var onMouseMove: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Boolean]] = js.native
  /**
    * Optional, onWheel handler
    */
  var onWheel: js.UndefOr[js.Function1[/* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent], Unit]] = js.native
  /**
    * The accessible role for this option
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Optional, if the cell is currently selected
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * The render callback to handle rendering the item
    */
  def onRenderItem(item: T): Element = js.native
}

object IGridCellProps {
  @scala.inline
  def apply[T](id: String, item: T, onRenderItem: T => Element): IGridCellProps[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onRenderItem = js.Any.fromFunction1(onRenderItem))
    __obj.asInstanceOf[IGridCellProps[T]]
  }
  @scala.inline
  implicit class IGridCellPropsOps[Self <: IGridCellProps[_], T] (val x: Self with IGridCellProps[T]) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: T): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRenderItem(value: T => Element): Self = this.set("onRenderItem", js.Any.fromFunction1(value))
    @scala.inline
    def setCellDisabledStyleVarargs(value: String*): Self = this.set("cellDisabledStyle", js.Array(value :_*))
    @scala.inline
    def setCellDisabledStyle(value: js.Array[String]): Self = this.set("cellDisabledStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellDisabledStyle: Self = this.set("cellDisabledStyle", js.undefined)
    @scala.inline
    def setCellIsSelectedStyleVarargs(value: String*): Self = this.set("cellIsSelectedStyle", js.Array(value :_*))
    @scala.inline
    def setCellIsSelectedStyle(value: js.Array[String]): Self = this.set("cellIsSelectedStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellIsSelectedStyle: Self = this.set("cellIsSelectedStyle", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setGetClassNames(
      value: (/* theme */ ITheme, /* className */ String, /* variantClassName */ String, /* iconClassName */ js.UndefOr[String], /* menuIconClassName */ js.UndefOr[String], /* disabled */ Boolean, /* checked */ Boolean, /* expanded */ Boolean, /* isSplit */ js.UndefOr[Boolean]) => IButtonClassNames
    ): Self = this.set("getClassNames", js.Any.fromFunction9(value))
    @scala.inline
    def deleteGetClassNames: Self = this.set("getClassNames", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOnClick(value: /* item */ T => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnFocus(value: /* item */ T => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnHover(value: /* item */ js.UndefOr[T] => Unit): Self = this.set("onHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
    @scala.inline
    def setOnKeyDown(value: /* ev */ KeyboardEvent[HTMLButtonElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Boolean): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseMove(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Boolean): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setOnWheel(value: /* ev */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onWheel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnWheel: Self = this.set("onWheel", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
  
}

