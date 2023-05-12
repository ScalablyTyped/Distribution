package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.SearchWidget.ConfigOptions
import typings.oojsUi.OO.ui.SearchWidget.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchWidget extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.SearchWidget")
  @js.native
  /** @param config Configuration options */
  open class ^[T /* <: typings.oojsUi.OO.ui.InputWidget */] ()
    extends StObject
       with typings.oojsUi.OO.ui.SearchWidget[T] {
    def this(config: ConfigOptions[T]) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$query")
    var $query: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$results")
    var $results: JQuery[HTMLElement] = js.native
  }
  
  @JSGlobal("OO.ui.SearchWidget")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /** @deprecated Use `super` instead */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.SearchWidget.parent")
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
  @JSGlobal("OO.ui.SearchWidget.super")
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
  
  /* This means you don't have to write `^`, but can instead just say `SearchWidget.foo` */
  override def _to: js.Object & Constructor = ^
}
