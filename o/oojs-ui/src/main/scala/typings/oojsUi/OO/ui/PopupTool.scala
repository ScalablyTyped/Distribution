package typings.oojsUi.OO.ui

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.oojsUi.OO.ui.PopupTool.Prototype
import typings.oojsUi.OO.ui.Tool.Props
import typings.oojsUi.OO.ui.mixin.PopupElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Popup tools open a popup window when they are selected from the {@link OO.ui.Toolbar toolbar}.
  * Each popup tool is configured with a static name, title, and icon, as well with as any popup
  * configurations. Unlike other tools, popup tools do not require that developers specify an
  * #onSelect or #onUpdateState method, as these methods have been implemented already.
  *
  *     // Example of a popup tool. When selected, a popup tool displays
  *     // a popup window.
  *     function HelpTool( toolGroup, config ) {
  *        OO.ui.PopupTool.call( this, toolGroup, $.extend( { popup: {
  *            padded: true,
  *            label: 'Help',
  *            head: true
  *        } }, config ) );
  *        this.popup.$body.append( '<p>I am helpful!</p>' );
  *     };
  *     OO.inheritClass( HelpTool, OO.ui.PopupTool );
  *     HelpTool.static.name = 'help';
  *     HelpTool.static.icon = 'help';
  *     HelpTool.static.title = 'Help';
  *     toolFactory.register( HelpTool );
  *
  * For an example of a toolbar that contains a popup tool, see {@link OO.ui.Toolbar toolbars}.
  * For more information about toolbars in general, please see the
  * [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Toolbars).
  *
  * ResourceLoader module: `oojs-ui-toolbars`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.PopupTool
  */
@js.native
trait PopupTool
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
object PopupTool {
  
  trait ConfigOptions
    extends StObject
       with typings.oojsUi.OO.ui.Tool.ConfigOptions
       with typings.oojsUi.OO.ui.mixin.PopupElement.ConfigOptions
  object ConfigOptions {
    
    inline def apply(): ConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigOptions]
    }
  }
  
  @js.native
  trait Constructor
    extends StObject
       with /**
    * @param toolGroup
    * @param config Configuration options
    */
  Instantiable1[/* toolGroup */ ToolGroup, PopupTool]
       with Instantiable2[/* toolGroup */ ToolGroup, /* config */ ConfigOptions, PopupTool] {
    
    /** @deprecated Use `super` instead */
    var parent: typings.oojsUi.OO.ui.Tool.Constructor = js.native
    
    var static: Static = js.native
    
    var `super`: typings.oojsUi.OO.ui.Tool.Constructor = js.native
  }
  
  type Props = typings.oojsUi.OO.ui.Tool.Props
  
  @js.native
  trait Prototype
    extends StObject
       with typings.oojsUi.OO.ui.Tool.Prototype
       with PopupElement {
    
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
    
    /**
      * Handle popup visibility being toggled.
      *
      * @param isVisible
      */
    def onPopupToggle(isVisible: Boolean): Unit = js.native
  }
  
  type Static = typings.oojsUi.OO.ui.Tool.Static
}
