package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.FactoryApiNs.PopupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupService extends js.Object {
  /**
  			 * Close an existing popup in the service with the given name. Does nothing if popup does not exist yet.
  			 * @param name the name of the popup you're trying to close
  			 */
  def closePopup(name: java.lang.String): scala.Unit
  /**
  			 * Create a new popup element
  			 * @param props The popup properties object, see Popup interface for more
  			 */
  def createPopup(props: Popup): scala.Unit
  /**
  			 * Remove the referenced popup from the popupService, unregister the service
  			 * @param name The name of the popup to remove
  			 */
  def deletePopup(name: java.lang.String): scala.Unit
  /**
  			 * Gets the currently set popup Id
  			 */
  def getPopupsId(): java.lang.String
  /**
  			 * Open an existing popup in the service with the given name. Does nothing if popup does not exist yet.
  			 * @param name the name of the popup you're trying to open
  			 */
  def openPopup(name: java.lang.String): scala.Unit
  /**
  			 * Sets the ID (on the DOM and in the system) for the root popup element.
  			 * @param id The string to set as the id
  			 */
  def setPopupsId(id: java.lang.String): scala.Unit
  /**
  			 * Update an existing popup in the service with the given name, patching new content to the same popup element. Does nothing if popup does not exist yet.
  			 * @param name the name of the popup you're trying to update
  			 * @param newProps the updated properties to give to the popup.
  			 */
  def updatePopup(name: java.lang.String, newProps: Popup): scala.Unit
}

object PopupService {
  @scala.inline
  def apply(
    closePopup: java.lang.String => scala.Unit,
    createPopup: Popup => scala.Unit,
    deletePopup: java.lang.String => scala.Unit,
    getPopupsId: () => java.lang.String,
    openPopup: java.lang.String => scala.Unit,
    setPopupsId: java.lang.String => scala.Unit,
    updatePopup: (java.lang.String, Popup) => scala.Unit
  ): PopupService = {
    val __obj = js.Dynamic.literal(closePopup = js.Any.fromFunction1(closePopup), createPopup = js.Any.fromFunction1(createPopup), deletePopup = js.Any.fromFunction1(deletePopup), getPopupsId = js.Any.fromFunction0(getPopupsId), openPopup = js.Any.fromFunction1(openPopup), setPopupsId = js.Any.fromFunction1(setPopupsId), updatePopup = js.Any.fromFunction2(updatePopup))
  
    __obj.asInstanceOf[PopupService]
  }
}

