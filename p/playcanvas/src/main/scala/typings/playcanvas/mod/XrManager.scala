package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manage and update XR session and its states.
  * @property supported - True if XR is supported.
  * @property active - True if XR session is running.
  * @property type - Returns type of currently running XR session or null if no session is running. Can be
  * any of pc.XRTYPE_*.
  * @property spaceType - Returns reference space type of currently running XR session or null if no session
  * is running. Can be any of pc.XRSPACE_*.
  * @property camera - Active camera for which XR session is running or null.
  * @property input - provides access to Input Sources.
  * @property hitTest - provides ability to hit test representation of real world geometry of underlying AR system.
  * @property session - provides access to [XRSession](https://developer.mozilla.org/en-US/docs/Web/API/XRSession) of WebXR
  * @param app - The main application.
  */
@JSImport("playcanvas", "XrManager")
@js.native
class XrManager protected ()
  extends StObject
     with typings.playcanvas.pc.XrManager {
  def this(app: typings.playcanvas.pc.Application) = this()
}
