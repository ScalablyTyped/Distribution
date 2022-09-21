package typings.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.TimeKeeper")
@js.native
open class TimeKeeper ()
  extends StObject
     with typings.phaser.spine.TimeKeeper {
  
  /* CompleteClass */
  var delta: Double = js.native
  
  /* private */ /* CompleteClass */
  var frameCount: Any = js.native
  
  /* private */ /* CompleteClass */
  var frameTime: Any = js.native
  
  /* CompleteClass */
  var framesPerSecond: Double = js.native
  
  /* private */ /* CompleteClass */
  var lastTime: Any = js.native
  
  /* CompleteClass */
  var maxDelta: Double = js.native
  
  /* CompleteClass */
  var totalTime: Double = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
}
