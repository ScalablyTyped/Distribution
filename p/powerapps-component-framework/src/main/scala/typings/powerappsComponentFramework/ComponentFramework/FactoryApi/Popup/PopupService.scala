package typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupService extends js.Object {
  /**
    * Close an existing popup in the service with the given name. Does nothing if popup does not exist yet.
    * @param name the name of the popup you're trying to close
    */
  def closePopup(name: String): Unit = js.native
  /**
    * Create a new popup element
    * @param props The popup properties object, see Popup interface for more
    */
  def createPopup(props: typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup): Unit = js.native
  /**
    * Remove the referenced popup from the popupService, unregister the service
    * @param name The name of the popup to remove
    */
  def deletePopup(name: String): Unit = js.native
  /**
    * Gets the currently set popup Id
    */
  def getPopupsId(): String = js.native
  /**
    * Open an existing popup in the service with the given name. Does nothing if popup does not exist yet.
    * @param name the name of the popup you're trying to open
    */
  def openPopup(name: String): Unit = js.native
  /**
    * Sets the ID (on the DOM and in the system) for the root popup element.
    * @param id The string to set as the id
    */
  def setPopupsId(id: String): Unit = js.native
  /**
    * Update an existing popup in the service with the given name, patching new content to the same popup element. Does nothing if popup does not exist yet.
    * @param name the name of the popup you're trying to update
    * @param newProps the updated properties to give to the popup.
    */
  def updatePopup(
    name: String,
    newProps: typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup
  ): Unit = js.native
}

object PopupService {
  @scala.inline
  def apply(
    closePopup: String => Unit,
    createPopup: typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup => Unit,
    deletePopup: String => Unit,
    getPopupsId: () => String,
    openPopup: String => Unit,
    setPopupsId: String => Unit,
    updatePopup: (String, typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup) => Unit
  ): PopupService = {
    val __obj = js.Dynamic.literal(closePopup = js.Any.fromFunction1(closePopup), createPopup = js.Any.fromFunction1(createPopup), deletePopup = js.Any.fromFunction1(deletePopup), getPopupsId = js.Any.fromFunction0(getPopupsId), openPopup = js.Any.fromFunction1(openPopup), setPopupsId = js.Any.fromFunction1(setPopupsId), updatePopup = js.Any.fromFunction2(updatePopup))
    __obj.asInstanceOf[PopupService]
  }
  @scala.inline
  implicit class PopupServiceOps[Self <: PopupService] (val x: Self) extends AnyVal {
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
    def setClosePopup(value: String => Unit): Self = this.set("closePopup", js.Any.fromFunction1(value))
    @scala.inline
    def setCreatePopup(value: typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup => Unit): Self = this.set("createPopup", js.Any.fromFunction1(value))
    @scala.inline
    def setDeletePopup(value: String => Unit): Self = this.set("deletePopup", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPopupsId(value: () => String): Self = this.set("getPopupsId", js.Any.fromFunction0(value))
    @scala.inline
    def setOpenPopup(value: String => Unit): Self = this.set("openPopup", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPopupsId(value: String => Unit): Self = this.set("setPopupsId", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdatePopup(
      value: (String, typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup) => Unit
    ): Self = this.set("updatePopup", js.Any.fromFunction2(value))
  }
  
}

