package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait rows
  extends stdLib.Array[
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for T */ js.Any
    ] {
  def add(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param row because its type IRow is not an array type */ row: mssqlLib.IRow
  ): scala.Double = js.native
}

