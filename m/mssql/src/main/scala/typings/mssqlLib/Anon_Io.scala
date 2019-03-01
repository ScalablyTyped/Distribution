package typings
package mssqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Io extends js.Object {
  var io: scala.Double
  var length: scala.Double
  var name: java.lang.String
  var precision: scala.Double
  var scale: scala.Double
  var tvpType: js.Any
  var `type`: js.Function0[mssqlLib.mssqlMod.ISqlType] | mssqlLib.mssqlMod.ISqlType
  var value: js.Any
}

object Anon_Io {
  @scala.inline
  def apply(
    io: scala.Double,
    length: scala.Double,
    name: java.lang.String,
    precision: scala.Double,
    scale: scala.Double,
    tvpType: js.Any,
    `type`: js.Function0[mssqlLib.mssqlMod.ISqlType] | mssqlLib.mssqlMod.ISqlType,
    value: js.Any
  ): Anon_Io = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("io")(io)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("precision")(precision)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("tvpType")(tvpType)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Io]
  }
}

