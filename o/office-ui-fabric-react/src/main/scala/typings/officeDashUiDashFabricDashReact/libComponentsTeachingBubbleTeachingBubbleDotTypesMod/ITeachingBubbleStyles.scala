package typings.officeDashUiDashFabricDashReact.libComponentsTeachingBubbleTeachingBubbleDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITeachingBubbleStyles extends js.Object {
  var body: IStyle
  var bodyContent: IStyle
  var closeButton: IStyle
  var content: IStyle
  var footer: IStyle
  var header: IStyle
  var headline: IStyle
  var imageContent: IStyle
  var primaryButton: IStyle
  var root: IStyle
  var secondaryButton: IStyle
  var subComponentStyles: js.UndefOr[ITeachingBubbleSubComponentStyles] = js.undefined
  var subText: IStyle
}

object ITeachingBubbleStyles {
  @scala.inline
  def apply(
    body: IStyle = null,
    bodyContent: IStyle = null,
    closeButton: IStyle = null,
    content: IStyle = null,
    footer: IStyle = null,
    header: IStyle = null,
    headline: IStyle = null,
    imageContent: IStyle = null,
    primaryButton: IStyle = null,
    root: IStyle = null,
    secondaryButton: IStyle = null,
    subComponentStyles: ITeachingBubbleSubComponentStyles = null,
    subText: IStyle = null
  ): ITeachingBubbleStyles = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (bodyContent != null) __obj.updateDynamic("bodyContent")(bodyContent.asInstanceOf[js.Any])
    if (closeButton != null) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headline != null) __obj.updateDynamic("headline")(headline.asInstanceOf[js.Any])
    if (imageContent != null) __obj.updateDynamic("imageContent")(imageContent.asInstanceOf[js.Any])
    if (primaryButton != null) __obj.updateDynamic("primaryButton")(primaryButton.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (secondaryButton != null) __obj.updateDynamic("secondaryButton")(secondaryButton.asInstanceOf[js.Any])
    if (subComponentStyles != null) __obj.updateDynamic("subComponentStyles")(subComponentStyles.asInstanceOf[js.Any])
    if (subText != null) __obj.updateDynamic("subText")(subText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITeachingBubbleStyles]
  }
}

