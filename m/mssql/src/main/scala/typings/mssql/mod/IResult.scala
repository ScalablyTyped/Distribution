package typings.mssql.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResult[T] extends StObject {
  
  var output: StringDictionary[Any]
  
  var recordset: IRecordSet[
    T | (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any)
  ]
  
  var recordsets: js.Array[IRecordSet[T]] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: mssql.mssql.IRecordSet<T[P]>}
    */ typings.mssql.mssqlStrings.IResult & TopLevel[T])
  
  var rowsAffected: js.Array[Double]
}
object IResult {
  
  inline def apply[T](
    output: StringDictionary[Any],
    recordset: IRecordSet[
      T | (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any)
    ],
    recordsets: js.Array[IRecordSet[T]] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: mssql.mssql.IRecordSet<T[P]>}
    */ typings.mssql.mssqlStrings.IResult & TopLevel[T]),
    rowsAffected: js.Array[Double]
  ): IResult[T] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], recordset = recordset.asInstanceOf[js.Any], recordsets = recordsets.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult[T]]
  }
  
  extension [Self <: IResult[?], T](x: Self & IResult[T]) {
    
    inline def setOutput(value: StringDictionary[Any]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setRecordset(
      value: IRecordSet[
          T | (/* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any)
        ]
    ): Self = StObject.set(x, "recordset", value.asInstanceOf[js.Any])
    
    inline def setRecordsets(
      value: js.Array[IRecordSet[T]] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: mssql.mssql.IRecordSet<T[P]>}
      */ typings.mssql.mssqlStrings.IResult & TopLevel[T])
    ): Self = StObject.set(x, "recordsets", value.asInstanceOf[js.Any])
    
    inline def setRecordsetsVarargs(value: IRecordSet[T]*): Self = StObject.set(x, "recordsets", js.Array(value*))
    
    inline def setRowsAffected(value: js.Array[Double]): Self = StObject.set(x, "rowsAffected", value.asInstanceOf[js.Any])
    
    inline def setRowsAffectedVarargs(value: Double*): Self = StObject.set(x, "rowsAffected", js.Array(value*))
  }
}
