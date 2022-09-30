package typings.pixiJs.mod

import typings.pixiLoaders.anon.TypeofLoader
import typings.pixiLoaders.mod.ILoaderPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "Loader")
@js.native
/**
  * @param baseUrl - The base url for all resources loaded by this loader.
  * @param concurrency - The number of resources to load concurrently.
  */
open class Loader ()
  extends typings.pixiLoaders.mod.Loader {
  def this(baseUrl: String) = this()
  def this(baseUrl: String, concurrency: Double) = this()
  def this(baseUrl: Unit, concurrency: Double) = this()
}
/* static members */
object Loader {
  
  @JSImport("pixi.js", "Loader")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pixi.js", "Loader._plugins")
  @js.native
  def _plugins: js.Array[ILoaderPlugin] = js.native
  inline def _plugins_=(x: js.Array[ILoaderPlugin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_plugins")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "Loader._shared")
  @js.native
  def _shared: Any = js.native
  inline def _shared_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_shared")(x.asInstanceOf[js.Any])
  
  /**
    * Use the {@link PIXI.extensions.add} API to register plugins.
    * @deprecated since 6.5.0
    * @param plugin - The plugin to add
    * @returns Reference to PIXI.Loader for chaining
    */
  inline def registerPlugin(plugin: ILoaderPlugin): TypeofLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[TypeofLoader]
}
