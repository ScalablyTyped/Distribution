package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Loader plugin for handling Texture resources.
  * @class
  * @memberof PIXI
  * @implements PIXI.ILoaderPlugin
  */
@JSImport("pixi.js", "TextureLoader")
@js.native
class TextureLoader ()
  extends typings.pixiJs.PIXI.TextureLoader

/* static members */
@JSImport("pixi.js", "TextureLoader")
@js.native
object TextureLoader extends js.Object {
  /**
    * Called after a resource is loaded.
    * @see PIXI.Loader.loaderMiddleware
    * @param {PIXI.LoaderResource} resource
    * @param {function} next
    */
  def use(resource: typings.pixiJs.PIXI.LoaderResource, next: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}

