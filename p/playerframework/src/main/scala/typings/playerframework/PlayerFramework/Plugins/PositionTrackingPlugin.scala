package typings.playerframework.PlayerFramework.Plugins

import typings.playerframework.PlayerFramework.MediaPlayer
import typings.playerframework.PlayerFramework.PluginBase
import typings.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionTrackingPlugin extends PluginBase {
  var evaluateOnForwardOnly: Boolean
  var position: Double
  var positionPercentage: Double
}

object PositionTrackingPlugin {
  @scala.inline
  def apply(
    currentMediaSource: MediaSource,
    evaluateOnForwardOnly: Boolean,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    position: Double,
    positionPercentage: Double,
    unload: () => Unit,
    update: MediaSource => Unit
  ): PositionTrackingPlugin = {
    val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], evaluateOnForwardOnly = evaluateOnForwardOnly.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positionPercentage = positionPercentage.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PositionTrackingPlugin]
  }
}

