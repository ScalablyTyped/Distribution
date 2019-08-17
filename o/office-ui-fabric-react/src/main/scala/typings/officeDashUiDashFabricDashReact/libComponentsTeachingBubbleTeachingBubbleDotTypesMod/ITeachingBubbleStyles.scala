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
    body: IStyle,
    bodyContent: IStyle,
    closeButton: IStyle,
    content: IStyle,
    footer: IStyle,
    header: IStyle,
    headline: IStyle,
    imageContent: IStyle,
    primaryButton: IStyle,
    root: IStyle,
    secondaryButton: IStyle,
    subText: IStyle,
    subComponentStyles: ITeachingBubbleSubComponentStyles = null
  ): ITeachingBubbleStyles = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], bodyContent = bodyContent.asInstanceOf[js.Any], closeButton = closeButton.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headline = headline.asInstanceOf[js.Any], imageContent = imageContent.asInstanceOf[js.Any], primaryButton = primaryButton.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], secondaryButton = secondaryButton.asInstanceOf[js.Any], subText = subText.asInstanceOf[js.Any])
    if (subComponentStyles != null) __obj.updateDynamic("subComponentStyles")(subComponentStyles)
    __obj.asInstanceOf[ITeachingBubbleStyles]
  }
}

