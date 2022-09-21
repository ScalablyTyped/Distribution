package typings.photoshop

import typings.photoshop.documentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object historyStateMod {
  
  @JSImport("photoshop/dom/HistoryState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("photoshop/dom/HistoryState", "HistoryState")
  @js.native
  open class HistoryState protected () extends StObject {
    /**
      * @ignore
      */
    def this(id: Double, docId: Double) = this()
    
    /**
      * The ID of the document of this history state.
      */
    def docId: Double = js.native
    
    /**
      * For use with batchPlay operations. This history ID, along with its document ID
      * can be used to represent this history state for the lifetime of this document.
      */
    def id: Double = js.native
    
    /**
      * The name of this history state as it appears on history panel
      */
    def name: String = js.native
    
    /**
      * Owner document of this history state
      */
    def parent: Document = js.native
    
    /**
      * Whether this history state is a snapshot or an automatically generated history state
      */
    def snapshot: Boolean = js.native
    
    /**
      * The class name of the referenced HistoryState object
      */
    def typename: String = js.native
  }
  
  inline def PSHistoryState(id: Double, docId: Double): HistoryState = (^.asInstanceOf[js.Dynamic].applyDynamic("PSHistoryState")(id.asInstanceOf[js.Any], docId.asInstanceOf[js.Any])).asInstanceOf[HistoryState]
  
  inline def validateHistoryState(h: HistoryState): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateHistoryState")(h.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
