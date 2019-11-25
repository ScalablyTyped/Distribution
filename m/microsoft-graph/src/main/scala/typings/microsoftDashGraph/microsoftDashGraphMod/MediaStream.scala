package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStream extends js.Object {
  var direction: js.UndefOr[MediaDirection] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var mediaType: js.UndefOr[Modality] = js.undefined
  var serverMuted: js.UndefOr[Boolean] = js.undefined
  var sourceId: js.UndefOr[String] = js.undefined
}

object MediaStream {
  @scala.inline
  def apply(
    direction: MediaDirection = null,
    label: String = null,
    mediaType: Modality = null,
    serverMuted: js.UndefOr[Boolean] = js.undefined,
    sourceId: String = null
  ): MediaStream = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (!js.isUndefined(serverMuted)) __obj.updateDynamic("serverMuted")(serverMuted.asInstanceOf[js.Any])
    if (sourceId != null) __obj.updateDynamic("sourceId")(sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStream]
  }
}

