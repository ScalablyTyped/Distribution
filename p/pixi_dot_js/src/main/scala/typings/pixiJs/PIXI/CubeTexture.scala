package typings.pixiJs.PIXI

import typings.pixiJs.PIXI.resources.Resource
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Texture that depends on six other resources.
  *
  * @class
  * @extends PIXI.BaseTexture
  * @memberof PIXI
  */
@JSGlobal("PIXI.CubeTexture")
@js.native
class CubeTexture () extends BaseTexture

/* static members */
@JSGlobal("PIXI.CubeTexture")
@js.native
object CubeTexture extends js.Object {
  def from(resources: String): BaseTexture = js.native
  def from(resources: String, options: js.Any): BaseTexture = js.native
  /**
    * Generate a new CubeTexture.
    * @static
    * @param {string[]|PIXI.resources.Resource[]} resources - Collection of 6 URLs or resources
    * @param {object} [options] - Optional options passed to the resources being loaded.
    *        See {@PIXI.resources.autoDetectResource autoDetectResource} for more info
    *        on the options available to each resource.
    * @returns {PIXI.CubeTexture} new cube texture
    */
  def from(resources: js.Array[Resource | String]): CubeTexture = js.native
  def from(resources: js.Array[Resource | String], options: js.Any): CubeTexture = js.native
  def from(resources: HTMLCanvasElement): BaseTexture = js.native
  def from(resources: HTMLCanvasElement, options: js.Any): BaseTexture = js.native
  def from(resources: HTMLImageElement): BaseTexture = js.native
  def from(resources: HTMLImageElement, options: js.Any): BaseTexture = js.native
  def from(resources: HTMLVideoElement): BaseTexture = js.native
  def from(resources: HTMLVideoElement, options: js.Any): BaseTexture = js.native
  def from(resources: SVGElement): BaseTexture = js.native
  def from(resources: SVGElement, options: js.Any): BaseTexture = js.native
}

