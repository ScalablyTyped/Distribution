package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodespacesTotalcount extends StObject {
  
  var codespaces: js.Array[Gitstatus]
  
  var total_count: Double
}
object CodespacesTotalcount {
  
  inline def apply(codespaces: js.Array[Gitstatus], total_count: Double): CodespacesTotalcount = {
    val __obj = js.Dynamic.literal(codespaces = codespaces.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodespacesTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodespacesTotalcount] (val x: Self) extends AnyVal {
    
    inline def setCodespaces(value: js.Array[Gitstatus]): Self = StObject.set(x, "codespaces", value.asInstanceOf[js.Any])
    
    inline def setCodespacesVarargs(value: Gitstatus*): Self = StObject.set(x, "codespaces", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
