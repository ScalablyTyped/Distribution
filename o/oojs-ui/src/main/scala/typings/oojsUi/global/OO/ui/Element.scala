package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.jquery.JQuery
import typings.oojsUi.OO.ui.Element.ConfigOptions
import typings.oojsUi.OO.ui.Element.Constructor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Element extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.Element")
  @js.native
  /** @param config Configuration options */
  open class ^ ()
    extends StObject
       with typings.oojsUi.OO.ui.Element {
    def this(config: ConfigOptions) = this()
    
    /* CompleteClass */
    @JSName("$element")
    var $element: JQuery[HTMLElement] = js.native
  }
  
  @JSGlobal("OO.ui.Element")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `Element.foo` */
  override def _to: js.Object & Constructor = ^
}
