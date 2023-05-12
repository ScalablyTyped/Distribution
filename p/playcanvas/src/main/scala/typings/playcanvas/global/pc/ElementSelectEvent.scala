package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a XRInputSourceEvent fired on a {@link ElementComponent}.
  *
  * @augments ElementInputEvent
  */
@JSGlobal("pc.ElementSelectEvent")
@js.native
open class ElementSelectEvent protected ()
  extends typings.playcanvas.mod.ElementSelectEvent {
  /**
    * Create an instance of a ElementSelectEvent.
    *
    * @param {object} event - The XRInputSourceEvent that was originally raised.
    * @param {import('../components/element/component.js').ElementComponent} element - The
    * ElementComponent that this event was originally raised on.
    * @param {import('../components/camera/component.js').CameraComponent} camera - The
    * CameraComponent that this event was originally raised via.
    * @param {import('../xr/xr-input-source.js').XrInputSource} inputSource - The XR input source
    * that this event was originally raised from.
    */
  def this(
    event: js.Object,
    element: typings.playcanvas.mod.ElementComponent,
    camera: typings.playcanvas.mod.CameraComponent,
    inputSource: typings.playcanvas.mod.XrInputSource
  ) = this()
}
