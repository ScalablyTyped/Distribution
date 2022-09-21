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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teachingBubbleTypesMod {
  
  trait ITeachingBubble extends StObject {
    
    /** Sets focus to the TeachingBubble root element */
    def focus(): Unit
  }
  object ITeachingBubble {
    
    inline def apply(focus: () => Unit): ITeachingBubble = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[ITeachingBubble]
    }
    
    extension [Self <: ITeachingBubble](x: Self) {
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  trait ITeachingBubbleProps
    extends StObject
       with ClassAttributes[TeachingBubbleBase | TeachingBubbleContentBase]
       with IAccessiblePopupProps {
    
    /**
      * Defines the element id referencing the element containing the description for the TeachingBubble.
      */
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    /**
      *  Defines the element id referencing the element containing label text for TeachingBubble.
      */
    var ariaLabelledBy: js.UndefOr[String] = js.undefined
    
    /**
      * Properties to pass through for Callout, reference detail properties in ICalloutProps
      */
    var calloutProps: js.UndefOr[ICalloutProps] = js.undefined
    
    /**
      * Optional callback to access the ITeachingBubble interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ITeachingBubble]] = js.undefined
    
    /**
      * Properties to pass through for FocusTrapZone, reference detail properties in IFocusTrapZoneProps
      */
    var focusTrapZoneProps: js.UndefOr[IFocusTrapZoneProps] = js.undefined
    
    /**
      * Text that will be rendered in the footer of the TeachingBubble.
      * May be rendered alongside primary and secondary buttons.
      */
    var footerContent: js.UndefOr[String | Element] = js.undefined
    
    /**
      * Whether the TeachingBubble renders close button in the top right corner.
      */
    var hasCloseButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated Use `hasCloseButton`.
      */
    var hasCloseIcon: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A variation with smaller bold headline and no margins.
      */
    var hasCondensedHeadline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A variation with smaller bold headline and margins to the body.
      * (`hasCondensedHeadline` takes precedence if it is also set to true.)
      */
    var hasSmallHeadline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A headline for the Teaching Bubble.
      */
    var headline: js.UndefOr[String] = js.undefined
    
    /**
      * An Image for the TeachingBubble.
      */
    var illustrationImage: js.UndefOr[IImageProps] = js.undefined
    
    /**
      * Whether or not the TeachingBubble is wide, with image on the left side.
      */
    var isWide: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback when the TeachingBubble tries to close.
      */
    var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[Any], Unit]] = js.undefined
    
    /**
      * The Primary interaction button
      */
    var primaryButtonProps: js.UndefOr[IButtonProps] = js.undefined
    
    /**
      * The Secondary interaction button
      */
    var secondaryButtonProps: js.UndefOr[IButtonProps] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ITeachingBubbleStyleProps, ITeachingBubbleStyles]] = js.undefined
    
    /**
      * Element, MouseEvent, Point, or querySelector string that the TeachingBubble
      * should anchor to.
      */
    var target: js.UndefOr[Target] = js.undefined
    
    /**
      * @deprecated use target instead
      * Element to anchor the TeachingBubble to.
      */
    var targetElement: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object ITeachingBubbleProps {
    
    inline def apply(): ITeachingBubbleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITeachingBubbleProps]
    }
    
    extension [Self <: ITeachingBubbleProps](x: Self) {
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setCalloutProps(value: ICalloutProps): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
      
      inline def setCalloutPropsUndefined: Self = StObject.set(x, "calloutProps", js.undefined)
      
      inline def setComponentRef(value: IRefObject[ITeachingBubble]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ ITeachingBubble | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setFocusTrapZoneProps(value: IFocusTrapZoneProps): Self = StObject.set(x, "focusTrapZoneProps", value.asInstanceOf[js.Any])
      
      inline def setFocusTrapZonePropsUndefined: Self = StObject.set(x, "focusTrapZoneProps", js.undefined)
      
      inline def setFooterContent(value: String | Element): Self = StObject.set(x, "footerContent", value.asInstanceOf[js.Any])
      
      inline def setFooterContentUndefined: Self = StObject.set(x, "footerContent", js.undefined)
      
      inline def setHasCloseButton(value: Boolean): Self = StObject.set(x, "hasCloseButton", value.asInstanceOf[js.Any])
      
      inline def setHasCloseButtonUndefined: Self = StObject.set(x, "hasCloseButton", js.undefined)
      
      inline def setHasCloseIcon(value: Boolean): Self = StObject.set(x, "hasCloseIcon", value.asInstanceOf[js.Any])
      
      inline def setHasCloseIconUndefined: Self = StObject.set(x, "hasCloseIcon", js.undefined)
      
      inline def setHasCondensedHeadline(value: Boolean): Self = StObject.set(x, "hasCondensedHeadline", value.asInstanceOf[js.Any])
      
      inline def setHasCondensedHeadlineUndefined: Self = StObject.set(x, "hasCondensedHeadline", js.undefined)
      
      inline def setHasSmallHeadline(value: Boolean): Self = StObject.set(x, "hasSmallHeadline", value.asInstanceOf[js.Any])
      
      inline def setHasSmallHeadlineUndefined: Self = StObject.set(x, "hasSmallHeadline", js.undefined)
      
      inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
      
      inline def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
      
      inline def setIllustrationImage(value: IImageProps): Self = StObject.set(x, "illustrationImage", value.asInstanceOf[js.Any])
      
      inline def setIllustrationImageUndefined: Self = StObject.set(x, "illustrationImage", js.undefined)
      
      inline def setIsWide(value: Boolean): Self = StObject.set(x, "isWide", value.asInstanceOf[js.Any])
      
      inline def setIsWideUndefined: Self = StObject.set(x, "isWide", js.undefined)
      
      inline def setOnDismiss(value: /* ev */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setPrimaryButtonProps(value: IButtonProps): Self = StObject.set(x, "primaryButtonProps", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonPropsUndefined: Self = StObject.set(x, "primaryButtonProps", js.undefined)
      
      inline def setSecondaryButtonProps(value: IButtonProps): Self = StObject.set(x, "secondaryButtonProps", value.asInstanceOf[js.Any])
      
      inline def setSecondaryButtonPropsUndefined: Self = StObject.set(x, "secondaryButtonProps", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[ITeachingBubbleStyleProps, ITeachingBubbleStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: ITeachingBubbleStyleProps => DeepPartial[ITeachingBubbleStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetElement(value: HTMLElement): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
      
      inline def setTargetElementUndefined: Self = StObject.set(x, "targetElement", js.undefined)
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.types.ITeachingBubbleProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.types.ITeachingBubbleProps, 'hasCondensedHeadline' | 'hasSmallHeadline' | 'isWide'> & {  calloutProps :office-ui-fabric-react.office-ui-fabric-react/lib/Callout.ICalloutContentStyleProps | undefined,   primaryButtonClassName :string | undefined,   secondaryButtonClassName :string | undefined,   hasCloseButton :boolean | undefined,   hasHeadline :boolean | undefined} */
  trait ITeachingBubbleStyleProps extends StObject {
    
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
    
    inline def apply(theme: ITheme): ITeachingBubbleStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITeachingBubbleStyleProps]
    }
    
    extension [Self <: ITeachingBubbleStyleProps](x: Self) {
      
      inline def setCalloutProps(value: ICalloutContentStyleProps): Self = StObject.set(x, "calloutProps", value.asInstanceOf[js.Any])
      
      inline def setCalloutPropsUndefined: Self = StObject.set(x, "calloutProps", js.undefined)
      
      inline def setHasCloseButton(value: Boolean): Self = StObject.set(x, "hasCloseButton", value.asInstanceOf[js.Any])
      
      inline def setHasCloseButtonUndefined: Self = StObject.set(x, "hasCloseButton", js.undefined)
      
      inline def setHasCondensedHeadline(value: Boolean): Self = StObject.set(x, "hasCondensedHeadline", value.asInstanceOf[js.Any])
      
      inline def setHasCondensedHeadlineUndefined: Self = StObject.set(x, "hasCondensedHeadline", js.undefined)
      
      inline def setHasHeadline(value: Boolean): Self = StObject.set(x, "hasHeadline", value.asInstanceOf[js.Any])
      
      inline def setHasHeadlineUndefined: Self = StObject.set(x, "hasHeadline", js.undefined)
      
      inline def setHasSmallHeadline(value: Boolean): Self = StObject.set(x, "hasSmallHeadline", value.asInstanceOf[js.Any])
      
      inline def setHasSmallHeadlineUndefined: Self = StObject.set(x, "hasSmallHeadline", js.undefined)
      
      inline def setIsWide(value: Boolean): Self = StObject.set(x, "isWide", value.asInstanceOf[js.Any])
      
      inline def setIsWideUndefined: Self = StObject.set(x, "isWide", js.undefined)
      
      inline def setPrimaryButtonClassName(value: String): Self = StObject.set(x, "primaryButtonClassName", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonClassNameUndefined: Self = StObject.set(x, "primaryButtonClassName", js.undefined)
      
      inline def setSecondaryButtonClassName(value: String): Self = StObject.set(x, "secondaryButtonClassName", value.asInstanceOf[js.Any])
      
      inline def setSecondaryButtonClassNameUndefined: Self = StObject.set(x, "secondaryButtonClassName", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITeachingBubbleStyles extends StObject {
    
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
    
    inline def apply(): ITeachingBubbleStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITeachingBubbleStyles]
    }
    
    extension [Self <: ITeachingBubbleStyles](x: Self) {
      
      inline def setBody(value: IStyle): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyContent(value: IStyle): Self = StObject.set(x, "bodyContent", value.asInstanceOf[js.Any])
      
      inline def setBodyContentNull: Self = StObject.set(x, "bodyContent", null)
      
      inline def setBodyContentUndefined: Self = StObject.set(x, "bodyContent", js.undefined)
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCloseButton(value: IStyle): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonNull: Self = StObject.set(x, "closeButton", null)
      
      inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      inline def setContent(value: IStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setFooter(value: IStyle): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterNull: Self = StObject.set(x, "footer", null)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: IStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeadline(value: IStyle): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
      
      inline def setHeadlineNull: Self = StObject.set(x, "headline", null)
      
      inline def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
      
      inline def setImageContent(value: IStyle): Self = StObject.set(x, "imageContent", value.asInstanceOf[js.Any])
      
      inline def setImageContentNull: Self = StObject.set(x, "imageContent", null)
      
      inline def setImageContentUndefined: Self = StObject.set(x, "imageContent", js.undefined)
      
      inline def setPrimaryButton(value: IStyle): Self = StObject.set(x, "primaryButton", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonNull: Self = StObject.set(x, "primaryButton", null)
      
      inline def setPrimaryButtonUndefined: Self = StObject.set(x, "primaryButton", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSecondaryButton(value: IStyle): Self = StObject.set(x, "secondaryButton", value.asInstanceOf[js.Any])
      
      inline def setSecondaryButtonNull: Self = StObject.set(x, "secondaryButton", null)
      
      inline def setSecondaryButtonUndefined: Self = StObject.set(x, "secondaryButton", js.undefined)
      
      inline def setSubComponentStyles(value: ITeachingBubbleSubComponentStyles): Self = StObject.set(x, "subComponentStyles", value.asInstanceOf[js.Any])
      
      inline def setSubComponentStylesUndefined: Self = StObject.set(x, "subComponentStyles", js.undefined)
      
      inline def setSubText(value: IStyle): Self = StObject.set(x, "subText", value.asInstanceOf[js.Any])
      
      inline def setSubTextNull: Self = StObject.set(x, "subText", null)
      
      inline def setSubTextUndefined: Self = StObject.set(x, "subText", js.undefined)
    }
  }
  
  trait ITeachingBubbleSubComponentStyles extends StObject {
    
    /** Refers to the callout that hosts the TeachingBubble. */
    var callout: IStyleFunctionOrObject[Any, Any]
  }
  object ITeachingBubbleSubComponentStyles {
    
    inline def apply(callout: IStyleFunctionOrObject[Any, Any]): ITeachingBubbleSubComponentStyles = {
      val __obj = js.Dynamic.literal(callout = callout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITeachingBubbleSubComponentStyles]
    }
    
    extension [Self <: ITeachingBubbleSubComponentStyles](x: Self) {
      
      inline def setCallout(value: IStyleFunctionOrObject[Any, Any]): Self = StObject.set(x, "callout", value.asInstanceOf[js.Any])
      
      inline def setCalloutFunction1(value: Any => DeepPartial[Any]): Self = StObject.set(x, "callout", js.Any.fromFunction1(value))
    }
  }
}
