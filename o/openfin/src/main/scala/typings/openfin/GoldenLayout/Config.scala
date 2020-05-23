package typings.openfin.GoldenLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var content: js.UndefOr[js.Array[ItemConfigType]] = js.undefined
  var dimensions: js.UndefOr[Dimensions] = js.undefined
  var labels: js.UndefOr[Labels] = js.undefined
  var settings: js.UndefOr[Settings] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    content: js.Array[ItemConfigType] = null,
    dimensions: Dimensions = null,
    labels: Labels = null,
    settings: Settings = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

