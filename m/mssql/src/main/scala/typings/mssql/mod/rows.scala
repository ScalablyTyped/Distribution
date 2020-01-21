package typings.mssql.mod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait rows
  extends Array[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ js.Any
    ] {
  def add(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param row because its type IRow is not an array type */ row: IRow
  ): Double = js.native
}

