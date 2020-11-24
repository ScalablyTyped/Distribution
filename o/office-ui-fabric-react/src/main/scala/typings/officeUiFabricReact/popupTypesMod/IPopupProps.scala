package typings.officeUiFabricReact.popupTypesMod

import typings.officeUiFabricReact.anon.ContainsFocus
import typings.officeUiFabricReact.popupPopupMod.Popup
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPopupProps extends HTMLAttributes[Popup] {
  
  /**
    * Defines the element id referencing the element containing the description for the popup.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  
  /**
    * Accessible label text for the popup.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    *  Defines the element id referencing the element containing label text for popup.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  
  /**
    * A callback function for when the popup is dismissed from the close button or light dismiss. If provided, will
    * handle escape keypresses and call this. The event will be stopped/canceled.
    */
  var onDismiss: js.UndefOr[
    js.Function1[
      /* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], 
      _
    ]
  ] = js.native
  
  /**
    * Called when the component is unmounting, and focus needs to be restored.
    * Argument passed down contains two variables, the element that the underlying
    * popup believes focus should go to * and whether or not the popup currently
    * contains focus. If this is provided, focus will not be restored automatically,
    * you'll need to call originalElement.focus()
    */
  var onRestoreFocus: js.UndefOr[js.Function1[/* options */ ContainsFocus, Unit]] = js.native
  
  /**
    * If true, when this component is unmounted, focus will be restored to the element that had focus when the component
    * first mounted.
    * @defaultvalue true
    * @deprecated use restoreFocus callback instead
    */
  var shouldRestoreFocus: js.UndefOr[Boolean] = js.native
}
object IPopupProps {
  
  @scala.inline
  def apply(): IPopupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopupProps]
  }
  
  @scala.inline
  implicit class IPopupPropsOps[Self <: IPopupProps] (val x: Self) extends AnyVal {
    
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
    def setAriaDescribedBy(value: String): Self = this.set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaDescribedBy: Self = this.set("ariaDescribedBy", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    
    @scala.inline
    def setOnDismiss(
      value: /* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]] => _
    ): Self = this.set("onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setOnRestoreFocus(value: /* options */ ContainsFocus => Unit): Self = this.set("onRestoreFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRestoreFocus: Self = this.set("onRestoreFocus", js.undefined)
    
    @scala.inline
    def setShouldRestoreFocus(value: Boolean): Self = this.set("shouldRestoreFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldRestoreFocus: Self = this.set("shouldRestoreFocus", js.undefined)
  }
}
