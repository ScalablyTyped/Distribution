package typings.mssql.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISqlTypeWithLength extends ISqlType {
  var length: Double = js.native
  @JSName("type")
  var type_Original: ISqlTypeFactoryWithLength = js.native
  @JSName("type")
  def type_MISqlTypeWithLength(): ISqlTypeWithLength = js.native
  @JSName("type")
  def type_MISqlTypeWithLength(length: Double): ISqlTypeWithLength = js.native
}

