package typings.playable.chomecastApiMockMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemotePlayerController extends Publisher {
  
  var player: RemotePlayer = js.native
  
  def seek(): Unit = js.native
  
  def setVolumeLevel(): Unit = js.native
}
object RemotePlayerController {
  
  @scala.inline
  def apply(
    _listeners: StringDictionary[js.Array[js.Function]],
    addEventListener: (eventType, js.Function) => Unit,
    player: RemotePlayer,
    seek: () => Unit,
    setVolumeLevel: () => Unit,
    trigger: (eventType, js.Any) => Unit
  ): RemotePlayerController = {
    val __obj = js.Dynamic.literal(_listeners = _listeners.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), player = player.asInstanceOf[js.Any], seek = js.Any.fromFunction0(seek), setVolumeLevel = js.Any.fromFunction0(setVolumeLevel), trigger = js.Any.fromFunction2(trigger))
    __obj.asInstanceOf[RemotePlayerController]
  }
  
  @scala.inline
  implicit class RemotePlayerControllerOps[Self <: RemotePlayerController] (val x: Self) extends AnyVal {
    
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
    def setPlayer(value: RemotePlayer): Self = this.set("player", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeek(value: () => Unit): Self = this.set("seek", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetVolumeLevel(value: () => Unit): Self = this.set("setVolumeLevel", js.Any.fromFunction0(value))
  }
}
