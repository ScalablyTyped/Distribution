package typings.opentok

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    var id: String
    
    var layoutClassList: js.Array[String]
  }
  object Id {
    
    inline def apply(id: String, layoutClassList: js.Array[String]): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], layoutClassList = layoutClassList.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLayoutClassList(value: js.Array[String]): Self = StObject.set(x, "layoutClassList", value.asInstanceOf[js.Any])
      
      inline def setLayoutClassListVarargs(value: String*): Self = StObject.set(x, "layoutClassList", js.Array(value*))
    }
  }
}
