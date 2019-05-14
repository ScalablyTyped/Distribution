package typings
package oracledbLib.oracledbMod

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
  var byteSize: scala.Double
  /**
    * One of the Node-oracledb Type Constant values.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracledbconstantsdbtype
    */
  var dbType: scala.Double
  /**
    * One of the Node-oracledb Type Constant values.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#oracledbconstantsnodbtype
    */
  var fetchType: scala.Double
  /**
    * The column name follows Oracle’s standard name-casing rules. It will commonly be uppercase,
    * since most applications create tables using unquoted, case-insensitive names.
    */
  var name: java.lang.String
  /**
    * Indicates whether NULL values are permitted for this column.
    */
  var nullable: scala.Boolean
  /**
    * Set only for DB_TYPE_NUMBER, DB_TYPE_TIMESTAMP, DB_TYPE_TIMESTAMP_TZ and DB_TYPE_TIMESTAMP_LTZ columns.
    */
  var precision: scala.Double
  /**
    * Set only for DB_TYPE_NUMBER columns.
    */
  var scale: scala.Double
}

object Metadata {
  @scala.inline
  def apply(
    byteSize: scala.Double,
    dbType: scala.Double,
    fetchType: scala.Double,
    name: java.lang.String,
    nullable: scala.Boolean,
    precision: scala.Double,
    scale: scala.Double
  ): Metadata = {
    val __obj = js.Dynamic.literal(byteSize = byteSize, dbType = dbType, fetchType = fetchType, name = name, nullable = nullable, precision = precision, scale = scale)
  
    __obj.asInstanceOf[Metadata]
  }
}

