package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.XrInputSource
  * @augments pc.EventHandler
  * @classdesc Represents an XR input source, which is any input mechanism which allows the user to perform targeted actions in the same virtual space as the viewer. Example XR input sources include, but are not limited to, handheld controllers, optically tracked hands, and gaze-based input methods that operate on the viewer's pose.
  * @description Represents an XR input source, which is any input mechanism which allows the user to perform targeted actions in the same virtual space as the viewer. Example XR input sources include, but are not limited to, handheld controllers, optically tracked hands, and gaze-based input methods that operate on the viewer's pose.
  * @param {pc.XrManager} manager - WebXR Manager.
  * @param {object} xrInputSource - XRInputSource object that is created by WebXR API.
  * @property {object} inputSource XRInputSource object that is associated with this input source.
  * @property {string} targetRayMode Type of ray Input Device is based on. Can be one of the following:
  *
  * * {@link pc.XRTARGETRAY_GAZE}: Gaze - indicates the target ray will originate at the viewer and follow the direction it is facing. (This is commonly referred to as a "gaze input" device in the context of head-mounted displays.)
  * * {@link pc.XRTARGETRAY_SCREEN}: Screen - indicates that the input source was an interaction with the canvas element associated with an inline session’s output context, such as a mouse click or touch event.
  * * {@link pc.XRTARGETRAY_POINTER}: Tracked Pointer - indicates that the target ray originates from either a handheld device or other hand-tracking mechanism and represents that the user is using their hands or the held device for pointing.
  *
  * @property {string} handedness Describes which hand input source is associated with. Can be one of the following:
  *
  * * {@link pc.XRHAND_NONE}: None - input source is not meant to be held in hands.
  * * {@link pc.XRHAND_LEFT}: Left - indicates that input source is meant to be held in left hand.
  * * {@link pc.XRHAND_RIGHT}: Right - indicates that input source is meant to be held in right hand.
  *
  * @property {string[]} profiles List of input profile names indicating both the prefered visual representation and behavior of the input source.
  * @property {pc.Ray} ray Ray that is calculated based on {pc.XrInputSource#targetRayMode} that can be used for interacting with virtual objects. Its origin and direction are in local space of XR session.
  * @property {boolean} grip If input source can be held, then it will have node with its world transformation, that can be used to position and rotate virtual joystics based on it.
  * @property {pc.Vec3|null} position If {pc.XrInputSource#grip} is true, then position will represent position of handheld input source in local space of XR session.
  * @property {pc.Quat|null} rotation If {pc.XrInputSource#grip} is true, then rotation will represent rotation of handheld input source in local space of XR session.
  * @property {Gamepad|null} gamepad If input source has buttons, triggers, thumbstick or touchpad, then this object provides access to its states.
  * @property {boolean} selecting True if input source is in active primary action between selectstart and selectend events.
  */
@JSImport("playcanvas", "XrInputSource")
@js.native
class XrInputSource protected ()
  extends typings.playcanvas.pc.XrInputSource {
  def this(manager: typings.playcanvas.pc.XrManager, xrInputSource: js.Any) = this()
}

