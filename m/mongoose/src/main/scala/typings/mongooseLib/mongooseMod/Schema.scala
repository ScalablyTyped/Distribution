package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section schema.js
  * http://mongoosejs.com/docs/api.html#schema-js
  */
@js.native
trait Schema[T]
  extends nodeLib.eventsMod.EventEmitter {
  /** Object of currently defined methods on this schema. */
  var methods: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ F in keyof T ]: T[F]}
    */ mongooseLib.mongooseLibStrings.Schema with T = js.native
  /** The original object passed to the schema constructor */
  var obj: js.Any = js.native
  /** Object of currently defined query helpers on this schema. */
  var query: js.Any = js.native
  /** Object of currently defined statics on this schema. */
  var statics: js.Any = js.native
  /** Adds key path / schema type pairs to this schema. */
  def add(obj: SchemaDefinition): scala.Unit = js.native
  def add(obj: SchemaDefinition, prefix: java.lang.String): scala.Unit = js.native
  /**
    * Iterates the schemas paths similar to Array.forEach.
    * @param fn callback function
    * @returns this
    */
  def eachPath(fn: js.Function2[/* path */ java.lang.String, /* type */ SchemaType, scala.Unit]): this.type = js.native
  /**
    * Gets a schema option.
    * @param key option name
    */
  def get(key: java.lang.String): js.Any = js.native
  /**
    * Defines an index (most likely compound) for this schema.
    * @param options Options to pass to MongoDB driver's createIndex() function
    * @param options.expires Mongoose-specific syntactic sugar, uses ms to convert
    *   expires option into seconds for the expireAfterSeconds in the above link.
    */
  def index(fields: js.Any): this.type = js.native
  def index(fields: js.Any, options: mongooseLib.Anon_Expires): this.type = js.native
  /** Compiles indexes from fields and schema-level indexes */
  def indexes(): js.Array[_] = js.native
  /**
    * Loads an ES6 class into a schema. Maps setters + getters, static methods, and
    * instance methods to schema virtuals, statics, and methods.
    */
  def loadClass(model: js.Function): this.type = js.native
  def method(
    methodObj: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ F in keyof T ]: T[F]}
    */ mongooseLib.mongooseLibStrings.Schema with T
  ): this.type = js.native
  /**
    * Adds an instance method to documents constructed from Models compiled from this schema.
    * If a hash of name/fn pairs is passed as the only argument, each name/fn pair will be added as methods.
    */
  def method[F /* <: java.lang.String */](method: F, fn: /* import warning: ImportType.apply Failed type conversion: T[F] */ js.Any): this.type = js.native
  /**
    * Gets/sets schema paths.
    * Sets a path (if arity 2)
    * Gets a path (if arity 1)
    */
  def path(path: java.lang.String): SchemaType = js.native
  def path(path: java.lang.String, constructor: js.Any): this.type = js.native
  /**
    * Returns the pathType of path for this schema.
    * @returns whether it is a real, virtual, nested, or ad-hoc/undefined path.
    */
  def pathType(path: java.lang.String): java.lang.String = js.native
  /**
    * Registers a plugin for this schema.
    * @param plugin callback
    */
  def plugin(plugin: js.Function1[/* schema */ Schema[_], scala.Unit]): this.type = js.native
  def plugin[T](plugin: js.Function2[/* schema */ Schema[_], /* options */ T, scala.Unit], opts: T): this.type = js.native
  /**
    * Defines a post hook for the document
    * Post hooks fire on the event emitted from document instances of Models compiled
    *   from this schema.
    * @param method name of the method to hook
    * @param fn callback
    */
  def post[T /* <: Document */](
    method: java.lang.String,
    fn: js.Function2[
      /* doc */ T, 
      /* next */ js.Function1[/* err */ js.UndefOr[NativeError], scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  def post[T /* <: Document */](
    method: java.lang.String,
    fn: js.Function3[
      /* error */ mongodbLib.mongodbMod.MongoError, 
      /* doc */ T, 
      /* next */ js.Function1[/* err */ js.UndefOr[NativeError], scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  def post[T /* <: Document */](
    method: stdLib.RegExp,
    fn: js.Function2[
      /* doc */ T, 
      /* next */ js.Function1[/* err */ js.UndefOr[NativeError], scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  def post[T /* <: Document */](
    method: stdLib.RegExp,
    fn: js.Function3[
      /* error */ mongodbLib.mongodbMod.MongoError, 
      /* doc */ T, 
      /* next */ js.Function1[/* err */ js.UndefOr[NativeError], scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  def pre[T /* <: Document | (Model[Document, js.Object]) | Query[_] | Aggregate[_] */](method: java.lang.String, fn: HookSyncCallback[T]): this.type = js.native
  def pre[T /* <: Document | (Model[Document, js.Object]) | Query[_] | Aggregate[_] */](method: java.lang.String, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  def pre[T /* <: Document | (Model[Document, js.Object]) | Query[_] | Aggregate[_] */](method: java.lang.String, parallel: scala.Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  def pre[T /* <: Document | (Model[Document, js.Object]) | Query[_] | Aggregate[_] */](
    method: java.lang.String,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  def pre[T /* <: Document | (Model[Document, js.Object]) | Query[_] | Aggregate[_] */](method: stdLib.RegExp, parallel: scala.Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  def pre[T /* <: Document | (Model[Document, js.Object]) | Query[_] | Aggregate[_] */](
    method: stdLib.RegExp,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_aggregate[T /* <: Aggregate[_] */](method: mongooseLib.mongooseLibStrings.aggregate, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_aggregate[T /* <: Aggregate[_] */](
    method: mongooseLib.mongooseLibStrings.aggregate,
    fn: HookSyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_aggregate[T /* <: Aggregate[_] */](
    method: mongooseLib.mongooseLibStrings.aggregate,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T]
  ): this.type = js.native
  @JSName("pre")
  def pre_aggregate[T /* <: Aggregate[_] */](
    method: mongooseLib.mongooseLibStrings.aggregate,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_count[T /* <: Query[_] */](method: mongooseLib.mongooseLibStrings.count, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_count[T /* <: Query[_] */](method: mongooseLib.mongooseLibStrings.count, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_count[T /* <: Query[_] */](method: mongooseLib.mongooseLibStrings.count, parallel: scala.Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_count[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.count,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_find[T /* <: Query[_] */](method: mongooseLib.mongooseLibStrings.find, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_find[T /* <: Query[_] */](method: mongooseLib.mongooseLibStrings.find, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_find[T /* <: Query[_] */](method: mongooseLib.mongooseLibStrings.find, parallel: scala.Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_find[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.find,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_findOne[T /* <: Query[_] */](method: mongooseLib.mongooseLibStrings.findOne, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_findOne[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.findOne,
    fn: HookSyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_findOne[T /* <: Query[_] */](method: mongooseLib.mongooseLibStrings.findOne, parallel: scala.Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_findOne[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.findOne,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_findOneAndRemove[T /* <: Query[_] */](method: mongooseLib.mongooseLibStrings.findOneAndRemove, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_findOneAndRemove[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.findOneAndRemove,
    fn: HookSyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_findOneAndRemove[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.findOneAndRemove,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T]
  ): this.type = js.native
  @JSName("pre")
  def pre_findOneAndRemove[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.findOneAndRemove,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_findOneAndUpdate[T /* <: Query[_] */](method: mongooseLib.mongooseLibStrings.findOneAndUpdate, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_findOneAndUpdate[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.findOneAndUpdate,
    fn: HookSyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_findOneAndUpdate[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.findOneAndUpdate,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T]
  ): this.type = js.native
  @JSName("pre")
  def pre_findOneAndUpdate[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.findOneAndUpdate,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  /**
    * Defines a pre hook for the document.
    */
  @JSName("pre")
  def pre_init[T /* <: Document */](method: mongooseLib.mongooseLibStrings.init, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_init[T /* <: Document */](method: mongooseLib.mongooseLibStrings.init, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_init[T /* <: Document */](method: mongooseLib.mongooseLibStrings.init, parallel: scala.Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_init[T /* <: Document */](
    method: mongooseLib.mongooseLibStrings.init,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_insertMany[T /* <: Model[Document, js.Object] */](method: mongooseLib.mongooseLibStrings.insertMany, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_insertMany[T /* <: Model[Document, js.Object] */](
    method: mongooseLib.mongooseLibStrings.insertMany,
    fn: HookSyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_insertMany[T /* <: Model[Document, js.Object] */](
    method: mongooseLib.mongooseLibStrings.insertMany,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T]
  ): this.type = js.native
  @JSName("pre")
  def pre_insertMany[T /* <: Model[Document, js.Object] */](
    method: mongooseLib.mongooseLibStrings.insertMany,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_remove[T /* <: Document */](method: mongooseLib.mongooseLibStrings.remove, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_remove[T /* <: Document */](method: mongooseLib.mongooseLibStrings.remove, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_remove[T /* <: Document */](method: mongooseLib.mongooseLibStrings.remove, parallel: scala.Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_remove[T /* <: Document */](
    method: mongooseLib.mongooseLibStrings.remove,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_save[T /* <: Document */](method: mongooseLib.mongooseLibStrings.save, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_save[T /* <: Document */](method: mongooseLib.mongooseLibStrings.save, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_save[T /* <: Document */](method: mongooseLib.mongooseLibStrings.save, parallel: scala.Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_save[T /* <: Document */](
    method: mongooseLib.mongooseLibStrings.save,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_update[T /* <: Query[_] */](method: mongooseLib.mongooseLibStrings.update, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_update[T /* <: Query[_] */](method: mongooseLib.mongooseLibStrings.update, fn: HookSyncCallback[T], errorCb: HookErrorCallback): this.type = js.native
  @JSName("pre")
  def pre_update[T /* <: Query[_] */](method: mongooseLib.mongooseLibStrings.update, parallel: scala.Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_update[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.update,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_updateMany[T /* <: Query[_] */](method: mongooseLib.mongooseLibStrings.updateMany, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_updateMany[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.updateMany,
    fn: HookSyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_updateMany[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.updateMany,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T]
  ): this.type = js.native
  @JSName("pre")
  def pre_updateMany[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.updateMany,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_updateOne[T /* <: Query[_] */](method: mongooseLib.mongooseLibStrings.updateOne, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_updateOne[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.updateOne,
    fn: HookSyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_updateOne[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.updateOne,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T]
  ): this.type = js.native
  @JSName("pre")
  def pre_updateOne[T /* <: Query[_] */](
    method: mongooseLib.mongooseLibStrings.updateOne,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_validate[T /* <: Document */](method: mongooseLib.mongooseLibStrings.validate, fn: HookSyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_validate[T /* <: Document */](
    method: mongooseLib.mongooseLibStrings.validate,
    fn: HookSyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  @JSName("pre")
  def pre_validate[T /* <: Document */](method: mongooseLib.mongooseLibStrings.validate, parallel: scala.Boolean, fn: HookAsyncCallback[T]): this.type = js.native
  @JSName("pre")
  def pre_validate[T /* <: Document */](
    method: mongooseLib.mongooseLibStrings.validate,
    parallel: scala.Boolean,
    fn: HookAsyncCallback[T],
    errorCb: HookErrorCallback
  ): this.type = js.native
  /**
    * Adds a method call to the queue.
    * @param name name of the document method to call later
    * @param args arguments to pass to the method
    */
  def queue(name: java.lang.String, args: js.Array[_]): this.type = js.native
  /**
    * Removes the given path (or [paths]).
    */
  def remove(path: java.lang.String): scala.Unit = js.native
  def remove(path: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * @param invalidate refresh the cache
    * @returns an Array of path strings that are required by this schema.
    */
  def requiredPaths(): js.Array[java.lang.String] = js.native
  def requiredPaths(invalidate: scala.Boolean): js.Array[java.lang.String] = js.native
  def set(key: mongooseLib.mongooseLibStrings.strict, value: mongooseLib.mongooseLibStrings.`throw`): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set__id(key: mongooseLib.mongooseLibStrings._id): scala.Boolean = js.native
  @JSName("set")
  def set__id(key: mongooseLib.mongooseLibStrings._id, value: scala.Boolean): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_autoIndex(key: mongooseLib.mongooseLibStrings.autoIndex): scala.Boolean = js.native
  @JSName("set")
  def set_autoIndex(key: mongooseLib.mongooseLibStrings.autoIndex, value: scala.Boolean): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_bufferCommands(key: mongooseLib.mongooseLibStrings.bufferCommands): scala.Boolean = js.native
  @JSName("set")
  def set_bufferCommands(key: mongooseLib.mongooseLibStrings.bufferCommands, value: scala.Boolean): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_capped(key: mongooseLib.mongooseLibStrings.capped): scala.Boolean | scala.Double | mongooseLib.Anon_AutoIndexId = js.native
  @JSName("set")
  def set_capped(key: mongooseLib.mongooseLibStrings.capped, value: mongooseLib.Anon_AutoIndexId): this.type = js.native
  @JSName("set")
  def set_capped(key: mongooseLib.mongooseLibStrings.capped, value: scala.Boolean): this.type = js.native
  @JSName("set")
  def set_capped(key: mongooseLib.mongooseLibStrings.capped, value: scala.Double): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_collation(key: mongooseLib.mongooseLibStrings.collation): CollationOptions = js.native
  @JSName("set")
  def set_collation(key: mongooseLib.mongooseLibStrings.collation, value: CollationOptions): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_collection(key: mongooseLib.mongooseLibStrings.collection): java.lang.String = js.native
  @JSName("set")
  def set_collection(key: mongooseLib.mongooseLibStrings.collection, value: java.lang.String): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_discriminatorKey(key: mongooseLib.mongooseLibStrings.discriminatorKey): java.lang.String = js.native
  @JSName("set")
  def set_discriminatorKey(key: mongooseLib.mongooseLibStrings.discriminatorKey, value: java.lang.String): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_emitIndexErrors(key: mongooseLib.mongooseLibStrings.emitIndexErrors): scala.Boolean = js.native
  @JSName("set")
  def set_emitIndexErrors(key: mongooseLib.mongooseLibStrings.emitIndexErrors, value: scala.Boolean): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_excludeIndexes(key: mongooseLib.mongooseLibStrings.excludeIndexes): js.Any = js.native
  @JSName("set")
  def set_excludeIndexes(key: mongooseLib.mongooseLibStrings.excludeIndexes, value: js.Any): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_id(key: mongooseLib.mongooseLibStrings.id): scala.Boolean = js.native
  @JSName("set")
  def set_id(key: mongooseLib.mongooseLibStrings.id, value: scala.Boolean): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_minimize(key: mongooseLib.mongooseLibStrings.minimize): scala.Boolean = js.native
  @JSName("set")
  def set_minimize(key: mongooseLib.mongooseLibStrings.minimize, value: scala.Boolean): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_read(key: mongooseLib.mongooseLibStrings.read): java.lang.String = js.native
  @JSName("set")
  def set_read(key: mongooseLib.mongooseLibStrings.read, value: java.lang.String): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_safe(key: mongooseLib.mongooseLibStrings.safe): scala.Boolean | mongooseLib.Anon_J = js.native
  @JSName("set")
  def set_safe(key: mongooseLib.mongooseLibStrings.safe, value: mongooseLib.Anon_J): this.type = js.native
  @JSName("set")
  def set_safe(key: mongooseLib.mongooseLibStrings.safe, value: scala.Boolean): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_selectPopulatedPaths(key: mongooseLib.mongooseLibStrings.selectPopulatedPaths): scala.Boolean = js.native
  @JSName("set")
  def set_selectPopulatedPaths(key: mongooseLib.mongooseLibStrings.selectPopulatedPaths, value: scala.Boolean): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_shardKey(key: mongooseLib.mongooseLibStrings.shardKey): js.Object = js.native
  @JSName("set")
  def set_shardKey(key: mongooseLib.mongooseLibStrings.shardKey, value: js.Object): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_skipVersioning(key: mongooseLib.mongooseLibStrings.skipVersioning): js.Any = js.native
  @JSName("set")
  def set_skipVersioning(key: mongooseLib.mongooseLibStrings.skipVersioning, value: js.Any): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_storeSubdocValidationError(key: mongooseLib.mongooseLibStrings.storeSubdocValidationError): scala.Boolean = js.native
  @JSName("set")
  def set_storeSubdocValidationError(key: mongooseLib.mongooseLibStrings.storeSubdocValidationError, value: scala.Boolean): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_strict(key: mongooseLib.mongooseLibStrings.strict): scala.Boolean | mongooseLib.mongooseLibStrings.`throw` = js.native
  @JSName("set")
  def set_strict(key: mongooseLib.mongooseLibStrings.strict, value: scala.Boolean): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_timestamps(key: mongooseLib.mongooseLibStrings.timestamps): scala.Boolean | SchemaTimestampsConfig = js.native
  @JSName("set")
  def set_timestamps(key: mongooseLib.mongooseLibStrings.timestamps, value: SchemaTimestampsConfig): this.type = js.native
  @JSName("set")
  def set_timestamps(key: mongooseLib.mongooseLibStrings.timestamps, value: scala.Boolean): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_toJSON(key: mongooseLib.mongooseLibStrings.toJSON): DocumentToObjectOptions = js.native
  @JSName("set")
  def set_toJSON(key: mongooseLib.mongooseLibStrings.toJSON, value: DocumentToObjectOptions): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_toObject(key: mongooseLib.mongooseLibStrings.toObject): DocumentToObjectOptions = js.native
  @JSName("set")
  def set_toObject(key: mongooseLib.mongooseLibStrings.toObject, value: DocumentToObjectOptions): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_typeKey(key: mongooseLib.mongooseLibStrings.typeKey): java.lang.String = js.native
  @JSName("set")
  def set_typeKey(key: mongooseLib.mongooseLibStrings.typeKey, value: java.lang.String): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_useNestedStrict(key: mongooseLib.mongooseLibStrings.useNestedStrict): scala.Boolean = js.native
  @JSName("set")
  def set_useNestedStrict(key: mongooseLib.mongooseLibStrings.useNestedStrict, value: scala.Boolean): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_usePushEach(key: mongooseLib.mongooseLibStrings.usePushEach): scala.Boolean = js.native
  @JSName("set")
  def set_usePushEach(key: mongooseLib.mongooseLibStrings.usePushEach, value: scala.Boolean): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_validateBeforeSave(key: mongooseLib.mongooseLibStrings.validateBeforeSave): scala.Boolean = js.native
  @JSName("set")
  def set_validateBeforeSave(key: mongooseLib.mongooseLibStrings.validateBeforeSave, value: scala.Boolean): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_versionKey(key: mongooseLib.mongooseLibStrings.versionKey): java.lang.String | scala.Boolean = js.native
  @JSName("set")
  def set_versionKey(key: mongooseLib.mongooseLibStrings.versionKey, value: java.lang.String): this.type = js.native
  @JSName("set")
  def set_versionKey(key: mongooseLib.mongooseLibStrings.versionKey, value: scala.Boolean): this.type = js.native
  /**
    * Sets/gets a schema option.
    * @param key option name
    * @param value if not passed, the current option value is returned
    */
  @JSName("set")
  def set_writeConcern(key: mongooseLib.mongooseLibStrings.writeConcern): WriteConcern = js.native
  @JSName("set")
  def set_writeConcern(key: mongooseLib.mongooseLibStrings.writeConcern, value: WriteConcern): this.type = js.native
  def static(nameObj: org.scalablytyped.runtime.StringDictionary[js.Function]): this.type = js.native
  /**
    * Adds static "class" methods to Models compiled from this schema.
    */
  def static(name: java.lang.String, fn: js.Function): this.type = js.native
  /** Creates a virtual type with the given name. */
  def virtual(name: java.lang.String): VirtualType = js.native
  def virtual(name: java.lang.String, options: js.Any): VirtualType = js.native
  /** Returns the virtual type with the given name. */
  def virtualpath(name: java.lang.String): VirtualType = js.native
}

