package typings.officeUiFabricReact.focusTrapZoneTypesMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFocusTrapZoneProps extends HTMLAttributes[HTMLDivElement] {
  
  /**
    * Sets the aria-labelledby attribute.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  
  /**
    * Optional callback to access the IFocusTrapZone interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IFocusTrapZone]] = js.native
  
  /**
    * Do not put focus onto the first element inside the focus trap zone.
    * @defaultvalue false
    */
  var disableFirstFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to disable the FocusTrapZone's focus trapping behavior.
    * @defaultvalue false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the element to focus on when exiting the FocusTrapZone.
    * @defaultvalue The `element.target` that triggered the FTZ.
    */
  var elementToFocusOnDismiss: js.UndefOr[HTMLElement] = js.native
  
  /**
    * Puts aria-hidden=true on all non-ancestors of the current element, for screen readers.
    * This is an experimental feature that will be graduated to default behavior after testing.
    * This flag will be removed with the next major release.
    */
  var enableAriaHiddenSiblings: js.UndefOr[Boolean] = js.native
  
  /**
    * Class name (not actual selector) for first focusable item. Do not append a dot.
    * Only applies if `focusPreviouslyFocusedInnerElement` is false.
    * @deprecated Use `firstFocusableTarget`, since it is more generic. `firstFocusableTarget` takes precendence if
    * supplied.
    */
  var firstFocusableSelector: js.UndefOr[String | js.Function0[String]] = js.native
  
  /**
    * Either a full query selector for the first focusable element, or a function to select the focusable element
    * within the area directly.
    */
  var firstFocusableTarget: js.UndefOr[String | (js.Function1[/* element */ HTMLElement, HTMLElement | Null])] = js.native
  
  /**
    * Specifies which descendant element to focus when `focus()` is called.
    * If false, use the first focusable descendant, filtered by the `firstFocusableSelector` property if present.
    * If true, use the element that was focused when the trap zone last had a focused descendant
    * (or fall back to the first focusable descendant if the trap zone has never been focused).
    * @defaultvalue false
    */
  var focusPreviouslyFocusedInnerElement: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the focus trap zone should force focus to stay inside of it.
    * @defaultvalue true
    */
  var forceFocusInsideTrap: js.UndefOr[Boolean] = js.native
  
  /**
    * If false (the default), the trap zone will restore focus to the element which activated it
    * once the trap zone is unmounted or disabled. Set to true to disable this behavior.
    * @defaultvalue false
    */
  var ignoreExternalFocusing: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether clicks are allowed outside this FocusTrapZone.
    * @defaultvalue false
    */
  var isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.native
}
object IFocusTrapZoneProps {
  
  @scala.inline
  def apply(): IFocusTrapZoneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFocusTrapZoneProps]
  }
  
  @scala.inline
  implicit class IFocusTrapZonePropsOps[Self <: IFocusTrapZoneProps] (val x: Self) extends AnyVal {
    
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
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IFocusTrapZone | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IFocusTrapZone]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setDisableFirstFocus(value: Boolean): Self = this.set("disableFirstFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFirstFocus: Self = this.set("disableFirstFocus", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setElementToFocusOnDismiss(value: HTMLElement): Self = this.set("elementToFocusOnDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementToFocusOnDismiss: Self = this.set("elementToFocusOnDismiss", js.undefined)
    
    @scala.inline
    def setEnableAriaHiddenSiblings(value: Boolean): Self = this.set("enableAriaHiddenSiblings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAriaHiddenSiblings: Self = this.set("enableAriaHiddenSiblings", js.undefined)
    
    @scala.inline
    def setFirstFocusableSelectorFunction0(value: () => String): Self = this.set("firstFocusableSelector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFirstFocusableSelector(value: String | js.Function0[String]): Self = this.set("firstFocusableSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstFocusableSelector: Self = this.set("firstFocusableSelector", js.undefined)
    
    @scala.inline
    def setFirstFocusableTargetFunction1(value: /* element */ HTMLElement => HTMLElement | Null): Self = this.set("firstFocusableTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirstFocusableTarget(value: String | (js.Function1[/* element */ HTMLElement, HTMLElement | Null])): Self = this.set("firstFocusableTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstFocusableTarget: Self = this.set("firstFocusableTarget", js.undefined)
    
    @scala.inline
    def setFocusPreviouslyFocusedInnerElement(value: Boolean): Self = this.set("focusPreviouslyFocusedInnerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusPreviouslyFocusedInnerElement: Self = this.set("focusPreviouslyFocusedInnerElement", js.undefined)
    
    @scala.inline
    def setForceFocusInsideTrap(value: Boolean): Self = this.set("forceFocusInsideTrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceFocusInsideTrap: Self = this.set("forceFocusInsideTrap", js.undefined)
    
    @scala.inline
    def setIgnoreExternalFocusing(value: Boolean): Self = this.set("ignoreExternalFocusing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreExternalFocusing: Self = this.set("ignoreExternalFocusing", js.undefined)
    
    @scala.inline
    def setIsClickableOutsideFocusTrap(value: Boolean): Self = this.set("isClickableOutsideFocusTrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsClickableOutsideFocusTrap: Self = this.set("isClickableOutsideFocusTrap", js.undefined)
  }
}
