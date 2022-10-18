package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcCommonWebComponentMetadataMod {
  
  @JSImport("sap/ui/webc/common/WebComponentMetadata", JSImport.Default)
  @js.native
  open class default protected () extends WebComponentMetadata {
    /**
      * Creates a new metadata object for a WebComponent Wrapper subclass.
      */
    def this(
      /**
      * fully qualified name of the class that is described by this metadata object
      */
    sClassName: String,
      /**
      * static info to construct the metadata from
      */
    oClassInfo: js.Object
    ) = this()
  }
  
  @js.native
  trait WebComponentMetadata
    extends typings.openui5.sapUiCoreElementMetadataMod.default {
    
    /**
      * Returns the list of public getters, proxied by the Component Wrapper to the component itself
      */
    def getGetters(): js.Array[Any] = js.native
    
    /**
      * Returns the list of public methods, proxied by the Component Wrapper to the component itself
      */
    def getMethods(): js.Array[Any] = js.native
    
    /**
      * Retrieves the renderer for the described web component class. Note: this is always the default renderer
      * and Web Component wrappers should not define their own renderers.
      */
    def getRenderer(): Unit = js.native
    
    /**
      * Returns the tag, used to render the Component Wrapper
      */
    def getTag(): String = js.native
  }
}
