package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInfo extends js.Object {
  /** Optional; parameter used to indicate the server is able to render image dynamically in response to parameterization. For example – a high contrast image */
  var addImageQuery: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional; alt-text accessible content for the image */
  var alternateText: js.UndefOr[java.lang.String] = js.undefined
  var alternativeText: js.UndefOr[java.lang.String] = js.undefined
  /** Optional; URI that points to an icon which represents the application used to generate the activity */
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
}

object ImageInfo {
  @scala.inline
  def apply(
    addImageQuery: js.UndefOr[scala.Boolean] = js.undefined,
    alternateText: java.lang.String = null,
    alternativeText: java.lang.String = null,
    iconUrl: java.lang.String = null
  ): ImageInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addImageQuery)) __obj.updateDynamic("addImageQuery")(addImageQuery)
    if (alternateText != null) __obj.updateDynamic("alternateText")(alternateText)
    if (alternativeText != null) __obj.updateDynamic("alternativeText")(alternativeText)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    __obj.asInstanceOf[ImageInfo]
  }
}

