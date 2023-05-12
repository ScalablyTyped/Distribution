package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.PageLayout.ConfigOptions
import typings.oojsUi.OO.ui.PageLayout.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageLayout extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.PageLayout")
  @js.native
  open class ^ protected ()
    extends StObject
       with typings.oojsUi.OO.ui.PageLayout {
    /**
      * @param name Unique symbolic name of page
      * @param config Configuration options
      */
    def this(name: String) = this()
    def this(name: String, config: ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
  }
  
  @JSGlobal("OO.ui.PageLayout")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /** @deprecated Use `super` instead */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.PageLayout.parent")
  @js.native
  /** @param config Configuration options */
  open class parent ()
    extends StObject
       with typings.oojsUi.OO.ui.PanelLayout {
    def this(config: typings.oojsUi.OO.ui.PanelLayout.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.PageLayout.super")
  @js.native
  /** @param config Configuration options */
  open class `super` ()
    extends StObject
       with typings.oojsUi.OO.ui.PanelLayout {
    def this(config: typings.oojsUi.OO.ui.PanelLayout.ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
  }
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `PageLayout.foo` */
  override def _to: js.Object & Constructor = ^
}
