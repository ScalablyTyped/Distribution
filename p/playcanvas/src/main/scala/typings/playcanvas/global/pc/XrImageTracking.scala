package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./xr-manager.js').XrManager} XrManager */
/**
  * Image Tracking provides the ability to track real world images by provided image samples and
  * their estimated sizes.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.XrImageTracking")
@js.native
open class XrImageTracking protected ()
  extends typings.playcanvas.mod.XrImageTracking {
  /**
    * Image Tracking provides the ability to track real world images by provided image samples and
    * their estimate sizes.
    *
    * @param {XrManager} manager - WebXR Manager.
    * @hideconstructor
    */
  def this(manager: typings.playcanvas.mod.XrManager) = this()
}
