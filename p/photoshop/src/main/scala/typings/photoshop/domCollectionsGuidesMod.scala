package typings.photoshop

import typings.photoshop.anon.Get
import typings.photoshop.domConstantsMod.Direction
import typings.photoshop.domDocumentMod.Document
import typings.photoshop.domGuideMod.Guide
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domCollectionsGuidesMod {
  
  @JSImport("photoshop/dom/collections/Guides", "Guides")
  @js.native
  open class Guides protected ()
    extends StObject
       with Array[Guide] {
    /**
      * @ignore
      */
    def this(docId: Double) = this()
    
    /**
      * @ignore
      */
    val _docId: Double = js.native
    
    /**
      * Ruler origin defines where coordinates [0,0] are located.
      * Point coordinates are calculated from left top corner of the canvas.
      * @ignore
      */
    /**
      * Adds a guide for the collection at the given coordinate and direction
      *
      *
      * ***Fixes in Photoshop 24.0:***
      * - *Correct coordinate when resolution is not 72 PPI*
      * - *Returns valid instance of guide*
      *
      * @param direction Indicates whether the guide is vertical or horizontal
      * @param coordinate Position of the guide measured from the ruler origin in pixels.
      * The value can be a decimal number.
      *
      * Note: the user can move the ruler origin which will affect the position value of the guides.
      * @minVersion 23.0
      */
    def add(direction: Direction, coordinate: Double): Guide = js.native
    
    /**
      * @ignore
      */
    def handler(): Get = js.native
    
    /**
      * Number of [[Guide]] elements in this collection.
      * @minVersion 23.0
      */
    @JSName("length")
    def length_MGuides: Double = js.native
    
    /**
      * The owner document of this Guide collection.
      * @minVersion 23.0
      */
    def parent: Document = js.native
    
    /**
      * @ignore
      */
    /* private */ var proxy: Any = js.native
    
    /**
      * Clears all guides from this collection.
      * @minVersion 23.0
      */
    def removeAll(): Unit = js.native
  }
}
