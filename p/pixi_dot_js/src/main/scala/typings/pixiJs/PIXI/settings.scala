package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User's customizable globals for overriding the default PIXI settings, such
  * as a renderer's default resolution, framerate, float precision, etc.
  * @example
  * // Use the native window resolution as the default resolution
  * // will support high-density displays when rendering
  * PIXI.settings.RESOLUTION = window.devicePixelRatio;
  *
  * // Disable interpolation when scaling, will make texture be pixelated
  * PIXI.settings.SCALE_MODE = PIXI.SCALE_MODES.NEAREST;
  * @namespace PIXI.settings
  */
@JSGlobal("PIXI.settings")
@js.native
object settings extends js.Object

