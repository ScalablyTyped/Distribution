package typings.pixiSpineRuntime41.mod

import typings.pixiSpineBase.mod.IEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Stores the current pose values for an {@link Event}.
  *
  * See Timeline {@link Timeline#apply()},
  * AnimationStateListener {@link AnimationStateListener#event()}, and
  * [Events](http://esotericsoftware.com/spine-events) in the Spine User Guide.
  * @public
  * */
@JSImport("@pixi-spine/runtime-4.1", "Event")
@js.native
open class Event protected ()
  extends StObject
     with Event2 {
  def this(time: Double, data: EventData) = this()
  
  /* CompleteClass */
  var balance: Double = js.native
  
  /* CompleteClass */
  var data: IEventData = js.native
  /* CompleteClass */
  @JSName("data")
  var data_Event2: EventData = js.native
  
  /* CompleteClass */
  var floatValue: Double = js.native
  
  /* CompleteClass */
  var intValue: Double = js.native
  
  /* CompleteClass */
  var stringValue: String | Null = js.native
  
  /* CompleteClass */
  var time: Double = js.native
  
  /* CompleteClass */
  var volume: Double = js.native
}
