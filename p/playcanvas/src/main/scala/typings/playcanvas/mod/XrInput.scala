package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to input sources for WebXR.
  * @property inputSources - List of active {@link pc.XrInputSource}.
  * @param manager - WebXR Manager.
  */
@JSImport("playcanvas", "XrInput")
@js.native
class XrInput protected ()
  extends typings.playcanvas.pc.XrInput {
  def this(manager: typings.playcanvas.pc.XrManager) = this()
}
