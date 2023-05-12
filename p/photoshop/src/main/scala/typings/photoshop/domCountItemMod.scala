package typings.photoshop

import typings.photoshop.anon.X
import typings.photoshop.domCollectionsCountItemsMod.CountItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domCountItemMod {
  
  @JSImport("photoshop/dom/CountItem", "CountItem")
  @js.native
  open class CountItem () extends StObject {
    
    /**
      * The index of the Group the CountItem belongs to.
      */
    val groupIndex: Double = js.native
    
    /**
      * The itemIndex of the CountItem as received from the descriptor.
      */
    val itemIndex: Double = js.native
    
    /**
      * Moves the CountItem to a new position.
      * @param position : Object with x and y properties in pixels;
      * @minVersion 24.1
      */
    def move(position: X): Unit = js.native
    
    /**
      * The document collection in which we will find this and all other CountItems collected.
      * @minVersion 24.1
      */
    def parent: CountItems = js.native
    
    /**
      * The position of the CountItem as an object with x and y properties in pixels.
      * @minVersion 24.1
      */
    def position: X = js.native
    
    /**
      * Removes the CountItem from the document.
      * @minVersion 24.1
      */
    def remove(): Unit = js.native
    
    /**
      * The class name of the referenced CountItem object
      * @minVersion 24.1
      */
    def typename: typings.photoshop.photoshopStrings.CountItem = js.native
  }
}
