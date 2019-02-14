package typings
package mongooseLib.mongooseMod.ErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError
  extends mongooseLib.mongooseMod.Error {
  var errors: org.scalablytyped.runtime.StringDictionary[ValidatorError | CastError] = js.native
  @JSName("name")
  var name_ValidationError: mongooseLib.mongooseLibStrings.ValidationError = js.native
  def addError(path: java.lang.String, error: js.Any): scala.Unit = js.native
  def inspect(): js.Object = js.native
  def toJSON(): js.Object = js.native
}

