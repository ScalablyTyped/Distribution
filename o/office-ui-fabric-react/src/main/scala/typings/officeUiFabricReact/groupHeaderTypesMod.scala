package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.groupedListTypesMod.IGroupDividerProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupHeaderTypesMod {
  
  @js.native
  trait IGroupHeaderCheckboxProps extends StObject {
    
    var checked: Boolean = js.native
    
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IGroupHeaderCheckboxProps {
    
    @scala.inline
    def apply(checked: Boolean): IGroupHeaderCheckboxProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroupHeaderCheckboxProps]
    }
    
    @scala.inline
    implicit class IGroupHeaderCheckboxPropsMutableBuilder[Self <: IGroupHeaderCheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IGroupHeaderProps extends IGroupDividerProps {
    
    /** Defines an element's number or position in the current set of listitems or treeitems */
    var ariaPosInSet: js.UndefOr[Double] = js.native
    
    /** Defines the number of items in the current set of listitems or treeitems */
    var ariaSetSize: js.UndefOr[Double] = js.native
    
    /** Defines the name of a custom icon to be used for group headers. If not set, the default icon will be used */
    var expandButtonIcon: js.UndefOr[String] = js.native
    
    /** GroupedList id for aria-controls */
    var groupedListId: js.UndefOr[String] = js.native
    
    /**
      * If provided, can be used to render a custom checkbox
      */
    var onRenderGroupHeaderCheckbox: js.UndefOr[IRenderFunction[IGroupHeaderCheckboxProps]] = js.native
    
    /** Native props for the GroupHeader select all button */
    var selectAllButtonProps: js.UndefOr[HTMLAttributes[HTMLButtonElement]] = js.native
    
    /** Style function to be passed in to override the themed or default styles */
    var styles: js.UndefOr[IStyleFunctionOrObject[IGroupHeaderStyleProps, IGroupHeaderStyles]] = js.native
    
    /**
      * Whether to use fast icon and check components. The icons can't be targeted by customization
      * but are still customizable via class names.
      * @defaultvalue true
      */
    var useFastIcons: js.UndefOr[Boolean] = js.native
  }
  object IGroupHeaderProps {
    
    @scala.inline
    def apply(): IGroupHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupHeaderProps]
    }
    
    @scala.inline
    implicit class IGroupHeaderPropsMutableBuilder[Self <: IGroupHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaPosInSet(value: Double): Self = StObject.set(x, "ariaPosInSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaPosInSetUndefined: Self = StObject.set(x, "ariaPosInSet", js.undefined)
      
      @scala.inline
      def setAriaSetSize(value: Double): Self = StObject.set(x, "ariaSetSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaSetSizeUndefined: Self = StObject.set(x, "ariaSetSize", js.undefined)
      
      @scala.inline
      def setExpandButtonIcon(value: String): Self = StObject.set(x, "expandButtonIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandButtonIconUndefined: Self = StObject.set(x, "expandButtonIcon", js.undefined)
      
      @scala.inline
      def setGroupedListId(value: String): Self = StObject.set(x, "groupedListId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupedListIdUndefined: Self = StObject.set(x, "groupedListId", js.undefined)
      
      @scala.inline
      def setOnRenderGroupHeaderCheckbox(
        value: (/* props */ js.UndefOr[IGroupHeaderCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderCheckboxProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderGroupHeaderCheckbox", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderGroupHeaderCheckboxUndefined: Self = StObject.set(x, "onRenderGroupHeaderCheckbox", js.undefined)
      
      @scala.inline
      def setSelectAllButtonProps(value: HTMLAttributes[HTMLButtonElement]): Self = StObject.set(x, "selectAllButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllButtonPropsUndefined: Self = StObject.set(x, "selectAllButtonProps", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IGroupHeaderStyleProps, IGroupHeaderStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IGroupHeaderStyleProps => DeepPartial[IGroupHeaderStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setUseFastIcons(value: Boolean): Self = StObject.set(x, "useFastIcons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFastIconsUndefined: Self = StObject.set(x, "useFastIcons", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupHeader.types.IGroupHeaderProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/GroupedList/GroupHeader.types.IGroupHeaderProps, 'selected' | 'className'> & {  isCollapsed :boolean | undefined,   compact :boolean | undefined} */
  @js.native
  trait IGroupHeaderStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    /** Whether the group header is in compact mode or not */
    var compact: js.UndefOr[Boolean] = js.native
    
    /** Is Header collapsed */
    var isCollapsed: js.UndefOr[Boolean] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var theme: ITheme = js.native
  }
  object IGroupHeaderStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IGroupHeaderStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGroupHeaderStyleProps]
    }
    
    @scala.inline
    implicit class IGroupHeaderStylePropsMutableBuilder[Self <: IGroupHeaderStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
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
  trait IGroupHeaderStyles extends StObject {
    
    var check: IStyle = js.native
    
    var dropIcon: IStyle = js.native
    
    var expand: IStyle = js.native
    
    var expandIsCollapsed: IStyle = js.native
    
    var groupHeaderContainer: IStyle = js.native
    
    var headerCount: IStyle = js.native
    
    var root: IStyle = js.native
    
    var title: IStyle = js.native
  }
  object IGroupHeaderStyles {
    
    @scala.inline
    def apply(): IGroupHeaderStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupHeaderStyles]
    }
    
    @scala.inline
    implicit class IGroupHeaderStylesMutableBuilder[Self <: IGroupHeaderStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: IStyle): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckNull: Self = StObject.set(x, "check", null)
      
      @scala.inline
      def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      @scala.inline
      def setDropIcon(value: IStyle): Self = StObject.set(x, "dropIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropIconNull: Self = StObject.set(x, "dropIcon", null)
      
      @scala.inline
      def setDropIconUndefined: Self = StObject.set(x, "dropIcon", js.undefined)
      
      @scala.inline
      def setExpand(value: IStyle): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIsCollapsed(value: IStyle): Self = StObject.set(x, "expandIsCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIsCollapsedNull: Self = StObject.set(x, "expandIsCollapsed", null)
      
      @scala.inline
      def setExpandIsCollapsedUndefined: Self = StObject.set(x, "expandIsCollapsed", js.undefined)
      
      @scala.inline
      def setExpandNull: Self = StObject.set(x, "expand", null)
      
      @scala.inline
      def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      @scala.inline
      def setGroupHeaderContainer(value: IStyle): Self = StObject.set(x, "groupHeaderContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupHeaderContainerNull: Self = StObject.set(x, "groupHeaderContainer", null)
      
      @scala.inline
      def setGroupHeaderContainerUndefined: Self = StObject.set(x, "groupHeaderContainer", js.undefined)
      
      @scala.inline
      def setHeaderCount(value: IStyle): Self = StObject.set(x, "headerCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderCountNull: Self = StObject.set(x, "headerCount", null)
      
      @scala.inline
      def setHeaderCountUndefined: Self = StObject.set(x, "headerCount", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setTitle(value: IStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleNull: Self = StObject.set(x, "title", null)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
