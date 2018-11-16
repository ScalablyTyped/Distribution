package typings
package oracledbLib.oracledbMod.oracledbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IExecuteReturn extends js.Object {
  /** Metadata information - column names is always given. If the Oracledb extendedMetaData or execute() option extendedMetaData are true then additional information is included. */
  var metaData: js.UndefOr[js.Array[IMetaData]] = js.undefined
  /** This is either an array or an object containing OUT and IN OUT bind values. If bindParams is passed as an array, then outBinds is returned as an array. If bindParams is passed as an object, then outBinds is returned as an object. */
  var outBinds: js.UndefOr[js.Array[_] | js.Object] = js.undefined
  /** For SELECT statements when the resultSet option is true, use the resultSet object to fetch rows. See ResultSet Class. */
  var resultSet: js.UndefOr[IResultSet] = js.undefined
  /** For SELECT statements where the resultSet option is false or unspecified, rows contains an array of fetched rows. It will be NULL if there is an error or the SQL statement was not a SELECT statement. By default, the rows are in an array of column value arrays, but this can be changed to arrays of objects by setting outFormat to OBJECT. If a single row is fetched, then rows is an array that contains one single row. The number of rows returned is limited to the maxRows configuration property of the Oracledb object, although this may be overridden in any execute() call. */
  var rows: js.UndefOr[js.Array[js.Array[_]] | js.Array[_]] = js.undefined
  /** For DML statements (including SELECT FOR UPDATE) this contains the number of rows affected, for example the number of rows inserted. For non-DML statements such as queries, or if no rows are affected, then rowsAffected will be zero. */
  var rowsAffected: js.UndefOr[scala.Double] = js.undefined
}

