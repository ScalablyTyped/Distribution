package typings
package offlineDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OfflineChecks extends js.Object {
  var active: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[OfflineCheck] = js.undefined
  // TODO "xhr" and "image" probably have different options.
  // However, this is not stated in the project documentation.
  var xhr: js.UndefOr[OfflineCheck] = js.undefined
}

