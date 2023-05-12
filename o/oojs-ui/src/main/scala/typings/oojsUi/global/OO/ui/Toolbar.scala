package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.Toolbar.ConfigOptions
import typings.oojsUi.OO.ui.Toolbar.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toolbar extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.Toolbar")
  @js.native
  open class ^ protected ()
    extends StObject
       with typings.oojsUi.OO.ui.Toolbar {
    /**
      * @param toolFactory Factory for creating tools
      * @param toolGroupFactory Factory for creating toolgroups
      * @param config Configuration options
      */
    def this(
      toolFactory: typings.oojsUi.OO.ui.ToolFactory,
      toolGroupFactory: typings.oojsUi.OO.ui.ToolGroupFactory
    ) = this()
    def this(
      toolFactory: typings.oojsUi.OO.ui.ToolFactory,
      toolGroupFactory: typings.oojsUi.OO.ui.ToolGroupFactory,
      config: ConfigOptions
    ) = this()
    
    /* CompleteClass */
    @JSName("$actions")
    var $actions: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$after")
    var $after: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$bar")
    var $bar: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$group")
    var $group: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$overlay")
    var $overlay: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$popups")
    var $popups: JQuery[HTMLElement] = js.native
  }
  
  @JSGlobal("OO.ui.Toolbar")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /** @deprecated Use `super` instead */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.Toolbar.parent")
  @js.native
  /** @param config Configuration options */
  open class parent ()
    extends StObject
       with typings.oojsUi.OO.ui.Element {
    def this(config: typings.oojsUi.OO.ui.Element.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.Toolbar.super")
  @js.native
  /** @param config Configuration options */
  open class `super` ()
    extends StObject
       with typings.oojsUi.OO.ui.Element {
    def this(config: typings.oojsUi.OO.ui.Element.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
  }
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `Toolbar.foo` */
  override def _to: js.Object & Constructor = ^
}
