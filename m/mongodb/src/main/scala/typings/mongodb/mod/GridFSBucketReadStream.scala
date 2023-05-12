package typings.mongodb.mod

import typings.mongodb.mongodbStrings.close
import typings.mongodb.mongodbStrings.data
import typings.mongodb.mongodbStrings.end
import typings.mongodb.mongodbStrings.error
import typings.mongodb.mongodbStrings.file
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "GridFSBucketReadStream")
@js.native
open class GridFSBucketReadStream () extends Readable {
  def this(opts: ReadableOptions) = this()
  
  /**
    * Marks this stream as aborted (will never push another `data` event)
    * and kills the underlying cursor. Will emit the 'end' event, and then
    * the 'close' event once the cursor is successfully killed.
    */
  def abort(): js.Promise[Unit] = js.native
  
  /**
    * Sets the 0-based offset in bytes to start streaming from. Throws
    * an error if this stream has entered flowing mode
    * (e.g. if you've already called `on('data')`)
    *
    * @param end - Offset in bytes to stop reading at
    */
  def end(): this.type = js.native
  def end(end: scala.Double): this.type = js.native
  
  /* Excluded from this release type: __constructor */
  /* Excluded from this release type: _read */
  /**
    * Sets the 0-based offset in bytes to start streaming from. Throws
    * an error if this stream has entered flowing mode
    * (e.g. if you've already called `on('data')`)
    *
    * @param start - 0-based offset in bytes to start streaming from
    */
  def start(): this.type = js.native
  def start(start: scala.Double): this.type = js.native
}
/* static members */
object GridFSBucketReadStream {
  
  /**
    * Fired when the stream is exhausted and the underlying cursor is killed
    * @event
    */
  @JSImport("mongodb", "GridFSBucketReadStream.CLOSE")
  @js.native
  val CLOSE: close = js.native
  
  /**
    * Emitted when a chunk of data is available to be consumed.
    * @event
    */
  @JSImport("mongodb", "GridFSBucketReadStream.DATA")
  @js.native
  val DATA: data = js.native
  
  /**
    * Fired when the stream is exhausted (no more data events).
    * @event
    */
  @JSImport("mongodb", "GridFSBucketReadStream.END")
  @js.native
  val END: end = js.native
  
  /* Excluded from this release type: s */
  /**
    * An error occurred
    * @event
    */
  @JSImport("mongodb", "GridFSBucketReadStream.ERROR")
  @js.native
  val ERROR: error = js.native
  
  /**
    * Fires when the stream loaded the file document corresponding to the provided id.
    * @event
    */
  @JSImport("mongodb", "GridFSBucketReadStream.FILE")
  @js.native
  val FILE: file = js.native
}
