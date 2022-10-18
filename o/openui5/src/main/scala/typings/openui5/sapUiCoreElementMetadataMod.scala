package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreElementMetadataMod {
  
  @JSImport("sap/ui/core/ElementMetadata", JSImport.Default)
  @js.native
  open class default protected () extends ElementMetadata {
    /**
      * Creates a new metadata object for a UIElement subclass.
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
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/ElementMetadata", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculates a new id based on a prefix.
      *
      * @returns A (hopefully unique) control id
      */
    inline def uid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")().asInstanceOf[String]
  }
  
  @js.native
  trait ElementMetadata
    extends typings.openui5.sapUiBaseManagedObjectMetadataMod.default {
    
    /**
      * @SINCE 1.56
      *
      * Returns an info object describing the drag-and-drop behavior.
      *
      * @returns An info object about the drag-and-drop behavior.
      */
    def getDragDropInfo(): js.Object = js.native
    def getDragDropInfo(/**
      * name of the aggregation or empty.
      */
    sAggregationName: String): js.Object = js.native
    
    /**
      * By default, the element name is equal to the class name
      *
      * @returns the qualified name of the UIElement class
      */
    def getElementName(): String = js.native
  }
}
