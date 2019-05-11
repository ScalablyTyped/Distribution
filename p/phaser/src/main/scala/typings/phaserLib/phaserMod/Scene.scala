package typings
package phaserLib.phaserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A base Phaser.Scene class which can be extended for your own use.
  */
@JSImport("phaser", "Scene")
@js.native
class Scene protected ()
  extends phaserLib.PhaserNs.Scene {
  /**
    * 
    * @param config Scene specific configuration settings.
    */
  def this(config: java.lang.String) = this()
  def this(config: phaserLib.PhaserNs.TypesNs.ScenesNs.SettingsConfig) = this()
}

