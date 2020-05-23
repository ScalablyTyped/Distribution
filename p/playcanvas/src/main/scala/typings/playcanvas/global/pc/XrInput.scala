package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides access to input sources for WebXR.
  * @property inputSources - List of active {@link pc.XrInputSource}.
  * @param manager - WebXR Manager.
  */
@JSGlobal("pc.XrInput")
@js.native
class XrInput protected ()
  extends typings.playcanvas.pc.XrInput {
  def this(manager: typings.playcanvas.pc.XrManager) = this()
}

