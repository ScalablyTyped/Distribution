package typings.phaser.phaserMod

import typings.phaser.Phaser.Types.Scenes.SettingsConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A base Phaser.Scene class which can be extended for your own use.
  * 
  * You can also define the optional methods {@link Phaser.Types.Scenes.SceneInitCallback init()}, {@link Phaser.Types.Scenes.ScenePreloadCallback preload()}, and {@link Phaser.Types.Scenes.SceneCreateCallback create()}.
  */
@JSImport("phaser", "Scene")
@js.native
class Scene protected ()
  extends typings.phaser.Phaser.Scene {
  /**
    * 
    * @param config Scene specific configuration settings.
    */
  def this(config: String) = this()
  def this(config: SettingsConfig) = this()
}

