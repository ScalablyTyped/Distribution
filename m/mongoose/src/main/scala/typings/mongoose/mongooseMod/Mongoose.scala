package typings.mongoose.mongooseMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.mongodb.mongodbMod.MongoError
import typings.mongodb.mongodbMod.SessionOptions
import typings.mongoose.Anon_Catch
import typings.mongoose.TypeofSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mongoose extends js.Object {
  var DocumentProvider: js.Any = js.native
  val ErrorNs: js.Any = js.native
  var Model: typings.mongoose.mongooseMod.Model[_, js.Object] = js.native
  var Mongoose: Instantiable1[
    /* args (repeated) */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: typeof mongoose */ js.Any
  ] = js.native
  var Promise: js.Any = js.native
  var PromiseProvider: js.Any = js.native
  var STATES: ConnectionStates = js.native
  val SchemaNs: TypeofSchema = js.native
  // Interfaces specific to schema type options should be scoped in this namespace
  val SchemaTypeOptsNs: js.Any = js.native
  val TypesNs: js.Any = js.native
  var connection: Connection = js.native
  var connections: js.Array[Connection] = js.native
  var models: StringDictionary[Model[_, js.Object]] = js.native
  var version: String = js.native
  def connect(uris: String): js.Promise[Mongoose] = js.native
  def connect(uris: String, callback: js.Function1[/* err */ MongoError, Unit]): js.Promise[Mongoose] = js.native
  def connect(uris: String, options: ConnectionOptions): js.Promise[Mongoose] = js.native
  def connect(uris: String, options: ConnectionOptions, callback: js.Function1[/* err */ MongoError, Unit]): js.Promise[Mongoose] = js.native
  def createConnection(): Connection = js.native
  def createConnection(uri: String): Connection with Anon_Catch = js.native
  def createConnection(uri: String, options: ConnectionOptions): Connection with Anon_Catch = js.native
  def disconnect(): js.Promise[Unit] = js.native
  def disconnect(fn: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def get(key: String): js.Any = js.native
  def model[T /* <: Document */](name: String): Model[T, js.Object] = js.native
  def model[T /* <: Document */](name: String, schema: Schema[_]): Model[T, js.Object] = js.native
  def model[T /* <: Document */](name: String, schema: Schema[_], collection: String): Model[T, js.Object] = js.native
  def model[T /* <: Document */](name: String, schema: Schema[_], collection: String, skipInit: Boolean): Model[T, js.Object] = js.native
  def modelNames(): js.Array[String] = js.native
  @JSName("model")
  def model_T_DocumentU_ModelTObject_U[T /* <: Document */, U /* <: Model[T, js.Object] */](name: String): U = js.native
  @JSName("model")
  def model_T_DocumentU_ModelTObject_U[T /* <: Document */, U /* <: Model[T, js.Object] */](name: String, schema: Schema[_]): U = js.native
  @JSName("model")
  def model_T_DocumentU_ModelTObject_U[T /* <: Document */, U /* <: Model[T, js.Object] */](name: String, schema: Schema[_], collection: String): U = js.native
  @JSName("model")
  def model_T_DocumentU_ModelTObject_U[T /* <: Document */, U /* <: Model[T, js.Object] */](name: String, schema: Schema[_], collection: String, skipInit: Boolean): U = js.native
  def plugin(fn: js.Function): /* import warning: ImportType.apply Failed type conversion: typeof mongoose */ js.Any = js.native
  def plugin[T](fn: js.Function, opts: T): /* import warning: ImportType.apply Failed type conversion: typeof mongoose */ js.Any = js.native
  def pluralize(): js.Function1[/* str */ String, String] = js.native
  def pluralize(fn: js.Function1[/* str */ String, String]): js.Function1[/* str */ String, String] = js.native
  def set(key: String, value: js.Any): Unit = js.native
  def startSession(): js.Promise[typings.mongodb.mongodbMod.ClientSession] = js.native
  def startSession(options: SessionOptions): js.Promise[typings.mongodb.mongodbMod.ClientSession] = js.native
  def startSession(
    options: SessionOptions,
    cb: js.Function2[/* err */ js.Any, /* session */ typings.mongodb.mongodbMod.ClientSession, Unit]
  ): js.Promise[typings.mongodb.mongodbMod.ClientSession] = js.native
}

