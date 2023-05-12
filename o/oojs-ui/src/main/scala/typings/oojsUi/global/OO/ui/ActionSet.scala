package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.oojsUi.OO.ui.ActionSet.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionSet extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.ActionSet")
  @js.native
  /** @param config Configuration options */
  open class ^ ()
    extends StObject
       with typings.oojsUi.OO.ui.ActionSet {
    def this(config: js.Object) = this()
  }
  
  @JSGlobal("OO.ui.ActionSet")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `ActionSet.foo` */
  override def _to: js.Object & Constructor = ^
}
