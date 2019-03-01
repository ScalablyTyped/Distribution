package typings
package oracledbLib.oracledbMod.oracledbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetaData extends js.Object {
  /** the database byte size. This is only set for DB_TYPE_VARCHAR, DB_TYPE_CHAR and DB_TYPE_RAW column types. */
  var byteSize: js.UndefOr[scala.Double] = js.undefined
  /** one of the Node-oracledb Type Constant values. */
  var dbType: js.UndefOr[scala.Double] = js.undefined
  /** one of the Node-oracledb Type Constant values. */
  var fetchType: js.UndefOr[scala.Double] = js.undefined
  /** The column name follows Oracle's standard name-casing rules. It will commonly be uppercase, since most applications create tables using unquoted, case-insensitive names. */
  var name: java.lang.String
  /** indicates whether NULL values are permitted for this column. */
  var nullable: js.UndefOr[scala.Boolean] = js.undefined
  /** set only for DB_TYPE_NUMBER, DB_TYPE_TIMESTAMP, DB_TYPE_TIMESTAMP_TZ and DB_TYPE_TIMESTAMP_LTZ columns. */
  var precision: js.UndefOr[scala.Double] = js.undefined
  /** set only for DB_TYPE_NUMBER columns. */
  var scale: scala.Double
}

object IMetaData {
  @scala.inline
  def apply(
    name: java.lang.String,
    scale: scala.Double,
    byteSize: scala.Int | scala.Double = null,
    dbType: scala.Int | scala.Double = null,
    fetchType: scala.Int | scala.Double = null,
    nullable: js.UndefOr[scala.Boolean] = js.undefined,
    precision: scala.Int | scala.Double = null
  ): IMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("scale")(scale)
    if (byteSize != null) __obj.updateDynamic("byteSize")(byteSize.asInstanceOf[js.Any])
    if (dbType != null) __obj.updateDynamic("dbType")(dbType.asInstanceOf[js.Any])
    if (fetchType != null) __obj.updateDynamic("fetchType")(fetchType.asInstanceOf[js.Any])
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetaData]
  }
}

