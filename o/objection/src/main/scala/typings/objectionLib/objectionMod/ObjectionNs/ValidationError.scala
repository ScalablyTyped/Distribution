package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ValidationError
  extends nodeLib.Error {
  var data: js.UndefOr[ErrorHash | js.Any] = js.undefined
  var message: java.lang.String
  var statusCode: scala.Double
  var `type`: ValidationErrorType
}

