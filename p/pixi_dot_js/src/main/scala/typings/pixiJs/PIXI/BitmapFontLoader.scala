package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link PIXI.Loader Loader} middleware for loading
  * bitmap-based fonts suitable for using with {@link PIXI.BitmapText}.
  * @class
  * @memberof PIXI
  * @implements PIXI.ILoaderPlugin
  */
@JSGlobal("PIXI.BitmapFontLoader")
@js.native
class BitmapFontLoader () extends ILoaderPlugin

/* static members */
@JSGlobal("PIXI.BitmapFontLoader")
@js.native
object BitmapFontLoader extends js.Object {
  /**
    * Called when the plugin is installed.
    *
    * @see PIXI.Loader.registerPlugin
    */
  def add(): Unit = js.native
  /**
    * Register a BitmapText font from loader resource.
    *
    * @param {PIXI.LoaderResource} resource - Loader resource.
    * @param {PIXI.Texture} texture - Reference to texture.
    */
  def parse(resource: LoaderResource, texture: Texture): Unit = js.native
  /**
    * Called after a resource is loaded.
    * @see PIXI.Loader.loaderMiddleware
    * @param {PIXI.LoaderResource} resource
    * @param {function} next
    */
  def use(resource: LoaderResource, next: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}

