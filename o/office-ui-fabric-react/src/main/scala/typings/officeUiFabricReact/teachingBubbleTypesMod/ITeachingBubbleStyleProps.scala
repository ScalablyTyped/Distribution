package typings.officeUiFabricReact.teachingBubbleTypesMod

import typings.officeUiFabricReact.calloutTypesMod.ICalloutContentStyleProps
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.types.ITeachingBubbleProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.types.ITeachingBubbleProps, 'hasCondensedHeadline' | 'hasSmallHeadline' | 'isWide'> & {  calloutProps ? :office-ui-fabric-react.office-ui-fabric-react/lib/Callout.ICalloutContentStyleProps,   primaryButtonClassName ? :string,   secondaryButtonClassName ? :string,   hasCloseButton ? :boolean,   hasHeadline ? :boolean} */
trait ITeachingBubbleStyleProps extends js.Object {
  /** Style props for callout. */
  var calloutProps: js.UndefOr[ICalloutContentStyleProps] = js.undefined
  /** If the close button is visible. */
  var hasCloseButton: js.UndefOr[Boolean] = js.undefined
  var hasCondensedHeadline: js.UndefOr[Boolean] = js.undefined
  /** If a headline has been specified. */
  var hasHeadline: js.UndefOr[Boolean] = js.undefined
  var hasSmallHeadline: js.UndefOr[Boolean] = js.undefined
  var isWide: js.UndefOr[Boolean] = js.undefined
  /** Class name for primary button. */
  var primaryButtonClassName: js.UndefOr[String] = js.undefined
  /** Class name for secondary button. */
  var secondaryButtonClassName: js.UndefOr[String] = js.undefined
  var theme: ITheme
}

object ITeachingBubbleStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    calloutProps: ICalloutContentStyleProps = null,
    hasCloseButton: js.UndefOr[Boolean] = js.undefined,
    hasCondensedHeadline: js.UndefOr[Boolean] = js.undefined,
    hasHeadline: js.UndefOr[Boolean] = js.undefined,
    hasSmallHeadline: js.UndefOr[Boolean] = js.undefined,
    isWide: js.UndefOr[Boolean] = js.undefined,
    primaryButtonClassName: String = null,
    secondaryButtonClassName: String = null
  ): ITeachingBubbleStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCloseButton)) __obj.updateDynamic("hasCloseButton")(hasCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCondensedHeadline)) __obj.updateDynamic("hasCondensedHeadline")(hasCondensedHeadline.asInstanceOf[js.Any])
    if (!js.isUndefined(hasHeadline)) __obj.updateDynamic("hasHeadline")(hasHeadline.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSmallHeadline)) __obj.updateDynamic("hasSmallHeadline")(hasSmallHeadline.asInstanceOf[js.Any])
    if (!js.isUndefined(isWide)) __obj.updateDynamic("isWide")(isWide.asInstanceOf[js.Any])
    if (primaryButtonClassName != null) __obj.updateDynamic("primaryButtonClassName")(primaryButtonClassName.asInstanceOf[js.Any])
    if (secondaryButtonClassName != null) __obj.updateDynamic("secondaryButtonClassName")(secondaryButtonClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITeachingBubbleStyleProps]
  }
}

