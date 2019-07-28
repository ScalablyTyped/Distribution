package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.FactoryApiNs.PopupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupService extends js.Object {
  /**
  			 * Close an existing popup in the service with the given name. Does nothing if popup does not exist yet.
  			 * @param name the name of the popup you're trying to close
  			 */
  def closePopup(name: String): Unit
  /**
  			 * Create a new popup element
  			 * @param props The popup properties object, see Popup interface for more
  			 */
  def createPopup(props: Popup): Unit
  /**
  			 * Remove the referenced popup from the popupService, unregister the service
  			 * @param name The name of the popup to remove
  			 */
  def deletePopup(name: String): Unit
  /**
  			 * Gets the currently set popup Id
  			 */
  def getPopupsId(): String
  /**
  			 * Open an existing popup in the service with the given name. Does nothing if popup does not exist yet.
  			 * @param name the name of the popup you're trying to open
  			 */
  def openPopup(name: String): Unit
  /**
  			 * Sets the ID (on the DOM and in the system) for the root popup element.
  			 * @param id The string to set as the id
  			 */
  def setPopupsId(id: String): Unit
  /**
  			 * Update an existing popup in the service with the given name, patching new content to the same popup element. Does nothing if popup does not exist yet.
  			 * @param name the name of the popup you're trying to update
  			 * @param newProps the updated properties to give to the popup.
  			 */
  def updatePopup(name: String, newProps: Popup): Unit
}

object PopupService {
  @scala.inline
  def apply(
    closePopup: String => Unit,
    createPopup: Popup => Unit,
    deletePopup: String => Unit,
    getPopupsId: () => String,
    openPopup: String => Unit,
    setPopupsId: String => Unit,
    updatePopup: (String, Popup) => Unit
  ): PopupService = {
    val __obj = js.Dynamic.literal(closePopup = js.Any.fromFunction1(closePopup), createPopup = js.Any.fromFunction1(createPopup), deletePopup = js.Any.fromFunction1(deletePopup), getPopupsId = js.Any.fromFunction0(getPopupsId), openPopup = js.Any.fromFunction1(openPopup), setPopupsId = js.Any.fromFunction1(setPopupsId), updatePopup = js.Any.fromFunction2(updatePopup))
  
    __obj.asInstanceOf[PopupService]
  }
}

