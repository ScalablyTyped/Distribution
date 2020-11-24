package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents XR input source, which is any input mechanism which allows the user to perform targeted actions in the same virtual space as the viewer. Example XR input sources include, but are not limited to, handheld controllers, optically tracked hands, and gaze-based input methods that operate on the viewer's pose.
  * @property id - Unique number associated with instance of input source. Same physical devices when reconnected will not share this ID.
  * @property inputSource - XRInputSource object that is associated with this input source.
  * @property targetRayMode - Type of ray Input Device is based on. Can be one of the following:
  *
  * * {@link pc.XRTARGETRAY_GAZE}: Gaze - indicates the target ray will originate at the viewer and follow the direction it is facing. (This is commonly referred to as a "gaze input" device in the context of head-mounted displays.)
  * * {@link pc.XRTARGETRAY_SCREEN}: Screen - indicates that the input source was an interaction with the canvas element associated with an inline session’s output context, such as a mouse click or touch event.
  * * {@link pc.XRTARGETRAY_POINTER}: Tracked Pointer - indicates that the target ray originates from either a handheld device or other hand-tracking mechanism and represents that the user is using their hands or the held device for pointing.
  * @property handedness - Describes which hand input source is associated with. Can be one of the following:
  *
  * * {@link pc.XRHAND_NONE}: None - input source is not meant to be held in hands.
  * * {@link pc.XRHAND_LEFT}: Left - indicates that input source is meant to be held in left hand.
  * * {@link pc.XRHAND_RIGHT}: Right - indicates that input source is meant to be held in right hand.
  * @property profiles - List of input profile names indicating both the prefered visual representation and behavior of the input source.
  * @property grip - If input source can be held, then it will have node with its world transformation, that can be used to position and rotate virtual joystics based on it.
  * @property hand - If input source is a tracked hand, then it will point to {@link pc.XrHand} otherwise it is null.
  * @property gamepad - If input source has buttons, triggers, thumbstick or touchpad, then this object provides access to its states.
  * @property selecting - True if input source is in active primary action between selectstart and selectend events.
  * @property elementInput - Set to true to allow input source to interact with Element components. Defaults to true.
  * @property elementEntity - If {@link pc.XrInputSource#elementInput} is true, this property will hold entity with Element component at which this input source is hovering, or null if not hovering over any element.
  * @property hitTestSources - list of active {@link pc.XrHitTestSource} created by this input source.
  * @param manager - WebXR Manager.
  * @param xrInputSource - [XRInputSource]{@link https://developer.mozilla.org/en-US/docs/Web/API/XRInputSource} object that is created by WebXR API.
  */
@JSImport("playcanvas", "XrInputSource")
@js.native
class XrInputSource protected ()
  extends typings.playcanvas.pc.XrInputSource {
  def this(manager: typings.playcanvas.pc.XrManager, xrInputSource: js.Any) = this()
}
