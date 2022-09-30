package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "MongoClient")
@js.native
open class MongoClient protected () extends TypedEventEmitter[MongoClientEvents] {
  /* Excluded from this release type: s */
  /* Excluded from this release type: topology */
  /* Excluded from this release type: [kOptions] */
  def this(url: String) = this()
  def this(url: String, options: MongoClientOptions) = this()
  
  /* Excluded from this release type: monitorCommands */
  /* Excluded from this release type: monitorCommands */
  def autoEncrypter: js.UndefOr[AutoEncrypter] = js.native
  
  def bsonOptions: BSONSerializeOptions = js.native
  
  /**
    * Close the db and its underlying connections
    *
    * @param force - Force close, emitting no events
    * @param callback - An optional callback, a Promise will be returned if none is provided
    */
  def close(): js.Promise[Unit] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def close(callback: Callback[Unit]): Unit = js.native
  def close(force: Boolean): js.Promise[Unit] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def close(force: Boolean, callback: Callback[Unit]): Unit = js.native
  
  /**
    * Connect to MongoDB using a url
    *
    * @see docs.mongodb.org/manual/reference/connection-string/
    */
  def connect(): js.Promise[this.type] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def connect(callback: Callback[this.type]): Unit = js.native
  
  /**
    * Create a new Db instance sharing the current socket connections.
    *
    * @param dbName - The name of the database we want to use. If not provided, use database name from connection string.
    * @param options - Optional settings for Db construction
    */
  def db(): Db = js.native
  def db(dbName: String): Db = js.native
  def db(dbName: String, options: DbOptions): Db = js.native
  def db(dbName: Unit, options: DbOptions): Db = js.native
  
  /** Return the mongo client logger */
  def getLogger(): Logger = js.native
  
  def logger: Logger = js.native
  
  def options: MongoOptions = js.native
  
  def readConcern: js.UndefOr[ReadConcern] = js.native
  
  def readPreference: ReadPreference = js.native
  
  def serverApi: js.UndefOr[ServerApi] = js.native
  
  /** Starts a new session on the server */
  def startSession(): ClientSession = js.native
  def startSession(options: ClientSessionOptions): ClientSession = js.native
  
  /**
    * Create a new Change Stream, watching for new changes (insertions, updates,
    * replacements, deletions, and invalidations) in this cluster. Will ignore all
    * changes to system collections, as well as the local, admin, and config databases.
    *
    * @remarks
    * watch() accepts two generic arguments for distinct usecases:
    * - The first is to provide the schema that may be defined for all the data within the current cluster
    * - The second is to override the shape of the change stream document entirely, if it is not provided the type will default to ChangeStreamDocument of the first argument
    *
    * @param pipeline - An array of {@link https://docs.mongodb.com/manual/reference/operator/aggregation-pipeline/|aggregation pipeline stages} through which to pass change stream documents. This allows for filtering (using $match) and manipulating the change stream documents.
    * @param options - Optional settings for the command
    * @typeParam TSchema - Type of the data being detected by the change stream
    * @typeParam TChange - Type of the whole change stream document emitted
    */
  def watch[TSchema /* <: Document */, TChange /* <: Document */](): ChangeStream[TSchema, TChange] = js.native
  def watch[TSchema /* <: Document */, TChange /* <: Document */](pipeline: js.Array[Document]): ChangeStream[TSchema, TChange] = js.native
  def watch[TSchema /* <: Document */, TChange /* <: Document */](pipeline: js.Array[Document], options: ChangeStreamOptions): ChangeStream[TSchema, TChange] = js.native
  def watch[TSchema /* <: Document */, TChange /* <: Document */](pipeline: Unit, options: ChangeStreamOptions): ChangeStream[TSchema, TChange] = js.native
  
  /**
    * Runs a given operation with an implicitly created session. The lifetime of the session
    * will be handled without the need for user interaction.
    *
    * NOTE: presently the operation MUST return a Promise (either explicit or implicitly as an async function)
    *
    * @param options - Optional settings for the command
    * @param callback - An callback to execute with an implicitly created session
    */
  def withSession(callback: WithSessionCallback): js.Promise[Unit] = js.native
  def withSession(options: ClientSessionOptions, callback: WithSessionCallback): js.Promise[Unit] = js.native
  
  def writeConcern: js.UndefOr[WriteConcern] = js.native
}
/* static members */
object MongoClient {
  
  @JSImport("mongodb", "MongoClient")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Connect to MongoDB using a url
    *
    * @remarks
    * The programmatically provided options take precedence over the URI options.
    *
    * @see https://docs.mongodb.org/manual/reference/connection-string/
    */
  inline def connect(url: String): js.Promise[MongoClient] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MongoClient]]
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  inline def connect(url: String, callback: Callback[MongoClient]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connect(url: String, options: MongoClientOptions): js.Promise[MongoClient] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MongoClient]]
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  inline def connect(url: String, options: MongoClientOptions, callback: Callback[MongoClient]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
