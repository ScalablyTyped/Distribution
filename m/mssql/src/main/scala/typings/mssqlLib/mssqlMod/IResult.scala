package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IResult[T] extends js.Object {
  var output: ScalablyTyped.runtime.StringDictionary[js.Any]
  var recordset: IRecordSet[T]
  var recordsets: js.Array[IRecordSet[T]]
  var rowsAffected: js.Array[scala.Double]
}

