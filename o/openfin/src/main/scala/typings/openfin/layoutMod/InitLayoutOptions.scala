package typings.openfin.layoutMod

import typings.openfin.GoldenLayout.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitLayoutOptions extends js.Object {
  var containerId: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[Config] = js.undefined
}

object InitLayoutOptions {
  @scala.inline
  def apply(containerId: String = null, layout: Config = null): InitLayoutOptions = {
    val __obj = js.Dynamic.literal()
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitLayoutOptions]
  }
}

