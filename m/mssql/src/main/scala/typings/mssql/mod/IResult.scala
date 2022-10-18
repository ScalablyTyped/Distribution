package typings.mssql.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResult[T] extends StObject {
  
  var output: StringDictionary[Any]
  
  var recordset: IRecordSet[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? T[0] : T */ js.Any
  ]
  
  var recordsets: /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? {[ P in keyof T ]: mssql.mssql.IRecordSet<T[P]>} : std.Array<mssql.mssql.IRecordSet<T>> */ js.Any
  
  var rowsAffected: js.Array[Double]
}
object IResult {
  
  inline def apply[T](
    output: StringDictionary[Any],
    recordset: IRecordSet[
      /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? T[0] : T */ js.Any
    ],
    recordsets: /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? {[ P in keyof T ]: mssql.mssql.IRecordSet<T[P]>} : std.Array<mssql.mssql.IRecordSet<T>> */ js.Any,
    rowsAffected: js.Array[Double]
  ): IResult[T] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], recordset = recordset.asInstanceOf[js.Any], recordsets = recordsets.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult[T]]
  }
  
  extension [Self <: IResult[?], T](x: Self & IResult[T]) {
    
    inline def setOutput(value: StringDictionary[Any]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setRecordset(
      value: IRecordSet[
          /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? T[0] : T */ js.Any
        ]
    ): Self = StObject.set(x, "recordset", value.asInstanceOf[js.Any])
    
    inline def setRecordsets(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<any> ? {[ P in keyof T ]: mssql.mssql.IRecordSet<T[P]>} : std.Array<mssql.mssql.IRecordSet<T>> */ js.Any
    ): Self = StObject.set(x, "recordsets", value.asInstanceOf[js.Any])
    
    inline def setRowsAffected(value: js.Array[Double]): Self = StObject.set(x, "rowsAffected", value.asInstanceOf[js.Any])
    
    inline def setRowsAffectedVarargs(value: Double*): Self = StObject.set(x, "rowsAffected", js.Array(value*))
  }
}
