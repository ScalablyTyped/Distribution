package typings.mongoose.mongooseMod.ErrorNs

import typings.mongoose.mongooseMod.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

