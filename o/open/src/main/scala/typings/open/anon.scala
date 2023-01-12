package typings.open

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Record<open.open.AppName, string | std.Array<string>> */
  trait RecordAppNamestringArrays extends StObject {
    
    var chrome: String | js.Array[String]
    
    var edge: String | js.Array[String]
    
    var firefox: String | js.Array[String]
  }
  object RecordAppNamestringArrays {
    
    inline def apply(
      chrome: String | js.Array[String],
      edge: String | js.Array[String],
      firefox: String | js.Array[String]
    ): RecordAppNamestringArrays = {
      val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordAppNamestringArrays]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordAppNamestringArrays] (val x: Self) extends AnyVal {
      
      inline def setChrome(value: String | js.Array[String]): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      inline def setChromeVarargs(value: String*): Self = StObject.set(x, "chrome", js.Array(value*))
      
      inline def setEdge(value: String | js.Array[String]): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeVarargs(value: String*): Self = StObject.set(x, "edge", js.Array(value*))
      
      inline def setFirefox(value: String | js.Array[String]): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
      
      inline def setFirefoxVarargs(value: String*): Self = StObject.set(x, "firefox", js.Array(value*))
    }
  }
}
