package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemStyleProps
import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemStyles
import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuSubComponentStyles
import typings.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextualMenuClassNamesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.classNames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getItemClassNames(
    theme: ITheme,
    disabled: Boolean,
    expanded: Boolean,
    checked: Boolean,
    isAnchorLink: Boolean,
    knownIcon: Boolean,
    itemClassName: js.UndefOr[String],
    dividerClassName: js.UndefOr[String],
    iconClassName: js.UndefOr[String],
    subMenuClassName: js.UndefOr[String],
    primaryDisabled: js.UndefOr[Boolean],
    className: js.UndefOr[String]
  ): IContextualMenuItemStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemClassNames")(theme.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], expanded.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], isAnchorLink.asInstanceOf[js.Any], knownIcon.asInstanceOf[js.Any], itemClassName.asInstanceOf[js.Any], dividerClassName.asInstanceOf[js.Any], iconClassName.asInstanceOf[js.Any], subMenuClassName.asInstanceOf[js.Any], primaryDisabled.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[IContextualMenuItemStyles]
  
  inline def getItemStyles(props: IContextualMenuItemStyleProps): IContextualMenuItemStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IContextualMenuItemStyles]
  
  inline def getSplitButtonVerticalDividerClassNames(theme: ITheme): IVerticalDividerClassNames = ^.asInstanceOf[js.Dynamic].applyDynamic("getSplitButtonVerticalDividerClassNames")(theme.asInstanceOf[js.Any]).asInstanceOf[IVerticalDividerClassNames]
  
  trait IContextualMenuClassNames extends StObject {
    
    var container: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var list: js.UndefOr[String] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var subComponentStyles: js.UndefOr[IContextualMenuSubComponentStyles] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object IContextualMenuClassNames {
    
    inline def apply(): IContextualMenuClassNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IContextualMenuClassNames]
    }
    
    extension [Self <: IContextualMenuClassNames](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSubComponentStyles(value: IContextualMenuSubComponentStyles): Self = StObject.set(x, "subComponentStyles", value.asInstanceOf[js.Any])
      
      inline def setSubComponentStylesUndefined: Self = StObject.set(x, "subComponentStyles", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait IMenuItemClassNames extends StObject {
    
    var checkmarkIcon: js.UndefOr[String] = js.undefined
    
    var divider: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var item: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var linkContent: js.UndefOr[String] = js.undefined
    
    var linkContentMenu: js.UndefOr[String] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var screenReaderText: js.UndefOr[String] = js.undefined
    
    var secondaryText: js.UndefOr[String] = js.undefined
    
    var splitContainer: js.UndefOr[String] = js.undefined
    
    var splitMenu: js.UndefOr[String] = js.undefined
    
    var splitPrimary: js.UndefOr[String] = js.undefined
    
    var subMenuIcon: js.UndefOr[String] = js.undefined
  }
  object IMenuItemClassNames {
    
    inline def apply(): IMenuItemClassNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMenuItemClassNames]
    }
    
    extension [Self <: IMenuItemClassNames](x: Self) {
      
      inline def setCheckmarkIcon(value: String): Self = StObject.set(x, "checkmarkIcon", value.asInstanceOf[js.Any])
      
      inline def setCheckmarkIconUndefined: Self = StObject.set(x, "checkmarkIcon", js.undefined)
      
      inline def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLinkContent(value: String): Self = StObject.set(x, "linkContent", value.asInstanceOf[js.Any])
      
      inline def setLinkContentMenu(value: String): Self = StObject.set(x, "linkContentMenu", value.asInstanceOf[js.Any])
      
      inline def setLinkContentMenuUndefined: Self = StObject.set(x, "linkContentMenu", js.undefined)
      
      inline def setLinkContentUndefined: Self = StObject.set(x, "linkContent", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setScreenReaderText(value: String): Self = StObject.set(x, "screenReaderText", value.asInstanceOf[js.Any])
      
      inline def setScreenReaderTextUndefined: Self = StObject.set(x, "screenReaderText", js.undefined)
      
      inline def setSecondaryText(value: String): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
      inline def setSplitContainer(value: String): Self = StObject.set(x, "splitContainer", value.asInstanceOf[js.Any])
      
      inline def setSplitContainerUndefined: Self = StObject.set(x, "splitContainer", js.undefined)
      
      inline def setSplitMenu(value: String): Self = StObject.set(x, "splitMenu", value.asInstanceOf[js.Any])
      
      inline def setSplitMenuUndefined: Self = StObject.set(x, "splitMenu", js.undefined)
      
      inline def setSplitPrimary(value: String): Self = StObject.set(x, "splitPrimary", value.asInstanceOf[js.Any])
      
      inline def setSplitPrimaryUndefined: Self = StObject.set(x, "splitPrimary", js.undefined)
      
      inline def setSubMenuIcon(value: String): Self = StObject.set(x, "subMenuIcon", value.asInstanceOf[js.Any])
      
      inline def setSubMenuIconUndefined: Self = StObject.set(x, "subMenuIcon", js.undefined)
    }
  }
}
