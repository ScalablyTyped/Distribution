package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.oojsUi.OO.ui.ListToolGroup.Prototype
import typings.oojsUi.OO.ui.PopupToolGroup.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ListToolGroups are one of three types of {@link OO.ui.ToolGroup toolgroups} that are used to
  * create {@link OO.ui.Toolbar toolbars} (the other types of groups are
  * {@link OO.ui.MenuToolGroup MenuToolGroup} and {@link OO.ui.BarToolGroup BarToolGroup}).
  * The {@link OO.ui.Tool tools} in a ListToolGroup are displayed by label in a dropdown menu.
  * The title of the tool is used as the label text. The menu itself can be configured with a label,
  * icon, indicator, header, and title.
  *
  * ListToolGroups can be configured to be expanded and collapsed. Collapsed lists will have a
  * ‘More’ option that users can select to see the full list of tools. If a collapsed toolgroup is
  * expanded, a ‘Fewer’ option permits users to collapse the list again.
  *
  * ListToolGroups are created by a {@link OO.ui.ToolGroupFactory toolgroup factory} when the
  * toolbar is set up. The factory requires the ListToolGroup's symbolic name, 'list', which is
  * specified along with the other configurations. For more information about how to add tools to a
  * ListToolGroup, please see {@link OO.ui.ToolGroup toolgroup}.
  *
  *     // Example of a ListToolGroup
  *     var toolFactory = new OO.ui.ToolFactory();
  *     var toolGroupFactory = new OO.ui.ToolGroupFactory();
  *     var toolbar = new OO.ui.Toolbar( toolFactory, toolGroupFactory );
  *
  *     // Configure and register two tools
  *     function SettingsTool() {
  *         SettingsTool.super.apply( this, arguments );
  *     }
  *     OO.inheritClass( SettingsTool, OO.ui.Tool );
  *     SettingsTool.static.name = 'settings';
  *     SettingsTool.static.icon = 'settings';
  *     SettingsTool.static.title = 'Change settings';
  *     SettingsTool.prototype.onSelect = function () {
  *         this.setActive( false );
  *     };
  *     SettingsTool.prototype.onUpdateState = function () {};
  *     toolFactory.register( SettingsTool );
  *     // Register two more tools, nothing interesting here
  *     function StuffTool() {
  *         StuffTool.super.apply( this, arguments );
  *     }
  *     OO.inheritClass( StuffTool, OO.ui.Tool );
  *     StuffTool.static.name = 'stuff';
  *     StuffTool.static.icon = 'search';
  *     StuffTool.static.title = 'Change the world';
  *     StuffTool.prototype.onSelect = function () {
  *         this.setActive( false );
  *     };
  *     StuffTool.prototype.onUpdateState = function () {};
  *     toolFactory.register( StuffTool );
  *     toolbar.setup( [
  *         {
  *             // Configurations for list toolgroup.
  *             type: 'list',
  *             label: 'ListToolGroup',
  *             icon: 'ellipsis',
  *             title: 'This is the title, displayed when user moves the mouse over the list ' +
  *                 'toolgroup',
  *             header: 'This is the header',
  *             include: [ 'settings', 'stuff' ],
  *             allowCollapse: ['stuff']
  *         }
  *     ] );
  *
  *     // Create some UI around the toolbar and place it in the document
  *     var frame = new OO.ui.PanelLayout( {
  *         expanded: false,
  *         framed: true
  *     } );
  *     frame.$element.append(
  *         toolbar.$element
  *     );
  *     $( document.body ).append( frame.$element );
  *     // Build the toolbar. This must be done after the toolbar has been appended to the document.
  *     toolbar.initialize();
  *
  * For more information about toolbars in general, please see the
  * [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Toolbars).
  *
  * ResourceLoader module: `oojs-ui-toolbars`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.ListToolGroup
  */
@js.native
trait ListToolGroup
  extends StObject
     with Props
     with Prototype {
  
  /**
    * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
    * value.
    *
    * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
    * instead.
    *
    * @return The ID of the labelable element
    */
  /* InferMemberOverrides */
  override def getInputId(): String | Null = js.native
}
object ListToolGroup {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.PopupToolGroup.ConfigOptions {
    
    /**
      * Allow the specified tools to be collapsed. By default, collapsible
      * tools will only be displayed if users click the ‘More’ option displayed at the bottom
      * of the list. If the list is expanded, a ‘Fewer’ option permits users to collapse the
      * list again. Any tools that are included in the toolgroup, but are not designated as
      * collapsible, will always be displayed.
      * To open a collapsible list in its expanded state, set {@link expanded} to 'true'.
      */
    var allowCollapse: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Expand collapsible tools. This config is only relevant if tools
      * have been designated as collapsible. When expanded is set to true, all tools in the
      * group will be displayed when the list is first opened. Users can collapse the list
      * with a ‘Fewer’ option at the bottom.
      */
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Expand the specified tools. All other tools will be designated as
      * collapsible. Unless #expanded is set to true, the collapsible tools will be collapsed
      * when the list is first opened.
      */
    var forceExpand: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowCollapse(value: js.Array[String]): Self = StObject.set(x, "allowCollapse", value.asInstanceOf[js.Any])
      
      inline def setAllowCollapseUndefined: Self = StObject.set(x, "allowCollapse", js.undefined)
      
      inline def setAllowCollapseVarargs(value: String*): Self = StObject.set(x, "allowCollapse", js.Array(value*))
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setForceExpand(value: js.Array[String]): Self = StObject.set(x, "forceExpand", value.asInstanceOf[js.Any])
      
      inline def setForceExpandUndefined: Self = StObject.set(x, "forceExpand", js.undefined)
      
      inline def setForceExpandVarargs(value: String*): Self = StObject.set(x, "forceExpand", js.Array(value*))
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /**
    * @param toolbar
    * @param config Configuration options
    */
  Instantiable1[/* toolbar */ Toolbar, ListToolGroup]
       with Instantiable2[/* toolbar */ Toolbar, /* config */ ConfigOptions, ListToolGroup] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.PopupToolGroup.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.PopupToolGroup.Constructor = js.native
  }
  
  type Props = typings.oojsUi.OO.ui.PopupToolGroup.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.PopupToolGroup.Prototype {
    
    /**
      * Get the expand/collapse tool for this group
      *
      * @return Expand collapse tool
      */
    def getExpandCollapseTool(): Tool = js.native
    
    /**
      * Get an ID of a labelable node which is part of this widget, if any, to be used for `<label for>`
      * value.
      *
      * If this function returns null, the widget should have a meaningful {@link simulateLabelClick} method
      * instead.
      *
      * @return The ID of the labelable element
      */
    /* InferMemberOverrides */
    override def getInputId(): String | Null = js.native
    
    def updateCollapsibleState(): Unit = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.PopupToolGroup.Static
}
