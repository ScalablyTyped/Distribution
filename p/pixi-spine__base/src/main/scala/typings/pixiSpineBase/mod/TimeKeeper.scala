package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/base", "TimeKeeper")
@js.native
open class TimeKeeper () extends StObject {
  
  var delta: Double = js.native
  
  /* private */ var frameCount: Any = js.native
  
  /* private */ var frameTime: Any = js.native
  
  var framesPerSecond: Double = js.native
  
  /* private */ var lastTime: Any = js.native
  
  var maxDelta: Double = js.native
  
  var totalTime: Double = js.native
  
  def update(): Unit = js.native
}
