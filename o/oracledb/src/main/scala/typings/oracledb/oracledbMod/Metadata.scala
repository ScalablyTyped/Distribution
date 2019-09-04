package typings.oracledb.oracledbMod

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
  var byteSize: Double
  /**
    * One of the Node-oracledb Type Constant values.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracledbconstantsdbtype
    */
  var dbType: Double
  /**
    * The class associated with the database type. This is only set if the database type is an object type.
    */
  var dbTypeClass: DBObjectClass
  /**
    * Name of the database type, such as “NUMBER” or “VARCHAR2”. For object types, this will be the object name.
    */
  var dbTypeName: String
  /**
    * One of the Node-oracledb Type Constant values.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracledbconstantsnodbtype
    */
  var fetchType: Double
  /**
    * The column name follows Oracle’s standard name-casing rules. It will commonly be uppercase,
    * since most applications create tables using unquoted, case-insensitive names.
    */
  var name: String
  /**
    * Indicates whether NULL values are permitted for this column.
    */
  var nullable: Boolean
  /**
    * Set only for DB_TYPE_NUMBER, DB_TYPE_TIMESTAMP, DB_TYPE_TIMESTAMP_TZ and DB_TYPE_TIMESTAMP_LTZ columns.
    */
  var precision: Double
  /**
    * Set only for DB_TYPE_NUMBER columns.
    */
  var scale: Double
}

object Metadata {
  @scala.inline
  def apply(
    byteSize: Double,
    dbType: Double,
    dbTypeClass: DBObjectClass,
    dbTypeName: String,
    fetchType: Double,
    name: String,
    nullable: Boolean,
    precision: Double,
    scale: Double
  ): Metadata = {
    val __obj = js.Dynamic.literal(byteSize = byteSize, dbType = dbType, dbTypeClass = dbTypeClass, dbTypeName = dbTypeName, fetchType = fetchType, name = name, nullable = nullable, precision = precision, scale = scale)
  
    __obj.asInstanceOf[Metadata]
  }
}

