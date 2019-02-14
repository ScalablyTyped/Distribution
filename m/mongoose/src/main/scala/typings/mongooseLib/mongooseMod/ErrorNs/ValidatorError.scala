package typings
package mongooseLib.mongooseMod.ErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidatorError
  extends mongooseLib.mongooseMod.Error {
  var kind: java.lang.String = js.native
  @JSName("name")
  var name_ValidatorError: mongooseLib.mongooseLibStrings.ValidatorError = js.native
  var path: java.lang.String = js.native
  var properties: mongooseLib.Anon_Message = js.native
  var reason: js.Any = js.native
  var value: js.Any = js.native
  def formatMessage(msg: java.lang.String, properties: js.Any): java.lang.String = js.native
  def formatMessage(msg: js.Function, properties: js.Any): java.lang.String = js.native
}

