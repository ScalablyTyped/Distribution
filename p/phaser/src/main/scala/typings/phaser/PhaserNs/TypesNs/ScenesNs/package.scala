package typings.phaser.PhaserNs.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ScenesNs {
  /**
    * Can be defined on your own Scenes. Use it to create your game objects.
    * This method is called by the Scene Manager when the scene starts, after `init()` and `preload()`.
    * If the LoaderPlugin started after `preload()`, then this method is called only after loading is complete.
    */
  type SceneCreateCallback = js.Function1[/* data */ js.Object, Unit]
  /**
    * Can be defined on your own Scenes.
    * This method is called by the Scene Manager when the scene starts, before `preload()` and `create()`.
    */
  type SceneInitCallback = js.Function1[/* data */ js.Object, Unit]
  /**
    * Can be defined on your own Scenes. Use it to load assets.
    * This method is called by the Scene Manager, after `init()` and before `create()`, only if the Scene has a LoaderPlugin.
    * After this method completes, if the LoaderPlugin's queue isn't empty, the LoaderPlugin will start automatically.
    */
  type ScenePreloadCallback = js.Function0[Unit]
}
