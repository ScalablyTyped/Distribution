package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.PopupWidget.ConfigOptions
import typings.oojsUi.OO.ui.PopupWidget.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopupWidget extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.PopupWidget")
  @js.native
  /** @param config Configuration options */
  open class ^ ()
    extends StObject
       with typings.oojsUi.OO.ui.PopupWidget {
    def this(config: ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$anchor")
    var $anchor: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$body")
    var $body: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$clippable")
    var $clippable: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$clippableContainer")
    var $clippableContainer: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$container")
    var $container: JQuery[HTMLElement] = js.native
    
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
    @JSName("$icon")
    var $icon: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$label")
    var $label: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$popup")
    var $popup: JQuery[HTMLElement] = js.native
  }
  
  @JSGlobal("OO.ui.PopupWidget")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /** @deprecated Use `super` instead */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.PopupWidget.parent")
  @js.native
  /** @param config Configuration options */
  open class parent ()
    extends StObject
       with typings.oojsUi.OO.ui.Widget {
    def this(config: typings.oojsUi.OO.ui.Widget.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.PopupWidget.super")
  @js.native
  /** @param config Configuration options */
  open class `super` ()
    extends StObject
       with typings.oojsUi.OO.ui.Widget {
    def this(config: typings.oojsUi.OO.ui.Widget.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
  }
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `PopupWidget.foo` */
  override def _to: js.Object & Constructor = ^
}
