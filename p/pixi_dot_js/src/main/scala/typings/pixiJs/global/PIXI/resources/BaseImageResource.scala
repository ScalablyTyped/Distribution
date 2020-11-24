package typings.pixiJs.global.PIXI.resources

import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base for all the image/canvas resources
  * @class
  * @extends PIXI.resources.Resource
  * @memberof PIXI.resources
  */
@JSGlobal("PIXI.resources.BaseImageResource")
@js.native
class BaseImageResource protected ()
  extends typings.pixiJs.PIXI.resources.BaseImageResource {
  def this(source: HTMLCanvasElement) = this()
  def this(source: HTMLImageElement) = this()
  def this(source: HTMLVideoElement) = this()
  def this(source: SVGElement) = this()
}
/* static members */
@JSGlobal("PIXI.resources.BaseImageResource")
@js.native
object BaseImageResource extends js.Object {
  
  /**
    * Set cross origin based detecting the url and the crossorigin
    * @protected
    * @param {HTMLElement} element - Element to apply crossOrigin
    * @param {string} url - URL to check
    * @param {boolean|string} [crossorigin=true] - Cross origin value to use
    */
  /* protected */ def crossOrigin(element: HTMLElement, url: String): Unit = js.native
  /* protected */ def crossOrigin(element: HTMLElement, url: String, crossorigin: String): Unit = js.native
  /* protected */ def crossOrigin(element: HTMLElement, url: String, crossorigin: Boolean): Unit = js.native
}
