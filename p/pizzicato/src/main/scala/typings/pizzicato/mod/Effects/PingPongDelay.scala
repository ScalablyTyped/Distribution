package typings.pizzicato.mod.Effects

import typings.pizzicato.mod.Effect
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pizzicato.pizzicato.BaseEffect & std.Required<pizzicato.pizzicato.Effects.PingPongDelayOptions> */
trait PingPongDelay
  extends StObject
     with Effect {
  
  def connect(audioNode: AudioNode): this.type
  
  def disconnect(audioNode: AudioNode): this.type
  
  var feedback: Double
  
  var mix: Double
  
  var time: Double
}
/* Inlined pizzicato.pizzicato.Effects.PingPongDelay & {new (options : pizzicato.pizzicato.Effects.PingPongDelayOptions | undefined): pizzicato.pizzicato.Effects.PingPongDelay} */
object PingPongDelay {
  
  inline def apply(
    connect: AudioNode => PingPongDelay,
    disconnect: AudioNode => PingPongDelay,
    feedback: Double,
    mix: Double,
    time: Double
  ): PingPongDelay = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), feedback = feedback.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingPongDelay]
  }
  
  @JSImport("pizzicato", "Effects.PingPongDelay")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.PingPongDelay.feedback")
  @js.native
  def feedback: Double = js.native
  inline def feedback_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feedback")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.PingPongDelay.mix")
  @js.native
  def mix: Double = js.native
  inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.PingPongDelay.time")
  @js.native
  def time: Double = js.native
  inline def time_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
  
  extension [Self <: PingPongDelay](x: Self) {
    
    inline def setConnect(value: AudioNode => PingPongDelay): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setDisconnect(value: AudioNode => PingPongDelay): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
    
    inline def setFeedback(value: Double): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
