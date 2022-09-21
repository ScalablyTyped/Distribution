package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beforeSelectRecordEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/BeforeSelectRecordEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with BeforeSelectRecordEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var bookmarks: js.Array[String] = js.native
    
    /* private */ /* CompleteClass */
    var selectedRecords_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/BeforeSelectRecordEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BeforeSelectRecordEvent extends StObject {
    
    var bookmarks: js.Array[String]
    
    /* private */ var selectedRecords_ : Any
  }
  object BeforeSelectRecordEvent {
    
    inline def apply(bookmarks: js.Array[String], selectedRecords_ : Any): BeforeSelectRecordEvent = {
      val __obj = js.Dynamic.literal(bookmarks = bookmarks.asInstanceOf[js.Any], selectedRecords_ = selectedRecords_.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeSelectRecordEvent]
    }
    
    extension [Self <: BeforeSelectRecordEvent](x: Self) {
      
      inline def setBookmarks(value: js.Array[String]): Self = StObject.set(x, "bookmarks", value.asInstanceOf[js.Any])
      
      inline def setBookmarksVarargs(value: String*): Self = StObject.set(x, "bookmarks", js.Array(value*))
      
      inline def setSelectedRecords_(value: Any): Self = StObject.set(x, "selectedRecords_", value.asInstanceOf[js.Any])
    }
  }
}
