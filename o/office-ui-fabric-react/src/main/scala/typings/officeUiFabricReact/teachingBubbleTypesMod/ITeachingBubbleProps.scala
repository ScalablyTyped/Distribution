package typings.officeUiFabricReact.teachingBubbleTypesMod

import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.calloutTypesMod.Target
import typings.officeUiFabricReact.focusTrapZoneTypesMod.IFocusTrapZoneProps
import typings.officeUiFabricReact.iaccessiblepopuppropsMod.IAccessiblePopupProps
import typings.officeUiFabricReact.imageTypesMod.IImageProps
import typings.officeUiFabricReact.teachingBubbleBaseMod.TeachingBubbleBase
import typings.officeUiFabricReact.teachingBubbleContentBaseMod.TeachingBubbleContentBase
import typings.react.mod.ClassAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITeachingBubbleProps
  extends ClassAttributes[TeachingBubbleBase | TeachingBubbleContentBase]
     with IAccessiblePopupProps {
  /**
    * Defines the element id referencing the element containing the description for the TeachingBubble.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  /**
    *  Defines the element id referencing the element containing label text for TeachingBubble.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  /**
    * Properties to pass through for Callout, reference detail properties in ICalloutProps
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.native
  /**
    * Optional callback to access the ITeachingBubble interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ITeachingBubble]] = js.native
  /**
    * Properties to pass through for FocusTrapZone, reference detail properties in IFocusTrapZoneProps
    */
  var focusTrapZoneProps: js.UndefOr[IFocusTrapZoneProps] = js.native
  /**
    * Text that will be rendered in the footer of the TeachingBubble.
    * May be rendered alongside primary and secondary buttons.
    */
  var footerContent: js.UndefOr[String | Element] = js.native
  /**
    * Whether the TeachingBubble renders close button in the top right corner.
    */
  var hasCloseButton: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated Use `hasCloseButton`.
    */
  var hasCloseIcon: js.UndefOr[Boolean] = js.native
  /**
    * A variation with smaller bold headline and no margins.
    */
  var hasCondensedHeadline: js.UndefOr[Boolean] = js.native
  /**
    * A variation with smaller bold headline and margins to the body.
    * (`hasCondensedHeadline` takes precedence if it is also set to true.)
    */
  var hasSmallHeadline: js.UndefOr[Boolean] = js.native
  /**
    * A headline for the Teaching Bubble.
    */
  var headline: js.UndefOr[String] = js.native
  /**
    * An Image for the TeachingBubble.
    */
  var illustrationImage: js.UndefOr[IImageProps] = js.native
  /**
    * Whether or not the TeachingBubble is wide, with image on the left side.
    */
  var isWide: js.UndefOr[Boolean] = js.native
  /**
    * Callback when the TeachingBubble tries to close.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.native
  /**
    * The Primary interaction button
    */
  var primaryButtonProps: js.UndefOr[IButtonProps] = js.native
  /**
    * The Secondary interaction button
    */
  var secondaryButtonProps: js.UndefOr[IButtonProps] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ITeachingBubbleStyleProps, ITeachingBubbleStyles]] = js.native
  /**
    * Element, MouseEvent, Point, or querySelector string that the TeachingBubble
    * should anchor to.
    */
  var target: js.UndefOr[Target] = js.native
  /**
    * @deprecated use target instead
    * Element to anchor the TeachingBubble to.
    */
  var targetElement: js.UndefOr[HTMLElement] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object ITeachingBubbleProps {
  @scala.inline
  def apply(): ITeachingBubbleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITeachingBubbleProps]
  }
  @scala.inline
  implicit class ITeachingBubblePropsOps[Self <: ITeachingBubbleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAriaDescribedBy(value: String): Self = this.set("ariaDescribedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaDescribedBy: Self = this.set("ariaDescribedBy", js.undefined)
    @scala.inline
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    @scala.inline
    def setCalloutProps(value: ICalloutProps): Self = this.set("calloutProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutProps: Self = this.set("calloutProps", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ITeachingBubble | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[ITeachingBubble]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setFocusTrapZoneProps(value: IFocusTrapZoneProps): Self = this.set("focusTrapZoneProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusTrapZoneProps: Self = this.set("focusTrapZoneProps", js.undefined)
    @scala.inline
    def setFooterContent(value: String | Element): Self = this.set("footerContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterContent: Self = this.set("footerContent", js.undefined)
    @scala.inline
    def setHasCloseButton(value: Boolean): Self = this.set("hasCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasCloseButton: Self = this.set("hasCloseButton", js.undefined)
    @scala.inline
    def setHasCloseIcon(value: Boolean): Self = this.set("hasCloseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasCloseIcon: Self = this.set("hasCloseIcon", js.undefined)
    @scala.inline
    def setHasCondensedHeadline(value: Boolean): Self = this.set("hasCondensedHeadline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasCondensedHeadline: Self = this.set("hasCondensedHeadline", js.undefined)
    @scala.inline
    def setHasSmallHeadline(value: Boolean): Self = this.set("hasSmallHeadline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasSmallHeadline: Self = this.set("hasSmallHeadline", js.undefined)
    @scala.inline
    def setHeadline(value: String): Self = this.set("headline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadline: Self = this.set("headline", js.undefined)
    @scala.inline
    def setIllustrationImage(value: IImageProps): Self = this.set("illustrationImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIllustrationImage: Self = this.set("illustrationImage", js.undefined)
    @scala.inline
    def setIsWide(value: Boolean): Self = this.set("isWide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsWide: Self = this.set("isWide", js.undefined)
    @scala.inline
    def setOnDismiss(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = this.set("onDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setPrimaryButtonProps(value: IButtonProps): Self = this.set("primaryButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryButtonProps: Self = this.set("primaryButtonProps", js.undefined)
    @scala.inline
    def setSecondaryButtonProps(value: IButtonProps): Self = this.set("secondaryButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryButtonProps: Self = this.set("secondaryButtonProps", js.undefined)
    @scala.inline
    def setStylesFunction1(value: ITeachingBubbleStyleProps => DeepPartial[ITeachingBubbleStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ITeachingBubbleStyleProps, ITeachingBubbleStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTarget(value: Target): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
    @scala.inline
    def setTargetElement(value: HTMLElement): Self = this.set("targetElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetElement: Self = this.set("targetElement", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

