package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../resources/handler.js').ResourceHandler} ResourceHandler */
/** @typedef {import('../graphics/graphics-device.js').GraphicsDevice} GraphicsDevice */
/** @typedef {import('../input/element-input.js').ElementInput} ElementInput */
/** @typedef {import('../input/game-pads.js').GamePads} GamePads */
/** @typedef {import('../input/keyboard.js').Keyboard} Keyboard */
/** @typedef {import('../input/mouse.js').Mouse} Mouse */
/** @typedef {import('../input/touch-device.js').TouchDevice} TouchDevice */
/** @typedef {import('../sound/manager.js').SoundManager} SoundManager */
/** @typedef {import('../scene/lightmapper/lightmapper.js').Lightmapper} Lightmapper */
/** @typedef {import('../scene/batching/batch-manager.js').BatchManager} BatchManager */
/** @typedef {import('./components/system.js').ComponentSystem} ComponentSystem */
/** @typedef {import('../xr/xr-manager.js').XrManager} XrManager */
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
    * @type {BatchManager}
    */
  var batchManager: BatchManager = js.native
  
  /**
    * The component systems the app requires.
    *
    * @type {ComponentSystem[]}
    */
  var componentSystems: js.Array[ComponentSystem] = js.native
  
  /**
    * Input handler for {@link ElementComponent}s.
    *
    * @type {ElementInput}
    */
  var elementInput: ElementInput = js.native
  
  /**
    * Gamepad handler for input.
    *
    * @type {GamePads}
    */
  var gamepads: GamePads = js.native
  
  /**
    * The graphics device.
    *
    * @type {GraphicsDevice}
    */
  var graphicsDevice: GraphicsDevice = js.native
  
  /**
    * Keyboard handler for input.
    *
    * @type {Keyboard}
    */
  var keyboard: Keyboard = js.native
  
  /**
    * The lightmapper.
    *
    * @type {Lightmapper}
    */
  var lightmapper: Lightmapper = js.native
  
  /**
    * Mouse handler for input.
    *
    * @type {Mouse}
    */
  var mouse: Mouse = js.native
  
  /**
    * The resource handlers the app requires.
    *
    * @type {ResourceHandler[]}
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
    * @type {SoundManager}
    */
  var soundManager: SoundManager = js.native
  
  /**
    * TouchDevice handler for input.
    *
    * @type {TouchDevice}
    */
  var touch: TouchDevice = js.native
  
  /**
    * The XrManager.
    *
    * @type {XrManager}
    */
  var xr: XrManager = js.native
}
