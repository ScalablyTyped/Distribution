package typings.mongoose.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.mongodb.mod.MongoError
import typings.mongodb.mod.SessionOptions
import typings.mongoose.anon.ConnectionthenPromiseConn
import typings.mongoose.anon.TypeofSchema
import typings.mongoose.anon.Typeofmongoose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mongoose extends js.Object {
  var DocumentProvider: js.Any = js.native
  val Error: js.Any = js.native
  var Model: Model_[_, js.Object] = js.native
  var Mongoose: Instantiable1[
    /* args (repeated) */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof mongoose */ js.Any
  ] = js.native
  var Promise: js.Any = js.native
  var PromiseProvider: js.Any = js.native
  val Schema: TypeofSchema = js.native
  // Interfaces specific to schema type options should be scoped in this namespace
  val SchemaTypeOpts: js.Any = js.native
  val Types: js.Any = js.native
  var connection: Connection_ = js.native
  var connections: js.Array[Connection_] = js.native
  var models: StringDictionary[Model_[_, js.Object]] = js.native
  var version: String = js.native
  def connect(uris: String): js.Promise[Mongoose] = js.native
  def connect(uris: String, callback: js.Function1[/* err */ MongoError, Unit]): js.Promise[Mongoose] = js.native
  def connect(uris: String, options: ConnectionOptions): js.Promise[Mongoose] = js.native
  def connect(uris: String, options: ConnectionOptions, callback: js.Function1[/* err */ MongoError, Unit]): js.Promise[Mongoose] = js.native
  def createConnection(): Connection_ = js.native
  def createConnection(uri: String): ConnectionthenPromiseConn = js.native
  def createConnection(uri: String, options: ConnectionOptions): ConnectionthenPromiseConn = js.native
  def disconnect(): js.Promise[Unit] = js.native
  def disconnect(fn: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def get(key: String): js.Any = js.native
  def isValidObjectId(value: js.Any): Boolean = js.native
  def model[T /* <: Document */](name: String): Model_[T, js.Object] = js.native
  def model[T /* <: Document */](name: String, schema: typings.mongoose.mod.Schema[_]): Model_[T, js.Object] = js.native
  def model[T /* <: Document */](name: String, schema: typings.mongoose.mod.Schema[_], collection: String): Model_[T, js.Object] = js.native
  def model[T /* <: Document */](name: String, schema: typings.mongoose.mod.Schema[_], collection: String, skipInit: Boolean): Model_[T, js.Object] = js.native
  def modelNames(): js.Array[String] = js.native
  @JSName("model")
  def model_T_DocumentU_Model_TObject_U[T /* <: Document */, U /* <: Model_[T, js.Object] */](name: String): U = js.native
  @JSName("model")
  def model_T_DocumentU_Model_TObject_U[T /* <: Document */, U /* <: Model_[T, js.Object] */](name: String, schema: typings.mongoose.mod.Schema[_]): U = js.native
  @JSName("model")
  def model_T_DocumentU_Model_TObject_U[T /* <: Document */, U /* <: Model_[T, js.Object] */](name: String, schema: typings.mongoose.mod.Schema[_], collection: String): U = js.native
  @JSName("model")
  def model_T_DocumentU_Model_TObject_U[T /* <: Document */, U /* <: Model_[T, js.Object] */](name: String, schema: typings.mongoose.mod.Schema[_], collection: String, skipInit: Boolean): U = js.native
  def plugin(fn: js.Function): /* import warning: importer.ImportType#apply Failed type conversion: typeof mongoose */ js.Any = js.native
  def plugin[T](fn: js.Function, opts: T): /* import warning: importer.ImportType#apply Failed type conversion: typeof mongoose */ js.Any = js.native
  def pluralize(): js.Function1[/* str */ String, String] = js.native
  def pluralize(fn: js.Function1[/* str */ String, String]): js.Function1[/* str */ String, String] = js.native
  def set(key: String, value: js.Any): Unit = js.native
  def startSession(): js.Promise[typings.mongodb.mod.ClientSession] = js.native
  def startSession(options: SessionOptions): js.Promise[typings.mongodb.mod.ClientSession] = js.native
  def startSession(
    options: SessionOptions,
    cb: js.Function2[/* err */ js.Any, /* session */ typings.mongodb.mod.ClientSession, Unit]
  ): js.Promise[typings.mongodb.mod.ClientSession] = js.native
}

@JSImport("mongoose", "Mongoose")
@js.native
object Mongoose
  extends TopLevel[Instantiable1[/* args (repeated) */ js.Any, Typeofmongoose]]

