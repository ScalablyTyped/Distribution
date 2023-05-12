package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DOM Overlay provides the ability to use DOM elements as an overlay in a WebXR AR session. It
  * requires that the root DOM element is provided for session start. That way, input source select
  * events are first tested against DOM Elements and then propagated down to the XR Session. If this
  * propagation is not desirable, use the `beforexrselect` event on a DOM element and the
  * `preventDefault` function to stop propagation.
  *
  * ```javascript
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
@JSGlobal("pc.XrDomOverlay")
@js.native
open class XrDomOverlay protected ()
  extends typings.playcanvas.mod.XrDomOverlay {
  /**
    * DOM Overlay provides the ability to use DOM elements as an overlay in a WebXR AR session. It
    * requires that the root DOM element is provided for session start. That way, input source
    * select events are first tested against DOM Elements and then propagated down to the XR
    * Session. If this propagation is not desirable, use the `beforexrselect` event on a DOM
    * element and the `preventDefault` function to stop propagation.
    *
    * @param {import('./xr-manager.js').XrManager} manager - WebXR Manager.
    * @hideconstructor
    */
  def this(manager: typings.playcanvas.mod.XrManager) = this()
}
