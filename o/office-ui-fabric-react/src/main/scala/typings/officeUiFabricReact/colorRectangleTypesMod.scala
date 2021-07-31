package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.interfacesMod.IColor
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorRectangleTypesMod {
  
  trait IColorRectangle extends StObject {
    
    /** Currently selected color. */
    var color: IColor
  }
  object IColorRectangle {
    
    @scala.inline
    def apply(color: IColor): IColorRectangle = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorRectangle]
    }
    
    @scala.inline
    implicit class IColorRectangleMutableBuilder[Self <: IColorRectangle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  trait IColorRectangleProps extends StObject {
    
    /**
      * Detailed description for how to use the color rectangle. Moving the thumb horizontally adjusts
      * saturation and moving it vertically adjusts value (essentially, brightness).
      * @defaultvalue 'Use left and right arrow keys to set saturation. Use up and down arrow keys to set brightness.'
      */
    var ariaDescription: js.UndefOr[String] = js.undefined
    
    /**
      * Label of the ColorRectangle for the benefit of screen reader users.
      * @defaultvalue 'Saturation and brightness'
      */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Format string for the color rectangle's current value as read by screen readers.
      * The string must include descriptions and two placeholders for the current values:
      * `{0}` for saturation and `{1}` for value/brightness.
      * @defaultvalue `'Saturation {0} brightness {1}'`
      */
    var ariaValueFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Additional CSS class(es) to apply to the ColorRectangle.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Current color of the rectangle.
      */
    var color: IColor
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IColorRectangle]] = js.undefined
    
    /**
      * Minimum width and height.
      */
    var minSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback for when the color changes.
      */
    var onChange: js.UndefOr[
        js.Function2[
          /* ev */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], 
          /* color */ IColor, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]] = js.undefined
    
    /**
      * Theme (provided through customization).
      */
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IColorRectangleProps {
    
    @scala.inline
    def apply(color: IColor): IColorRectangleProps = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorRectangleProps]
    }
    
    @scala.inline
    implicit class IColorRectanglePropsMutableBuilder[Self <: IColorRectangleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaDescription(value: String): Self = StObject.set(x, "ariaDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaDescriptionUndefined: Self = StObject.set(x, "ariaDescription", js.undefined)
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setAriaValueFormat(value: String): Self = StObject.set(x, "ariaValueFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaValueFormatUndefined: Self = StObject.set(x, "ariaValueFormat", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRef(value: IRefObject[IColorRectangle]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IColorRectangle | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* ev */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], /* color */ IColor) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IColorRectangleStyleProps => DeepPartial[IColorRectangleStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IColorRectangleStyleProps extends StObject {
    
    /**
      * Additional CSS class(es) to apply to the ColorRectangle.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Minimum width and height.
      */
    var minSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Theme (provided through customization).
      */
    var theme: ITheme
  }
  object IColorRectangleStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IColorRectangleStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorRectangleStyleProps]
    }
    
    @scala.inline
    implicit class IColorRectangleStylePropsMutableBuilder[Self <: IColorRectangleStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IColorRectangleStyles extends StObject {
    
    /**
      * Style set for the dark-colored rectangle.
      */
    var dark: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for a hidden detailed description for screen reader users.
      */
    var description: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the light-colored rectangle.
      */
    var light: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the root element.
      */
    var root: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style set for the draggable thumb element.
      */
    var thumb: js.UndefOr[IStyle] = js.undefined
  }
  object IColorRectangleStyles {
    
    @scala.inline
    def apply(): IColorRectangleStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColorRectangleStyles]
    }
    
    @scala.inline
    implicit class IColorRectangleStylesMutableBuilder[Self <: IColorRectangleStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDark(value: IStyle): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkNull: Self = StObject.set(x, "dark", null)
      
      @scala.inline
      def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
      
      @scala.inline
      def setDescription(value: IStyle): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setLight(value: IStyle): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightNull: Self = StObject.set(x, "light", null)
      
      @scala.inline
      def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setThumb(value: IStyle): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbNull: Self = StObject.set(x, "thumb", null)
      
      @scala.inline
      def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    }
  }
}
