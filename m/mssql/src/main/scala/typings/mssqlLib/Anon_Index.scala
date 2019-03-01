package typings
package mssqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: scala.Double
  var length: scala.Double
  var name: java.lang.String
  var `type`: js.Function0[mssqlLib.mssqlMod.ISqlType] | mssqlLib.mssqlMod.ISqlType
  var udt: js.UndefOr[js.Any] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply(
    index: scala.Double,
    length: scala.Double,
    name: java.lang.String,
    `type`: js.Function0[mssqlLib.mssqlMod.ISqlType] | mssqlLib.mssqlMod.ISqlType,
    udt: js.Any = null
  ): Anon_Index = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("name")(name)
    if (udt != null) __obj.updateDynamic("udt")(udt)
    __obj.asInstanceOf[Anon_Index]
  }
}

