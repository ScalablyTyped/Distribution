package typings.mssql.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProcedureResult[T]
  extends StObject
     with IResult[T] {
  
  var returnValue: Any
}
object IProcedureResult {
  
  inline def apply[T](
    output: StringDictionary[Any],
    recordset: IRecordSet[
      T | (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any)
    ],
    recordsets: js.Array[IRecordSet[T]] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: mssql.mssql.IRecordSet<T[P]>}
    */ typings.mssql.mssqlStrings.IResult & TopLevel[T]),
    returnValue: Any,
    rowsAffected: js.Array[Double]
  ): IProcedureResult[T] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], recordset = recordset.asInstanceOf[js.Any], recordsets = recordsets.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProcedureResult[T]]
  }
  
  extension [Self <: IProcedureResult[?], T](x: Self & IProcedureResult[T]) {
    
    inline def setReturnValue(value: Any): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
