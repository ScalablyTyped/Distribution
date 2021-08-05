package typings.mssql.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProcedureResult[T]
  extends StObject
     with IResult[T] {
  
  var returnValue: js.Any
}
object IProcedureResult {
  
  inline def apply[T](
    output: StringDictionary[js.Any],
    recordset: IRecordSet[T],
    recordsets: js.Array[IRecordSet[T]],
    returnValue: js.Any,
    rowsAffected: js.Array[Double]
  ): IProcedureResult[T] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], recordset = recordset.asInstanceOf[js.Any], recordsets = recordsets.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProcedureResult[T]]
  }
  
  extension [Self <: IProcedureResult[?], T](x: Self & IProcedureResult[T]) {
    
    inline def setReturnValue(value: js.Any): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
