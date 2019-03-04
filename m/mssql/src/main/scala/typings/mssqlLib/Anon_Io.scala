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
    val __obj = js.Dynamic.literal(io = io, length = length, name = name, precision = precision, scale = scale, tvpType = tvpType, value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Io]
  }
}

