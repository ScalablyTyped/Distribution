package typings.mongoose.mongooseMod.ErrorNs

import typings.mongoose.Anon_Message
import typings.mongoose.mongooseMod.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

