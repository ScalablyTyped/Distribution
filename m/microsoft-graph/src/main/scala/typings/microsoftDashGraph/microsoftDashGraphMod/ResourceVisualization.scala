package typings.microsoftDashGraph.microsoftDashGraphMod

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
    if (containerDisplayName != null) __obj.updateDynamic("containerDisplayName")(containerDisplayName)
    if (containerType != null) __obj.updateDynamic("containerType")(containerType)
    if (containerWebUrl != null) __obj.updateDynamic("containerWebUrl")(containerWebUrl)
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType)
    if (previewImageUrl != null) __obj.updateDynamic("previewImageUrl")(previewImageUrl)
    if (previewText != null) __obj.updateDynamic("previewText")(previewText)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResourceVisualization]
  }
}

