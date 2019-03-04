package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInfo extends js.Object {
  var catalog: java.lang.String
  var charsetNr: scala.Double
  var db: java.lang.String
  var decimals: scala.Double
  var default: js.UndefOr[java.lang.String] = js.undefined
  var flags: scala.Double
  var length: scala.Double
  var name: java.lang.String
  var orgName: java.lang.String
  var orgTable: java.lang.String
  var protocol41: scala.Boolean
  var table: java.lang.String
  var `type`: Types
  var zeroFill: scala.Boolean
}

object FieldInfo {
  @scala.inline
  def apply(
    catalog: java.lang.String,
    charsetNr: scala.Double,
    db: java.lang.String,
    decimals: scala.Double,
    flags: scala.Double,
    length: scala.Double,
    name: java.lang.String,
    orgName: java.lang.String,
    orgTable: java.lang.String,
    protocol41: scala.Boolean,
    table: java.lang.String,
    `type`: Types,
    zeroFill: scala.Boolean,
    default: java.lang.String = null
  ): FieldInfo = {
    val __obj = js.Dynamic.literal(catalog = catalog, charsetNr = charsetNr, db = db, decimals = decimals, flags = flags, length = length, name = name, orgName = orgName, orgTable = orgTable, protocol41 = protocol41, table = table, zeroFill = zeroFill)
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[FieldInfo]
  }
}

