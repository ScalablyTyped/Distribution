package typings.photoshop

import typings.photoshop.anon.Get
import typings.photoshop.domHistoryStateMod.HistoryState
import typings.std.Array
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domCollectionsHistoryStatesMod {
  
  @JSImport("photoshop/dom/collections/HistoryStates", "HistoryStates")
  @js.native
  open class HistoryStates protected ()
    extends StObject
       with Array[HistoryState] {
    /**
      * @ignore
      */
    def this(docId: Double) = this()
    
    /**
      * @ignore
      */
    val _docId: Double = js.native
    
    /**
      * Find the first history state with the matching name.
      * @minVersion 22.5
      */
    def getByName(name: String): HistoryState = js.native
    
    /**
      * @ignore
      */
    def handler(): Get = js.native
    
    /**
      * Number of [[HistoryState]] elements in this collection.
      * @minVersion 22.5
      */
    @JSName("length")
    def length_MHistoryStates: Double = js.native
    
    /**
      * The owner document of this HistoryState collection.
      * @minVersion 22.5
      */
    def parent: Document = js.native
    
    /**
      * @ignore
      */
    /* private */ var proxy: Any = js.native
  }
}
