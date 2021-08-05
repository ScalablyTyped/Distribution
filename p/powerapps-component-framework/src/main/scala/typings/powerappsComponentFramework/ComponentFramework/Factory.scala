package typings.powerappsComponentFramework.ComponentFramework

import typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.PopupService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for the context.factory
  */
trait Factory extends StObject {
  
  /**
    * Gets the popup service which help create Popup and manage Popup easily
    */
  def getPopupService(): PopupService
  
  /**
    * Requests re-rendering of the control with updated data.
    */
  def requestRender(): Unit
}
object Factory {
  
  inline def apply(getPopupService: () => PopupService, requestRender: () => Unit): Factory = {
    val __obj = js.Dynamic.literal(getPopupService = js.Any.fromFunction0(getPopupService), requestRender = js.Any.fromFunction0(requestRender))
    __obj.asInstanceOf[Factory]
  }
  
  extension [Self <: Factory](x: Self) {
    
    inline def setGetPopupService(value: () => PopupService): Self = StObject.set(x, "getPopupService", js.Any.fromFunction0(value))
    
    inline def setRequestRender(value: () => Unit): Self = StObject.set(x, "requestRender", js.Any.fromFunction0(value))
  }
}
