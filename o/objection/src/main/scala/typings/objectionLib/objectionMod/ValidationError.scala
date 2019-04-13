package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objection", "ValidationError")
@js.native
class ValidationError protected ()
  extends stdLib.Error {
  def this(args: CreateValidationErrorArgs) = this()
  var data: js.UndefOr[ErrorHash | js.Any] = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var statusCode: scala.Double = js.native
  var `type`: ValidationErrorType = js.native
}

