package typings.pixiJs.mod

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
@JSImport("pixi.js", "CubeTexture")
@js.native
class CubeTexture ()
  extends typings.pixiJs.PIXI.CubeTexture

/* static members */
@JSImport("pixi.js", "CubeTexture")
@js.native
object CubeTexture extends js.Object {
  def from(resources: String): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: String, options: js.Any): typings.pixiJs.PIXI.BaseTexture = js.native
  /**
    * Generate a new CubeTexture.
    * @static
    * @param {string[]|PIXI.resources.Resource[]} resources - Collection of 6 URLs or resources
    * @param {object} [options] - Optional options passed to the resources being loaded.
    *        See {@PIXI.resources.autoDetectResource autoDetectResource} for more info
    *        on the options available to each resource.
    * @returns {PIXI.CubeTexture} new cube texture
    */
  def from(resources: js.Array[Resource | String]): typings.pixiJs.PIXI.CubeTexture = js.native
  def from(resources: js.Array[Resource | String], options: js.Any): typings.pixiJs.PIXI.CubeTexture = js.native
  def from(resources: HTMLCanvasElement): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: HTMLCanvasElement, options: js.Any): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: HTMLImageElement): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: HTMLImageElement, options: js.Any): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: HTMLVideoElement): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: HTMLVideoElement, options: js.Any): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: SVGElement): typings.pixiJs.PIXI.BaseTexture = js.native
  def from(resources: SVGElement, options: js.Any): typings.pixiJs.PIXI.BaseTexture = js.native
}

