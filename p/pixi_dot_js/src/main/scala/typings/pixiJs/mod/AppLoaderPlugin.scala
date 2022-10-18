package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiLoaders.GlobalMixins.IApplicationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "AppLoaderPlugin")
@js.native
open class AppLoaderPlugin ()
  extends typings.pixiLoaders.mod.AppLoaderPlugin
/* static members */
object AppLoaderPlugin {
  
  @JSImport("pixi.js", "AppLoaderPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Called when application destroyed
    * @private
    */
  inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** @ignore */
  @JSImport("pixi.js", "AppLoaderPlugin.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
  
  /**
    * Called on application constructor
    * @param options
    * @private
    */
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  inline def init(options: IApplicationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Loader instance to help with asset loading.
    * @memberof PIXI.Application#
    * @readonly
    */
  @JSImport("pixi.js", "AppLoaderPlugin.loader")
  @js.native
  def loader: typings.pixiLoaders.mod.Loader = js.native
  inline def loader_=(x: typings.pixiLoaders.mod.Loader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loader")(x.asInstanceOf[js.Any])
}
