package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceVisualization extends js.Object {
  var containerDisplayName: js.UndefOr[java.lang.String] = js.undefined
  var containerType: js.UndefOr[java.lang.String] = js.undefined
  var containerWebUrl: js.UndefOr[java.lang.String] = js.undefined
  var mediaType: js.UndefOr[java.lang.String] = js.undefined
  var previewImageUrl: js.UndefOr[java.lang.String] = js.undefined
  var previewText: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ResourceVisualization {
  @scala.inline
  def apply(
    containerDisplayName: java.lang.String = null,
    containerType: java.lang.String = null,
    containerWebUrl: java.lang.String = null,
    mediaType: java.lang.String = null,
    previewImageUrl: java.lang.String = null,
    previewText: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null
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

