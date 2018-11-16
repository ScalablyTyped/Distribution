package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISqlTypeWithPrecisionScale extends ISqlType {
  var precision: scala.Double = js.native
  var scale: scala.Double = js.native
  @JSName("type")
  var type_Original: ISqlTypeFactoryWithPrecisionScale = js.native
  @JSName("type")
  def type_MISqlTypeWithPrecisionScale(): ISqlTypeWithPrecisionScale = js.native
  @JSName("type")
  def type_MISqlTypeWithPrecisionScale(precision: scala.Double): ISqlTypeWithPrecisionScale = js.native
  @JSName("type")
  def type_MISqlTypeWithPrecisionScale(precision: scala.Double, scale: scala.Double): ISqlTypeWithPrecisionScale = js.native
}

