package typings.playable.anon

import typings.playable.playbackEngineTypesMod.IPlaybackEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EngineIPlaybackEngine extends StObject {
  
  var engine: IPlaybackEngine = js.native
}
object EngineIPlaybackEngine {
  
  @scala.inline
  def apply(engine: IPlaybackEngine): EngineIPlaybackEngine = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineIPlaybackEngine]
  }
  
  @scala.inline
  implicit class EngineIPlaybackEngineMutableBuilder[Self <: EngineIPlaybackEngine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngine(value: IPlaybackEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
  }
}
