package typings.pixiSpineRuntime38.mod

import typings.pixiSpineBase.mod.IEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @public
  */
@JSImport("@pixi-spine/runtime-3.8", "Event")
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
  var stringValue: String = js.native
  
  /* CompleteClass */
  var time: Double = js.native
  
  /* CompleteClass */
  var volume: Double = js.native
}
