package typings.mssql

import typings.mssql.mssqlMod.ISqlType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseSensitive extends js.Object {
  var caseSensitive: Boolean
  var identity: Boolean
  var index: Double
  var length: Double
  var name: String
  var nullable: Boolean
  var precision: js.UndefOr[Double] = js.undefined
  var readOnly: Boolean
  var scale: js.UndefOr[Double] = js.undefined
  var `type`: js.Function0[ISqlType] | ISqlType
  var udt: js.UndefOr[js.Any] = js.undefined
}

object Anon_CaseSensitive {
  @scala.inline
  def apply(
    caseSensitive: Boolean,
    identity: Boolean,
    index: Double,
    length: Double,
    name: String,
    nullable: Boolean,
    readOnly: Boolean,
    `type`: js.Function0[ISqlType] | ISqlType,
    precision: Int | Double = null,
    scale: Int | Double = null,
    udt: js.Any = null
  ): Anon_CaseSensitive = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (udt != null) __obj.updateDynamic("udt")(udt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CaseSensitive]
  }
}

