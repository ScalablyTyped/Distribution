package typings.officeUiFabricReact.teachingBubbleTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
    body: js.UndefOr[Null | IStyle] = js.undefined,
    bodyContent: js.UndefOr[Null | IStyle] = js.undefined,
    closeButton: js.UndefOr[Null | IStyle] = js.undefined,
    content: js.UndefOr[Null | IStyle] = js.undefined,
    footer: js.UndefOr[Null | IStyle] = js.undefined,
    header: js.UndefOr[Null | IStyle] = js.undefined,
    headline: js.UndefOr[Null | IStyle] = js.undefined,
    imageContent: js.UndefOr[Null | IStyle] = js.undefined,
    primaryButton: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    secondaryButton: js.UndefOr[Null | IStyle] = js.undefined,
    subComponentStyles: ITeachingBubbleSubComponentStyles = null,
    subText: js.UndefOr[Null | IStyle] = js.undefined
  ): ITeachingBubbleStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(bodyContent)) __obj.updateDynamic("bodyContent")(bodyContent.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(headline)) __obj.updateDynamic("headline")(headline.asInstanceOf[js.Any])
    if (!js.isUndefined(imageContent)) __obj.updateDynamic("imageContent")(imageContent.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryButton)) __obj.updateDynamic("primaryButton")(primaryButton.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(secondaryButton)) __obj.updateDynamic("secondaryButton")(secondaryButton.asInstanceOf[js.Any])
    if (subComponentStyles != null) __obj.updateDynamic("subComponentStyles")(subComponentStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(subText)) __obj.updateDynamic("subText")(subText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITeachingBubbleStyles]
  }
}

