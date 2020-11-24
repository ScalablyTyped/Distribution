package typings.powerappsComponentFramework.ComponentFramework

import typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.PopupService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for the context.factory
  */
@js.native
trait Factory extends js.Object {
  
  /**
    * Gets the popup service which help create Popup and manage Popup easily
    */
  def getPopupService(): PopupService = js.native
  
  /**
    * Requests re-rendering of the control with updated data.
    */
  def requestRender(): Unit = js.native
}
object Factory {
  
  @scala.inline
  def apply(getPopupService: () => PopupService, requestRender: () => Unit): Factory = {
    val __obj = js.Dynamic.literal(getPopupService = js.Any.fromFunction0(getPopupService), requestRender = js.Any.fromFunction0(requestRender))
    __obj.asInstanceOf[Factory]
  }
  
  @scala.inline
  implicit class FactoryOps[Self <: Factory] (val x: Self) extends AnyVal {
    
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
    def setGetPopupService(value: () => PopupService): Self = this.set("getPopupService", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestRender(value: () => Unit): Self = this.set("requestRender", js.Any.fromFunction0(value))
  }
}
