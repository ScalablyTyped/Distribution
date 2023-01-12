package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QCStatementsJson extends StObject {
  
  var values: js.Array[QCStatementJson]
}
object QCStatementsJson {
  
  inline def apply(values: js.Array[QCStatementJson]): QCStatementsJson = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[QCStatementsJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QCStatementsJson] (val x: Self) extends AnyVal {
    
    inline def setValues(value: js.Array[QCStatementJson]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: QCStatementJson*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
