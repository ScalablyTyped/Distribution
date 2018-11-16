package typings
package mongooseLib.mongooseMod.SchemaTypeOptsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncPromiseValidationOpts extends ValidateOptsBase {
  @JSName("validator")
  var validator_Original: AsyncPromiseValidationFn[_] = js.native
  def validator(value: js.Any): stdLib.Promise[scala.Boolean] = js.native
}

