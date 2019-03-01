package typings
package musicmetadataLib.MMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var duration: js.UndefOr[scala.Boolean] = js.undefined
  var fileSize: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(duration: js.UndefOr[scala.Boolean] = js.undefined, fileSize: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration)
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

