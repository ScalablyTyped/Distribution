package typings.mongoose.anon

import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.CollectionCreateOptions
import typings.mongodb.mod.Db
import typings.mongodb.mod.DefaultSchema
import typings.mongodb.mod.SessionOptions
import typings.mongoose.mod.Collection
import typings.mongoose.mod.ConnectionOptions
import typings.mongoose.mod.ConnectionUseDbOptions
import typings.mongoose.mod.Connection_
import typings.mongoose.mod.Document
import typings.mongoose.mod.Model_
import typings.mongoose.mod.Schema
import typings.node.eventsMod.EventEmitterOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mongoose.mongoose.Connection & {  then  :std.Promise<mongoose.mongoose.Connection>['then'],   catch  :std.Promise<mongoose.mongoose.Connection>['catch']} */
@js.native
trait ConnectionthenPromiseConn extends js.Object {
  @JSName("catch")
  var catch_Original: FnCallOnrejected = js.native
  /** A hash of the collections associated with this connection */
  var collections: StringDictionary[Collection] = js.native
  /** A hash of the global options that are associated with this connection */
  var config: PickConnectionOptionsauto = js.native
  /** The mongodb.Db instance, set when the connection is opened */
  var db: Db = js.native
  /** Connected host */
  var host: String = js.native
  /** A hash of models registered with this connection */
  var models: StringDictionary[Model_[_, js.Object]] = js.native
  /** Connected database name */
  var name: String = js.native
  /** Connected port number */
  var port: Double = js.native
  /**
    * Connection ready state
    * 0 = disconnected
    * 1 = connected
    * 2 = connecting
    * 3 = disconnecting
    * Each state change emits its associated event name.
    */
  var readyState: Double = js.native
  /** mapping of ready states */
  var states: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConnectionStates */ js.Any = js.native
  @JSName("then")
  var then_Original: FnCall = js.native
  def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def `catch`[TResult](): js.Promise[Connection_ | TResult] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[Connection_ | TResult] = js.native
  /** Closes the connection */
  def close(): js.Promise[Unit] = js.native
  def close(callback: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def close(force: Boolean): js.Promise[Unit] = js.native
  def close(force: Boolean, callback: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  /**
    * Retrieves a collection, creating it if not cached.
    * Not typically needed by applications. Just talk to your collection through your model.
    * @param name name of the collection
    * @param options optional collection options
    */
  def collection(name: String): Collection = js.native
  def collection(name: String, options: js.Any): Collection = js.native
  /** Helper for creating a collection */
  def createCollection[T](name: String): js.Promise[typings.mongodb.mod.Collection[T]] = js.native
  def createCollection[T](
    name: String,
    cb: js.Function2[/* err */ js.Any, /* collection */ typings.mongodb.mod.Collection[T], Unit]
  ): js.Promise[Unit] = js.native
  def createCollection[T](name: String, options: CollectionCreateOptions): js.Promise[typings.mongodb.mod.Collection[T]] = js.native
  def createCollection[T](
    name: String,
    options: CollectionCreateOptions,
    cb: js.Function2[
      /* err */ js.Any, 
      /* collection */ typings.mongodb.mod.Collection[DefaultSchema], 
      Unit
    ]
  ): js.Promise[typings.mongodb.mod.Collection[T]] = js.native
  /**
    * Removes the model named `name` from this connection, if it exists. You can
    * use this function to clean up any models you created in your tests to
    * prevent OverwriteModelErrors.
    *
    * @param name if string, the name of the model to remove. If regexp, removes all models whose name matches the regexp.
    * @returns this
    */
  def deleteModel(name: String): Connection_ = js.native
  def deleteModel(name: RegExp): Connection_ = js.native
  /** Helper for dropCollection() */
  def dropCollection(name: String): js.Promise[Unit] = js.native
  def dropCollection(name: String, callback: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  /** Helper for dropDatabase() */
  def dropDatabase(): js.Promise[_] = js.native
  def dropDatabase(callback: js.Function1[/* err */ js.Any, Unit]): js.Promise[_] = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  def eventNames(): js.Array[String | js.Symbol] = js.native
  def getMaxListeners(): Double = js.native
  def listenerCount(`type`: String): Double = js.native
  def listenerCount(`type`: js.Symbol): Double = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /**
    * Defines or retrieves a model.
    * When no collection argument is passed, Mongoose produces a collection name by passing
    * the model name to the utils.toCollectionName method. This method pluralizes the name.
    * If you don't like this behavior, either pass a collection name or set your schemas
    * collection name option.
    * @param name the model name
    * @param schema a schema. necessary when defining a model
    * @param collection name of mongodb collection (optional) if not given it will be induced from model name
    * @returns The compiled model
    */
  def model[T /* <: Document */](name: String): Model_[T, js.Object] = js.native
  def model[T /* <: Document */](name: String, schema: Schema[_]): Model_[T, js.Object] = js.native
  def model[T /* <: Document */](name: String, schema: Schema[_], collection: String): Model_[T, js.Object] = js.native
  /** Returns an array of model names created on this connection. */
  def modelNames(): js.Array[String] = js.native
  @JSName("model")
  def model_T_DocumentU_Model_TObject_U[T /* <: Document */, U /* <: Model_[T, js.Object] */](name: String): U = js.native
  @JSName("model")
  def model_T_DocumentU_Model_TObject_U[T /* <: Document */, U /* <: Model_[T, js.Object] */](name: String, schema: Schema[_]): U = js.native
  @JSName("model")
  def model_T_DocumentU_Model_TObject_U[T /* <: Document */, U /* <: Model_[T, js.Object] */](name: String, schema: Schema[_], collection: String): U = js.native
  def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /**
    * Opens the connection to MongoDB.
    * @param uri mongodb connection string
    * @param options Mongoose forces the db option forceServerObjectId false and cannot be overridden.
    *   Mongoose defaults the server auto_reconnect options to true which can be overridden.
    *   See the node-mongodb-native driver instance for options that it understands.
    *   Options passed take precedence over options included in connection strings.
    */
  def openUri(uri: String): js.Promise[Connection_] = js.native
  def openUri(uri: String, callback: js.Function2[/* err */ js.Any, /* conn */ js.UndefOr[Connection_], Unit]): Connection_ = js.native
  def openUri(uri: String, options: ConnectionOptions): Connection_ with Catch = js.native
  def openUri(
    uri: String,
    options: ConnectionOptions,
    callback: js.Function2[/* err */ js.Any, /* conn */ js.UndefOr[Connection_], Unit]
  ): Connection_ with Catch = js.native
  @JSName("openUri")
  def openUri_Promise(uri: String, options: ConnectionOptions): js.Promise[Connection_] = js.native
  // Added in Node 6...
  def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def rawListeners(event: String): js.Array[js.Function] = js.native
  def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
  def removeAllListeners(event: js.Symbol): this.type = js.native
  def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def setMaxListeners(n: Double): this.type = js.native
  def startSession(): js.Promise[ClientSession] = js.native
  def startSession(options: SessionOptions): js.Promise[ClientSession] = js.native
  def startSession(options: SessionOptions, cb: js.Function2[/* err */ js.Any, /* session */ ClientSession, Unit]): js.Promise[ClientSession] = js.native
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Connection_, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ Connection_, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  /**
    * Switches to a different database using the same connection pool.
    * @param name The database name
    * @param options Additional options
    * @returns New Connection Object
    */
  def useDb(name: String): Connection_ = js.native
  def useDb(name: String, options: ConnectionUseDbOptions): Connection_ = js.native
}

