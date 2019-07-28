package typings.phaser.PhaserNs.SoundNs

import typings.phaser.PhaserNs.Game
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Sound")
@js.native
object ^ extends js.Object {
  /**
    * Creates a Web Audio, HTML5 Audio or No Audio Sound Manager based on config and device settings.
    * 
    * Be aware of https://developers.google.com/web/updates/2017/09/autoplay-policy-changes
    * @param game Reference to the current game instance.
    */
  def SoundManagerCreator(game: Game): Unit = js.native
}

