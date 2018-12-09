package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateValidationErrorArgs extends js.Object {
  var data: js.UndefOr[ErrorHash | js.Any] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  // This can be any string for custom errors. ValidationErrorType is there
  // only to document the default values objection uses internally.
  var `type`: ValidationErrorType | java.lang.String
}

