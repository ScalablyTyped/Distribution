package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Plugin extends js.Object {
  var DocumentProvider: js.Any = js.native
  var Model: mongooseLib.mongooseMod.Model[_, js.Object] = js.native
  var Mongoose: org.scalablytyped.runtime.Instantiable1[
    /* args (repeated) */ js.Any, 
    /* import warning: ImportType.apply Failed type conversion: typeof mongoose */ js.Any
  ] = js.native
  var Promise: js.Any = js.native
  var PromiseProvider: js.Any = js.native
  var STATES: js.Any = js.native
  var connection: mongooseLib.mongooseMod.Connection = js.native
  var models: org.scalablytyped.runtime.StringDictionary[mongooseLib.mongooseMod.Model[_, js.Object]] = js.native
  var version: java.lang.String = js.native
  def connect(uris: java.lang.String): js.Promise[mongooseLib.mongooseMod.Mongoose] = js.native
  def connect(
    uris: java.lang.String,
    callback: js.Function1[/* err */ mongodbLib.mongodbMod.MongoError, scala.Unit]
  ): scala.Null = js.native
  def connect(uris: java.lang.String, options: mongooseLib.mongooseMod.ConnectionOptions): js.Promise[mongooseLib.mongooseMod.Mongoose] = js.native
  def connect(
    uris: java.lang.String,
    options: mongooseLib.mongooseMod.ConnectionOptions,
    callback: js.Function1[/* err */ mongodbLib.mongodbMod.MongoError, scala.Unit]
  ): scala.Null = js.native
  def createConnection(): mongooseLib.mongooseMod.Connection = js.native
  def createConnection(uri: java.lang.String): mongooseLib.mongooseMod.Connection with Anon_Then = js.native
  def createConnection(uri: java.lang.String, options: mongooseLib.mongooseMod.ConnectionOptions): mongooseLib.mongooseMod.Connection with Anon_Then = js.native
  def disconnect(): js.Promise[scala.Unit] = js.native
  def disconnect(fn: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit]): scala.Null = js.native
  def get(key: java.lang.String): js.Any = js.native
  def model[T /* <: mongooseLib.mongooseMod.Document */](name: java.lang.String): mongooseLib.mongooseMod.Model[T, js.Object] = js.native
  def model[T /* <: mongooseLib.mongooseMod.Document */](name: java.lang.String, schema: mongooseLib.mongooseMod.Schema): mongooseLib.mongooseMod.Model[T, js.Object] = js.native
  def model[T /* <: mongooseLib.mongooseMod.Document */](name: java.lang.String, schema: mongooseLib.mongooseMod.Schema, collection: java.lang.String): mongooseLib.mongooseMod.Model[T, js.Object] = js.native
  def model[T /* <: mongooseLib.mongooseMod.Document */](
    name: java.lang.String,
    schema: mongooseLib.mongooseMod.Schema,
    collection: java.lang.String,
    skipInit: scala.Boolean
  ): mongooseLib.mongooseMod.Model[T, js.Object] = js.native
  def modelNames(): js.Array[java.lang.String] = js.native
  @JSName("model")
  def model_TDocumentUModelU[T /* <: mongooseLib.mongooseMod.Document */, U /* <: mongooseLib.mongooseMod.Model[T, js.Object] */](name: java.lang.String): U = js.native
  @JSName("model")
  def model_TDocumentUModelU[T /* <: mongooseLib.mongooseMod.Document */, U /* <: mongooseLib.mongooseMod.Model[T, js.Object] */](name: java.lang.String, schema: mongooseLib.mongooseMod.Schema): U = js.native
  @JSName("model")
  def model_TDocumentUModelU[T /* <: mongooseLib.mongooseMod.Document */, U /* <: mongooseLib.mongooseMod.Model[T, js.Object] */](name: java.lang.String, schema: mongooseLib.mongooseMod.Schema, collection: java.lang.String): U = js.native
  @JSName("model")
  def model_TDocumentUModelU[T /* <: mongooseLib.mongooseMod.Document */, U /* <: mongooseLib.mongooseMod.Model[T, js.Object] */](
    name: java.lang.String,
    schema: mongooseLib.mongooseMod.Schema,
    collection: java.lang.String,
    skipInit: scala.Boolean
  ): U = js.native
  def plugin(fn: js.Function): /* import warning: ImportType.apply Failed type conversion: typeof mongoose */ js.Any = js.native
  def plugin[T](fn: js.Function, opts: T): /* import warning: ImportType.apply Failed type conversion: typeof mongoose */ js.Any = js.native
  def pluralize(): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  def pluralize(fn: js.Function1[/* str */ java.lang.String, java.lang.String]): js.Function1[/* str */ java.lang.String, java.lang.String] = js.native
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def startSession(): js.Promise[mongodbLib.mongodbMod.ClientSession] = js.native
  def startSession(options: mongodbLib.mongodbMod.SessionOptions): js.Promise[mongodbLib.mongodbMod.ClientSession] = js.native
  def startSession(
    options: mongodbLib.mongodbMod.SessionOptions,
    cb: js.Function2[/* err */ js.Any, /* session */ mongodbLib.mongodbMod.ClientSession, scala.Unit]
  ): js.Promise[mongodbLib.mongodbMod.ClientSession] = js.native
}

