package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./xr-manager.js').XrManager} XrManager */
/** @typedef {import('../shape/ray.js').Ray} Ray */
/**
  * Callback used by {@link XrHitTest#start} and {@link XrHitTest#startForInputSource}.
  *
  * @callback XrHitTestStartCallback
  * @param {Error|null} err - The Error object if failed to create hit test source or null.
  * @param {XrHitTestSource|null} hitTestSource - Object that provides access to hit results against
  * real world geometry.
  */
/**
  * Hit Test provides ability to get position and rotation of ray intersecting point with
  * representation of real world geometry by underlying AR system.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.XrHitTest")
@js.native
open class XrHitTest protected ()
  extends typings.playcanvas.mod.XrHitTest {
  /**
    * Create a new XrHitTest instance.
    *
    * @param {XrManager} manager - WebXR Manager.
    * @hideconstructor
    */
  def this(manager: typings.playcanvas.mod.XrManager) = this()
}
