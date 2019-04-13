package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResultSet extends js.Object {
  /**
  		 * Contains an array of objects with metadata about the query or REF CURSOR columns.
  		 * Each column's name is always given. If the Oracledb extendedMetaData or execute() option extendedMetaData are true then additional information is included.
  		 */
  var metaData: js.UndefOr[js.Array[IMetaData]] = js.native
  /**
  		 * Closes a ResultSet. Applications should always call this at the end of fetch or when no more rows are needed.
  		 * @returns  A void Promise on finish or when some error occurs.
  		 * @remarks Applications should always call this at the end of fetch or when no more rows are needed.
  		 */
  def close(): IPromise[scala.Unit] = js.native
  /**
  		 * Closes a ResultSet. Applications should always call this at the end of fetch or when no more rows are needed.
  		 * @param  {(err:any)=>void} callback Callback called on finish or when some error occurs.
  		 * @returns void
  		 * @remarks Applications should always call this at the end of fetch or when no more rows are needed.
  		 */
  def close(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
  		 * This call fetches one row of the result set as an object or an array of column values, depending on the value of outFormat.
  		 * At the end of fetching, the ResultSet should be freed by calling close().
  		 * @returns Promise when the row is available or when some error occurs.
  		 */
  def getRow(): IPromise[js.Array[_] | js.Object] = js.native
  /**
  		 * This call fetches one row of the result set as an object or an array of column values, depending on the value of outFormat.
  		 * At the end of fetching, the ResultSet should be freed by calling close().
  		 * @param  {(err:any,row:Array<any>|Object)=>void} callback Callback called when the row is available or when some error occurs.
  		 * @returns void
  		 */
  def getRow(callback: js.Function2[/* err */ js.Any, /* row */ js.Array[_] | js.Object, scala.Unit]): scala.Unit = js.native
  /**
  		 * This synchronous method converts a ResultSet into a stream.
  		 * It can be used to make ResultSets from top-level queries or from REF CURSOR bind variables streamable. To make top-level queries streamable, the alternative connection.queryStream() method may be easier to use.
  		 * @returns synchronous stream of result set.
  		 */
  def toQueryStream(): nodeLib.streamMod.Readable = js.native
}

