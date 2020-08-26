package typings.playerframework.PlayerFramework.Plugins

import typings.playerframework.PlayerFramework.MediaPlayer
import typings.playerframework.PlayerFramework.PluginBase
import typings.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayRequestPlugin extends PluginBase {
  var isRequestActive: Boolean = js.native
}

object DisplayRequestPlugin {
  @scala.inline
  def apply(
    currentMediaSource: MediaSource,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    isRequestActive: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    unload: () => Unit,
    update: MediaSource => Unit
  ): DisplayRequestPlugin = {
    val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isRequestActive = isRequestActive.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DisplayRequestPlugin]
  }
  @scala.inline
  implicit class DisplayRequestPluginOps[Self <: DisplayRequestPlugin] (val x: Self) extends AnyVal {
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
    def setIsRequestActive(value: Boolean): Self = this.set("isRequestActive", value.asInstanceOf[js.Any])
  }
  
}

