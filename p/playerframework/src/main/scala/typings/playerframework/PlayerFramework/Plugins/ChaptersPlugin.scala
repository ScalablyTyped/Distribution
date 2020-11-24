package typings.playerframework.PlayerFramework.Plugins

import typings.playerframework.PlayerFramework.MediaPlayer
import typings.playerframework.PlayerFramework.PluginBase
import typings.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChaptersPlugin extends PluginBase {
  
  var autoCreateChaptersFromTextTracks: Boolean = js.native
  
  var autoCreateDefaultChapters: Boolean = js.native
  
  var defaultChapterCount: Double = js.native
  
  var visualMarkerClass: String = js.native
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
  
  @scala.inline
  implicit class ChaptersPluginOps[Self <: ChaptersPlugin] (val x: Self) extends AnyVal {
    
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
    def setAutoCreateChaptersFromTextTracks(value: Boolean): Self = this.set("autoCreateChaptersFromTextTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCreateDefaultChapters(value: Boolean): Self = this.set("autoCreateDefaultChapters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultChapterCount(value: Double): Self = this.set("defaultChapterCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualMarkerClass(value: String): Self = this.set("visualMarkerClass", value.asInstanceOf[js.Any])
  }
}
