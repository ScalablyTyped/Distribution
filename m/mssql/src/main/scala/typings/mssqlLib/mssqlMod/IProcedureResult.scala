package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProcedureResult[T] extends IResult[T] {
  var returnValue: js.Any
}

object IProcedureResult {
  @scala.inline
  def apply[T](
    output: org.scalablytyped.runtime.StringDictionary[js.Any],
    recordset: IRecordSet[T],
    recordsets: js.Array[IRecordSet[T]],
    returnValue: js.Any,
    rowsAffected: js.Array[scala.Double]
  ): IProcedureResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("output")(output)
    __obj.updateDynamic("recordset")(recordset)
    __obj.updateDynamic("recordsets")(recordsets)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.updateDynamic("rowsAffected")(rowsAffected)
    __obj.asInstanceOf[IProcedureResult[T]]
  }
}

