package typings.mongoose.mod.SchemaTypeOpts

import typings.mongoose.mongooseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncValidateOpts extends ValidateOptsBase {
  
  /** deprecated */
  var isAsync: `true` = js.native
  
  def validator(value: js.Any, done: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  @JSName("validator")
  var validator_Original: AsyncValidateFn[_] = js.native
}
