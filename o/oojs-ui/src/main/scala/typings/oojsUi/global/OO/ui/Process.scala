package typings.oojsUi.global.OO.ui

import org.scalablytyped.runtime.Shortcut
import typings.oojsUi.OO.ui.Process.Constructor
import typings.oojsUi.OO.ui.Process.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Process extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("OO.ui.Process")
  @js.native
  open class ^[C] protected ()
    extends StObject
       with typings.oojsUi.OO.ui.Process {
    /**
      * @param step Number of milliseconds to wait before proceeding,
      * promise that must be resolved before proceeding, or a function to execute.
      * See {@link Process.first first} for more information.
      * @param context Execution context of the function. The context is ignored if the step
      * is a number or promise.
      */
    def this(step: Step[C]) = this()
    def this(step: Step[C], context: C) = this()
  }
  
  @JSGlobal("OO.ui.Process")
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `Process.foo` */
  override def _to: js.Object & Constructor = ^
}
