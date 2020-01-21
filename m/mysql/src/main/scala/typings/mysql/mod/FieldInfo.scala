package typings.mysql.mod

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
    val __obj = js.Dynamic.literal(catalog = catalog.asInstanceOf[js.Any], charsetNr = charsetNr.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orgName = orgName.asInstanceOf[js.Any], orgTable = orgTable.asInstanceOf[js.Any], protocol41 = protocol41.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], zeroFill = zeroFill.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInfo]
  }
}

