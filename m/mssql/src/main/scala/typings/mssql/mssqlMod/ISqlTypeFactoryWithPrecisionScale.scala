package typings.mssql.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISqlTypeFactoryWithPrecisionScale extends ISqlTypeFactory {
  def apply(): ISqlTypeWithPrecisionScale = js.native
  def apply(precision: Double): ISqlTypeWithPrecisionScale = js.native
  def apply(precision: Double, scale: Double): ISqlTypeWithPrecisionScale = js.native
}

