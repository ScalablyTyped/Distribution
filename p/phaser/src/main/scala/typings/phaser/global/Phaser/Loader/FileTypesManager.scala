package typings.phaser.global.Phaser.Loader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileTypesManager {
  
  @JSGlobal("Phaser.Loader.FileTypesManager")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Removed all associated file types.
    */
  inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /**
    * Static method called when a LoaderPlugin is created.
    * 
    * Loops through the local types object and injects all of them as
    * properties into the LoaderPlugin instance.
    * @param loader The LoaderPlugin to install the types into.
    */
  inline def install(loader: typings.phaser.Phaser.Loader.LoaderPlugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(loader.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Static method called directly by the File Types.
    * 
    * The key is a reference to the function used to load the files via the Loader, i.e. `image`.
    * @param key The key that will be used as the method name in the LoaderPlugin.
    * @param factoryFunction The function that will be called when LoaderPlugin.key is invoked.
    */
  inline def register(key: String, factoryFunction: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(key.asInstanceOf[js.Any], factoryFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
