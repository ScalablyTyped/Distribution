package typings.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Regexp for data URI.
  * Based on: {@link https://github.com/ragingwind/data-uri-regex}
  *
  * @static
  * @constant {RegExp|string} DATA_URI
  * @memberof PIXI
  * @example data:image/png;base64
  */
@scala.inline
def DATA_URI: typings.std.RegExp | java.lang.String = typings.pixiJs.global.PIXI.^.asInstanceOf[js.Dynamic].selectDynamic("DATA_URI").asInstanceOf[typings.std.RegExp | java.lang.String]
@scala.inline
def DATA_URI_=(x: typings.std.RegExp | java.lang.String): scala.Unit = typings.pixiJs.global.PIXI.^.asInstanceOf[js.Dynamic].updateDynamic("DATA_URI")(x.asInstanceOf[js.Any])

/**
  * Conversion factor for converting degrees to radians.
  *
  * @static
  * @constant {number} DEG_TO_RAD
  * @memberof PIXI
  */
@scala.inline
def DEG_TO_RAD: scala.Double = typings.pixiJs.global.PIXI.^.asInstanceOf[js.Dynamic].selectDynamic("DEG_TO_RAD").asInstanceOf[scala.Double]
@scala.inline
def DEG_TO_RAD_=(x: scala.Double): scala.Unit = typings.pixiJs.global.PIXI.^.asInstanceOf[js.Dynamic].updateDynamic("DEG_TO_RAD")(x.asInstanceOf[js.Any])

/**
  * Two Pi.
  *
  * @static
  * @constant {number} PI_2
  * @memberof PIXI
  */
@scala.inline
def PI_2: scala.Double = typings.pixiJs.global.PIXI.^.asInstanceOf[js.Dynamic].selectDynamic("PI_2").asInstanceOf[scala.Double]
@scala.inline
def PI_2_=(x: scala.Double): scala.Unit = typings.pixiJs.global.PIXI.^.asInstanceOf[js.Dynamic].updateDynamic("PI_2")(x.asInstanceOf[js.Any])

/**
  * Conversion factor for converting radians to degrees.
  *
  * @static
  * @constant {number} RAD_TO_DEG
  * @memberof PIXI
  */
@scala.inline
def RAD_TO_DEG: scala.Double = typings.pixiJs.global.PIXI.^.asInstanceOf[js.Dynamic].selectDynamic("RAD_TO_DEG").asInstanceOf[scala.Double]
@scala.inline
def RAD_TO_DEG_=(x: scala.Double): scala.Unit = typings.pixiJs.global.PIXI.^.asInstanceOf[js.Dynamic].updateDynamic("RAD_TO_DEG")(x.asInstanceOf[js.Any])

/**
  * String of the current PIXI version.
  *
  * @static
  * @constant
  * @memberof PIXI
  * @name VERSION
  * @type {string}
  */
@scala.inline
def VERSION: java.lang.String = typings.pixiJs.global.PIXI.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[java.lang.String]
@scala.inline
def VERSION_=(x: java.lang.String): scala.Unit = typings.pixiJs.global.PIXI.^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])

/**
  * This helper function will automatically detect which renderer you should be using.
  * WebGL is the preferred renderer as it is a lot faster. If WebGL is not supported by
  * the browser then this function will return a canvas renderer
  *
  * @memberof PIXI
  * @function autoDetectRenderer
  * @param {object} [options] - The optional renderer parameters
  * @param {number} [options.width=800] - the width of the renderers view
  * @param {number} [options.height=600] - the height of the renderers view
  * @param {HTMLCanvasElement} [options.view] - the canvas to use as a view, optional
  * @param {boolean} [options.transparent=false] - If the render view is transparent, default false
  * @param {boolean} [options.autoDensity=false] - Resizes renderer view in CSS pixels to allow for
  *   resolutions other than 1
  * @param {boolean} [options.antialias=false] - sets antialias
  * @param {boolean} [options.preserveDrawingBuffer=false] - enables drawing buffer preservation, enable this if you
  *  need to call toDataUrl on the webgl context
  * @param {number} [options.backgroundColor=0x000000] - The background color of the rendered area
  *  (shown if not transparent).
  * @param {boolean} [options.clearBeforeRender=true] - This sets if the renderer will clear the canvas or
  *   not before the new render pass.
  * @param {number} [options.resolution=1] - The resolution / device pixel ratio of the renderer, retina would be 2
  * @param {boolean} [options.forceCanvas=false] - prevents selection of WebGL renderer, even if such is present, this
  *   option only is available when using **pixi.js-legacy** or **@pixi/canvas-renderer** modules, otherwise
  *   it is ignored.
  * @param {string} [options.powerPreference] - Parameter passed to webgl context, set to "high-performance"
  *  for devices with dual graphics card **webgl only**
  * @return {PIXI.Renderer|PIXI.CanvasRenderer} Returns WebGL renderer if available, otherwise CanvasRenderer
  */
@scala.inline
def autoDetectRenderer(): typings.pixiJs.PIXI.Renderer = typings.pixiJs.global.PIXI.^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectRenderer")().asInstanceOf[typings.pixiJs.PIXI.Renderer]
@scala.inline
def autoDetectRenderer(options: typings.pixiJs.anon.ClearBeforeRender): typings.pixiJs.PIXI.Renderer = typings.pixiJs.global.PIXI.^.asInstanceOf[js.Dynamic].applyDynamic("autoDetectRenderer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.pixiJs.PIXI.Renderer]

/**
  * Default filter vertex shader
  * @memberof PIXI
  * @member {string} defaultFilterVertex
  */
@scala.inline
def defaultFilterVertex: java.lang.String = typings.pixiJs.global.PIXI.^.asInstanceOf[js.Dynamic].selectDynamic("defaultFilterVertex").asInstanceOf[java.lang.String]
@scala.inline
def defaultFilterVertex_=(x: java.lang.String): scala.Unit = typings.pixiJs.global.PIXI.^.asInstanceOf[js.Dynamic].updateDynamic("defaultFilterVertex")(x.asInstanceOf[js.Any])

/**
  * Default vertex shader
  * @memberof PIXI
  * @member {string} defaultVertex
  */
@scala.inline
def defaultVertex: java.lang.String = typings.pixiJs.global.PIXI.^.asInstanceOf[js.Dynamic].selectDynamic("defaultVertex").asInstanceOf[java.lang.String]
@scala.inline
def defaultVertex_=(x: java.lang.String): scala.Unit = typings.pixiJs.global.PIXI.^.asInstanceOf[js.Dynamic].updateDynamic("defaultVertex")(x.asInstanceOf[js.Any])
