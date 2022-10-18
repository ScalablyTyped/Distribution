package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.officeUiFabricReact.officeUiFabricReactStrings.assertive
import typings.officeUiFabricReact.officeUiFabricReactStrings.off
import typings.officeUiFabricReact.officeUiFabricReactStrings.polite
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSpinnerSpinnerDottypesMod {
  
  @js.native
  sealed trait SpinnerSize extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.types", "SpinnerSize")
  @js.native
  object SpinnerSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SpinnerSize & Double] = js.native
    
    /**
      * 28px Spinner diameter
      */
    @js.native
    sealed trait large
      extends StObject
         with SpinnerSize
    /* 3 */ val large: typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.SpinnerSize.large & Double = js.native
    
    /**
      * 20px Spinner diameter
      */
    @js.native
    sealed trait medium
      extends StObject
         with SpinnerSize
    /* 2 */ val medium: typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.SpinnerSize.medium & Double = js.native
    
    /**
      * 16px Spinner diameter
      */
    @js.native
    sealed trait small
      extends StObject
         with SpinnerSize
    /* 1 */ val small: typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.SpinnerSize.small & Double = js.native
    
    /**
      * 12px Spinner diameter
      */
    @js.native
    sealed trait xSmall
      extends StObject
         with SpinnerSize
    /* 0 */ val xSmall: typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.SpinnerSize.xSmall & Double = js.native
  }
  
  @js.native
  sealed trait SpinnerType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.types", "SpinnerType")
  @js.native
  object SpinnerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SpinnerType & Double] = js.native
    
    /**
      * Deprecated and will be removed at \>= 2.0.0. Use `SpinnerSize.large` instead.
      * @deprecated Use `SpinnerSize.large` instead.
      */
    @js.native
    sealed trait large
      extends StObject
         with SpinnerType
    /* 1 */ val large: typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.SpinnerType.large & Double = js.native
    
    /**
      * Deprecated and will be removed at \>= 2.0.0. Use `SpinnerSize.medium` instead.
      * @deprecated Use `SpinnerSize.medium` instead.
      */
    @js.native
    sealed trait normal
      extends StObject
         with SpinnerType
    /* 0 */ val normal: typings.officeUiFabricReact.libComponentsSpinnerSpinnerDottypesMod.SpinnerType.normal & Double = js.native
  }
  
  trait ISpinner extends StObject
  
  trait ISpinnerProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    /**
      * Alternative status label for screen reader
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Politeness setting for label update announcement.
      * @defaultvalue polite
      */
    var ariaLive: js.UndefOr[assertive | polite | off] = js.undefined
    
    /**
      * Optional callback to access the ISpinner interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ISpinner]] = js.undefined
    
    /**
      * The label to show next to the Spinner. Label updates will be announced to the screen readers.
      * Use ariaLive to control politeness level.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * The position of the label in regards of the spinner animation.
      * @defaultvalue SpinnerLabelPosition.bottom
      */
    var labelPosition: js.UndefOr[SpinnerLabelPosition] = js.undefined
    
    /**
      * The size of Spinner to render. \{ extraSmall, small, medium, large \}
      * @defaultvalue SpinnerType.medium
      */
    var size: js.UndefOr[SpinnerSize] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ISpinnerStyleProps, ISpinnerStyles]] = js.undefined
    
    /**
      * Theme (provided through customization.)
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Deprecated and will be removed at \>= 2.0.0. Use `SpinnerSize` instead.
      * @deprecated Use `SpinnerSize` instead.
      */
    var `type`: js.UndefOr[SpinnerType] = js.undefined
  }
  object ISpinnerProps {
    
    inline def apply(): ISpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISpinnerProps]
    }
    
    extension [Self <: ISpinnerProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaLive(value: assertive | polite | off): Self = StObject.set(x, "ariaLive", value.asInstanceOf[js.Any])
      
      inline def setAriaLiveUndefined: Self = StObject.set(x, "ariaLive", js.undefined)
      
      inline def setComponentRef(value: IRefObject[ISpinner]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ ISpinner | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelPosition(value: SpinnerLabelPosition): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSize(value: SpinnerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[ISpinnerStyleProps, ISpinnerStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: ISpinnerStyleProps => DeepPartial[ISpinnerStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: SpinnerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ISpinnerStyleProps extends StObject {
    
    /** CSS class name for the component attached to the root stylable area. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Position of the label in regards to the spinner animation. */
    var labelPosition: js.UndefOr[SpinnerLabelPosition] = js.undefined
    
    /** Size of the spinner animation. */
    var size: js.UndefOr[SpinnerSize] = js.undefined
    
    /** Theme provided by High-Order Component. */
    var theme: ITheme
  }
  object ISpinnerStyleProps {
    
    inline def apply(theme: ITheme): ISpinnerStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpinnerStyleProps]
    }
    
    extension [Self <: ISpinnerStyleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setLabelPosition(value: SpinnerLabelPosition): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setSize(value: SpinnerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISpinnerStyles extends StObject {
    
    /** Styles for the spinner circle animation. */
    var circle: js.UndefOr[IStyle] = js.undefined
    
    /** Styles for the label accompanying the circle. */
    var label: js.UndefOr[IStyle] = js.undefined
    
    /** Styles for the root element. Refers to the wrapper containing both the circle and the label. */
    var root: js.UndefOr[IStyle] = js.undefined
    
    /** Styles for the hidden helper element to aid with screen readers. */
    var screenReaderText: js.UndefOr[IStyle] = js.undefined
  }
  object ISpinnerStyles {
    
    inline def apply(): ISpinnerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISpinnerStyles]
    }
    
    extension [Self <: ISpinnerStyles](x: Self) {
      
      inline def setCircle(value: IStyle): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      inline def setCircleNull: Self = StObject.set(x, "circle", null)
      
      inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      inline def setLabel(value: IStyle): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setScreenReaderText(value: IStyle): Self = StObject.set(x, "screenReaderText", value.asInstanceOf[js.Any])
      
      inline def setScreenReaderTextNull: Self = StObject.set(x, "screenReaderText", null)
      
      inline def setScreenReaderTextUndefined: Self = StObject.set(x, "screenReaderText", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.officeUiFabricReact.officeUiFabricReactStrings.top
    - typings.officeUiFabricReact.officeUiFabricReactStrings.right
    - typings.officeUiFabricReact.officeUiFabricReactStrings.bottom
    - typings.officeUiFabricReact.officeUiFabricReactStrings.left
  */
  trait SpinnerLabelPosition extends StObject
  object SpinnerLabelPosition {
    
    inline def bottom: typings.officeUiFabricReact.officeUiFabricReactStrings.bottom = "bottom".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.bottom]
    
    inline def left: typings.officeUiFabricReact.officeUiFabricReactStrings.left = "left".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.left]
    
    inline def right: typings.officeUiFabricReact.officeUiFabricReactStrings.right = "right".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.right]
    
    inline def top: typings.officeUiFabricReact.officeUiFabricReactStrings.top = "top".asInstanceOf[typings.officeUiFabricReact.officeUiFabricReactStrings.top]
  }
}
