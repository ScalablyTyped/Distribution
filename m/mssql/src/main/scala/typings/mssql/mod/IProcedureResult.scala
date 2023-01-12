package typings.mssql.mod

import org.scalablytyped.runtime.StringDictionary
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
      /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? T[0] : T */ js.Any
    ],
    recordsets: /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? {[ P in keyof T ]: mssql.mssql.IRecordSet<T[P]>} : std.Array<mssql.mssql.IRecordSet<T>> */ js.Any,
    returnValue: Any,
    rowsAffected: js.Array[Double]
  ): IProcedureResult[T] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], recordset = recordset.asInstanceOf[js.Any], recordsets = recordsets.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProcedureResult[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IProcedureResult[?], T] (val x: Self & IProcedureResult[T]) extends AnyVal {
    
    inline def setReturnValue(value: Any): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
