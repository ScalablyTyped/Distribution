package typings.mongoose.mongooseMod

import org.scalablytyped.runtime.StringDictionary
import typings.mongoose.Anon_Message
import typings.mongoose.mongooseStrings.MongooseError
import typings.std.ErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * section error.js
  * http://mongoosejs.com/docs/api.html#error-js
  */
@js.native
trait Error extends ErrorConstructor {
  // "MongooseError" for instances of the current class,
  // an other string for instances of derived classes.
  var name: MongooseError | String = js.native
}

@JSImport("mongoose", "Error")
@js.native
object Error extends js.Object {
  @js.native
  trait CastError extends Error {
    var kind: String = js.native
    var model: js.UndefOr[js.Any] = js.native
    @JSName("name")
    var name_CastError: typings.mongoose.mongooseStrings.CastError = js.native
    var path: String = js.native
    var reason: js.UndefOr[js.Any] = js.native
    var stringValue: String = js.native
    var value: js.Any = js.native
    def setModel(model: js.Any): Unit = js.native
  }
  
  @js.native
  trait DivergentArrayError extends Error {
    @JSName("name")
    var name_DivergentArrayError: typings.mongoose.mongooseStrings.DivergentArrayError = js.native
  }
  
  @js.native
  trait DocumentNotFoundError extends Error {
    var filter: js.Any = js.native
    @JSName("name")
    var name_DocumentNotFoundError: typings.mongoose.mongooseStrings.DocumentNotFoundError = js.native
    var query: js.Any = js.native
  }
  
  @js.native
  trait MissingSchemaError extends Error {
    @JSName("name")
    var name_MissingSchemaError: typings.mongoose.mongooseStrings.MissingSchemaError = js.native
  }
  
  @js.native
  trait OverwriteModelError extends Error {
    @JSName("name")
    var name_OverwriteModelError: typings.mongoose.mongooseStrings.OverwriteModelError = js.native
  }
  
  @js.native
  trait ParallelSaveError extends Error {
    @JSName("name")
    var name_ParallelSaveError: typings.mongoose.mongooseStrings.ParallelSaveError = js.native
  }
  
  @js.native
  trait ValidationError extends Error {
    var errors: StringDictionary[ValidatorError | typings.mongoose.mongooseMod.Error.CastError] = js.native
    @JSName("name")
    var name_ValidationError: typings.mongoose.mongooseStrings.ValidationError = js.native
    def addError(path: String, error: js.Any): Unit = js.native
    def inspect(): js.Object = js.native
    def toJSON(): js.Object = js.native
  }
  
  @js.native
  trait ValidatorError extends Error {
    var kind: String = js.native
    @JSName("name")
    var name_ValidatorError: typings.mongoose.mongooseStrings.ValidatorError = js.native
    var path: String = js.native
    var properties: Anon_Message = js.native
    var reason: js.Any = js.native
    var value: js.Any = js.native
    def formatMessage(msg: String, properties: js.Any): String = js.native
    def formatMessage(msg: js.Function, properties: js.Any): String = js.native
  }
  
  @js.native
  trait VersionError extends Error {
    var modifiedPaths: js.Array[_] = js.native
    @JSName("name")
    var name_VersionError: typings.mongoose.mongooseStrings.VersionError = js.native
    var version: js.Any = js.native
  }
  
}

