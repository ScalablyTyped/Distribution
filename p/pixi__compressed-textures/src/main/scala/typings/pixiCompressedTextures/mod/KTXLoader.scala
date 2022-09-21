package typings.pixiCompressedTextures.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiLoaders.mod.LoaderResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/compressed-textures", "KTXLoader")
@js.native
open class KTXLoader () extends StObject
/* static members */
object KTXLoader {
  
  @JSImport("@pixi/compressed-textures", "KTXLoader")
  @js.native
  val ^ : js.Any = js.native
  
  /** @ignore */
  @JSImport("@pixi/compressed-textures", "KTXLoader.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
  
  /**
    * If set to `true`, {@link PIXI.KTXLoader} will parse key-value data in KTX textures. This feature relies
    * on the [Encoding Standard]{@link https://encoding.spec.whatwg.org}.
    *
    * The key-value data will be available on the base-textures as {@code PIXI.BaseTexture.ktxKeyValueData}. They
    * will hold a reference to the texture data buffer, so make sure to delete key-value data once you are done
    * using it.
    */
  @JSImport("@pixi/compressed-textures", "KTXLoader.loadKeyValueData")
  @js.native
  def loadKeyValueData: Boolean = js.native
  inline def loadKeyValueData_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadKeyValueData")(x.asInstanceOf[js.Any])
  
  /**
    * Called after a KTX file is loaded.
    *
    * This will parse the KTX file header and add a {@code BaseTexture} to the texture
    * cache.
    * @see PIXI.Loader.loaderMiddleware
    * @param resource - loader resource that is checked to see if it is a KTX file
    * @param next - callback Function to call when done
    */
  inline def use(resource: LoaderResource, next: js.Function1[/* repeated */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
