package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "BitmapFontLoader")
@js.native
open class BitmapFontLoader ()
  extends typings.pixiTextBitmap.mod.BitmapFontLoader
/* static members */
object BitmapFontLoader {
  
  @JSImport("pixi.js", "BitmapFontLoader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Called when the plugin is installed.
    * @see PIXI.extensions.add
    */
  inline def add(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[Unit]
  
  /**
    * Replacement for NodeJS's path.dirname
    * @param {string} url - Path to get directory for
    */
  @JSImport("pixi.js", "BitmapFontLoader.dirname")
  @js.native
  def dirname: Any = js.native
  inline def dirname_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dirname")(x.asInstanceOf[js.Any])
  
  /** @ignore */
  @JSImport("pixi.js", "BitmapFontLoader.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
  
  /**
    * Get folder path from a resource.
    * @param loader
    * @param resource
    */
  @JSImport("pixi.js", "BitmapFontLoader.getBaseUrl")
  @js.native
  def getBaseUrl: Any = js.native
  inline def getBaseUrl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getBaseUrl")(x.asInstanceOf[js.Any])
  
  /**
    * Called after a resource is loaded.
    * @see PIXI.Loader.loaderMiddleware
    * @param this
    * @param {PIXI.LoaderResource} resource
    * @param {Function} next
    */
  inline def use(resource: typings.pixiLoaders.mod.LoaderResource, next: js.Function1[/* repeated */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(resource.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
