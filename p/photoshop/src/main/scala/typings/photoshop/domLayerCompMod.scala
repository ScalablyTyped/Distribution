package typings.photoshop

import typings.photoshop.domDocumentMod.Document
import typings.photoshop.domLayerMod.Layer
import typings.photoshop.domTypesLayerCompTypesMod.LayerCompRecaptureOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domLayerCompMod {
  
  @JSImport("photoshop/dom/LayerComp", "LayerComp")
  @js.native
  open class LayerComp protected () extends StObject {
    /**
      * @ignore
      */
    def this(id: Double, docId: Double) = this()
    
    /**
      * @ignore
      */
    /* private */ def _directRef: Any = js.native
    
    /**
      * If true, the layer comp will remember the layers' appearance (layer style) settings.
      *
      * @minVersion 24.0
      */
    def appearance: Boolean = js.native
    def appearance_=(value: Boolean): Unit = js.native
    
    /**
      * Applies the layer comp to the document.
      *
      * @async
      * @minVersion 24.0
      */
    @JSName("apply")
    def apply(): js.Promise[Unit] = js.native
    
    /**
      * If true, the layer comp will remember which of the Smart Object's layer comps are set in the Properties panel.
      *
      * @minVersion 24.0
      */
    def childComp: Boolean = js.native
    def childComp_=(value: Boolean): Unit = js.native
    
    /**
      * The description of the layer comp.
      *
      * @minVersion 24.0
      */
    def comment: String | Null = js.native
    def comment_=(comment: String | Null): Unit = js.native
    
    /**
      * The ID of the document of this layer comp.
      *
      * @minVersion 24.0
      */
    def docId: Double = js.native
    
    /**
      * Duplicates this layer comp
      *
      * @returns newly created layer comp
      * @async
      * @minVersion 24.0
      */
    def duplicate(): js.Promise[LayerComp] = js.native
    
    /**
      * For use with batchPlay operations. This layer comp ID, along with its document ID
      * can be used to represent this layer comp for the lifetime of this document or the layer comp.
      *
      * @minVersion 24.0
      */
    def id: Double = js.native
    
    /**
      * The name of the layer comp.
      *
      * @minVersion 24.0
      */
    def name: String = js.native
    def name_=(name: String): Unit = js.native
    
    /**
      * Owner document of this layer comp
      *
      * @minVersion 24.0
      */
    def parent: Document = js.native
    
    /**
      * If true, the layer comp will remember layers' positions.
      *
      * @minVersion 24.0
      */
    def position: Boolean = js.native
    def position_=(value: Boolean): Unit = js.native
    
    /**
      * Updates the recorded states of the layers for this layer comp.
      *
      * Applies to all layers and all properties supported by this layer comp.
      *
      * @async
      * @minVersion 24.0
      */
    def recapture(): js.Promise[Unit] = js.native
    /**
      * Updates the recorded states of the layers for this layer comp.
      *
      * @async
      * @param argument what properties to recapture.
      * @param layers if this argument is passed then only specified layers will be recaptured.
      */
    def recapture(arg: LayerCompRecaptureOptions): js.Promise[Unit] = js.native
    def recapture(arg: LayerCompRecaptureOptions, layers: js.Array[Layer]): js.Promise[Unit] = js.native
    
    /**
      * Deletes this object from document.
      *
      * @async
      * @minVersion 24.0
      */
    def remove(): js.Promise[Unit] = js.native
    
    /**
      * Resets the layer comp state to the document state.
      *
      * @async
      * @minVersion 24.0
      */
    def resetLayerComp(): js.Promise[Unit] = js.native
    
    /**
      * If true, the layer comp is currently selected in the Layer Comps panel.
      *
      * Note: selected does not mean that this layer comp is applied to document.
      *
      * @minVersion 24.0
      */
    def selected: Boolean = js.native
    
    /**
      * The class name of the referenced LayerComp object
      *
      * @minVersion 24.0
      */
    def typename: typings.photoshop.photoshopStrings.LayerComp = js.native
    
    /**
      * If true, the layer comp will remember layers' visibilities.
      *
      * @minVersion 24.0
      */
    def visibility: Boolean = js.native
    def visibility_=(value: Boolean): Unit = js.native
  }
}
