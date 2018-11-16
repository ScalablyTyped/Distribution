package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISqlTypeWithScale extends ISqlType {
  var scale: scala.Double = js.native
  @JSName("type")
  var type_Original: ISqlTypeFactoryWithScale = js.native
  @JSName("type")
  def type_MISqlTypeWithScale(): ISqlTypeWithScale = js.native
  @JSName("type")
  def type_MISqlTypeWithScale(scale: scala.Double): ISqlTypeWithScale = js.native
}

