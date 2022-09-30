package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "DDSLoader")
@js.native
open class DDSLoader ()
  extends typings.pixiCompressedTextures.mod.DDSLoader
/* static members */
object DDSLoader {
  
  @JSImport("pixi.js", "DDSLoader")
  @js.native
  val ^ : js.Any = js.native
  
  /** @ignore */
  @JSImport("pixi.js", "DDSLoader.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
  
  /**
    * Registers a DDS compressed texture
    * @see PIXI.Loader.loaderMiddleware
    * @param resource - loader resource that is checked to see if it is a DDS file
    * @param next - callback Function to call when done
    */
  inline def use(resource: typings.pixiLoaders.mod.LoaderResource, next: js.Function1[/* repeated */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
