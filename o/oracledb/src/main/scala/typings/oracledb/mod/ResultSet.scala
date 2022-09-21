package typings.oracledb.mod

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResultSets allow query results to fetched from the database one at a time, or in groups of rows.
  * They can also be converted to Readable Streams. ResultSets enable applications to process very large data sets.
  *
  * ResultSets should also be used where the number of query rows cannot be predicted and may be larger than
  * Node.js can handle in a single array.
  *
  * A ResultSet object is obtained by setting resultSet: true in the options parameter of the
  * Connection execute() method when executing a query. A ResultSet is also returned to node-oracledb when
  * binding as type oracledb.CURSOR to a PL/SQL REF CURSOR bind parameter.
  *
  * @see https://oracle.github.io/node-oracledb/doc/api.html#resultsethandling
  */
@js.native
trait ResultSet[T] extends StObject {
  
  /**
    * Closes a ResultSet. Applications should always call this at the end of fetch or when no more rows are needed.
    * It should also be called if no rows are ever going to be fetched from the ResultSet.
    */
  def close(): js.Promise[Unit] = js.native
  def close(callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  
  /**
    * This call fetches one row of the ResultSet as an object or an array of column values,
    * depending on the value of outFormat.
    *
    * At the end of fetching, the ResultSet should be freed by calling close().
    *
    * Performance of getRow() can be tuned by adjusting the value of oracledb.fetchArraySize or
    * the execute() option fetchArraySize.
    */
  def getRow(): js.Promise[T] = js.native
  def getRow(callback: js.Function2[/* error */ DBError, /* row */ T, Unit]): Unit = js.native
  
  /**
    * This call fetches numRows rows of the ResultSet as an object or an array of column values,
    * depending on the value of outFormat. If no argument is passed, or numRows is zero, then all rows are fetched. 
    *
    * At the end of fetching, the ResultSet should be freed by calling close().
    *
    * Different values of numRows may alter the time needed for fetching data from Oracle Database.
    * The value of fetchArraySize has no effect on getRows() performance or internal buffering.
    *
    * @param numRows The number of rows to fetch
    */
  def getRows(): js.Promise[js.Array[T]] = js.native
  def getRows(callback: js.Function2[/* error */ DBError, /* rows */ js.Array[T], Unit]): Unit = js.native
  def getRows(numRows: Double): js.Promise[js.Array[T]] = js.native
  def getRows(numRows: Double, callback: js.Function2[/* error */ DBError, /* rows */ js.Array[T], Unit]): Unit = js.native
  
  /**
    * Contains an array of objects with metadata about the query or REF CURSOR columns.
    *
    * Each column’s name is always given. If the oracledb.extendedMetaData or execute() option
    * extendedMetaData are true then additional information is included.
    */
  val metaData: js.Array[Metadata[T]] = js.native
  
  /**
    * This synchronous method converts a ResultSet into a stream.
    *
    * It can be used to make ResultSets from top-level queries or from REF CURSOR bind variables streamable.
    * To make top-level queries streamable, the alternative connection.queryStream() method may be easier to use.
    *
    * To change the behavior of toQueryStream(), such as setting the query output Format or the internal
    * buffer size for performance, adjust global attributes such as oracledb.outFormat and oracledb.fetchArraySize
    * before calling execute().
    *
    * @since 1.9
    * @see https://oracle.github.io/node-oracledb/doc/api.html#streamingresults
    */
  def toQueryStream(): Readable = js.native
}
