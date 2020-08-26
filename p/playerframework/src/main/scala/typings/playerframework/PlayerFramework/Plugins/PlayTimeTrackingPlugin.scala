package typings.playerframework.PlayerFramework.Plugins

import typings.playerframework.PlayerFramework.MediaPlayer
import typings.playerframework.PlayerFramework.PluginBase
import typings.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayTimeTrackingPlugin extends PluginBase {
  var playTime: Double = js.native
  var playTimePercentage: Double = js.native
}

object PlayTimeTrackingPlugin {
  @scala.inline
  def apply(
    currentMediaSource: MediaSource,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    playTime: Double,
    playTimePercentage: Double,
    unload: () => Unit,
    update: MediaSource => Unit
  ): PlayTimeTrackingPlugin = {
    val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], playTime = playTime.asInstanceOf[js.Any], playTimePercentage = playTimePercentage.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlayTimeTrackingPlugin]
  }
  @scala.inline
  implicit class PlayTimeTrackingPluginOps[Self <: PlayTimeTrackingPlugin] (val x: Self) extends AnyVal {
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
    def setPlayTime(value: Double): Self = this.set("playTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayTimePercentage(value: Double): Self = this.set("playTimePercentage", value.asInstanceOf[js.Any])
  }
  
}

