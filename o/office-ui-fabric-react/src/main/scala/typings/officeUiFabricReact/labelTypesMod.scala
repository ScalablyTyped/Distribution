package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.LabelHTMLAttributes
import typings.std.HTMLElement
import typings.std.HTMLLabelElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.icomponentasMod.IComponentAs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelTypesMod {
  
  @js.native
  trait ILabel extends StObject
  
  @js.native
  trait ILabelProps extends LabelHTMLAttributes[HTMLLabelElement] {
    
    /**
      * Render the root element as another type.
      */
    var as: js.UndefOr[IComponentAs[AllHTMLAttributes[HTMLElement]]] = js.native
    
    /**
      * Optional callback to access the ILabel interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ILabel]] = js.native
    
    /**
      * Renders the label as disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the associated form field is required or not
      * @defaultvalue false
      */
    var required: js.UndefOr[Boolean] = js.native
    
    /**
      * Styles for the label.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles]] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object ILabelProps {
    
    @scala.inline
    def apply(): ILabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILabelProps]
    }
    
    @scala.inline
    implicit class ILabelPropsMutableBuilder[Self <: ILabelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: IComponentAs[AllHTMLAttributes[HTMLElement]]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[ILabel]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ILabel | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ILabelStyleProps, ILabelStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ILabelStyleProps => DeepPartial[ILabelStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait ILabelStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    /**
      *
      */
    var theme: ITheme = js.native
  }
  object ILabelStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ILabelStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILabelStyleProps]
    }
    
    @scala.inline
    implicit class ILabelStylePropsMutableBuilder[Self <: ILabelStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ILabelStyles extends StObject {
    
    /**
      * Styles for the root element.
      */
    var root: IStyle = js.native
  }
  object ILabelStyles {
    
    @scala.inline
    def apply(): ILabelStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILabelStyles]
    }
    
    @scala.inline
    implicit class ILabelStylesMutableBuilder[Self <: ILabelStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
