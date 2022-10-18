package typings.openui5

import typings.openui5.sapUiIntegrationWidgetsCardMod.CardFacade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationEditorExtensionMod {
  
  @JSImport("sap/ui/integration/editor/Extension", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Extension`.
    */
  open class default () extends Extension {
    def this(/**
      * Initial settings for the new extension.
      */
    mSettings: ExtensionSettings) = this()
    def this(/**
      * ID for the new extension, generated automatically if no ID is given.
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new extension, generated automatically if no ID is given.
      */
    sId: String,
      /**
      * Initial settings for the new extension.
      */
    mSettings: ExtensionSettings
    ) = this()
    def this(
      /**
      * ID for the new extension, generated automatically if no ID is given.
      */
    sId: Unit,
      /**
      * Initial settings for the new extension.
      */
    mSettings: ExtensionSettings
    ) = this()
  }
  
  @js.native
  trait Extension
    extends typings.openui5.sapUiIntegrationExtensionMod.default {
    
    /**
      * Returns an interface to the editor, which uses this extension.
      *
      * @returns An interface to the card.
      */
    def getEditor(): CardFacade = js.native
    
    /**
      * Called when the editor is ready.
      */
    def onEditorReady(): Unit = js.native
  }
  
  type ExtensionSettings = typings.openui5.sapUiIntegrationExtensionMod.ExtensionSettings
}
