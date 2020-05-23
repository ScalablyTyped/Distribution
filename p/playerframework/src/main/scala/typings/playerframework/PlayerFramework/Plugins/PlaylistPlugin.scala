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
trait PlaylistPlugin extends PluginBase {
  /**
    *
    **/
  var autoAdvance: Boolean
  /**
    *
    **/
  var currentPlaylistItem: PlaylistItem
  /**
    *
    **/
  var currentPlaylistItemIndex: Double
  /**
    *
    **/
  var playlist: js.Array[PlaylistItem]
  /**
    *
    **/
  var skipBackThreshold: Double
  /**
    *
    **/
  var startupPlaylistItemIndex: Double
  def canGoToNextPlaylistItem(): Boolean
  def canGoToPreviousPlaylistItem(): Boolean
  def goToNextPlaylistItem(): Unit
  // Methods
  def goToPreviousPlaylistItem(): Unit
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
}

