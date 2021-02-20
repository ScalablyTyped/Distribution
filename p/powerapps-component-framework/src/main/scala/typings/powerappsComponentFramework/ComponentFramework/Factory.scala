package typings.powerappsComponentFramework.ComponentFramework

import typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.PopupService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for the context.factory
  */
@js.native
trait Factory extends StObject {
  
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
  implicit class FactoryMutableBuilder[Self <: Factory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPopupService(value: () => PopupService): Self = StObject.set(x, "getPopupService", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestRender(value: () => Unit): Self = StObject.set(x, "requestRender", js.Any.fromFunction0(value))
  }
}
