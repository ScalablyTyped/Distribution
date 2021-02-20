package typings.powerappsComponentFramework.ComponentFramework

import typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Types.PopupType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FactoryApi {
  
  /**
    * Helper of Factory Pop API interface
    */
  object Popup {
    
    @js.native
    trait Popup extends StObject {
      
      /**
        * Indicates whether popup close on an outside mouse click.
        * When it's false, the popup will not be closed on an outside mouse click.
        */
      var closeOnOutsideClick: js.UndefOr[Boolean] = js.native
      
      /**
        * Static DOM element to be inserted
        */
      var content: HTMLElement = js.native
      
      /**
        * The id to be set to the anchor control if any.
        */
      var id: js.UndefOr[String] = js.native
      
      /**
        * The name of the Popup. Used as the reference to open Popups.
        */
      var name: String = js.native
      
      /**
        * The name of Popup which should be opened.
        * Should be defined ONLY in a Root Popup.
        * To open nested Popups, should be provided string like "rootName.nestedName.[allOtherNestedNames]".
        * To close Popups, should be provided empty string.
        * This prop will be automatically propagated to children.
        */
      var popupToOpen: js.UndefOr[String] = js.native
      
      /**
        * The type of Popup, which is described in PopupType enum. Should be only one "root" Popup for each set of Popups.
        */
      var `type`: PopupType = js.native
    }
    object Popup {
      
      @scala.inline
      def apply(content: HTMLElement, name: String, `type`: PopupType): typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup]
      }
      
      @scala.inline
      implicit class PopupMutableBuilder[Self <: typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCloseOnOutsideClick(value: Boolean): Self = StObject.set(x, "closeOnOutsideClick", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCloseOnOutsideClickUndefined: Self = StObject.set(x, "closeOnOutsideClick", js.undefined)
        
        @scala.inline
        def setContent(value: HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPopupToOpen(value: String): Self = StObject.set(x, "popupToOpen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPopupToOpenUndefined: Self = StObject.set(x, "popupToOpen", js.undefined)
        
        @scala.inline
        def setType(value: PopupType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait PopupService extends StObject {
      
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
      implicit class PopupServiceMutableBuilder[Self <: PopupService] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClosePopup(value: String => Unit): Self = StObject.set(x, "closePopup", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreatePopup(value: typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup => Unit): Self = StObject.set(x, "createPopup", js.Any.fromFunction1(value))
        
        @scala.inline
        def setDeletePopup(value: String => Unit): Self = StObject.set(x, "deletePopup", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetPopupsId(value: () => String): Self = StObject.set(x, "getPopupsId", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOpenPopup(value: String => Unit): Self = StObject.set(x, "openPopup", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetPopupsId(value: String => Unit): Self = StObject.set(x, "setPopupsId", js.Any.fromFunction1(value))
        
        @scala.inline
        def setUpdatePopup(
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
        
        @scala.inline
        def `1`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1` = 1.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`]
        
        @scala.inline
        def `2`: typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2` = 2.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2`]
      }
    }
  }
}
