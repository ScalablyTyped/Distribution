package typings.playcanvas.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./xr-manager.js').XrManager} XrManager */
/**
  * DOM Overlay provides the ability to use DOM elements as an overlay in a WebXR AR session. It
  * requires that the root DOM element is provided for session start. That way, input source select
  * events are first tested against DOM Elements and then propagated down to the XR Session. If this
  * propagation is not desirable, use the `beforexrselect` event on a DOM element and the
  * `preventDefault` function to stop propagation.
  *
  * ```javascript```
  * app.xr.domOverlay.root = element;
  * app.xr.start(camera, pc.XRTYPE_AR, pc.XRSPACE_LOCALFLOOR);
  * ```
  *
  * ```javascript
  * // Disable input source firing `select` event when some descendant element of DOM overlay root
  * // is touched/clicked. This is useful when the user interacts with UI elements and there should
  * // not be `select` events behind UI.
  * someElement.addEventListener('beforexrselect', function (evt) {
  *     evt.preventDefault();
  * });
  * ```
  */
@JSImport("playcanvas", "XrDomOverlay")
@js.native
open class XrDomOverlay protected () extends StObject {
  /**
    * DOM Overlay provides the ability to use DOM elements as an overlay in a WebXR AR session. It
    * requires that the root DOM element is provided for session start. That way, input source
    * select events are first tested against DOM Elements and then propagated down to the XR
    * Session. If this propagation is not desirable, use the `beforexrselect` event on a DOM
    * element and the `preventDefault` function to stop propagation.
    *
    * @param {XrManager} manager - WebXR Manager.
    * @hideconstructor
    */
  def this(manager: XrManager) = this()
  
  /**
    * @type {XrManager}
    * @private
    */
  /* private */ var _manager: Any = js.native
  
  /**
    * @type {Element|null}
    * @private
    */
  /* private */ var _root: Any = js.native
  
  /**
    * @type {boolean}
    * @private
    */
  /* private */ var _supported: Any = js.native
  
  /**
    * True if DOM Overlay is available. It can only be available if it is supported, during a
    * valid WebXR session and if a valid root element is provided.
    *
    * @type {boolean}
    */
  def available: Boolean = js.native
  
  def root: Element = js.native
  /**
    * The DOM element to be used as the root for DOM Overlay. Can be changed only outside of an
    * active WebXR session.
    *
    * @type {Element|null}
    * @example
    * app.xr.domOverlay.root = element;
    * app.xr.start(camera, pc.XRTYPE_AR, pc.XRSPACE_LOCALFLOOR);
    */
  def root_=(arg: Element): Unit = js.native
  
  /**
    * State of the DOM Overlay, which defines how the root DOM element is rendered. Possible
    * options:
    *
    * - screen: Screen - indicates that the DOM element is covering whole physical screen,
    * matching XR viewports.
    * - floating: Floating - indicates that the underlying platform renders the DOM element as
    * floating in space, which can move during the WebXR session or allow the application to move
    * the element.
    * - head-locked: Head Locked - indicates that the DOM element follows the user's head movement
    * consistently, appearing similar to a helmet heads-up display.
    *
    * @type {string|null}
    */
  def state: String = js.native
  
  /**
    * True if DOM Overlay is supported.
    *
    * @type {boolean}
    */
  def supported: Boolean = js.native
}
