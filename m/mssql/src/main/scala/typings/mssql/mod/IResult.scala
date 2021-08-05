package typings.mssql.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResult[T] extends StObject {
  
  var output: StringDictionary[js.Any]
  
  var recordset: IRecordSet[T]
  
  var recordsets: js.Array[IRecordSet[T]]
  
  var rowsAffected: js.Array[Double]
}
object IResult {
  
  inline def apply[T](
    output: StringDictionary[js.Any],
    recordset: IRecordSet[T],
    recordsets: js.Array[IRecordSet[T]],
    rowsAffected: js.Array[Double]
  ): IResult[T] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], recordset = recordset.asInstanceOf[js.Any], recordsets = recordsets.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult[T]]
  }
  
  extension [Self <: IResult[?], T](x: Self & IResult[T]) {
    
    inline def setOutput(value: StringDictionary[js.Any]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setRecordset(value: IRecordSet[T]): Self = StObject.set(x, "recordset", value.asInstanceOf[js.Any])
    
    inline def setRecordsets(value: js.Array[IRecordSet[T]]): Self = StObject.set(x, "recordsets", value.asInstanceOf[js.Any])
    
    inline def setRecordsetsVarargs(value: IRecordSet[T]*): Self = StObject.set(x, "recordsets", js.Array(value :_*))
    
    inline def setRowsAffected(value: js.Array[Double]): Self = StObject.set(x, "rowsAffected", value.asInstanceOf[js.Any])
    
    inline def setRowsAffectedVarargs(value: Double*): Self = StObject.set(x, "rowsAffected", js.Array(value :_*))
  }
}
