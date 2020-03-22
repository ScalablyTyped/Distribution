package typings.mysql

import typings.mysql.mod.GeometryType
import typings.mysql.mod.Types
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mysql.mysql.FieldInfo & {  type  :string,   length  :number, string (): string, buffer (): node.Buffer, geometry (): null | mysql.mysql.GeometryType} */
trait FieldInfotypestringlength extends js.Object {
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
  var `type`: Types with String
  var zeroFill: Boolean
  def buffer(): Buffer
  def geometry(): Null | GeometryType
  def string(): String
}

object FieldInfotypestringlength {
  @scala.inline
  def apply(
    buffer: () => Buffer,
    catalog: String,
    charsetNr: Double,
    db: String,
    decimals: Double,
    flags: Double,
    geometry: () => Null | GeometryType,
    length: Double,
    name: String,
    orgName: String,
    orgTable: String,
    protocol41: Boolean,
    string: () => String,
    table: String,
    `type`: Types with String,
    zeroFill: Boolean,
    default: String = null
  ): FieldInfotypestringlength = {
    val __obj = js.Dynamic.literal(buffer = js.Any.fromFunction0(buffer), catalog = catalog.asInstanceOf[js.Any], charsetNr = charsetNr.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], geometry = js.Any.fromFunction0(geometry), length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orgName = orgName.asInstanceOf[js.Any], orgTable = orgTable.asInstanceOf[js.Any], protocol41 = protocol41.asInstanceOf[js.Any], string = js.Any.fromFunction0(string), table = table.asInstanceOf[js.Any], zeroFill = zeroFill.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldInfotypestringlength]
  }
}

