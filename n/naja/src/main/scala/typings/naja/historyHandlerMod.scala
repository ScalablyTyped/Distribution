package typings.naja

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object historyHandlerMod {
  
  @JSImport("naja/src/core/HistoryHandler", "HistoryHandler")
  @js.native
  class HistoryHandler () extends StObject {
    
    var historyAdapter: HistoryAdapter = js.native
    
    var uiCache: Boolean = js.native
  }
  
  trait HistoryAdapter extends StObject {
    
    def pushState(data: js.Any, title: String, url: String): Unit
    
    def replaceState(data: js.Any, title: String, url: String): Unit
  }
  object HistoryAdapter {
    
    @scala.inline
    def apply(pushState: (js.Any, String, String) => Unit, replaceState: (js.Any, String, String) => Unit): HistoryAdapter = {
      val __obj = js.Dynamic.literal(pushState = js.Any.fromFunction3(pushState), replaceState = js.Any.fromFunction3(replaceState))
      __obj.asInstanceOf[HistoryAdapter]
    }
    
    @scala.inline
    implicit class HistoryAdapterMutableBuilder[Self <: HistoryAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPushState(value: (js.Any, String, String) => Unit): Self = StObject.set(x, "pushState", js.Any.fromFunction3(value))
      
      @scala.inline
      def setReplaceState(value: (js.Any, String, String) => Unit): Self = StObject.set(x, "replaceState", js.Any.fromFunction3(value))
    }
  }
}
