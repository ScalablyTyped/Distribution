package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.FormLayout.ConfigOptions
import typings.oojsUi.OO.ui.FormLayout.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormLayout extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.FormLayout")
  @js.native
  /** @param config Configuration options */
  open class ^ ()
    extends StObject
       with typings.oojsUi.OO.ui.FormLayout {
    def this(config: ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$group")
    var $group: JQuery[HTMLElement] = js.native
  }
  
  @JSGlobal("OO.ui.FormLayout")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /** @deprecated Use `super` instead */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.FormLayout.parent")
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
  @JSGlobal("OO.ui.FormLayout.super")
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
  
  /* This means you don't have to write `^`, but can instead just say `FormLayout.foo` */
  override def _to: js.Object & Constructor = ^
}
