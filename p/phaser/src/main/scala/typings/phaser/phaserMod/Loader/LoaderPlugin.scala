package typings.phaser.phaserMod.Loader

import typings.phaser.Phaser.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Loader handles loading all external content such as Images, Sounds, Texture Atlases and data files.
  * You typically interact with it via `this.load` in your Scene. Scenes can have a `preload` method, which is always
  * called before the Scenes `create` method, allowing you to preload assets that the Scene may need.
  * 
  * If you call any `this.load` methods from outside of `Scene.preload` then you need to start the Loader going
  * yourself by calling `Loader.start()`. It's only automatically started during the Scene preload.
  * 
  * The Loader uses a combination of tag loading (eg. Audio elements) and XHR and provides progress and completion events.
  * Files are loaded in parallel by default. The amount of concurrent connections can be controlled in your Game Configuration.
  * 
  * Once the Loader has started loading you are still able to add files to it. These can be injected as a result of a loader
  * event, the type of file being loaded (such as a pack file) or other external events. As long as the Loader hasn't finished
  * simply adding a new file to it, while running, will ensure it's added into the current queue.
  * 
  * Every Scene has its own instance of the Loader and they are bound to the Scene in which they are created. However,
  * assets loaded by the Loader are placed into global game-level caches. For example, loading an XML file will place that
  * file inside `Game.cache.xml`, which is accessible from every Scene in your game, no matter who was responsible
  * for loading it. The same is true of Textures. A texture loaded in one Scene is instantly available to all other Scenes
  * in your game.
  * 
  * The Loader works by using custom File Types. These are stored in the FileTypesManager, which injects them into the Loader
  * when it's instantiated. You can create your own custom file types by extending either the File or MultiFile classes.
  * See those files for more details.
  */
@JSImport("phaser", "Loader.LoaderPlugin")
@js.native
class LoaderPlugin protected ()
  extends typings.phaser.Phaser.Loader.LoaderPlugin {
  /**
    * 
    * @param scene The Scene which owns this Loader instance.
    */
  def this(scene: Scene) = this()
}
