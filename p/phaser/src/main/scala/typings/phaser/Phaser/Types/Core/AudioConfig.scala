package typings.phaser.Phaser.Types.Core

import typings.std.AudioContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Config object containing various sound settings.
  */
@js.native
trait AudioConfig extends js.Object {
  /**
    * An existing Web Audio context.
    */
  var context: js.UndefOr[AudioContext] = js.native
  /**
    * Use HTML5 Audio instead of Web Audio.
    */
  var disableWebAudio: js.UndefOr[Boolean] = js.native
  /**
    * Disable all audio output.
    */
  var noAudio: js.UndefOr[Boolean] = js.native
}

object AudioConfig {
  @scala.inline
  def apply(): AudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioConfig]
  }
  @scala.inline
  implicit class AudioConfigOps[Self <: AudioConfig] (val x: Self) extends AnyVal {
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
    def setContext(value: AudioContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setDisableWebAudio(value: Boolean): Self = this.set("disableWebAudio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableWebAudio: Self = this.set("disableWebAudio", js.undefined)
    @scala.inline
    def setNoAudio(value: Boolean): Self = this.set("noAudio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoAudio: Self = this.set("noAudio", js.undefined)
  }
  
}

