package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playcanvas", "AppOptions")
@js.native
open class AppOptions () extends StObject {
  
  /**
    * Prefix to apply to asset urls before loading.
    *
    * @type {string}
    */
  var assetPrefix: String = js.native
  
  /**
    * The BatchManager.
    *
    * @type {import('../scene/batching/batch-manager.js').BatchManager}
    */
  var batchManager: BatchManager = js.native
  
  /**
    * The component systems the app requires.
    *
    * @type {import('./components/system.js').ComponentSystem[]}
    */
  var componentSystems: js.Array[ComponentSystem] = js.native
  
  /**
    * Input handler for {@link ElementComponent}s.
    *
    * @type {import('./input/element-input.js').ElementInput}
    */
  var elementInput: ElementInput = js.native
  
  /**
    * Gamepad handler for input.
    *
    * @type {import('../platform/input/game-pads.js').GamePads}
    */
  var gamepads: GamePads = js.native
  
  /**
    * The graphics device.
    *
    * @type {import('../platform/graphics/graphics-device.js').GraphicsDevice}
    */
  var graphicsDevice: GraphicsDevice = js.native
  
  /**
    * Keyboard handler for input.
    *
    * @type {import('../platform/input/keyboard.js').Keyboard}
    */
  var keyboard: Keyboard = js.native
  
  /**
    * The lightmapper.
    *
    * @type {import('./lightmapper/lightmapper.js').Lightmapper}
    */
  var lightmapper: Lightmapper = js.native
  
  /**
    * Mouse handler for input.
    *
    * @type {import('../platform/input/mouse.js').Mouse}
    */
  var mouse: Mouse = js.native
  
  /**
    * The resource handlers the app requires.
    *
    * @type {import('./handlers/handler.js').ResourceHandler[]}
    */
  var resourceHandlers: js.Array[ResourceHandler] = js.native
  
  /**
    * Prefix to apply to script urls before loading.
    *
    * @type {string}
    */
  var scriptPrefix: String = js.native
  
  /**
    * Scripts in order of loading first.
    *
    * @type {string[]}
    */
  var scriptsOrder: js.Array[String] = js.native
  
  /**
    * The sound manager
    *
    * @type {import('../platform/sound/manager.js').SoundManager}
    */
  var soundManager: SoundManager = js.native
  
  /**
    * TouchDevice handler for input.
    *
    * @type {import('../platform/input/touch-device.js').TouchDevice}
    */
  var touch: TouchDevice = js.native
  
  /**
    * The XrManager.
    *
    * @type {import('./xr/xr-manager.js').XrManager}
    */
  var xr: XrManager = js.native
}
