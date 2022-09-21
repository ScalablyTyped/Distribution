package typings.pizzicato.mod.Effects

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("pizzicato", "Effects.PingPongDelay")
@js.native
open class PingPongDelayCls ()
  extends StObject
     with PingPongDelay {
  def this(options: PingPongDelayOptions) = this()
  
  /* CompleteClass */
  override def connect(audioNode: AudioNode): this.type = js.native
  
  /* CompleteClass */
  override def disconnect(audioNode: AudioNode): this.type = js.native
  
  /* CompleteClass */
  var feedback: Double = js.native
  
  /* CompleteClass */
  var mix: Double = js.native
  
  /* CompleteClass */
  var time: Double = js.native
}
