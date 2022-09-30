package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "SpritesheetLoader")
@js.native
open class SpritesheetLoader ()
  extends typings.pixiSpritesheet.mod.SpritesheetLoader
/* static members */
object SpritesheetLoader {
  
  @JSImport("pixi.js", "SpritesheetLoader")
  @js.native
  val ^ : js.Any = js.native
  
  /** @ignore */
  @JSImport("pixi.js", "SpritesheetLoader.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
  
  /**
    * Get the spritesheets root path
    * @param resource - Resource to check path
    * @param baseUrl - Base root url
    */
  inline def getResourcePath(resource: typings.pixiLoaders.mod.LoaderResource, baseUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getResourcePath")(resource.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Called after a resource is loaded.
    * @see PIXI.Loader.loaderMiddleware
    * @param resource
    * @param next
    */
  inline def use(resource: typings.pixiLoaders.mod.LoaderResource, next: js.Function1[/* repeated */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
