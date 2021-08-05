package typings.pixiJs.global.PIXI

import typings.pixiJs.PIXI.ILoaderPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Loader plugin for handling Texture resources.
  * @class
  * @memberof PIXI
  * @implements PIXI.ILoaderPlugin
  */
@JSGlobal("PIXI.TextureLoader")
@js.native
class TextureLoader ()
  extends StObject
     with ILoaderPlugin
object TextureLoader {
  
  @JSGlobal("PIXI.TextureLoader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Called after a resource is loaded.
    * @see PIXI.Loader.loaderMiddleware
    * @param {PIXI.LoaderResource} resource
    * @param {function} next
    */
  /* static member */
  inline def use(resource: typings.pixiJs.PIXI.LoaderResource, next: js.Function1[/* repeated */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
