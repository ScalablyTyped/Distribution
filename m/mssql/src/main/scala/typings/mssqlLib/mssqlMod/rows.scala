package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait rows
  extends stdLib.Array[js.Object] {
  def add(
    /* import warning: Dropping repeated marker of param TsIdentSimple(row) because its type Some(TsTypeRef(TsQIdent(List(TsIdentSimple(IRow))),List())) is not an array type */row: mssqlLib.IRow
  ): scala.Double = js.native
}

