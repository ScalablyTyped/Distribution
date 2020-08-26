package typings.phaser.Phaser.Types.Core

import typings.phaser.Phaser.Game
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbacksConfig extends js.Object {
  /**
    * A function to run at the end of the boot sequence. At this point, all the game systems have started and plugins have been loaded.
    */
  var postBoot: js.UndefOr[BootCallback] = js.native
  /**
    * A function to run at the start of the boot sequence.
    */
  var preBoot: js.UndefOr[BootCallback] = js.native
}

object CallbacksConfig {
  @scala.inline
  def apply(): CallbacksConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbacksConfig]
  }
  @scala.inline
  implicit class CallbacksConfigOps[Self <: CallbacksConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPostBoot(value: /* game */ Game => Unit): Self = this.set("postBoot", js.Any.fromFunction1(value))
    @scala.inline
    def deletePostBoot: Self = this.set("postBoot", js.undefined)
    @scala.inline
    def setPreBoot(value: /* game */ Game => Unit): Self = this.set("preBoot", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreBoot: Self = this.set("preBoot", js.undefined)
  }
  
}

