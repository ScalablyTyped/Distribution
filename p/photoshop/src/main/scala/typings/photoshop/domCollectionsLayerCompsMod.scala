package typings.photoshop

import typings.photoshop.anon.Get
import typings.photoshop.domDocumentMod.Document
import typings.photoshop.domLayerCompMod.LayerComp
import typings.photoshop.domTypesLayerCompTypesMod.LayerCompCreateOptions
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domCollectionsLayerCompsMod {
  
  @JSImport("photoshop/dom/collections/LayerComps", "LayerComps")
  @js.native
  open class LayerComps protected ()
    extends StObject
       with Array[LayerComp] {
    /**
      * @ignore
      */
    def this(docId: Double) = this()
    
    /**
      * @ignore
      */
    val _docId: Double = js.native
    
    /**
      * Adds a Layer Comp to the document's collection. If no options are given, only visibility will be recorded.
      *
      * Note: This command will fail if the document is flat, that is, only a Background and no other layers.
      *
      * @param options An optional object literal containing key/value pairs as described by [[LayerCompCreateOptions]]
      * ```javascript
      * const options = {
      *   name: "mockup",
      *   comment: "First attempt",
      *   visibility: true,
      *   position: true
      *  };
      * await require('photoshop').app.activeDocument.layerComps.add(options);
      * ```
      *
      * @minVersion 24.0
      */
    def add(): js.Promise[LayerComp] = js.native
    def add(options: LayerCompCreateOptions): js.Promise[LayerComp] = js.native
    
    /**
      * Get all Layer Comps by name
      * @param name
      *
      * @minVersion 24.0
      */
    def getAllByName(name: String): js.Array[LayerComp] = js.native
    
    /**
      * @ignore
      */
    def handler(): Get = js.native
    
    /**
      * Number of [[LayerComp]] elements in this collection
      *
      * @minVersion 24.0
      */
    @JSName("length")
    def length_MLayerComps: Double = js.native
    
    /**
      * The owner document of this Layer comp collection
      *
      * @minVersion 24.0
      */
    def parent: Document = js.native
    
    /**
      * @ignore
      */
    /* private */ var proxy: Any = js.native
    
    /**
      * Clears all Layer Comps from this collection
      *
      * @minVersion 24.0
      */
    def removeAll(): js.Promise[Unit] = js.native
    
    /**
      * The name for this object collection: LayerComps
      *
      * @minVersion 24.0
      */
    def typename: typings.photoshop.photoshopStrings.LayerComps = js.native
  }
}
