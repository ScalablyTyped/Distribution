package typings.powerappsComponentFramework.ComponentFramework

import typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Types.PopupType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FactoryApi {
  
  /**
    * Helper of Factory Pop API interface
    */
  object Popup {
    
    trait Popup extends StObject {
      
      /**
        * Indicates whether popup close on an outside mouse click.
        * When it's false, the popup will not be closed on an outside mouse click.
        */
      var closeOnOutsideClick: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Static DOM element to be inserted
        */
      var content: HTMLElement
      
      /**
        * The id to be set to the anchor control if any.
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * The name of the Popup. Used as the reference to open Popups.
        */
      var name: String
      
      /**
        * The name of Popup which should be opened.
        * Should be defined ONLY in a Root Popup.
        * To open nested Popups, should be provided string like "rootName.nestedName.[allOtherNestedNames]".
        * To close Popups, should be provided empty string.
        * This prop will be automatically propagated to children.
        */
      var popupToOpen: js.UndefOr[String] = js.undefined
      
      /**
        * The type of Popup, which is described in PopupType enum. Should be only one "root" Popup for each set of Popups.
        */
      var `type`: PopupType
    }
    object Popup {
      
      inline def apply(content: HTMLElement, name: String, `type`: PopupType): typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup]
      }
      
      extension [Self <: typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup](x: Self) {
        
        inline def setCloseOnOutsideClick(value: Boolean): Self = StObject.set(x, "closeOnOutsideClick", value.asInstanceOf[js.Any])
        
        inline def setCloseOnOutsideClickUndefined: Self = StObject.set(x, "closeOnOutsideClick", js.undefined)
        
        inline def setContent(value: HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPopupToOpen(value: String): Self = StObject.set(x, "popupToOpen", value.asInstanceOf[js.Any])
        
        inline def setPopupToOpenUndefined: Self = StObject.set(x, "popupToOpen", js.undefined)
        
        inline def setType(value: PopupType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait PopupService extends StObject {
      
      /**
        * Close an existing popup in the service with the given name. Does nothing if popup does not exist yet.
        * @param name the name of the popup you're trying to close
        */
      def closePopup(name: String): Unit
      
      /**
        * Create a new popup element
        * @param props The popup properties object, see Popup interface for more
        */
      def createPopup(props: typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup): Unit
      
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
      def updatePopup(
        name: String,
        newProps: typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup
      ): Unit
    }
    object PopupService {
      
      inline def apply(
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
      
      extension [Self <: PopupService](x: Self) {
        
        inline def setClosePopup(value: String => Unit): Self = StObject.set(x, "closePopup", js.Any.fromFunction1(value))
        
        inline def setCreatePopup(value: typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup => Unit): Self = StObject.set(x, "createPopup", js.Any.fromFunction1(value))
        
        inline def setDeletePopup(value: String => Unit): Self = StObject.set(x, "deletePopup", js.Any.fromFunction1(value))
        
        inline def setGetPopupsId(value: () => String): Self = StObject.set(x, "getPopupsId", js.Any.fromFunction0(value))
        
        inline def setOpenPopup(value: String => Unit): Self = StObject.set(x, "openPopup", js.Any.fromFunction1(value))
        
        inline def setSetPopupsId(value: String => Unit): Self = StObject.set(x, "setPopupsId", js.Any.fromFunction1(value))
        
        inline def setUpdatePopup(
          value: (String, typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup) => Unit
        ): Self = StObject.set(x, "updatePopup", js.Any.fromFunction2(value))
      }
    }
    
    object Types {
      
      /**
        * Root popup in the popup stack
        * 1 - Root - Root popup in the popup stack,
        * 2 - Nested - Not root popup in the popup stack
        */
      /* Rewritten from type alias, can be one of: 
        - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`
        - typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2`
      */
      trait PopupType extends StObject
      object PopupType {
        
        inline def `1`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1` = 1.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`]
        
        inline def `2`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2` = 2.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2`]
      }
    }
  }
}
