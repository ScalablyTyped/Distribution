package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.FieldsetLayout.ConfigOptions
import typings.oojsUi.OO.ui.FieldsetLayout.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FieldsetLayout extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.FieldsetLayout")
  @js.native
  /** @param config Configuration options */
  open class ^ ()
    extends StObject
       with typings.oojsUi.OO.ui.FieldsetLayout {
    def this(config: ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$group")
    var $group: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$header")
    var $header: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$icon")
    var $icon: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$label")
    var $label: JQuery[HTMLElement] = js.native
  }
  
  @JSGlobal("OO.ui.FieldsetLayout")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /** @deprecated Use `super` instead */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.FieldsetLayout.parent")
  @js.native
  /** @param config Configuration options */
  open class parent ()
    extends StObject
       with typings.oojsUi.OO.ui.Layout {
    def this(config: typings.oojsUi.OO.ui.Layout.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.FieldsetLayout.super")
  @js.native
  /** @param config Configuration options */
  open class `super` ()
    extends StObject
       with typings.oojsUi.OO.ui.Layout {
    def this(config: typings.oojsUi.OO.ui.Layout.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
  }
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `FieldsetLayout.foo` */
  override def _to: js.Object & Constructor = ^
}
