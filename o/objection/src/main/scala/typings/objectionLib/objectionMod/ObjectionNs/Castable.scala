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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("as")(as)
    __obj.updateDynamic("asArray")(asArray)
    __obj.updateDynamic("castArray")(castArray)
    __obj.updateDynamic("castBigInt")(castBigInt)
    __obj.updateDynamic("castBool")(castBool)
    __obj.updateDynamic("castDecimal")(castDecimal)
    __obj.updateDynamic("castFloat")(castFloat)
    __obj.updateDynamic("castInt")(castInt)
    __obj.updateDynamic("castJson")(castJson)
    __obj.updateDynamic("castReal")(castReal)
    __obj.updateDynamic("castText")(castText)
    __obj.updateDynamic("castTo")(castTo)
    __obj.updateDynamic("castType")(castType)
    __obj.asInstanceOf[Castable]
  }
}

