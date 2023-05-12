package typings.photoshop

import typings.photoshop.anon.Get
import typings.photoshop.anon.X
import typings.photoshop.domColorSamplerMod.ColorSampler
import typings.std.Array
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domCollectionsColorSamplersMod {
  
  @JSImport("photoshop/dom/collections/ColorSamplers", "ColorSamplers")
  @js.native
  open class ColorSamplers protected ()
    extends StObject
       with Array[ColorSampler] {
    /**
      * @ignore
      */
    def this(docId: Double) = this()
    
    /**
      * @ignore
      */
    /* private */ val _docId: Any = js.native
    
    /**
      * Adds a [[ColorSampler]] to the collection at the given `{x, y}` coordinates in pixels.
      *
      * ```javascript
      * app.activeDocument.colorSamplers.add({x: 20, y: 20});
      * app.activeDocument.colorSamplers.length; // returns 1
      * ```
      * @minVersion 24.0
      */
    def add(position: X): ColorSampler = js.native
    
    /**
      * @ignore
      */
    def handler(): Get = js.native
    
    /**
      * Number of [[ColorSampler]] elements in this collection.
      * ```javascript
      * // A new document starts with no colorSamplers
      * app.activeDocument.colorSamplers.length; // returns 0
      * ```
      * @minVersion 24.0
      */
    @JSName("length")
    def length_MColorSamplers: Double = js.native
    
    /**
      * The owner [[Document]] of this ColorSamplers collection.
      * @minVersion 24.0
      */
    def parent: Document = js.native
    
    /**
      * @ignore
      */
    /* private */ var proxy: Any = js.native
    
    /**
      * Removes all ColorSampler instances from this collection.
      *
      * ```javascript
      * app.activeDocument.colorSamplers.removeAll();
      * app.activeDocument.colorSamplers.length; // returns 0
      * ```
      * @minVersion 24.0
      */
    def removeAll(): Unit = js.native
  }
}
