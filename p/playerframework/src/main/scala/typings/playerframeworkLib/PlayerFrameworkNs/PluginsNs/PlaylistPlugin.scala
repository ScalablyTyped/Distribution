package typings
package playerframeworkLib.PlayerFrameworkNs.PluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*
		**/
@JSGlobal("PlayerFramework.Plugins.PlaylistPlugin")
@js.native
class PlaylistPlugin ()
  extends playerframeworkLib.PlayerFrameworkNs.PluginBase {
  /**
  			*
  			**/
  var autoAdvance: scala.Boolean = js.native
  /**
  			*
  			**/
  var currentPlaylistItem: playerframeworkLib.PlayerFrameworkNs.PlaylistItem = js.native
  /**
  			*
  			**/
  var currentPlaylistItemIndex: scala.Double = js.native
  /**
  			*
  			**/
  var playlist: js.Array[playerframeworkLib.PlayerFrameworkNs.PlaylistItem] = js.native
  /**
  			*
  			**/
  var skipBackThreshold: scala.Double = js.native
  /**
  			*
  			**/
  var startupPlaylistItemIndex: scala.Double = js.native
  def canGoToNextPlaylistItem(): scala.Boolean = js.native
  def canGoToPreviousPlaylistItem(): scala.Boolean = js.native
  def goToNextPlaylistItem(): scala.Unit = js.native
  // Methods
  def goToPreviousPlaylistItem(): scala.Unit = js.native
}

