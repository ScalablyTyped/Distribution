package typings.pixiDotJs.PIXINs.settingsNs

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default render options if none are supplied to {@link PIXI.WebGLRenderer}
  * or {@link PIXI.CanvasRenderer}.
  *
  * @static
  * @constant
  * @memberof PIXI.settings
  * @type {object}
  * @property {HTMLCanvasElement} view=null
  * @property {number} resolution=1
  * @property {boolean} antialias=false
  * @property {boolean} forceFXAA=false
  * @property {boolean} autoResize=false
  * @property {boolean} transparent=false
  * @property {number} backgroundColor=0x000000
  * @property {boolean} clearBeforeRender=true
  * @property {boolean} preserveDrawingBuffer=false
  * @property {boolean} roundPixels=false
  * @property {number} width=800
  * @property {number} height=600
  * @property {boolean} legacy=false
  */
@JSGlobal("PIXI.settings.RENDER_OPTIONS")
@js.native
object RENDER_OPTIONS extends js.Object {
  var antialias: Boolean = js.native
  var autoResize: Boolean = js.native
  var backgroundColor: Double = js.native
  var clearBeforeRender: Boolean = js.native
  var forceFXAA: Boolean = js.native
  var height: Double = js.native
  var legacy: Boolean = js.native
  var preserveDrawingBuffer: Boolean = js.native
  var roundPixels: Boolean = js.native
  var transparent: Boolean = js.native
  var view: HTMLCanvasElement | Null = js.native
  var width: Double = js.native
}

