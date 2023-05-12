package typings.photoshop

import typings.photoshop.domDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domHistoryStateMod {
  
  @JSImport("photoshop/dom/HistoryState", "HistoryState")
  @js.native
  open class HistoryState protected () extends StObject {
    /**
      * @ignore
      */
    def this(id: Double, docId: Double) = this()
    
    /**
      * The ID of the document of this history state.
      * @minVersion 22.5
      */
    def docId: Double = js.native
    
    /**
      * For use with batchPlay operations. This history ID, along with its document ID
      * can be used to represent this history state for the lifetime of this document.
      * @minVersion 22.5
      */
    def id: Double = js.native
    
    /**
      * The name of this history state as it appears on history panel.
      * @minVersion 22.5
      */
    def name: String = js.native
    
    /**
      * Owner document of this history state.
      * @minVersion 22.5
      */
    def parent: Document = js.native
    
    /**
      * Whether this history state is a snapshot or an automatically generated history state.
      * @minVersion 22.5
      */
    def snapshot: Boolean = js.native
    
    /**
      * The class name of the referenced object: *"HistoryState"*.
      * @minVersion 23.0
      */
    def typename: typings.photoshop.photoshopStrings.HistoryState = js.native
  }
}
