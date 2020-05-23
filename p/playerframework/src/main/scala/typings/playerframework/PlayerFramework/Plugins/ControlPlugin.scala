package typings.playerframework.PlayerFramework.Plugins

import typings.playerframework.PlayerFramework.MediaPlayer
import typings.playerframework.PlayerFramework.PluginBase
import typings.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlPlugin extends PluginBase {
  def compactThresholdInInches(): Double
  def hide(): Unit
  def isCompact(): Boolean
  def orientation(): String
  def show(): Unit
}

object ControlPlugin {
  @scala.inline
  def apply(
    compactThresholdInInches: () => Double,
    currentMediaSource: MediaSource,
    hide: () => Unit,
    isActive: Boolean,
    isCompact: () => Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    orientation: () => String,
    show: () => Unit,
    unload: () => Unit,
    update: MediaSource => Unit
  ): ControlPlugin = {
    val __obj = js.Dynamic.literal(compactThresholdInInches = js.Any.fromFunction0(compactThresholdInInches), currentMediaSource = currentMediaSource.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isActive = isActive.asInstanceOf[js.Any], isCompact = js.Any.fromFunction0(isCompact), isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], orientation = js.Any.fromFunction0(orientation), show = js.Any.fromFunction0(show), unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ControlPlugin]
  }
}

