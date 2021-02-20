package typings.officeUiFabricReact

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemStyleProps
import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemStyles
import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuSubComponentStyles
import typings.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextualMenuClassNamesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.classNames", "getItemClassNames")
  @js.native
  def getItemClassNames(
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
  ): IContextualMenuItemStyles = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.classNames", "getItemStyles")
  @js.native
  def getItemStyles(props: IContextualMenuItemStyleProps): IContextualMenuItemStyles = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.classNames", "getSplitButtonVerticalDividerClassNames")
  @js.native
  def getSplitButtonVerticalDividerClassNames(theme: ITheme): IVerticalDividerClassNames = js.native
  
  @js.native
  trait IContextualMenuClassNames extends StObject {
    
    var container: String = js.native
    
    var header: String = js.native
    
    var list: String = js.native
    
    var root: String = js.native
    
    var subComponentStyles: js.UndefOr[IContextualMenuSubComponentStyles] = js.native
    
    var title: String = js.native
  }
  object IContextualMenuClassNames {
    
    @scala.inline
    def apply(container: String, header: String, list: String, root: String, title: String): IContextualMenuClassNames = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContextualMenuClassNames]
    }
    
    @scala.inline
    implicit class IContextualMenuClassNamesMutableBuilder[Self <: IContextualMenuClassNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubComponentStyles(value: IContextualMenuSubComponentStyles): Self = StObject.set(x, "subComponentStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubComponentStylesUndefined: Self = StObject.set(x, "subComponentStyles", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IMenuItemClassNames extends StObject {
    
    var checkmarkIcon: String = js.native
    
    var divider: String = js.native
    
    var icon: String = js.native
    
    var item: String = js.native
    
    var label: String = js.native
    
    var linkContent: String = js.native
    
    var linkContentMenu: String = js.native
    
    var root: String = js.native
    
    var secondaryText: String = js.native
    
    var splitContainer: String = js.native
    
    var splitMenu: String = js.native
    
    var splitPrimary: String = js.native
    
    var subMenuIcon: String = js.native
  }
  object IMenuItemClassNames {
    
    @scala.inline
    def apply(
      checkmarkIcon: String,
      divider: String,
      icon: String,
      item: String,
      label: String,
      linkContent: String,
      linkContentMenu: String,
      root: String,
      secondaryText: String,
      splitContainer: String,
      splitMenu: String,
      splitPrimary: String,
      subMenuIcon: String
    ): IMenuItemClassNames = {
      val __obj = js.Dynamic.literal(checkmarkIcon = checkmarkIcon.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], linkContent = linkContent.asInstanceOf[js.Any], linkContentMenu = linkContentMenu.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], secondaryText = secondaryText.asInstanceOf[js.Any], splitContainer = splitContainer.asInstanceOf[js.Any], splitMenu = splitMenu.asInstanceOf[js.Any], splitPrimary = splitPrimary.asInstanceOf[js.Any], subMenuIcon = subMenuIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMenuItemClassNames]
    }
    
    @scala.inline
    implicit class IMenuItemClassNamesMutableBuilder[Self <: IMenuItemClassNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckmarkIcon(value: String): Self = StObject.set(x, "checkmarkIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkContent(value: String): Self = StObject.set(x, "linkContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkContentMenu(value: String): Self = StObject.set(x, "linkContentMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryText(value: String): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitContainer(value: String): Self = StObject.set(x, "splitContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitMenu(value: String): Self = StObject.set(x, "splitMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitPrimary(value: String): Self = StObject.set(x, "splitPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuIcon(value: String): Self = StObject.set(x, "subMenuIcon", value.asInstanceOf[js.Any])
    }
  }
}
