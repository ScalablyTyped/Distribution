package typings.mssql.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISqlTypeFactoryWithScale extends ISqlTypeFactory {
  def apply(): ISqlTypeWithScale = js.native
  def apply(scale: Double): ISqlTypeWithScale = js.native
}

