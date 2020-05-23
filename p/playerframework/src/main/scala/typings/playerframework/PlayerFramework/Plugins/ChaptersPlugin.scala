package typings.playerframework.PlayerFramework.Plugins

import typings.playerframework.PlayerFramework.MediaPlayer
import typings.playerframework.PlayerFramework.PluginBase
import typings.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChaptersPlugin extends PluginBase {
  var autoCreateChaptersFromTextTracks: Boolean
  var autoCreateDefaultChapters: Boolean
  var defaultChapterCount: Double
  var visualMarkerClass: String
}

object ChaptersPlugin {
  @scala.inline
  def apply(
    autoCreateChaptersFromTextTracks: Boolean,
    autoCreateDefaultChapters: Boolean,
    currentMediaSource: MediaSource,
    defaultChapterCount: Double,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    unload: () => Unit,
    update: MediaSource => Unit,
    visualMarkerClass: String
  ): ChaptersPlugin = {
    val __obj = js.Dynamic.literal(autoCreateChaptersFromTextTracks = autoCreateChaptersFromTextTracks.asInstanceOf[js.Any], autoCreateDefaultChapters = autoCreateDefaultChapters.asInstanceOf[js.Any], currentMediaSource = currentMediaSource.asInstanceOf[js.Any], defaultChapterCount = defaultChapterCount.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update), visualMarkerClass = visualMarkerClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChaptersPlugin]
  }
}

