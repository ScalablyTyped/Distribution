package typings.mongodb.mod

import typings.mongodb.anon.Aborted
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "GridFSBucketWriteStream")
@js.native
open class GridFSBucketWriteStream () extends Writable {
  def this(opts: WritableOptions) = this()
  
  /**
    * Places this write stream into an aborted state (all future writes fail)
    * and deletes all chunks that have already been written.
    */
  def abort(): js.Promise[Unit] = js.native
  
  var bucket: GridFSBucket = js.native
  
  var bufToStore: Buffer = js.native
  
  var chunkSizeBytes: scala.Double = js.native
  
  var chunks: Collection[GridFSChunk] = js.native
  
  var done: Boolean = js.native
  
  def end(callback: Callback[GridFSFile | Unit]): this.type = js.native
  def end(chunk: Buffer): this.type = js.native
  def end(chunk: Buffer, callback: Callback[GridFSFile | Unit]): this.type = js.native
  def end(chunk: Buffer, encoding: Unit, callback: Callback[GridFSFile | Unit]): this.type = js.native
  def end(chunk: Buffer, encoding: BufferEncoding): this.type = js.native
  def end(chunk: Buffer, encoding: BufferEncoding, callback: Callback[GridFSFile | Unit]): this.type = js.native
  
  var filename: String = js.native
  
  var files: Collection[GridFSFile] = js.native
  
  var id: typings.bson.mod.ObjectId = js.native
  
  var length: scala.Double = js.native
  
  var n: scala.Double = js.native
  
  var options: GridFSBucketWriteStreamOptions = js.native
  
  var pos: scala.Double = js.native
  
  var state: Aborted = js.native
  
  def write(chunk: String, callback: Callback[Unit]): Boolean = js.native
  def write(chunk: String, encoding: Unit, callback: Callback[Unit]): Boolean = js.native
  def write(chunk: String, encoding: BufferEncoding, callback: Callback[Unit]): Boolean = js.native
  /* Excluded from this release type: __constructor */
  /**
    * Write a buffer to the stream.
    *
    * @param chunk - Buffer to write
    * @param encodingOrCallback - Optional encoding for the buffer
    * @param callback - Function to call when the chunk was added to the buffer, or if the entire chunk was persisted to MongoDB if this chunk caused a flush.
    * @returns False if this write required flushing a chunk to MongoDB. True otherwise.
    */
  def write(chunk: Buffer): Boolean = js.native
  def write(chunk: Buffer, callback: Callback[Unit]): Boolean = js.native
  def write(chunk: Buffer, encoding: Unit, callback: Callback[Unit]): Boolean = js.native
  def write(chunk: Buffer, encoding: BufferEncoding): Boolean = js.native
  def write(chunk: Buffer, encoding: BufferEncoding, callback: Callback[Unit]): Boolean = js.native
  
  var writeConcern: js.UndefOr[WriteConcern] = js.native
}
/* static members */
object GridFSBucketWriteStream {
  
  /** @event */
  @JSImport("mongodb", "GridFSBucketWriteStream.CLOSE")
  @js.native
  val CLOSE: /* "close" */ String = js.native
  
  /** @event */
  @JSImport("mongodb", "GridFSBucketWriteStream.ERROR")
  @js.native
  val ERROR: /* "error" */ String = js.native
  
  /**
    * `end()` was called and the write stream successfully wrote the file metadata and all the chunks to MongoDB.
    * @event
    */
  @JSImport("mongodb", "GridFSBucketWriteStream.FINISH")
  @js.native
  val FINISH: /* "finish" */ String = js.native
}
