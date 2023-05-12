package typings.nginstackIquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CompleteColumnsNames extends StObject {
    
    var completeColumnsNames: js.Array[Any]
    
    var simpleColumnsNames: js.Array[Any]
  }
  object CompleteColumnsNames {
    
    inline def apply(completeColumnsNames: js.Array[Any], simpleColumnsNames: js.Array[Any]): CompleteColumnsNames = {
      val __obj = js.Dynamic.literal(completeColumnsNames = completeColumnsNames.asInstanceOf[js.Any], simpleColumnsNames = simpleColumnsNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompleteColumnsNames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompleteColumnsNames] (val x: Self) extends AnyVal {
      
      inline def setCompleteColumnsNames(value: js.Array[Any]): Self = StObject.set(x, "completeColumnsNames", value.asInstanceOf[js.Any])
      
      inline def setCompleteColumnsNamesVarargs(value: Any*): Self = StObject.set(x, "completeColumnsNames", js.Array(value*))
      
      inline def setSimpleColumnsNames(value: js.Array[Any]): Self = StObject.set(x, "simpleColumnsNames", value.asInstanceOf[js.Any])
      
      inline def setSimpleColumnsNamesVarargs(value: Any*): Self = StObject.set(x, "simpleColumnsNames", js.Array(value*))
    }
  }
}
