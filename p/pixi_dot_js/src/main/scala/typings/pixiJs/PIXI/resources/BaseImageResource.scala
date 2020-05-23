package typings.pixiJs.PIXI.resources

import typings.pixiJs.PIXI.BaseTexture
import typings.pixiJs.PIXI.GLTexture
import typings.pixiJs.PIXI.Renderer
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base for all the image/canvas resources
  * @class
  * @extends PIXI.resources.Resource
  * @memberof PIXI.resources
  */
@js.native
trait BaseImageResource extends Resource {
  /**
    * The source element
    * @member {HTMLImageElement|HTMLCanvasElement|HTMLVideoElement|SVGElement} PIXI.resources.BaseImageResource#source
    * @readonly
    */
  val source: HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | SVGElement = js.native
  def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLCanvasElement): Boolean = js.native
  def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLImageElement): Boolean = js.native
  def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: HTMLVideoElement): Boolean = js.native
  def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture, source: SVGElement): Boolean = js.native
}

