package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISqlTypeFactoryWithPrecisionScale extends ISqlTypeFactory {
  def apply(): ISqlTypeWithPrecisionScale = js.native
  def apply(precision: scala.Double): ISqlTypeWithPrecisionScale = js.native
  def apply(precision: scala.Double, scale: scala.Double): ISqlTypeWithPrecisionScale = js.native
}

