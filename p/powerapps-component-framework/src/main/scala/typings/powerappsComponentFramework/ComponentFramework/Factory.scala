package typings.powerappsComponentFramework.ComponentFramework

import typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.PopupService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The interface for the context.factory
	 */
trait Factory extends js.Object {
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
  @scala.inline
  def apply(getPopupService: () => PopupService, requestRender: () => Unit): Factory = {
    val __obj = js.Dynamic.literal(getPopupService = js.Any.fromFunction0(getPopupService), requestRender = js.Any.fromFunction0(requestRender))
    __obj.asInstanceOf[Factory]
  }
}

