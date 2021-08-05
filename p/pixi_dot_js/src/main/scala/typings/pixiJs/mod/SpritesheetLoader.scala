package typings.pixiJs.mod

import typings.pixiJs.PIXI.ILoaderPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link PIXI.Loader Loader} middleware for loading texture atlases that have been created with
  * TexturePacker or similar JSON-based spritesheet.
  *
  * This middleware automatically generates Texture resources.
  *
  * @class
  * @memberof PIXI
  * @implements PIXI.ILoaderPlugin
  */
@JSImport("pixi.js", "SpritesheetLoader")
@js.native
class SpritesheetLoader ()
  extends StObject
     with ILoaderPlugin
object SpritesheetLoader {
  
  @JSImport("pixi.js", "SpritesheetLoader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the spritesheets root path
    * @param {PIXI.LoaderResource} resource - Resource to check path
    * @param {string} baseUrl - Base root url
    */
  /* static member */
  inline def getResourcePath(resource: typings.pixiJs.PIXI.LoaderResource, baseUrl: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getResourcePath")(resource.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Called after a resource is loaded.
    * @see PIXI.Loader.loaderMiddleware
    * @param {PIXI.LoaderResource} resource
    * @param {function} next
    */
  /* static member */
  inline def use(resource: typings.pixiJs.PIXI.LoaderResource, next: js.Function1[/* repeated */ js.Any, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
