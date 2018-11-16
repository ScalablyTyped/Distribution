package typings
package officeDashUiDashFabricDashReactLib.libComponentsTeachingBubbleTeachingBubbleDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITeachingBubbleProps
  extends reactLib.reactMod.ReactNs.Props[
      officeDashUiDashFabricDashReactLib.libComponentsTeachingBubbleTeachingBubbleDotBaseMod.TeachingBubbleBase | officeDashUiDashFabricDashReactLib.libComponentsTeachingBubbleTeachingBubbleContentDotBaseMod.TeachingBubbleContentBase
    ]
     with officeDashUiDashFabricDashReactLib.libCommonIAccessiblePopupPropsMod.IAccessiblePopupProps {
  /**
       * Defines the element id referencing the element containing the description for the TeachingBubble.
       */
  var ariaDescribedBy: js.UndefOr[java.lang.String] = js.undefined
  /**
       *  Defines the element id referencing the element containing label text for TeachingBubble.
       */
  var ariaLabelledBy: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Properties to pass through for Callout, reference detail properties in ICalloutProps
       */
  var calloutProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsCalloutCalloutDotTypesMod.ICalloutProps
  ] = js.undefined
  /**
       * Optional callback to access the ITeachingBubble interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ITeachingBubble]] = js.undefined
  /**
       * Does the TeachingBubble have a close button in the top right corner?
       */
  var hasCloseIcon: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A variation with smaller bold headline and no margins.
       */
  var hasCondensedHeadline: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A variation with smaller bold headline and margins to the body (hasCondensedHeadline takes precedence if it is also set to true).
       */
  var hasSmallHeadline: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A headline for the Teaching Bubble.
       */
  var headline: js.UndefOr[java.lang.String] = js.undefined
  /**
       * An Image for the Teaching Bubble.
       */
  var illustrationImage: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsImageImageDotTypesMod.IImageProps
  ] = js.undefined
  /**
       * Whether or not the Teaching Bubble is wide, with image on the left side.
       */
  var isWide: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Callback when the TeachingBubble tries to close.
       */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /**
       * The Primary interaction button
       */
  var primaryButtonProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonProps
  ] = js.undefined
  /**
       * The Secondary interaction button
       */
  var secondaryButtonProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonProps
  ] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ITeachingBubbleStyleProps, ITeachingBubbleStyles]
  ] = js.undefined
  /**
       * Element to anchor the TeachingBubble to.
       */
  var targetElement: js.UndefOr[reactLib.HTMLElement] = js.undefined
  /**
       * Theme provided by High-Order Component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

