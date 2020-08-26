package typings.playerframework.PlayerFramework.Plugins

import typings.playerframework.PlayerFramework.MediaPlayer
import typings.playerframework.PlayerFramework.PluginBase
import typings.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderPlugin extends PluginBase {
  def hide(): Unit = js.native
  def show(): Unit = js.native
}

object LoaderPlugin {
  @scala.inline
  def apply(
    currentMediaSource: MediaSource,
    hide: () => Unit,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    show: () => Unit,
    unload: () => Unit,
    update: MediaSource => Unit
  ): LoaderPlugin = {
    val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LoaderPlugin]
  }
  @scala.inline
  implicit class LoaderPluginOps[Self <: LoaderPlugin] (val x: Self) extends AnyVal {
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
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
  }
  
}

