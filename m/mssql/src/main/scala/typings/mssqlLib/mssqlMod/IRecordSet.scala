package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRecordSet[T]
  extends stdLib.Array[T] {
  var columns: IColumnMetadata = js.native
  def toTable(): Table = js.native
  def toTable(name: java.lang.String): Table = js.native
}

