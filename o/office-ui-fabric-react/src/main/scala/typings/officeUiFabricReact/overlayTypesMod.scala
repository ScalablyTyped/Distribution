package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.HTMLAttributes
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayTypesMod {
  
  @js.native
  trait IOverlay extends StObject
  
  @js.native
  trait IOverlayProps extends HTMLAttributes[HTMLElement] {
    
    /**
      * Allow body scroll on touch devices. Changing after mounting has no effect.
      * @defaultvalue false
      */
    var allowTouchBodyScroll: js.UndefOr[Boolean] = js.native
    
    /**
      * Gets the component ref.
      */
    var componentRef: js.UndefOr[IRefObject[IOverlay]] = js.native
    
    /**
      * Whether to use the dark-themed overlay.
      * @defaultvalue false
      */
    var isDarkThemed: js.UndefOr[Boolean] = js.native
    
    @JSName("onClick")
    var onClick_IOverlayProps: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IOverlayStyleProps, IOverlayStyles]] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IOverlayProps {
    
    @scala.inline
    def apply(): IOverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOverlayProps]
    }
    
    @scala.inline
    implicit class IOverlayPropsMutableBuilder[Self <: IOverlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowTouchBodyScroll(value: Boolean): Self = StObject.set(x, "allowTouchBodyScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTouchBodyScrollUndefined: Self = StObject.set(x, "allowTouchBodyScroll", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IOverlay]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IOverlay | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setIsDarkThemed(value: Boolean): Self = StObject.set(x, "isDarkThemed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDarkThemedUndefined: Self = StObject.set(x, "isDarkThemed", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IOverlayStyleProps, IOverlayStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IOverlayStyleProps => DeepPartial[IOverlayStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IOverlayStyleProps extends StObject {
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Is overlay dark themed
      */
    var isDark: js.UndefOr[Boolean] = js.native
    
    /**
      * Is overlay visible
      */
    var isNone: js.UndefOr[Boolean] = js.native
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme = js.native
  }
  object IOverlayStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IOverlayStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOverlayStyleProps]
    }
    
    @scala.inline
    implicit class IOverlayStylePropsMutableBuilder[Self <: IOverlayStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIsDark(value: Boolean): Self = StObject.set(x, "isDark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDarkUndefined: Self = StObject.set(x, "isDark", js.undefined)
      
      @scala.inline
      def setIsNone(value: Boolean): Self = StObject.set(x, "isNone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNoneUndefined: Self = StObject.set(x, "isNone", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IOverlayStyles extends StObject {
    
    /**
      * Style for the root element.
      */
    var root: IStyle = js.native
  }
  object IOverlayStyles {
    
    @scala.inline
    def apply(): IOverlayStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOverlayStyles]
    }
    
    @scala.inline
    implicit class IOverlayStylesMutableBuilder[Self <: IOverlayStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
