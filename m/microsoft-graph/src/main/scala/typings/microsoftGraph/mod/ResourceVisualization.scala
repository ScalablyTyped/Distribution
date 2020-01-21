package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceVisualization extends js.Object {
  var containerDisplayName: js.UndefOr[String] = js.undefined
  var containerType: js.UndefOr[String] = js.undefined
  var containerWebUrl: js.UndefOr[String] = js.undefined
  var mediaType: js.UndefOr[String] = js.undefined
  var previewImageUrl: js.UndefOr[String] = js.undefined
  var previewText: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ResourceVisualization {
  @scala.inline
  def apply(
    containerDisplayName: String = null,
    containerType: String = null,
    containerWebUrl: String = null,
    mediaType: String = null,
    previewImageUrl: String = null,
    previewText: String = null,
    title: String = null,
    `type`: String = null
  ): ResourceVisualization = {
    val __obj = js.Dynamic.literal()
    if (containerDisplayName != null) __obj.updateDynamic("containerDisplayName")(containerDisplayName.asInstanceOf[js.Any])
    if (containerType != null) __obj.updateDynamic("containerType")(containerType.asInstanceOf[js.Any])
    if (containerWebUrl != null) __obj.updateDynamic("containerWebUrl")(containerWebUrl.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (previewImageUrl != null) __obj.updateDynamic("previewImageUrl")(previewImageUrl.asInstanceOf[js.Any])
    if (previewText != null) __obj.updateDynamic("previewText")(previewText.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceVisualization]
  }
}

