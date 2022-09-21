package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a XRInputSourceEvent fired on a {@link ElementComponent}.
  *
  * @augments ElementInputEvent
  */
@JSImport("playcanvas", "ElementSelectEvent")
@js.native
open class ElementSelectEvent protected () extends ElementInputEvent {
  /**
    * Create an instance of a ElementSelectEvent.
    *
    * @param {object} event - The XRInputSourceEvent that was originally raised.
    * @param {ElementComponent} element - The ElementComponent that this event was originally
    * raised on.
    * @param {CameraComponent} camera - The CameraComponent that this event was originally raised
    * via.
    * @param {XrInputSource} inputSource - The XR input source that this event was originally
    * raised from.
    */
  def this(event: js.Object, element: ElementComponent, camera: CameraComponent, inputSource: XrInputSource) = this()
  
  /**
    * The XR input source that this event was originally raised from.
    *
    * @type {XrInputSource}
    */
  var inputSource: XrInputSource = js.native
}
