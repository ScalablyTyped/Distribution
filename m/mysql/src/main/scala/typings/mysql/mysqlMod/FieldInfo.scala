package typings.mysql.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInfo extends js.Object {
  var catalog: String
  var charsetNr: Double
  var db: String
  var decimals: Double
  var default: js.UndefOr[String] = js.undefined
  var flags: Double
  var length: Double
  var name: String
  var orgName: String
  var orgTable: String
  var protocol41: Boolean
  var table: String
  var `type`: Types
  var zeroFill: Boolean
}

object FieldInfo {
  @scala.inline
  def apply(
    catalog: String,
    charsetNr: Double,
    db: String,
    decimals: Double,
    flags: Double,
    length: Double,
    name: String,
    orgName: String,
    orgTable: String,
    protocol41: Boolean,
    table: String,
    `type`: Types,
    zeroFill: Boolean,
    default: String = null
  ): FieldInfo = {
    val __obj = js.Dynamic.literal(catalog = catalog, charsetNr = charsetNr, db = db, decimals = decimals, flags = flags, length = length, name = name, orgName = orgName, orgTable = orgTable, protocol41 = protocol41, table = table, zeroFill = zeroFill)
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[FieldInfo]
  }
}

