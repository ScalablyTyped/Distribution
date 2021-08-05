package typings.pixiJs.mod

import typings.pixiJs.PIXI.ILoaderPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link PIXI.Loader Loader} middleware for loading
  * bitmap-based fonts suitable for using with {@link PIXI.BitmapText}.
  * @class
  * @memberof PIXI
  * @implements PIXI.ILoaderPlugin
  */
@JSImport("pixi.js", "BitmapFontLoader")
@js.native
class BitmapFontLoader ()
  extends StObject
     with ILoaderPlugin
object BitmapFontLoader {
  
  @JSImport("pixi.js", "BitmapFontLoader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Called when the plugin is installed.
    *
    * @see PIXI.Loader.registerPlugin
    */
  /* static member */
  inline def add(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[Unit]
  
  /**
    * Called after a resource is loaded.
    * @see PIXI.Loader.loaderMiddleware
    * @param {PIXI.LoaderResource} resource
    * @param {function} next
    */
  /* static member */
  inline def use(resource: typings.pixiJs.PIXI.LoaderResource, next: js.Function1[/* repeated */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
