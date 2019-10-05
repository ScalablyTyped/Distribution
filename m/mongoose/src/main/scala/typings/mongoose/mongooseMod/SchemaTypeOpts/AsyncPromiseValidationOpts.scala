package typings.mongoose.mongooseMod.SchemaTypeOpts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncPromiseValidationOpts extends ValidateOptsBase {
  @JSName("validator")
  var validator_Original: AsyncPromiseValidationFn[_] = js.native
  def validator(value: js.Any): js.Promise[Boolean] = js.native
}

