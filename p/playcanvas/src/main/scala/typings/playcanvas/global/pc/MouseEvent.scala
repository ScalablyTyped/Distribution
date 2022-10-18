package typings.playcanvas.global.pc

import typings.playcanvas.mod.Mouse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MouseEvent object that is passed to events 'mousemove', 'mouseup', 'mousedown' and 'mousewheel'.
  */
@JSGlobal("pc.MouseEvent")
@js.native
open class MouseEvent protected ()
  extends typings.playcanvas.mod.MouseEvent {
  /**
    * Create a new MouseEvent instance.
    *
    * @param {Mouse} mouse - The Mouse device that is firing this event.
    * @param {globalThis.MouseEvent} event - The original browser event that fired.
    */
  def this(
    mouse: Mouse,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.MouseEvent */ Any
  ) = this()
}
