package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Castable extends js.Object {
  def as(alias: java.lang.String): this.type
  def asArray(): this.type
  def castArray(): this.type
  def castBigInt(): this.type
  def castBool(): this.type
  def castDecimal(): this.type
  def castFloat(): this.type
  def castInt(): this.type
  def castJson(): this.type
  def castReal(): this.type
  def castText(): this.type
  def castTo(sqlType: java.lang.String): this.type
  def castType(sqlType: java.lang.String): this.type
}

object Castable {
  @scala.inline
  def apply(
    as: js.Function1[java.lang.String, Castable],
    asArray: js.Function0[Castable],
    castArray: js.Function0[Castable],
    castBigInt: js.Function0[Castable],
    castBool: js.Function0[Castable],
    castDecimal: js.Function0[Castable],
    castFloat: js.Function0[Castable],
    castInt: js.Function0[Castable],
    castJson: js.Function0[Castable],
    castReal: js.Function0[Castable],
    castText: js.Function0[Castable],
    castTo: js.Function1[java.lang.String, Castable],
    castType: js.Function1[java.lang.String, Castable]
  ): Castable = {
    val __obj = js.Dynamic.literal(as = as, asArray = asArray, castArray = castArray, castBigInt = castBigInt, castBool = castBool, castDecimal = castDecimal, castFloat = castFloat, castInt = castInt, castJson = castJson, castReal = castReal, castText = castText, castTo = castTo, castType = castType)
  
    __obj.asInstanceOf[Castable]
  }
}

