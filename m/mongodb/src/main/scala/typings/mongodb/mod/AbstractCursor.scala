package typings.mongodb.mod

import typings.mongodb.mongodbStrings.close
import typings.node.eventsMod.EventEmitterOptions
import typings.node.streamMod.Readable
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("mongodb", "AbstractCursor")
@js.native
open class AbstractCursor[TSchema, CursorEvents /* <: AbstractCursorEvents */] () extends TypedEventEmitter[CursorEvents] {
  def this(options: EventEmitterOptions) = this()
  
  /**
    * Add a cursor flag to the cursor
    *
    * @param flag - The flag to set, must be one of following ['tailable', 'oplogReplay', 'noCursorTimeout', 'awaitData', 'partial' -.
    * @param value - The flag boolean value.
    */
  def addCursorFlag(flag: CursorFlag, value: Boolean): this.type = js.native
  
  /**
    * Set the batch size for the cursor.
    *
    * @param value - The number of documents to return per batch. See {@link https://www.mongodb.com/docs/manual/reference/command/find/|find command documentation}.
    */
  def batchSize(value: scala.Double): this.type = js.native
  
  /** Returns current buffered documents length */
  def bufferedCount(): scala.Double = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  /* Excluded from this release type: session */
  /* Excluded from this release type: session */
  /* Excluded from this release type: cursorOptions */
  def closed: Boolean = js.native
  
  /**
    * Iterates over all the documents for this cursor using the iterator, callback pattern.
    *
    * If the iterator returns `false`, iteration will stop.
    *
    * @param iterator - The iteration callback.
    * @deprecated - Will be removed in a future release. Use for await...of instead.
    */
  def forEach(iterator: js.Function1[/* doc */ TSchema, Boolean | Unit]): js.Promise[Unit] = js.native
  
  def hasNext(): js.Promise[Boolean] = js.native
  
  /* Excluded from this release type: __constructor */
  def id: js.UndefOr[typings.bson.mod.Long] = js.native
  
  def killed: Boolean = js.native
  
  def loadBalanced: Boolean = js.native
  
  /**
    * Map all documents using the provided function
    * If there is a transform set on the cursor, that will be called first and the result passed to
    * this function's transform.
    *
    * @remarks
    *
    * **Note** Cursors use `null` internally to indicate that there are no more documents in the cursor. Providing a mapping
    * function that maps values to `null` will result in the cursor closing itself before it has finished iterating
    * all documents.  This will **not** result in a memory leak, just surprising behavior.  For example:
    *
    * ```typescript
    * const cursor = collection.find({});
    * cursor.map(() => null);
    *
    * const documents = await cursor.toArray();
    * // documents is always [], regardless of how many documents are in the collection.
    * ```
    *
    * Other falsey values are allowed:
    *
    * ```typescript
    * const cursor = collection.find({});
    * cursor.map(() => '');
    *
    * const documents = await cursor.toArray();
    * // documents is now an array of empty strings
    * ```
    *
    * **Note for Typescript Users:** adding a transform changes the return type of the iteration of this cursor,
    * it **does not** return a new instance of a cursor. This means when calling map,
    * you should always assign the result to a new variable in order to get a correctly typed cursor variable.
    * Take note of the following example:
    *
    * @example
    * ```typescript
    * const cursor: FindCursor<Document> = coll.find();
    * const mappedCursor: FindCursor<number> = cursor.map(doc => Object.keys(doc).length);
    * const keyCounts: number[] = await mappedCursor.toArray(); // cursor.toArray() still returns Document[]
    * ```
    * @param transform - The mapping transformation method.
    */
  def map[T](transform: js.Function1[/* doc */ TSchema, T]): AbstractCursor[T, AbstractCursorEvents] = js.native
  
  /**
    * Set a maxTimeMS on the cursor query, allowing for hard timeout limits on queries (Only supported on MongoDB 2.6 or higher)
    *
    * @param value - Number of milliseconds to wait before aborting the query.
    */
  def maxTimeMS(value: scala.Double): this.type = js.native
  
  /* Excluded from this release type: client */
  /* Excluded from this release type: server */
  def namespace: MongoDBNamespace = js.native
  
  /** Get the next available document from the cursor, returns null if no more documents are available. */
  def next(): js.Promise[TSchema | Null] = js.native
  
  /** Returns current buffered documents */
  def readBufferedDocuments(): js.Array[TSchema] = js.native
  def readBufferedDocuments(number: scala.Double): js.Array[TSchema] = js.native
  
  def readConcern: js.UndefOr[ReadConcern] = js.native
  
  def readPreference: ReadPreference = js.native
  
  /**
    * Rewind this cursor to its uninitialized state. Any options that are present on the cursor will
    * remain in effect. Iterating this cursor will cause new queries to be sent to the server, even
    * if the resultant data has already been retrieved by this cursor.
    */
  def rewind(): Unit = js.native
  
  def stream(): Readable & AsyncIterable[TSchema] = js.native
  def stream(options: CursorStreamOptions): Readable & AsyncIterable[TSchema] = js.native
  
  /**
    * Returns an array of documents. The caller is responsible for making sure that there
    * is enough memory to store the results. Note that the array only contains partial
    * results when this cursor had been previously accessed. In that case,
    * cursor.rewind() can be used to reset the cursor.
    */
  def toArray(): js.Promise[js.Array[TSchema]] = js.native
  
  /**
    * Try to get the next available document from the cursor or `null` if an empty batch is returned
    */
  def tryNext(): js.Promise[TSchema | Null] = js.native
  
  /**
    * Set the ReadPreference for the cursor.
    *
    * @param readPreference - The new read preference for the cursor.
    */
  def withReadConcern(readConcern: ReadConcernLike): this.type = js.native
  
  /**
    * Set the ReadPreference for the cursor.
    *
    * @param readPreference - The new read preference for the cursor.
    */
  def withReadPreference(readPreference: ReadPreferenceLike): this.type = js.native
}
/* static members */
object AbstractCursor {
  
  /* Excluded from this release type: [kId] */
  /* Excluded from this release type: [kSession] */
  /* Excluded from this release type: [kServer] */
  /* Excluded from this release type: [kNamespace] */
  /* Excluded from this release type: [kDocuments] */
  /* Excluded from this release type: [kClient] */
  /* Excluded from this release type: [kTransform] */
  /* Excluded from this release type: [kInitialized] */
  /* Excluded from this release type: [kClosed] */
  /* Excluded from this release type: [kKilled] */
  /* Excluded from this release type: [kOptions] */
  /** @event */
  @JSImport("mongodb", "AbstractCursor.CLOSE")
  @js.native
  val CLOSE: close = js.native
}
