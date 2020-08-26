package typings.officeUiFabricReact.selectionZoneMod

import typings.react.mod.ClassAttributes
import typings.std.Event
import typings.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typings.uifabricUtilities.selectionTypesMod.ISelection
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectionZoneProps extends ClassAttributes[SelectionZone] {
  /**
    * Reference to the component interface.
    */
  var componentRef: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If true, disables automatic selection on input elements.
    */
  var disableAutoSelectOnInputElements: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether elements with the attribute `data-selection-touch-invoke` should be used as invocation targets
    * for an item if the user is using touch.
    *
    * @defaultvalue false
    */
  var enableTouchInvocationTarget: js.UndefOr[Boolean] = js.native
  /**
    * If true, modal selection is enabled on touch event.
    */
  var enterModalOnTouch: js.UndefOr[Boolean] = js.native
  /**
    * Determines if an item is selected on focus.
    *
    * @defaultvalue true
    */
  var isSelectedOnFocus: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated No longer in use, focus is now managed by {@link FocusZone}.
    */
  var layout: js.UndefOr[js.Object] = js.native
  /**
    * Optional callback for when an
    * item's contextual menu action occurs.
    */
  var onItemContextMenu: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[Event], 
      Unit | Boolean
    ]
  ] = js.native
  /**
    * Optional callback for when an item is
    * invoked via ENTER or double-click.
    */
  var onItemInvoked: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[IObjectWithKey], 
      /* index */ js.UndefOr[Double], 
      /* ev */ js.UndefOr[Event], 
      Unit
    ]
  ] = js.native
  /**
    * Required {@link ISelection} instance bound to the {@link SelectionZone}.
    */
  var selection: ISelection[IObjectWithKey] = js.native
  /**
    * The mode of Selection, where the value is one of
    * 'none', 'single', or 'multiple'.
    *
    * @defaultvalue {@link SelectionMode.multiple}
    */
  var selectionMode: js.UndefOr[SelectionMode] = js.native
  /**
    * If true, selection is preserved on outer click.
    */
  var selectionPreservedOnEmptyClick: js.UndefOr[Boolean] = js.native
}

object ISelectionZoneProps {
  @scala.inline
  def apply(selection: ISelection[IObjectWithKey]): ISelectionZoneProps = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionZoneProps]
  }
  @scala.inline
  implicit class ISelectionZonePropsOps[Self <: ISelectionZoneProps] (val x: Self) extends AnyVal {
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
    def setSelection(value: ISelection[IObjectWithKey]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentRef(value: () => Unit): Self = this.set("componentRef", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setDisableAutoSelectOnInputElements(value: Boolean): Self = this.set("disableAutoSelectOnInputElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAutoSelectOnInputElements: Self = this.set("disableAutoSelectOnInputElements", js.undefined)
    @scala.inline
    def setEnableTouchInvocationTarget(value: Boolean): Self = this.set("enableTouchInvocationTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTouchInvocationTarget: Self = this.set("enableTouchInvocationTarget", js.undefined)
    @scala.inline
    def setEnterModalOnTouch(value: Boolean): Self = this.set("enterModalOnTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnterModalOnTouch: Self = this.set("enterModalOnTouch", js.undefined)
    @scala.inline
    def setIsSelectedOnFocus(value: Boolean): Self = this.set("isSelectedOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSelectedOnFocus: Self = this.set("isSelectedOnFocus", js.undefined)
    @scala.inline
    def setLayout(value: js.Object): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setOnItemContextMenu(
      value: (/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit | Boolean
    ): Self = this.set("onItemContextMenu", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnItemContextMenu: Self = this.set("onItemContextMenu", js.undefined)
    @scala.inline
    def setOnItemInvoked(
      value: (/* item */ js.UndefOr[IObjectWithKey], /* index */ js.UndefOr[Double], /* ev */ js.UndefOr[Event]) => Unit
    ): Self = this.set("onItemInvoked", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnItemInvoked: Self = this.set("onItemInvoked", js.undefined)
    @scala.inline
    def setSelectionMode(value: SelectionMode): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setSelectionPreservedOnEmptyClick(value: Boolean): Self = this.set("selectionPreservedOnEmptyClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionPreservedOnEmptyClick: Self = this.set("selectionPreservedOnEmptyClick", js.undefined)
  }
  
}

