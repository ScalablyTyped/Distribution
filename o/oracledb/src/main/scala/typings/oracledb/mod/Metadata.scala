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
    byteSize: js.UndefOr[Double] = js.undefined,
    dbType: js.UndefOr[Double] = js.undefined,
    dbTypeClass: DBObjectClass = null,
    dbTypeName: String = null,
    fetchType: js.UndefOr[Double] = js.undefined,
    nullable: js.UndefOr[Boolean] = js.undefined,
    precision: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined
  ): Metadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(byteSize)) __obj.updateDynamic("byteSize")(byteSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dbType)) __obj.updateDynamic("dbType")(dbType.get.asInstanceOf[js.Any])
    if (dbTypeClass != null) __obj.updateDynamic("dbTypeClass")(dbTypeClass.asInstanceOf[js.Any])
    if (dbTypeName != null) __obj.updateDynamic("dbTypeName")(dbTypeName.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchType)) __obj.updateDynamic("fetchType")(fetchType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

