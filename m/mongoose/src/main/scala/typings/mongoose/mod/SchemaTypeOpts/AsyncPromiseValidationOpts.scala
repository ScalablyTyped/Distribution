package typings.mongoose.mod.SchemaTypeOpts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncPromiseValidationOpts extends ValidateOptsBase {
  
  def validator(value: js.Any): js.Promise[Boolean] = js.native
  @JSName("validator")
  var validator_Original: AsyncPromiseValidationFn[_] = js.native
}
