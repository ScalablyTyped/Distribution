package typings.mssql

import typings.mssql.mssqlMod.ISqlType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Io extends js.Object {
  var io: Double
  var length: Double
  var name: String
  var precision: Double
  var scale: Double
  var tvpType: js.Any
  var `type`: js.Function0[ISqlType] | ISqlType
  var value: js.Any
}

object Anon_Io {
  @scala.inline
  def apply(
    io: Double,
    length: Double,
    name: String,
    precision: Double,
    scale: Double,
    tvpType: js.Any,
    `type`: js.Function0[ISqlType] | ISqlType,
    value: js.Any
  ): Anon_Io = {
    val __obj = js.Dynamic.literal(io = io.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], tvpType = tvpType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Io]
  }
}

