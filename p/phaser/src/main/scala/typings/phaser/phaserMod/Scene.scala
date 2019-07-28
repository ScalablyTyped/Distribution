package typings.phaser.phaserMod

import typings.phaser.PhaserNs.TypesNs.ScenesNs.SettingsConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A base Phaser.Scene class which can be extended for your own use.
  */
@JSImport("phaser", "Scene")
@js.native
class Scene protected ()
  extends typings.phaser.PhaserNs.Scene {
  /**
    * 
    * @param config Scene specific configuration settings.
    */
  def this(config: String) = this()
  def this(config: SettingsConfig) = this()
}

