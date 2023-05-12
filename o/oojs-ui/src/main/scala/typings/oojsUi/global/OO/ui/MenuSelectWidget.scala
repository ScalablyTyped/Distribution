package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.MenuSelectWidget.ConfigOptions
import typings.oojsUi.OO.ui.MenuSelectWidget.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuSelectWidget extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.MenuSelectWidget")
  @js.native
  /** @param config Configuration options */
  open class ^ ()
    extends StObject
       with typings.oojsUi.OO.ui.MenuSelectWidget {
    def this(config: ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$autoCloseIgnore")
    var $autoCloseIgnore: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$clippable")
    var $clippable: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$clippableContainer")
    var $clippableContainer: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$floatable")
    var $floatable: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$floatableContainer")
    var $floatableContainer: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$focusOwner")
    var $focusOwner: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$group")
    var $group: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$input")
    var $input: JQuery[HTMLElement] | Null = js.native
    
    /* CompleteClass */
    @JSName("$widget")
    var $widget: JQuery[HTMLElement] | Null = js.native
  }
  
  @JSGlobal("OO.ui.MenuSelectWidget")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /** @deprecated Use `super` instead */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.MenuSelectWidget.parent")
  @js.native
  /** @param config Configuration options */
  open class parent ()
    extends StObject
       with typings.oojsUi.OO.ui.SelectWidget {
    def this(config: typings.oojsUi.OO.ui.SelectWidget.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$focusOwner")
    var $focusOwner: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$group")
    var $group: JQuery[HTMLElement] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.MenuSelectWidget.super")
  @js.native
  /** @param config Configuration options */
  open class `super` ()
    extends StObject
       with typings.oojsUi.OO.ui.SelectWidget {
    def this(config: typings.oojsUi.OO.ui.SelectWidget.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$focusOwner")
    var $focusOwner: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$group")
    var $group: JQuery[HTMLElement] = js.native
  }
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `MenuSelectWidget.foo` */
  override def _to: js.Object & Constructor = ^
}
