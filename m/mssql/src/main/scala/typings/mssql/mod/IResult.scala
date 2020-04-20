package typings.mssql.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResult[T] extends js.Object {
  var output: StringDictionary[js.Any]
  var recordset: IRecordSet[T]
  var recordsets: js.Array[IRecordSet[T]]
  var rowsAffected: js.Array[Double]
}

object IResult {
  @scala.inline
  def apply[T](
    output: StringDictionary[js.Any],
    recordset: IRecordSet[T],
    recordsets: js.Array[IRecordSet[T]],
    rowsAffected: js.Array[Double]
  ): IResult[T] = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], recordset = recordset.asInstanceOf[js.Any], recordsets = recordsets.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult[T]]
  }
}

