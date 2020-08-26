package typings.mssql.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProcedureResult[T] extends IResult[T] {
  var returnValue: js.Any = js.native
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
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], recordset = recordset.asInstanceOf[js.Any], recordsets = recordsets.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProcedureResult[T]]
  }
  @scala.inline
  implicit class IProcedureResultOps[Self <: IProcedureResult[_], T] (val x: Self with IProcedureResult[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReturnValue(value: js.Any): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

