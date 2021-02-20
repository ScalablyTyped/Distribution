package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.calloutTypesMod.ICalloutContentStyleProps
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.focusTrapZoneTypesMod.IFocusTrapZoneProps
import typings.officeUiFabricReact.iaccessiblepopuppropsMod.IAccessiblePopupProps
import typings.officeUiFabricReact.imageTypesMod.IImageProps
import typings.officeUiFabricReact.teachingBubbleBaseMod.TeachingBubbleBase
import typings.officeUiFabricReact.teachingBubbleContentBaseMod.TeachingBubbleContentBase
import typings.react.mod.ClassAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricReactHooks.useTargetMod.Target
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teachingBubbleTypesMod {
  
  @js.native
  trait ITeachingBubble extends StObject {
    
    /** Sets focus to the TeachingBubble root element */
    def focus(): Unit = js.native
  }
  object ITeachingBubble {
    
    @scala.inline
    def apply(focus: () => Unit): ITeachingBubble = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[ITeachingBubble]
    }
    
    @scala.inline
    implicit class ITeachingBubbleMutableBuilder[Self <: ITeachingBubble] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
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
    implicit class ITeachingBubblePropsMutableBuilder[Self <: ITeachingBubbleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      @scala.inline
      def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      @scala.inline
      def setCalloutProps(value: ICalloutProps): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutPropsUndefined: Self = StObject.set(x, "calloutProps", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[ITeachingBubble]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ITeachingBubble | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setFocusTrapZoneProps(value: IFocusTrapZoneProps): Self = StObject.set(x, "focusTrapZoneProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusTrapZonePropsUndefined: Self = StObject.set(x, "focusTrapZoneProps", js.undefined)
      
      @scala.inline
      def setFooterContent(value: String | Element): Self = StObject.set(x, "footerContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterContentUndefined: Self = StObject.set(x, "footerContent", js.undefined)
      
      @scala.inline
      def setHasCloseButton(value: Boolean): Self = StObject.set(x, "hasCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasCloseButtonUndefined: Self = StObject.set(x, "hasCloseButton", js.undefined)
      
      @scala.inline
      def setHasCloseIcon(value: Boolean): Self = StObject.set(x, "hasCloseIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasCloseIconUndefined: Self = StObject.set(x, "hasCloseIcon", js.undefined)
      
      @scala.inline
      def setHasCondensedHeadline(value: Boolean): Self = StObject.set(x, "hasCondensedHeadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasCondensedHeadlineUndefined: Self = StObject.set(x, "hasCondensedHeadline", js.undefined)
      
      @scala.inline
      def setHasSmallHeadline(value: Boolean): Self = StObject.set(x, "hasSmallHeadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasSmallHeadlineUndefined: Self = StObject.set(x, "hasSmallHeadline", js.undefined)
      
      @scala.inline
      def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
      
      @scala.inline
      def setIllustrationImage(value: IImageProps): Self = StObject.set(x, "illustrationImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIllustrationImageUndefined: Self = StObject.set(x, "illustrationImage", js.undefined)
      
      @scala.inline
      def setIsWide(value: Boolean): Self = StObject.set(x, "isWide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWideUndefined: Self = StObject.set(x, "isWide", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: /* ev */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setPrimaryButtonProps(value: IButtonProps): Self = StObject.set(x, "primaryButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonPropsUndefined: Self = StObject.set(x, "primaryButtonProps", js.undefined)
      
      @scala.inline
      def setSecondaryButtonProps(value: IButtonProps): Self = StObject.set(x, "secondaryButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryButtonPropsUndefined: Self = StObject.set(x, "secondaryButtonProps", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ITeachingBubbleStyleProps, ITeachingBubbleStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ITeachingBubbleStyleProps => DeepPartial[ITeachingBubbleStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElement(value: HTMLElement): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetElementUndefined: Self = StObject.set(x, "targetElement", js.undefined)
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.types.ITeachingBubbleProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.types.ITeachingBubbleProps, 'hasCondensedHeadline' | 'hasSmallHeadline' | 'isWide'> & {  calloutProps :office-ui-fabric-react.office-ui-fabric-react/lib/Callout.ICalloutContentStyleProps | undefined,   primaryButtonClassName :string | undefined,   secondaryButtonClassName :string | undefined,   hasCloseButton :boolean | undefined,   hasHeadline :boolean | undefined} */
  @js.native
  trait ITeachingBubbleStyleProps extends StObject {
    
    /** Style props for callout. */
    var calloutProps: js.UndefOr[ICalloutContentStyleProps] = js.native
    
    /** If the close button is visible. */
    var hasCloseButton: js.UndefOr[Boolean] = js.native
    
    var hasCondensedHeadline: js.UndefOr[Boolean] = js.native
    
    /** If a headline has been specified. */
    var hasHeadline: js.UndefOr[Boolean] = js.native
    
    var hasSmallHeadline: js.UndefOr[Boolean] = js.native
    
    var isWide: js.UndefOr[Boolean] = js.native
    
    /** Class name for primary button. */
    var primaryButtonClassName: js.UndefOr[String] = js.native
    
    /** Class name for secondary button. */
    var secondaryButtonClassName: js.UndefOr[String] = js.native
    
    var theme: ITheme = js.native
  }
  object ITeachingBubbleStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ITeachingBubbleStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITeachingBubbleStyleProps]
    }
    
    @scala.inline
    implicit class ITeachingBubbleStylePropsMutableBuilder[Self <: ITeachingBubbleStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalloutProps(value: ICalloutContentStyleProps): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutPropsUndefined: Self = StObject.set(x, "calloutProps", js.undefined)
      
      @scala.inline
      def setHasCloseButton(value: Boolean): Self = StObject.set(x, "hasCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasCloseButtonUndefined: Self = StObject.set(x, "hasCloseButton", js.undefined)
      
      @scala.inline
      def setHasCondensedHeadline(value: Boolean): Self = StObject.set(x, "hasCondensedHeadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasCondensedHeadlineUndefined: Self = StObject.set(x, "hasCondensedHeadline", js.undefined)
      
      @scala.inline
      def setHasHeadline(value: Boolean): Self = StObject.set(x, "hasHeadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasHeadlineUndefined: Self = StObject.set(x, "hasHeadline", js.undefined)
      
      @scala.inline
      def setHasSmallHeadline(value: Boolean): Self = StObject.set(x, "hasSmallHeadline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasSmallHeadlineUndefined: Self = StObject.set(x, "hasSmallHeadline", js.undefined)
      
      @scala.inline
      def setIsWide(value: Boolean): Self = StObject.set(x, "isWide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWideUndefined: Self = StObject.set(x, "isWide", js.undefined)
      
      @scala.inline
      def setPrimaryButtonClassName(value: String): Self = StObject.set(x, "primaryButtonClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonClassNameUndefined: Self = StObject.set(x, "primaryButtonClassName", js.undefined)
      
      @scala.inline
      def setSecondaryButtonClassName(value: String): Self = StObject.set(x, "secondaryButtonClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryButtonClassNameUndefined: Self = StObject.set(x, "secondaryButtonClassName", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITeachingBubbleStyles extends StObject {
    
    var body: IStyle = js.native
    
    var bodyContent: IStyle = js.native
    
    var closeButton: IStyle = js.native
    
    var content: IStyle = js.native
    
    var footer: IStyle = js.native
    
    var header: IStyle = js.native
    
    var headline: IStyle = js.native
    
    var imageContent: IStyle = js.native
    
    var primaryButton: IStyle = js.native
    
    var root: IStyle = js.native
    
    var secondaryButton: IStyle = js.native
    
    var subComponentStyles: js.UndefOr[ITeachingBubbleSubComponentStyles] = js.native
    
    var subText: IStyle = js.native
  }
  object ITeachingBubbleStyles {
    
    @scala.inline
    def apply(): ITeachingBubbleStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITeachingBubbleStyles]
    }
    
    @scala.inline
    implicit class ITeachingBubbleStylesMutableBuilder[Self <: ITeachingBubbleStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: IStyle): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyContent(value: IStyle): Self = StObject.set(x, "bodyContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyContentNull: Self = StObject.set(x, "bodyContent", null)
      
      @scala.inline
      def setBodyContentUndefined: Self = StObject.set(x, "bodyContent", js.undefined)
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCloseButton(value: IStyle): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonNull: Self = StObject.set(x, "closeButton", null)
      
      @scala.inline
      def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      @scala.inline
      def setContent(value: IStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentNull: Self = StObject.set(x, "content", null)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setFooter(value: IStyle): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterNull: Self = StObject.set(x, "footer", null)
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setHeader(value: IStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderNull: Self = StObject.set(x, "header", null)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHeadline(value: IStyle): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadlineNull: Self = StObject.set(x, "headline", null)
      
      @scala.inline
      def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
      
      @scala.inline
      def setImageContent(value: IStyle): Self = StObject.set(x, "imageContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageContentNull: Self = StObject.set(x, "imageContent", null)
      
      @scala.inline
      def setImageContentUndefined: Self = StObject.set(x, "imageContent", js.undefined)
      
      @scala.inline
      def setPrimaryButton(value: IStyle): Self = StObject.set(x, "primaryButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryButtonNull: Self = StObject.set(x, "primaryButton", null)
      
      @scala.inline
      def setPrimaryButtonUndefined: Self = StObject.set(x, "primaryButton", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSecondaryButton(value: IStyle): Self = StObject.set(x, "secondaryButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryButtonNull: Self = StObject.set(x, "secondaryButton", null)
      
      @scala.inline
      def setSecondaryButtonUndefined: Self = StObject.set(x, "secondaryButton", js.undefined)
      
      @scala.inline
      def setSubComponentStyles(value: ITeachingBubbleSubComponentStyles): Self = StObject.set(x, "subComponentStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubComponentStylesUndefined: Self = StObject.set(x, "subComponentStyles", js.undefined)
      
      @scala.inline
      def setSubText(value: IStyle): Self = StObject.set(x, "subText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTextNull: Self = StObject.set(x, "subText", null)
      
      @scala.inline
      def setSubTextUndefined: Self = StObject.set(x, "subText", js.undefined)
    }
  }
  
  @js.native
  trait ITeachingBubbleSubComponentStyles extends StObject {
    
    /** Refers to the callout that hosts the TeachingBubble. */
    var callout: IStyleFunctionOrObject[_, _] = js.native
  }
  object ITeachingBubbleSubComponentStyles {
    
    @scala.inline
    def apply(callout: IStyleFunctionOrObject[_, _]): ITeachingBubbleSubComponentStyles = {
      val __obj = js.Dynamic.literal(callout = callout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITeachingBubbleSubComponentStyles]
    }
    
    @scala.inline
    implicit class ITeachingBubbleSubComponentStylesMutableBuilder[Self <: ITeachingBubbleSubComponentStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallout(value: IStyleFunctionOrObject[_, _]): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalloutFunction1(value: _ => DeepPartial[_]): Self = StObject.set(x, "callout", js.Any.fromFunction1(value))
    }
  }
}
