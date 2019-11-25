package typings.openlayers.openlayersMod.olx.format

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WKTOptions extends js.Object {
  var splitCollection: js.UndefOr[Boolean] = js.undefined
}

object WKTOptions {
  @scala.inline
  def apply(splitCollection: js.UndefOr[Boolean] = js.undefined): WKTOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(splitCollection)) __obj.updateDynamic("splitCollection")(splitCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[WKTOptions]
  }
}

