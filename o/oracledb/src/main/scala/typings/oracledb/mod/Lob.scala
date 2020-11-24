package typings.oracledb.mod

import typings.node.Buffer
import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lob objects can be used to access Oracle Database CLOB and BLOB data.
  *
  * @see https://oracle.github.io/node-oracledb/doc/api.html#lobhandling
  */
@js.native
trait Lob extends Duplex {
  
  /**
    * This corresponds to the size used by the Oracle LOB layer when accessing or modifying the LOB value.
    */
  val chunkSize: Double = js.native
  
  /**
    * Explicitly closes a Lob.
    *
    * Lobs created with createLob() should be explicitly closed with lob.close() when no longer needed.
    * This frees resources in node-oracledb and in Oracle Database.
    *
    * Persistent or temporary Lobs returned from the database may also be closed with lob.close() as
    * long as streaming is not currently happening. Note these Lobs are automatically closed when
    * streamed to completion or used as the source for an IN OUT bind.
    * If you try to close a Lob being used for streaming you will get the error NJS-023: concurrent
    * operations on a Lob are not allowed.
    *
    * The lob.close() method emits the Node.js Stream ‘close’ event unless the Lob has already been
    * explicitly or automatically closed.
    *
    * The connection must be open when calling lob.close() on a temporary LOB, such as those created
    * by createLob().
    *
    * Once a Lob is closed, it cannot be bound.
    *
    * @deprecated since 4.2, lob.destroy() should be used instead.
    * @see https://oracle.github.io/node-oracledb/doc/api.html#closinglobs
    */
  def close(): js.Promise[Unit] = js.native
  def close(callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  
  /**
    * Return all the LOB data. CLOBs and NCLOBs will be returned as strings. BLOBs will be returned as a Buffer.
    * 
    * This method is usable for LOBs up to 1 GB in length.
    * 
    * For queries returning LOB columns, it can be more efficient to use fetchAsString, fetchAsBuffer, or fetchInfo instead of lob.getData().
    * 
    * Note it is an asynchronous method and requires a round-trip to the database.
    * 
    * @since 4.0
    */
  def getData(): js.Promise[String | Buffer] = js.native
  def getData(callback: js.Function2[/* error */ DBError, /* data */ String | Buffer, Unit]): Unit = js.native
  
  /**
    * Length of a queried LOB in bytes (for BLOBs) or characters (for CLOBs).
    */
  val length: Double = js.native
  
  /**
    * The number of bytes (for BLOBs) or characters (for CLOBs) to read for each Stream ‘data’ event of a queried LOB.
    *
    * For efficiency, it is recommended that pieceSize be a multiple of chunkSize.
    *
    * The property should not be reset in the middle of streaming since data will be lost when
    * internal buffers are resized.
    *
    * The maximum value for pieceSize is limited to the value of UINT_MAX.
    *
    * @default chunkSize
    */
  var pieceSize: Double = js.native
  
  /**
    * The type of Lob being used. It will have the value of one of the constants BLOB or CLOB.
    *
    * The value is derived from the bind type when using LOB bind variables, or from the column
    * type when a LOB is returned by a query.
    */
  val `type`: Double = js.native
}
