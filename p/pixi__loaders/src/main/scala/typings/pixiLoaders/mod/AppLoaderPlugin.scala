package typings.pixiLoaders.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/loaders", "AppLoaderPlugin")
@js.native
open class AppLoaderPlugin () extends StObject
/* static members */
object AppLoaderPlugin {
  
  @JSImport("@pixi/loaders", "AppLoaderPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Called when application destroyed
    * @private
    */
  inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** @ignore */
  @JSImport("@pixi/loaders", "AppLoaderPlugin.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
  
  /**
    * Called on application constructor
    * @param options
    * @private
    */
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  inline def init(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.IApplicationOptions */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Loader instance to help with asset loading.
    * @memberof PIXI.Application#
    * @readonly
    */
  @JSImport("@pixi/loaders", "AppLoaderPlugin.loader")
  @js.native
  def loader: Loader = js.native
  inline def loader_=(x: Loader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loader")(x.asInstanceOf[js.Any])
}
