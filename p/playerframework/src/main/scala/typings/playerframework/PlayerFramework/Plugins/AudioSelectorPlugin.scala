package typings.playerframework.PlayerFramework.Plugins

import typings.playerframework.PlayerFramework.MediaPlayer
import typings.playerframework.PlayerFramework.PluginBase
import typings.std.HTMLElement
import typings.std.MediaSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioSelectorPlugin extends PluginBase {
  /**
    * Not available in phone.
    **/
  var alignment: String
  /**
    * Not available in phone.
    **/
  var anchor: HTMLElement
  /**
    * Not available in phone.
    **/
  var placement: String
  def hide(): Unit
  def show(): Unit
}

object AudioSelectorPlugin {
  @scala.inline
  def apply(
    alignment: String,
    anchor: HTMLElement,
    currentMediaSource: MediaSource,
    hide: () => Unit,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    load: () => Unit,
    mediaPlayer: MediaPlayer,
    placement: String,
    show: () => Unit,
    unload: () => Unit,
    update: MediaSource => Unit
  ): AudioSelectorPlugin = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], anchor = anchor.asInstanceOf[js.Any], currentMediaSource = currentMediaSource.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), mediaPlayer = mediaPlayer.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), unload = js.Any.fromFunction0(unload), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AudioSelectorPlugin]
  }
}

