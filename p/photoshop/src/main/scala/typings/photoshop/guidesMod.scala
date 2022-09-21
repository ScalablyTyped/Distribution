package typings.photoshop

import org.scalablytyped.runtime.NumberDictionary
import typings.photoshop.anon.Get
import typings.photoshop.constantsMod.Direction
import typings.photoshop.guideMod.Guide
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guidesMod {
  
  @JSImport("photoshop/dom/collections/Guides", "Guides")
  @js.native
  open class Guides protected ()
    extends StObject
       with /**
    * Used to access the guides in the collection
    */
  /* index */ NumberDictionary[Guide] {
    /**
      * @ignore
      */
    def this(docId: Double) = this()
    
    /**
      * @ignore
      */
    val _docId: Double = js.native
    
    /**
      * Adds a guide for the collection at the given coordinate and direction
      */
    def add(direction: Direction, coordinate: Double): Unit = js.native
    
    /**
      * @ignore
      */
    def handler(): Get = js.native
    
    /**
      * Number of [[Guide]] elements in this collection
      */
    def length: Double = js.native
    
    /**
      * The owner document of this Guide collection
      */
    def parent: Document = js.native
    
    /**
      * @ignore
      */
    /* private */ var proxy: Any = js.native
    
    /**
      * Clears all guides from this collection
      */
    def removeAll(): Unit = js.native
  }
}
