package typings.playable.anon

import typings.playable.playbackEngineTypesMod.IPlaybackEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EngineIPlaybackEngine extends js.Object {
  
  var engine: IPlaybackEngine = js.native
}
object EngineIPlaybackEngine {
  
  @scala.inline
  def apply(engine: IPlaybackEngine): EngineIPlaybackEngine = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineIPlaybackEngine]
  }
  
  @scala.inline
  implicit class EngineIPlaybackEngineOps[Self <: EngineIPlaybackEngine] (val x: Self) extends AnyVal {
    
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
    def setEngine(value: IPlaybackEngine): Self = this.set("engine", value.asInstanceOf[js.Any])
  }
}
