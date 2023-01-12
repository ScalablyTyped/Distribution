package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QCStatementJson extends StObject {
  
  var id: String
  
  var `type`: js.UndefOr[Any] = js.undefined
}
object QCStatementJson {
  
  inline def apply(id: String): QCStatementJson = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[QCStatementJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QCStatementJson] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
