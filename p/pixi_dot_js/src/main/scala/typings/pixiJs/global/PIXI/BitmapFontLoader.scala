package typings.pixiJs.global.PIXI

import typings.pixiJs.PIXI.ILoaderPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object BitmapFontLoader {
  
  /**
    * Called when the plugin is installed.
    *
    * @see PIXI.Loader.registerPlugin
    */
  /* static member */
  @JSGlobal("PIXI.BitmapFontLoader.add")
  @js.native
  def add(): Unit = js.native
  
  /**
    * Called after a resource is loaded.
    * @see PIXI.Loader.loaderMiddleware
    * @param {PIXI.LoaderResource} resource
    * @param {function} next
    */
  /* static member */
  @JSGlobal("PIXI.BitmapFontLoader.use")
  @js.native
  def use(resource: typings.pixiJs.PIXI.LoaderResource, next: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
}
