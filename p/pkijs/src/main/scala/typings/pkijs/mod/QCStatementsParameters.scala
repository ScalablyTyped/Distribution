package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IQCStatements> */
trait QCStatementsParameters extends StObject {
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var values: js.UndefOr[js.Array[QCStatement]] = js.undefined
}
object QCStatementsParameters {
  
  inline def apply(): QCStatementsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QCStatementsParameters]
  }
  
  extension [Self <: QCStatementsParameters](x: Self) {
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setValues(value: js.Array[QCStatement]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: QCStatement*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
