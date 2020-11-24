package typings.officeUiFabricReact.iaccessiblepopuppropsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccessiblePopupProps extends js.Object {
  
  /**
    * Aria label on close button.
    */
  var closeButtonAriaLabel: js.UndefOr[String] = js.native
  
  /**
    * Sets the element to focus on when exiting the control's FocusTrapZone.
    * @defaultvalue The `element.target` that triggered the control opening.
    */
  var elementToFocusOnDismiss: js.UndefOr[HTMLElement] = js.native
  
  /**
    * Class name (not actual selector) for first focusable item. Do not append a dot.
    */
  var firstFocusableSelector: js.UndefOr[String | js.Function0[String]] = js.native
  
  /**
    * Whether control should force focus inside its focus trap zone.
    * @defaultvalue true
    */
  var forceFocusInsideTrap: js.UndefOr[Boolean] = js.native
  
  /**
    * If false (the default), the control's FocusTrapZone will restore focus to the element which
    * activated it once the trap zone is unmounted or disabled. Set to true to disable this behavior.
    * @defaultvalue false
    */
  var ignoreExternalFocusing: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this control will allow clicks outside its FocusTrapZone.
    * @defaultvalue false
    */
  var isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.native
}
object IAccessiblePopupProps {
  
  @scala.inline
  def apply(): IAccessiblePopupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccessiblePopupProps]
  }
  
  @scala.inline
  implicit class IAccessiblePopupPropsOps[Self <: IAccessiblePopupProps] (val x: Self) extends AnyVal {
    
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
    def setCloseButtonAriaLabel(value: String): Self = this.set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseButtonAriaLabel: Self = this.set("closeButtonAriaLabel", js.undefined)
    
    @scala.inline
    def setElementToFocusOnDismiss(value: HTMLElement): Self = this.set("elementToFocusOnDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementToFocusOnDismiss: Self = this.set("elementToFocusOnDismiss", js.undefined)
    
    @scala.inline
    def setFirstFocusableSelectorFunction0(value: () => String): Self = this.set("firstFocusableSelector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFirstFocusableSelector(value: String | js.Function0[String]): Self = this.set("firstFocusableSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstFocusableSelector: Self = this.set("firstFocusableSelector", js.undefined)
    
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
