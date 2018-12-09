package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objection", "ValidationError")
@js.native
class ValidationError protected ()
  extends objectionLib.objectionMod.ObjectionNs.ValidationError {
  def this(args: objectionLib.objectionMod.ObjectionNs.CreateValidationErrorArgs) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var statusCode: scala.Double = js.native
  /* CompleteClass */
  override var `type`: objectionLib.objectionMod.ObjectionNs.ValidationErrorType = js.native
}

