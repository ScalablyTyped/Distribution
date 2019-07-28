package typings.phaser.PhaserNs.ScenesNs

import typings.phaser.PhaserNs.TypesNs.ScenesNs.SettingsConfig
import typings.phaser.PhaserNs.TypesNs.ScenesNs.SettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Scenes.Settings")
@js.native
object SettingsNs extends js.Object {
  /**
    * Takes a Scene configuration object and returns a fully formed System Settings object.
    * @param config The Scene configuration object used to create this Scene Settings.
    */
  def create(config: String): SettingsObject = js.native
  def create(config: SettingsConfig): SettingsObject = js.native
}

