package typings.mssql.mssqlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProcedureResult[T] extends IResult[T] {
  var returnValue: js.Any
}

object IProcedureResult {
  @scala.inline
  def apply[T](
    output: StringDictionary[js.Any],
    recordset: IRecordSet[T],
    recordsets: js.Array[IRecordSet[T]],
    returnValue: js.Any,
    rowsAffected: js.Array[Double]
  ): IProcedureResult[T] = {
    val __obj = js.Dynamic.literal(output = output, recordset = recordset, recordsets = recordsets, returnValue = returnValue, rowsAffected = rowsAffected)
  
    __obj.asInstanceOf[IProcedureResult[T]]
  }
}

