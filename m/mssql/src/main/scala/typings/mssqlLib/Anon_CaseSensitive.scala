package typings
package mssqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseSensitive extends js.Object {
  var caseSensitive: scala.Boolean
  var identity: scala.Boolean
  var index: scala.Double
  var length: scala.Double
  var name: java.lang.String
  var nullable: scala.Boolean
  var precision: js.UndefOr[scala.Double] = js.undefined
  var readOnly: scala.Boolean
  var scale: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.Function0[mssqlLib.mssqlMod.ISqlType] | mssqlLib.mssqlMod.ISqlType
  var udt: js.UndefOr[js.Any] = js.undefined
}

object Anon_CaseSensitive {
  @scala.inline
  def apply(
    caseSensitive: scala.Boolean,
    identity: scala.Boolean,
    index: scala.Double,
    length: scala.Double,
    name: java.lang.String,
    nullable: scala.Boolean,
    readOnly: scala.Boolean,
    `type`: js.Function0[mssqlLib.mssqlMod.ISqlType] | mssqlLib.mssqlMod.ISqlType,
    precision: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null,
    udt: js.Any = null
  ): Anon_CaseSensitive = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive, identity = identity, index = index, length = length, name = name, nullable = nullable, readOnly = readOnly)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (udt != null) __obj.updateDynamic("udt")(udt)
    __obj.asInstanceOf[Anon_CaseSensitive]
  }
}

