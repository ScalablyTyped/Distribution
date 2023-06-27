package typings.openui5

import typings.openui5.anon.`4`
import typings.openui5.openui5Ints.`1`
import typings.openui5.openui5Ints.`2`
import typings.openui5.sapUiCoreElementMod.MetadataOptions.DnD
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
    oClassInfo: `4`
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
  
  trait ControlRenderer extends StObject {
    
    /**
      * The API version of the RenderManager that are used in this renderer. See {@link sap.ui.core.RenderManager RenderManager }
      * API documentation for detailed information
      */
    var apiVersion: js.UndefOr[`1` | `2` | typings.openui5.openui5Ints.`4`] = js.undefined
    
    /**
      * The function that renders the control
      */
    def render(
      p1: typings.openui5.sapUiCoreRenderManagerMod.default,
      p2: typings.openui5.sapUiCoreElementMod.default
    ): Unit
  }
  object ControlRenderer {
    
    inline def apply(
      render: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapUiCoreElementMod.default) => Unit
    ): ControlRenderer = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render))
      __obj.asInstanceOf[ControlRenderer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlRenderer] (val x: Self) extends AnyVal {
      
      inline def setApiVersion(value: `1` | `2` | typings.openui5.openui5Ints.`4`): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setRender(
        value: (typings.openui5.sapUiCoreRenderManagerMod.default, typings.openui5.sapUiCoreElementMod.default) => Unit
      ): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ElementMetadata
    extends typings.openui5.sapUiBaseManagedObjectMetadataMod.default {
    
    /**
      * @since 1.56
      *
      * Returns an info object describing the drag-and-drop behavior.
      *
      * @returns An info object about the drag-and-drop behavior.
      */
    def getDragDropInfo(): DnD = js.native
    def getDragDropInfo(/**
      * name of the aggregation or empty.
      */
    sAggregationName: String): DnD = js.native
    
    /**
      * By default, the element name is equal to the class name
      *
      * @returns the qualified name of the UIElement class
      */
    def getElementName(): String = js.native
  }
}
