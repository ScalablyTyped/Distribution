package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to input sources for WebXR.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.XrInput")
@js.native
open class XrInput protected ()
  extends typings.playcanvas.mod.XrInput {
  /**
    * Create a new XrInput instance.
    *
    * @param {import('./xr-manager.js').XrManager} manager - WebXR Manager.
    * @hideconstructor
    */
  def this(manager: typings.playcanvas.mod.XrManager) = this()
}
