package typings.officeUiFabricReact

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import typings.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDetailsListDetailsRowCheckDottypesMod {
  
  trait IDetailsCheckboxProps extends StObject {
    
    var checked: Boolean
    
    var theme: js.UndefOr[ITheme] = js.undefined
  }
  object IDetailsCheckboxProps {
    
    inline def apply(checked: Boolean): IDetailsCheckboxProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsCheckboxProps]
    }
    
    extension [Self <: IDetailsCheckboxProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IDetailsRowCheckProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    /**
      * Is any selected - also true for isSelectionModal
      */
    var anySelected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Can this checkbox be selectable
      */
    var canSelect: Boolean
    
    /**
      * The classname to be passed down to Check component
      */
    var checkClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Is this in compact mode?
      */
    var compact: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Is the check part of the header in a DetailsList
      */
    var isHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not this checkbox is visible
      */
    var isVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If provided, can be used to render a custom checkbox
      */
    var onRenderDetailsCheckbox: js.UndefOr[IRenderFunction[IDetailsCheckboxProps]] = js.undefined
    
    /**
      * Whether or not this check is selected
      */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style override
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDetailsRowCheckStyleProps, IDetailsRowCheckStyles]] = js.undefined
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.undefined
    
    /**
      * Whether to use fast icon and check components. The icons can't be targeted by customization
      * but are still customizable via class names.
      * @defaultvalue true
      */
    var useFastIcons: js.UndefOr[Boolean] = js.undefined
  }
  object IDetailsRowCheckProps {
    
    inline def apply(canSelect: Boolean): IDetailsRowCheckProps = {
      val __obj = js.Dynamic.literal(canSelect = canSelect.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowCheckProps]
    }
    
    extension [Self <: IDetailsRowCheckProps](x: Self) {
      
      inline def setAnySelected(value: Boolean): Self = StObject.set(x, "anySelected", value.asInstanceOf[js.Any])
      
      inline def setAnySelectedUndefined: Self = StObject.set(x, "anySelected", js.undefined)
      
      inline def setCanSelect(value: Boolean): Self = StObject.set(x, "canSelect", value.asInstanceOf[js.Any])
      
      inline def setCheckClassName(value: String): Self = StObject.set(x, "checkClassName", value.asInstanceOf[js.Any])
      
      inline def setCheckClassNameUndefined: Self = StObject.set(x, "checkClassName", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setIsHeader(value: Boolean): Self = StObject.set(x, "isHeader", value.asInstanceOf[js.Any])
      
      inline def setIsHeaderUndefined: Self = StObject.set(x, "isHeader", js.undefined)
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      inline def setOnRenderDetailsCheckbox(
        value: (/* props */ js.UndefOr[IDetailsCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsCheckboxProps], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderDetailsCheckbox", js.Any.fromFunction2(value))
      
      inline def setOnRenderDetailsCheckboxUndefined: Self = StObject.set(x, "onRenderDetailsCheckbox", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setStyles(value: IStyleFunctionOrObject[IDetailsRowCheckStyleProps, IDetailsRowCheckStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction1(value: IDetailsRowCheckStyleProps => DeepPartial[IDetailsRowCheckStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUseFastIcons(value: Boolean): Self = StObject.set(x, "useFastIcons", value.asInstanceOf[js.Any])
      
      inline def setUseFastIconsUndefined: Self = StObject.set(x, "useFastIcons", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRowCheck.types.IDetailsRowCheckProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRowCheck.types.IDetailsRowCheckProps, 'compact' | 'isHeader' | 'selected' | 'anySelected' | 'canSelect' | 'className'> & {  isVisible :boolean | undefined} */
  trait IDetailsRowCheckStyleProps extends StObject {
    
    var anySelected: js.UndefOr[Boolean] = js.undefined
    
    var canSelect: Boolean
    
    var className: js.UndefOr[String] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var isHeader: js.UndefOr[Boolean] = js.undefined
    
    /** Is checkbox visible */
    var isVisible: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var theme: ITheme
  }
  object IDetailsRowCheckStyleProps {
    
    inline def apply(canSelect: Boolean, theme: ITheme): IDetailsRowCheckStyleProps = {
      val __obj = js.Dynamic.literal(canSelect = canSelect.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDetailsRowCheckStyleProps]
    }
    
    extension [Self <: IDetailsRowCheckStyleProps](x: Self) {
      
      inline def setAnySelected(value: Boolean): Self = StObject.set(x, "anySelected", value.asInstanceOf[js.Any])
      
      inline def setAnySelectedUndefined: Self = StObject.set(x, "anySelected", js.undefined)
      
      inline def setCanSelect(value: Boolean): Self = StObject.set(x, "canSelect", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setIsHeader(value: Boolean): Self = StObject.set(x, "isHeader", value.asInstanceOf[js.Any])
      
      inline def setIsHeaderUndefined: Self = StObject.set(x, "isHeader", js.undefined)
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDetailsRowCheckStyles extends StObject {
    
    /** @deprecated Use `root` (they're applied to the same element) */
    var check: IStyle
    
    var isDisabled: IStyle
    
    var root: IStyle
  }
  object IDetailsRowCheckStyles {
    
    inline def apply(): IDetailsRowCheckStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDetailsRowCheckStyles]
    }
    
    extension [Self <: IDetailsRowCheckStyles](x: Self) {
      
      inline def setCheck(value: IStyle): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckNull: Self = StObject.set(x, "check", null)
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setIsDisabled(value: IStyle): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledNull: Self = StObject.set(x, "isDisabled", null)
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
