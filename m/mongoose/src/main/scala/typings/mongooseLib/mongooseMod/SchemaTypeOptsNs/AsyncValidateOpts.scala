package typings
package mongooseLib.mongooseMod.SchemaTypeOptsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncValidateOpts extends ValidateOptsBase {
  var isAsync: mongooseLib.mongooseLibNumbers.`true` = js.native
  @JSName("validator")
  var validator_Original: AsyncValidateFn[_] = js.native
  def validator(value: js.Any, done: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
}

