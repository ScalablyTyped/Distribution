package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Event corresponding to touchstart, touchend, touchmove or touchcancel. TouchEvent wraps the
  * standard browser event and provides lists of {@link Touch} objects.
  */
@JSGlobal("pc.TouchEvent")
@js.native
open class TouchEvent protected ()
  extends typings.playcanvas.mod.TouchEvent {
  /**
    * Create a new TouchEvent instance. It is created from an existing browser event.
    *
    * @param {import('./touch-device.js').TouchDevice} device - The source device of the touch
    * events.
    * @param {globalThis.TouchEvent} event - The original browser TouchEvent.
    */
  def this(
    device: typings.playcanvas.mod.TouchDevice,
    event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.TouchEvent */ Any
  ) = this()
}
