package typings.mssql.mssqlMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait columns
  extends Array[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for T */ js.Any
    ] {
  def add(name: String, `type`: js.Function0[ISqlType]): Double = js.native
  def add(name: String, `type`: js.Function0[ISqlType], options: IColumnOptions): Double = js.native
  def add(name: String, `type`: ISqlType): Double = js.native
  def add(name: String, `type`: ISqlType, options: IColumnOptions): Double = js.native
}

