package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotFoundError
  extends nodeLib.Error {
  var data: js.UndefOr[js.Any] = js.undefined
  var statusCode: scala.Double
}

