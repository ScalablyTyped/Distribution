package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Included in the result of a query execution to describe details of the columns involved.
  */
trait Metadata extends js.Object {
  /**
    * Database byte size. This is only set for DB_TYPE_VARCHAR, DB_TYPE_CHAR and DB_TYPE_RAW column types.
    */
  var byteSize: js.UndefOr[Double] = js.undefined
  /**
    * One of the Node-oracledb Type Constant values.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracledbconstantsdbtype
    */
  var dbType: js.UndefOr[Double] = js.undefined
  /**
    * The class associated with the database type. This is only set if the database type is an object type.
    */
  var dbTypeClass: js.UndefOr[DBObjectClass] = js.undefined
  /**
    * Name of the database type, such as “NUMBER” or “VARCHAR2”. For object types, this will be the object name.
    */
  var dbTypeName: js.UndefOr[String] = js.undefined
  /**
    * One of the Node-oracledb Type Constant values.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracledbconstantsnodbtype
    */
  var fetchType: js.UndefOr[Double] = js.undefined
  /**
    * The column name follows Oracle’s standard name-casing rules. It will commonly be uppercase,
    * since most applications create tables using unquoted, case-insensitive names.
    */
  var name: String
  /**
    * Indicates whether NULL values are permitted for this column.
    */
  var nullable: js.UndefOr[Boolean] = js.undefined
  /**
    * Set only for DB_TYPE_NUMBER, DB_TYPE_TIMESTAMP, DB_TYPE_TIMESTAMP_TZ and DB_TYPE_TIMESTAMP_LTZ columns.
    */
  var precision: js.UndefOr[Double] = js.undefined
  /**
    * Set only for DB_TYPE_NUMBER columns.
    */
  var scale: js.UndefOr[Double] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(
    name: String,
    byteSize: Int | Double = null,
    dbType: Int | Double = null,
    dbTypeClass: DBObjectClass = null,
    dbTypeName: String = null,
    fetchType: Int | Double = null,
    nullable: js.UndefOr[Boolean] = js.undefined,
    precision: Int | Double = null,
    scale: Int | Double = null
  ): Metadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (byteSize != null) __obj.updateDynamic("byteSize")(byteSize.asInstanceOf[js.Any])
    if (dbType != null) __obj.updateDynamic("dbType")(dbType.asInstanceOf[js.Any])
    if (dbTypeClass != null) __obj.updateDynamic("dbTypeClass")(dbTypeClass.asInstanceOf[js.Any])
    if (dbTypeName != null) __obj.updateDynamic("dbTypeName")(dbTypeName.asInstanceOf[js.Any])
    if (fetchType != null) __obj.updateDynamic("fetchType")(fetchType.asInstanceOf[js.Any])
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

