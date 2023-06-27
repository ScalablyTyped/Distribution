package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents XR hit test source, which provides access to hit results of real world geometry from
  * AR session.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "XrHitTestSource")
@js.native
open class XrHitTestSource protected () extends EventHandler {
  /**
    * Create a new XrHitTestSource instance.
    *
    * @param {import('./xr-manager.js').XrManager} manager - WebXR Manager.
    * @param {*} xrHitTestSource - XRHitTestSource object that is created by WebXR API.
    * @param {boolean} transient - True if XRHitTestSource created for input source profile.
    * @hideconstructor
    */
  def this(manager: XrManager, xrHitTestSource: Any, transient: Boolean) = this()
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _transient: Any = js.native
  
  /**
    * @type {XRHitTestSource}
    * @private
    */
  /* private */ var _xrHitTestSource: Any = js.native
  
  /**
    * @type {import('./xr-manager.js').XrManager}
    * @private
    */
  /* private */ var manager: Any = js.native
  
  /** @ignore */
  def onStop(): Unit = js.native
  
  /**
    * Fired when {@link XrHitTestSource} is removed.
    *
    * @event XrHitTestSource#remove
    * @example
    * hitTestSource.once('remove', function () {
    *     // hit test source has been removed
    * });
    */
  /**
    * Fired when hit test source receives new results. It provides transform information that
    * tries to match real world picked geometry.
    *
    * @event XrHitTestSource#result
    * @param {Vec3} position - Position of hit test.
    * @param {Quat} rotation - Rotation of hit test.
    * @param {import('./xr-input-source.js').XrInputSource|null} inputSource - If is transient hit
    * test source, then it will provide related input source.
    * @example
    * hitTestSource.on('result', function (position, rotation, inputSource) {
    *     target.setPosition(position);
    *     target.setRotation(rotation);
    * });
    */
  /**
    * Stop and remove hit test source.
    */
  def remove(): Unit = js.native
  
  /**
    * @param {*} frame - XRFrame from requestAnimationFrame callback.
    * @ignore
    */
  def update(frame: Any): Unit = js.native
  
  /**
    * @param {XRTransientInputHitTestResult[]} results - Hit test results.
    * @param {XRHitTestSource} inputSource - Input source.
    * @private
    */
  /* private */ var updateHitResults: Any = js.native
}
