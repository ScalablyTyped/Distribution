package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.groupedListTypesMod.IGroupDividerProps
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupFooterTypesMod {
  
  @js.native
  trait IGroupFooterProps extends IGroupDividerProps {
    
    /**
      * Style function to be passed in to override the themed or default styles
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IGroupFooterStyleProps, IGroupFooterStyles]] = js.native
  }
  object IGroupFooterProps {
    
    @scala.inline
    def apply(): IGroupFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupFooterProps]
    }
    
    @scala.inline
    implicit class IGroupFooterPropsMutableBuilder[Self <: IGroupFooterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IGroupFooterStyleProps, IGroupFooterStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IGroupFooterStyleProps => DeepPartial[IGroupFooterStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupFooter.types.IGroupFooterProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupFooter.types.IGroupFooterProps, 'selected' | 'className'> & {  isCollapsed :boolean | undefined} */
  @js.native
  trait IGroupFooterStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    /** Whether the footer is collapsed */
    var isCollapsed: js.UndefOr[Boolean] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var theme: ITheme = js.native
  }
  object IGroupFooterStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IGroupFooterStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroupFooterStyleProps]
    }
    
    @scala.inline
    implicit class IGroupFooterStylePropsMutableBuilder[Self <: IGroupFooterStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCollapsedUndefined: Self = StObject.set(x, "isCollapsed", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IGroupFooterStyles extends StObject {
    
    var root: IStyle = js.native
  }
  object IGroupFooterStyles {
    
    @scala.inline
    def apply(): IGroupFooterStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupFooterStyles]
    }
    
    @scala.inline
    implicit class IGroupFooterStylesMutableBuilder[Self <: IGroupFooterStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
