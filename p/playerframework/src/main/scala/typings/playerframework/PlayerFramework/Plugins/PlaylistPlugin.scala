package typings.playerframework.PlayerFramework.Plugins

import typings.playerframework.PlayerFramework.MediaPlayer
import typings.playerframework.PlayerFramework.PlaylistItem
import typings.playerframework.PlayerFramework.PluginBase
import typings.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  **/
@js.native
trait PlaylistPlugin extends PluginBase {
  /**
    *
    **/
  var autoAdvance: Boolean = js.native
  /**
    *
    **/
  var currentPlaylistItem: PlaylistItem = js.native
  /**
    *
    **/
  var currentPlaylistItemIndex: Double = js.native
  /**
    *
    **/
  var playlist: js.Array[PlaylistItem] = js.native
  /**
    *
    **/
  var skipBackThreshold: Double = js.native
  /**
    *
    **/
  var startupPlaylistItemIndex: Double = js.native
  def canGoToNextPlaylistItem(): Boolean = js.native
  def canGoToPreviousPlaylistItem(): Boolean = js.native
  def goToNextPlaylistItem(): Unit = js.native
  // Methods
  def goToPreviousPlaylistItem(): Unit = js.native
}

object PlaylistPlugin {
  @scala.inline
  def apply(
    autoAdvance: Boolean,
    canGoToNextPlaylistItem: () => Boolean,
    canGoToPreviousPlaylistItem: () => Boolean,
    currentMediaSource: MediaSource,
    currentPlaylistItem: PlaylistItem,
    currentPlaylistItemIndex: Double,
    goToNextPlaylistItem: () => Unit,
    goToPreviousPlaylistItem: () => Unit,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    playlist: js.Array[PlaylistItem],
    skipBackThreshold: Double,
    startupPlaylistItemIndex: Double,
    unload: () => Unit,
    update: MediaSource => Unit
  ): PlaylistPlugin = {
    val __obj = js.Dynamic.literal(autoAdvance = autoAdvance.asInstanceOf[js.Any], canGoToNextPlaylistItem = js.Any.fromFunction0(canGoToNextPlaylistItem), canGoToPreviousPlaylistItem = js.Any.fromFunction0(canGoToPreviousPlaylistItem), currentMediaSource = currentMediaSource.asInstanceOf[js.Any], currentPlaylistItem = currentPlaylistItem.asInstanceOf[js.Any], currentPlaylistItemIndex = currentPlaylistItemIndex.asInstanceOf[js.Any], goToNextPlaylistItem = js.Any.fromFunction0(goToNextPlaylistItem), goToPreviousPlaylistItem = js.Any.fromFunction0(goToPreviousPlaylistItem), isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], playlist = playlist.asInstanceOf[js.Any], skipBackThreshold = skipBackThreshold.asInstanceOf[js.Any], startupPlaylistItemIndex = startupPlaylistItemIndex.asInstanceOf[js.Any], unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlaylistPlugin]
  }
  @scala.inline
  implicit class PlaylistPluginOps[Self <: PlaylistPlugin] (val x: Self) extends AnyVal {
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
    def setAutoAdvance(value: Boolean): Self = this.set("autoAdvance", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanGoToNextPlaylistItem(value: () => Boolean): Self = this.set("canGoToNextPlaylistItem", js.Any.fromFunction0(value))
    @scala.inline
    def setCanGoToPreviousPlaylistItem(value: () => Boolean): Self = this.set("canGoToPreviousPlaylistItem", js.Any.fromFunction0(value))
    @scala.inline
    def setCurrentPlaylistItem(value: PlaylistItem): Self = this.set("currentPlaylistItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentPlaylistItemIndex(value: Double): Self = this.set("currentPlaylistItemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoToNextPlaylistItem(value: () => Unit): Self = this.set("goToNextPlaylistItem", js.Any.fromFunction0(value))
    @scala.inline
    def setGoToPreviousPlaylistItem(value: () => Unit): Self = this.set("goToPreviousPlaylistItem", js.Any.fromFunction0(value))
    @scala.inline
    def setPlaylistVarargs(value: PlaylistItem*): Self = this.set("playlist", js.Array(value :_*))
    @scala.inline
    def setPlaylist(value: js.Array[PlaylistItem]): Self = this.set("playlist", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipBackThreshold(value: Double): Self = this.set("skipBackThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartupPlaylistItemIndex(value: Double): Self = this.set("startupPlaylistItemIndex", value.asInstanceOf[js.Any])
  }
  
}

