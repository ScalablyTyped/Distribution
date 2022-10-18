package typings.photoshop

import typings.photoshop.anon.Get
import typings.photoshop.domLayerMod.Layer
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domCollectionsLayersMod {
  
  @JSImport("photoshop/dom/collections/Layers", "Layers")
  @js.native
  open class Layers protected ()
    extends StObject
       with Array[Layer] {
    /** @ignore */
    def this(parentDoc: Double, layerIDs: js.Array[Double]) = this()
    
    /**
      * Create a new layer.
      *
      * @async
      * ```javascript
      * let newDoc1 = await app.activeDocument.layers.add();
      * ```
      */
    def add(): js.Promise[Layer | Null] = js.native
    
    /**
      * Find the first layer with the matching name
      */
    def getByName(name: String): Layer = js.native
    
    /** @ignore */
    def handler(): Get = js.native
    
    /** @ignore */
    /* private */ var layerIDs: Any = js.native
    
    /**
      * Number of [[Layer]] elements in this collection
      */
    @JSName("length")
    def length_MLayers: Double = js.native
    
    /** @ignore */
    /* private */ var parentDocID: Any = js.native
    
    /** @ignore */
    /* private */ var proxy: Any = js.native
    
    /**
      * The name for this object collection: Layers
      */
    def typename: String = js.native
  }
}
