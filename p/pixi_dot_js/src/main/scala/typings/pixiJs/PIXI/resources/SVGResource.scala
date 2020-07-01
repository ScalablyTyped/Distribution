package typings.pixiJs.PIXI.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource type for SVG elements and graphics.
  * @class
  * @extends PIXI.resources.BaseImageResource
  * @memberof PIXI.resources
  * @param {string} source - Base64 encoded SVG element or URL for SVG file.
  * @param {object} [options] - Options to use
  * @param {number} [options.scale=1] - Scale to apply to SVG. Overridden by...
  * @param {number} [options.width] - Rasterize SVG this wide. Aspect ratio preserved if height not specified.
  * @param {number} [options.height] - Rasterize SVG this high. Aspect ratio preserved if width not specified.
  * @param {boolean} [options.autoLoad=true] - Start loading right away.
  */
@js.native
trait SVGResource extends BaseImageResource {
  /**
    * A height override for rasterization on load
    * @readonly
    * @member {number} PIXI.resources.SVGResource#_overrideHeight
    */
  val _overrideHeight: Double = js.native
  /**
    * A width override for rasterization on load
    * @readonly
    * @member {number} PIXI.resources.SVGResource#_overrideWidth
    */
  val _overrideWidth: Double = js.native
  /**
    * The source scale to apply when rasterizing on load
    * @readonly
    * @member {number} PIXI.resources.SVGResource#scale
    */
  val scale: Double = js.native
  /**
    * Base64 encoded SVG element or URL for SVG file
    * @readonly
    * @member {string} PIXI.resources.SVGResource#svg
    */
  val svg: String = js.native
}

