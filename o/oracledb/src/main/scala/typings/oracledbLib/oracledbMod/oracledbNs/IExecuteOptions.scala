package typings
package oracledbLib.oracledbMod.oracledbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IExecuteOptions extends js.Object {
  /**
  		 * Transaction should auto commit after each statement?
  		 * Overrides Oracledb autoCommit.
  		 */
  var autoCommit: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Determines whether additional metadata is available for queries and for REF CURSORs returned from PL/SQL blocks.
  		 * Overrides Oracledb extendedMetaData.
  		 */
  var extendedMetaData: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Object defining how query column data should be represented in JavaScript.
  		 * The fetchInfo property can be used to indicate that number or date columns in a query should be returned as strings instead of their native format. The property can be used in conjunction with, or instead of, the global setting fetchAsString.
  		 * For example:
  		 *
  		 * fetchInfo:
  		 * {
  		 *   "HIRE_DATE":      { type : oracledb.STRING },  // return the date as a string
  		 *   "COMMISSION_PCT": { type : oracledb.DEFAULT }  // override Oracledb.fetchAsString
  		 * }
  		 *
  		 * Each column is specified by name, using Oracle's standard naming convention.
  		 * The valid values for type are STRING and DEFAULT. The former indicates that the given column should be returned as a string. The latter can be used to override any global mapping given by fetchAsString and allow the column data for this query to be returned in native format.
  		 * The maximum length of a string created by type mapping is 200 bytes. However, if a database column that is already of type STRING is specified in fetchInfo, then the actual database metadata will be used to determine the maximum length.
  		 * Columns fetched from REF CURSORS are not mapped by fetchInfo settings in the execute() call. Use the global fetchAsString instead.
  		 */
  var fetchInfo: js.UndefOr[js.Object] = js.undefined
  /**
  		 * Maximum number of rows that will be retrieved. Used when resultSet is false.
  		 * Overrides Oracledb maxRows.
  		 */
  var maxRows: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Result format - ARRAY o OBJECT
  		 * Overrides Oracledb outFormat.
  		 */
  var outFormat: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Number of rows to be fetched in advance.
  		 * Overrides Oracledb prefetchRows.
  		 */
  var prefetchRows: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Determines whether query results should be returned as a ResultSet object or directly. The default is false.
  		 */
  var resultSet: js.UndefOr[scala.Boolean] = js.undefined
}

