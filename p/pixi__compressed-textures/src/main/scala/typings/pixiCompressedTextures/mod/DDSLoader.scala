package typings.pixiCompressedTextures.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiLoaders.mod.LoaderResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/compressed-textures", "DDSLoader")
@js.native
open class DDSLoader () extends StObject
/* static members */
object DDSLoader {
  
  @JSImport("@pixi/compressed-textures", "DDSLoader")
  @js.native
  val ^ : js.Any = js.native
  
  /** @ignore */
  @JSImport("@pixi/compressed-textures", "DDSLoader.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
  
  /**
    * Registers a DDS compressed texture
    * @see PIXI.Loader.loaderMiddleware
    * @param resource - loader resource that is checked to see if it is a DDS file
    * @param next - callback Function to call when done
    */
  inline def use(resource: LoaderResource, next: js.Function1[/* repeated */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
