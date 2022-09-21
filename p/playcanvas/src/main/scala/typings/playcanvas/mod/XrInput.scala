package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./xr-manager.js').XrManager} XrManager */
/**
  * Provides access to input sources for WebXR.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "XrInput")
@js.native
open class XrInput protected () extends EventHandler {
  /**
    * Create a new XrInput instance.
    *
    * @param {XrManager} manager - WebXR Manager.
    * @hideconstructor
    */
  def this(manager: XrManager) = this()
  
  /**
    * @param {XRInputSource} xrInputSource - Input source to add.
    * @private
    */
  /* private */ var _addInputSource: Any = js.native
  
  /**
    * @param {XRInputSource} xrInputSource - Input source to search for.
    * @returns {XrInputSource|null} The input source that matches the given WebXR input source or
    * null if no match is found.
    * @private
    */
  /* private */ var _getByInputSource: Any = js.native
  
  /**
    * @type {XrInputSource[]}
    * @private
    */
  /* private */ var _inputSources: Any = js.native
  
  /**
    * @param {XRInputSourcesChangeEvent} evt - WebXR input sources change event.
    * @private
    */
  /* private */ var _onInputSourcesChange: Any = js.native
  
  /**
    * @type {Function}
    * @private
    */
  /* private */ var _onInputSourcesChangeEvt: Any = js.native
  
  /** @private */
  /* private */ var _onSessionEnd: Any = js.native
  
  /**
    * Fired when new {@link XrInputSource} is added to the list.
    *
    * @event XrInput#add
    * @param {XrInputSource} inputSource - Input source that has been added.
    * @example
    * app.xr.input.on('add', function (inputSource) {
    *     // new input source is added
    * });
    */
  /**
    * Fired when {@link XrInputSource} is removed to the list.
    *
    * @event XrInput#remove
    * @param {XrInputSource} inputSource - Input source that has been removed.
    * @example
    * app.xr.input.on('remove', function (inputSource) {
    *     // input source is removed
    * });
    */
  /**
    * Fired when {@link XrInputSource} has triggered primary action. This could be pressing a
    * trigger button, or touching a screen.
    *
    * @event XrInput#select
    * @param {XrInputSource} inputSource - Input source that triggered select event.
    * @param {object} evt - XRInputSourceEvent event data from WebXR API.
    * @example
    * var ray = new pc.Ray();
    * app.xr.input.on('select', function (inputSource, evt) {
    *     ray.set(inputSource.getOrigin(), inputSource.getDirection());
    *     if (obj.intersectsRay(ray)) {
    *         // selected an object with input source
    *     }
    * });
    */
  /**
    * Fired when {@link XrInputSource} has started to trigger primary action.
    *
    * @event XrInput#selectstart
    * @param {XrInputSource} inputSource - Input source that triggered selectstart event.
    * @param {object} evt - XRInputSourceEvent event data from WebXR API.
    */
  /**
    * Fired when {@link XrInputSource} has ended triggerring primary action.
    *
    * @event XrInput#selectend
    * @param {XrInputSource} inputSource - Input source that triggered selectend event.
    * @param {object} evt - XRInputSourceEvent event data from WebXR API.
    */
  /**
    * Fired when {@link XrInputSource} has triggered squeeze action. This is associated with
    * "grabbing" action on the controllers.
    *
    * @event XrInput#squeeze
    * @param {XrInputSource} inputSource - Input source that triggered squeeze event.
    * @param {object} evt - XRInputSourceEvent event data from WebXR API.
    */
  /**
    * Fired when {@link XrInputSource} has started to trigger sqeeze action.
    *
    * @event XrInput#squeezestart
    * @param {XrInputSource} inputSource - Input source that triggered squeezestart event.
    * @param {object} evt - XRInputSourceEvent event data from WebXR API.
    * @example
    * app.xr.input.on('squeezestart', function (inputSource, evt) {
    *     if (obj.containsPoint(inputSource.getPosition())) {
    *         // grabbed an object
    *     }
    * });
    */
  /**
    * Fired when {@link XrInputSource} has ended triggerring sqeeze action.
    *
    * @event XrInput#squeezeend
    * @param {XrInputSource} inputSource - Input source that triggered squeezeend event.
    * @param {object} evt - XRInputSourceEvent event data from WebXR API.
    */
  /** @private */
  /* private */ var _onSessionStart: Any = js.native
  
  /**
    * @param {XRInputSource} xrInputSource - Input source to remove.
    * @private
    */
  /* private */ var _removeInputSource: Any = js.native
  
  /**
    * List of active {@link XrInputSource} instances.
    *
    * @type {XrInputSource[]}
    */
  def inputSources: js.Array[XrInputSource] = js.native
  
  /**
    * @type {XrManager}
    * @private
    */
  /* private */ var manager: Any = js.native
  
  /**
    * @param {*} frame - XRFrame from requestAnimationFrame callback.
    * @ignore
    */
  def update(frame: Any): Unit = js.native
}
