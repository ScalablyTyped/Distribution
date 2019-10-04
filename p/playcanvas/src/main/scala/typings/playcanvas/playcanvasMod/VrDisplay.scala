package typings.playcanvas.playcanvasMod

import typings.std.VRDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.VrDisplay
  * @extends pc.EventHandler
  * @classdesc Represents a single Display for VR content. This could be a Head Mounted display that can present content on a separate screen
  * or a phone which can display content full screen on the same screen. This object contains the native `navigator.VRDisplay` object
  * from the WebVR API.
  * @description Represents a single Display for VR content. This could be a Head Mounted display that can present content on a separate screen
  * or a phone which can display content full screen on the same screen. This object contains the native `navigator.VRDisplay` object
  * from the WebVR API.
  * @param {pc.Application} app The application outputting to this VR display.
  * @param {VRDisplay} display The native VRDisplay object from the WebVR API.
  * @property {Number} id An identifier for this distinct VRDisplay
  * @property {VRDisplay} display The native VRDisplay object from the WebVR API
  * @property {Boolean} presenting True if this display is currently presenting VR content
  * @property {VRDisplayCapabilities} capabilities Returns the <a href="https://w3c.github.io/webvr/#interface-vrdisplaycapabilities" target="_blank">VRDisplayCapabilities</a> object from the VRDisplay.
  * This can be used to determine what features are available on this display.
  */
@JSImport("playcanvas", "VrDisplay")
@js.native
class VrDisplay protected ()
  extends typings.playcanvas.pcNs.VrDisplay {
  def this(app: typings.playcanvas.pcNs.Application, display: VRDisplay) = this()
}

