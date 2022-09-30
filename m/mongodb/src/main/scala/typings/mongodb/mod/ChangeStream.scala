package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.mongodbStrings.change
import typings.mongodb.mongodbStrings.close
import typings.mongodb.mongodbStrings.end
import typings.mongodb.mongodbStrings.error
import typings.mongodb.mongodbStrings.init
import typings.mongodb.mongodbStrings.more
import typings.mongodb.mongodbStrings.response
import typings.mongodb.mongodbStrings.resumeTokenChanged
import typings.node.eventsMod.EventEmitterOptions
import typings.node.streamMod.Readable
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ChangeStream")
@js.native
open class ChangeStream[TSchema /* <: Document */, TChange /* <: Document */] () extends TypedEventEmitter[ChangeStreamEvents[TSchema, TChange]] {
  def this(options: EventEmitterOptions) = this()
  
  /** Close the Change Stream */
  def close(): js.Promise[Unit] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def close(callback: Callback[Any]): Unit = js.native
  
  /** Is the cursor closed */
  def closed: Boolean = js.native
  
  /** Check if there is any document still available in the Change Stream */
  def hasNext(): js.Promise[Boolean] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def hasNext(callback: Callback[Boolean]): Unit = js.native
  
  var namespace: MongoDBNamespace = js.native
  
  /** Get the next available document from the Change Stream. */
  def next(): js.Promise[TChange] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def next(callback: Callback[TChange]): Unit = js.native
  
  var options: ChangeStreamOptions = js.native
  
  var parent: MongoClient | Db | Collection[Document] = js.native
  
  var pipeline: js.Array[Document] = js.native
  
  /* Excluded from this release type: __constructor */
  /* Excluded from this release type: cursorStream */
  /** The cached resume token that is used to resume after the most recently returned change. */
  def resumeToken: ResumeToken = js.native
  
  /**
    * Return a modified Readable stream including a possible transform method.
    *
    * NOTE: When using a Stream to process change stream events, the stream will
    * NOT automatically resume in the case a resumable error is encountered.
    *
    * @throws MongoChangeStreamError if the underlying cursor or the change stream is closed
    */
  def stream(): Readable & AsyncIterable[TChange] = js.native
  def stream(options: CursorStreamOptions): Readable & AsyncIterable[TChange] = js.native
  
  /* Excluded from this release type: cursor */
  var streamOptions: js.UndefOr[CursorStreamOptions] = js.native
  
  /**
    * Try to get the next available document from the Change Stream's cursor or `null` if an empty batch is returned
    */
  def tryNext(): js.Promise[Document | Null] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def tryNext(callback: Callback[Document | Null]): Unit = js.native
  
  var `type`: js.Symbol = js.native
}
/* static members */
object ChangeStream {
  
  /**
    * Fired for each new matching change in the specified namespace. Attaching a `change`
    * event listener to a Change Stream will switch the stream into flowing mode. Data will
    * then be passed as soon as it is available.
    * @event
    */
  @JSImport("mongodb", "ChangeStream.CHANGE")
  @js.native
  val CHANGE: change = js.native
  
  /** @event */
  @JSImport("mongodb", "ChangeStream.CLOSE")
  @js.native
  val CLOSE: close = js.native
  
  /** @event */
  @JSImport("mongodb", "ChangeStream.END")
  @js.native
  val END: end = js.native
  
  /** @event */
  @JSImport("mongodb", "ChangeStream.ERROR")
  @js.native
  val ERROR: error = js.native
  
  /** @event */
  @JSImport("mongodb", "ChangeStream.INIT")
  @js.native
  val INIT: init = js.native
  
  /** @event */
  @JSImport("mongodb", "ChangeStream.MORE")
  @js.native
  val MORE: more = js.native
  
  /* Excluded from this release type: [kCursorStream] */
  /* Excluded from this release type: [kClosed] */
  /* Excluded from this release type: [kMode] */
  /** @event */
  @JSImport("mongodb", "ChangeStream.RESPONSE")
  @js.native
  val RESPONSE: response = js.native
  
  /**
    * Emitted each time the change stream stores a new resume token.
    * @event
    */
  @JSImport("mongodb", "ChangeStream.RESUME_TOKEN_CHANGED")
  @js.native
  val RESUME_TOKEN_CHANGED: resumeTokenChanged = js.native
}
