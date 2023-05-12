package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents XR input source, which is any input mechanism which allows the user to perform
  * targeted actions in the same virtual space as the viewer. Example XR input sources include, but
  * are not limited to, handheld controllers, optically tracked hands, and gaze-based input methods
  * that operate on the viewer's pose.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.XrInputSource")
@js.native
open class XrInputSource protected ()
  extends typings.playcanvas.mod.XrInputSource {
  /**
    * Create a new XrInputSource instance.
    *
    * @param {import('./xr-manager.js').XrManager} manager - WebXR Manager.
    * @param {*} xrInputSource - [XRInputSource](https://developer.mozilla.org/en-US/docs/Web/API/XRInputSource)
    * object that is created by WebXR API.
    * @hideconstructor
    */
  def this(manager: typings.playcanvas.mod.XrManager, xrInputSource: Any) = this()
}
