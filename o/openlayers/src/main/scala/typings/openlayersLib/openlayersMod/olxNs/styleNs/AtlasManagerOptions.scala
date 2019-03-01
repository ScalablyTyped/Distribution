package typings
package openlayersLib.openlayersMod.olxNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtlasManagerOptions extends js.Object {
  var initialSize: js.UndefOr[scala.Double] = js.undefined
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  var space: js.UndefOr[scala.Double] = js.undefined
}

object AtlasManagerOptions {
  @scala.inline
  def apply(
    initialSize: scala.Int | scala.Double = null,
    maxSize: scala.Int | scala.Double = null,
    space: scala.Int | scala.Double = null
  ): AtlasManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (initialSize != null) __obj.updateDynamic("initialSize")(initialSize.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtlasManagerOptions]
  }
}

