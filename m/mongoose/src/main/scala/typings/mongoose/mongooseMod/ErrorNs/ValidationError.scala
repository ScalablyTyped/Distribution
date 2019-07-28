package typings.mongoose.mongooseMod.ErrorNs

import org.scalablytyped.runtime.StringDictionary
import typings.mongoose.mongooseMod.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError extends Error {
  var errors: StringDictionary[ValidatorError | typings.mongoose.mongooseMod.ErrorNs.CastError] = js.native
  @JSName("name")
  var name_ValidationError: typings.mongoose.mongooseStrings.ValidationError = js.native
  def addError(path: String, error: js.Any): Unit = js.native
  def inspect(): js.Object = js.native
  def toJSON(): js.Object = js.native
}

