package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.oojsUi.OO.ui.Tool.Props
import typings.oojsUi.OO.ui.ToolGroupTool.Prototype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ToolGroupTool is a special sort of tool that can contain other {@link OO.ui.Tool tools}
  * and {@link OO.ui.ToolGroup toolgroups}. The ToolGroupTool was specifically designed to be used
  * inside a {@link OO.ui.BarToolGroup bar} toolgroup to provide access to additional tools from
  * the bar item. Included tools will be displayed in a dropdown {@link OO.ui.ListToolGroup list}
  * when the ToolGroupTool is selected.
  *
  *     // Example: ToolGroupTool with two nested tools, 'setting1' and 'setting2',
  *     // defined elsewhere.
  *
  *     function SettingsTool() {
  *         SettingsTool.super.apply( this, arguments );
  *     };
  *     OO.inheritClass( SettingsTool, OO.ui.ToolGroupTool );
  *     SettingsTool.static.name = 'settings';
  *     SettingsTool.static.title = 'Change settings';
  *     SettingsTool.static.groupConfig = {
  *         icon: 'settings',
  *         label: 'ToolGroupTool',
  *         include: [ 'setting1', 'setting2' ]
  *     };
  *     toolFactory.register( SettingsTool );
  *
  * For more information, please see the [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Toolbars#ToolGroupTool).
  *
  * Please note that this implementation is subject to change per [T74159](https://phabricator.wikimedia.org/T74159).
  *
  * ResourceLoader module: `oojs-ui-toolbars`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.ToolGroupTool
  */
@js.native
trait ToolGroupTool
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
object ToolGroupTool {
  
  type ConfigOptions = typings.oojsUi.OO.ui.Tool.ConfigOptions
  
  @js.native
  trait Constructor
    extends StObject
       with /**
    * @param toolGroup
    * @param config Configuration options
    */
  Instantiable1[/* toolGroup */ ToolGroup, ToolGroupTool]
       with Instantiable2[/* toolGroup */ ToolGroup, /* config */ ConfigOptions, ToolGroupTool] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Tool.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Tool.Constructor = js.native
  }
  
  type Props = typings.oojsUi.OO.ui.Tool.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Tool.Prototype {
    
    /**
      * Build a {@link OO.ui.ToolGroup toolgroup} from the specified configuration.
      *
      * @param group Toolgroup configuration. Please see {@link OO.ui.ToolGroup toolgroup}
      *  for more information.
      * @return
      */
    def createGroup(group: typings.oojsUi.OO.ui.ListToolGroup.ConfigOptions): ListToolGroup = js.native
    
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
  
  @js.native
  trait Static
    extends StObject
       with typings.oojsUi.OO.ui.Tool.Static {
    
    /**
      * Toolgroup configuration.
      *
      * The toolgroup configuration consists of the tools to include, as well as an icon and
      * label to use for the bar item. Tools can be included by symbolic name, group, or with
      * the wildcard selector. Please see {@link OO.ui.ToolGroup toolgroup} for more
      * information.
      */
    var groupConfig: typings.oojsUi.OO.ui.ListToolGroup.ConfigOptions = js.native
  }
}
