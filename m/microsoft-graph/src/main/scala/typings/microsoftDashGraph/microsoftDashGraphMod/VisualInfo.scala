package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualInfo extends js.Object {
  // Optional. JSON object used to represent an icon which represents the application used to generate the activity
  var attribution: js.UndefOr[ImageInfo] = js.undefined
  /**
    * Optional. Background color used to render the activity in the UI - brand color for the application source of the
    * activity. Must be a valid hex color
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Optional. Custom piece of data - JSON object used to provide custom content to render the activity in the Windows Shell
    * UI
    */
  var content: js.UndefOr[js.Any] = js.undefined
  /**
    * Optional. Longer text description of the user's unique activity (example: document name, first sentence, and/or
    * metadata)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Required. Short text description of the user's unique activity (for example, document name in cases where an activity
    * refers to document creation)
    */
  var displayText: js.UndefOr[String] = js.undefined
}

object VisualInfo {
  @scala.inline
  def apply(
    attribution: ImageInfo = null,
    backgroundColor: String = null,
    content: js.Any = null,
    description: String = null,
    displayText: String = null
  ): VisualInfo = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (content != null) __obj.updateDynamic("content")(content)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayText != null) __obj.updateDynamic("displayText")(displayText)
    __obj.asInstanceOf[VisualInfo]
  }
}

