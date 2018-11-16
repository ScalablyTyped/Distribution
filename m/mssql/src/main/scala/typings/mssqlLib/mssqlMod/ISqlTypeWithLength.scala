package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISqlTypeWithLength extends ISqlType {
  var length: scala.Double = js.native
  @JSName("type")
  var type_Original: ISqlTypeFactoryWithLength = js.native
  @JSName("type")
  def type_MISqlTypeWithLength(): ISqlTypeWithLength = js.native
  @JSName("type")
  def type_MISqlTypeWithLength(length: scala.Double): ISqlTypeWithLength = js.native
}

