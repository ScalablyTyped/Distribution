package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create an instance of a pc.ElementSelectEvent.
  * @property inputSource - The XR input source that this event was originally raised from.
  * @param event - The XRInputSourceEvent that was originally raised.
  * @param element - The ElementComponent that this event was originally raised on.
  * @param camera - The CameraComponent that this event was originally raised via.
  * @param inputSource - The XR input source that this event was originally raised from.
  */
@JSGlobal("pc.ElementSelectEvent")
@js.native
class ElementSelectEvent protected ()
  extends StObject
     with typings.playcanvas.pc.ElementSelectEvent {
  def this(
    event: js.Any,
    element: typings.playcanvas.pc.ElementComponent,
    camera: typings.playcanvas.pc.CameraComponent,
    inputSource: typings.playcanvas.pc.XrInputSource
  ) = this()
  
  /**
    * The CameraComponent that this event was originally raised via.
    */
  /* CompleteClass */
  var camera: typings.playcanvas.pc.CameraComponent = js.native
  
  /**
    * The ElementComponent that this event was originally raised on.
    */
  /* CompleteClass */
  var element: typings.playcanvas.pc.ElementComponent = js.native
  
  /**
    * The MouseEvent or TouchEvent that was originally raised.
    */
  /* CompleteClass */
  var event: typings.playcanvas.pc.MouseEvent | typings.playcanvas.pc.TouchEvent = js.native
  
  /**
    * The XR input source that this event was originally raised from.
    */
  /* CompleteClass */
  var inputSource: typings.playcanvas.pc.XrInputSource = js.native
  
  /**
    * Stop propagation of the event to parent {@link pc.ElementComponent}s. This also stops propagation of the event to other event listeners of the original DOM Event.
    */
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}
