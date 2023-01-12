package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQCStatements extends StObject {
  
  var values: js.Array[QCStatement]
}
object IQCStatements {
  
  inline def apply(values: js.Array[QCStatement]): IQCStatements = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQCStatements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IQCStatements] (val x: Self) extends AnyVal {
    
    inline def setValues(value: js.Array[QCStatement]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: QCStatement*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
