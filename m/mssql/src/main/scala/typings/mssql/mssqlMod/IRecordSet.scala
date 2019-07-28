package typings.mssql.mssqlMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRecordSet[T] extends Array[T] {
  var columns: IColumnMetadata = js.native
  def toTable(): Table = js.native
  def toTable(name: String): Table = js.native
}

