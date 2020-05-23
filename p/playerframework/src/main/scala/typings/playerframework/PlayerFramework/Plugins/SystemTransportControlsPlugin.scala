package typings.playerframework.PlayerFramework.Plugins

import typings.playerframework.PlayerFramework.MediaPlayer
import typings.playerframework.PlayerFramework.PluginBase
import typings.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemTransportControlsPlugin extends PluginBase {
  var isNextTrackEnabled: Boolean
  var isPreviousTrackEnabled: Boolean
  var nextTrackExists: Boolean
  var previousTrackExists: Boolean
}

object SystemTransportControlsPlugin {
  @scala.inline
  def apply(
    currentMediaSource: MediaSource,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    isNextTrackEnabled: Boolean,
    isPreviousTrackEnabled: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    nextTrackExists: Boolean,
    previousTrackExists: Boolean,
    unload: () => Unit,
    update: MediaSource => Unit
  ): SystemTransportControlsPlugin = {
    val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isNextTrackEnabled = isNextTrackEnabled.asInstanceOf[js.Any], isPreviousTrackEnabled = isPreviousTrackEnabled.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], nextTrackExists = nextTrackExists.asInstanceOf[js.Any], previousTrackExists = previousTrackExists.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SystemTransportControlsPlugin]
  }
}

