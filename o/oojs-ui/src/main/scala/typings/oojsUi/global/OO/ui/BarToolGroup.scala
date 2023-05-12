package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.BarToolGroup.ConfigOptions
import typings.oojsUi.OO.ui.BarToolGroup.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BarToolGroup extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.BarToolGroup")
  @js.native
  /** @param config Configuration options */
  open class ^ ()
    extends StObject
       with typings.oojsUi.OO.ui.BarToolGroup {
    def this(config: ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$group")
    var $group: JQuery[HTMLElement] = js.native
  }
  
  @JSGlobal("OO.ui.BarToolGroup")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /** @deprecated Use `super` instead */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.BarToolGroup.parent")
  @js.native
  open class parent protected ()
    extends StObject
       with typings.oojsUi.OO.ui.ToolGroup {
    /**
      * @param toolbar
      * @param config Configuration options
      */
    def this(toolbar: typings.oojsUi.OO.ui.Toolbar) = this()
    def this(toolbar: typings.oojsUi.OO.ui.Toolbar, config: typings.oojsUi.OO.ui.ToolGroup.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$group")
    var $group: JQuery[HTMLElement] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.BarToolGroup.super")
  @js.native
  open class `super` protected ()
    extends StObject
       with typings.oojsUi.OO.ui.ToolGroup {
    /**
      * @param toolbar
      * @param config Configuration options
      */
    def this(toolbar: typings.oojsUi.OO.ui.Toolbar) = this()
    def this(toolbar: typings.oojsUi.OO.ui.Toolbar, config: typings.oojsUi.OO.ui.ToolGroup.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$group")
    var $group: JQuery[HTMLElement] = js.native
  }
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `BarToolGroup.foo` */
  override def _to: js.Object & Constructor = ^
}
