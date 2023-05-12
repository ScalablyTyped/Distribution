package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.IndexLayout.ConfigOptions
import typings.oojsUi.OO.ui.IndexLayout.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IndexLayout extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.IndexLayout")
  @js.native
  /** @param config Configuration options */
  open class ^ ()
    extends StObject
       with typings.oojsUi.OO.ui.IndexLayout {
    def this(config: ConfigOptions) = this()
    
    /** Content DOM node */
    /* CompleteClass */
    @JSName("$content")
    var $content: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /** Menu DOM node */
    /* CompleteClass */
    @JSName("$menu")
    var $menu: JQuery[HTMLElement] = js.native
  }
  
  @JSGlobal("OO.ui.IndexLayout")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  /** @deprecated Use `super` instead */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.IndexLayout.parent")
  @js.native
  /** @param config Configuration options */
  open class parent ()
    extends StObject
       with typings.oojsUi.OO.ui.MenuLayout {
    def this(config: typings.oojsUi.OO.ui.MenuLayout.ConfigOptions) = this()
    
    /** Content DOM node */
    /* CompleteClass */
    @JSName("$content")
    var $content: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /** Menu DOM node */
    /* CompleteClass */
    @JSName("$menu")
    var $menu: JQuery[HTMLElement] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.IndexLayout.super")
  @js.native
  /** @param config Configuration options */
  open class `super` ()
    extends StObject
       with typings.oojsUi.OO.ui.MenuLayout {
    def this(config: typings.oojsUi.OO.ui.MenuLayout.ConfigOptions) = this()
    
    /** Content DOM node */
    /* CompleteClass */
    @JSName("$content")
    var $content: JQuery[HTMLElement] = js.native
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
    
    /** Menu DOM node */
    /* CompleteClass */
    @JSName("$menu")
    var $menu: JQuery[HTMLElement] = js.native
  }
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `IndexLayout.foo` */
  override def _to: js.Object & Constructor = ^
}
