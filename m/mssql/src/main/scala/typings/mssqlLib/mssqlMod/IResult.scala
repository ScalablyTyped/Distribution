package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResult[T] extends js.Object {
  var output: org.scalablytyped.runtime.StringDictionary[js.Any]
  var recordset: IRecordSet[T]
  var recordsets: js.Array[IRecordSet[T]]
  var rowsAffected: js.Array[scala.Double]
}

object IResult {
  @scala.inline
  def apply[T](
    output: org.scalablytyped.runtime.StringDictionary[js.Any],
    recordset: IRecordSet[T],
    recordsets: js.Array[IRecordSet[T]],
    rowsAffected: js.Array[scala.Double]
  ): IResult[T] = {
    val __obj = js.Dynamic.literal(output = output, recordset = recordset, recordsets = recordsets, rowsAffected = rowsAffected)
  
    __obj.asInstanceOf[IResult[T]]
  }
}

