package typings.phaser.phaserMod.Loader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phaser", "Loader.FileTypesManager")
@js.native
object FileTypesManager extends js.Object {
  
  /**
    * Removed all associated file types.
    */
  def destroy(): Unit = js.native
  
  /**
    * Static method called when a LoaderPlugin is created.
    * 
    * Loops through the local types object and injects all of them as
    * properties into the LoaderPlugin instance.
    * @param loader The LoaderPlugin to install the types into.
    */
  def install(loader: typings.phaser.Phaser.Loader.LoaderPlugin): Unit = js.native
  
  /**
    * Static method called directly by the File Types.
    * 
    * The key is a reference to the function used to load the files via the Loader, i.e. `image`.
    * @param key The key that will be used as the method name in the LoaderPlugin.
    * @param factoryFunction The function that will be called when LoaderPlugin.key is invoked.
    */
  def register(key: String, factoryFunction: js.Function): Unit = js.native
}
