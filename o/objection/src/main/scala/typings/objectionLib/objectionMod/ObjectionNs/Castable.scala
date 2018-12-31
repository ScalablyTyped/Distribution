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

