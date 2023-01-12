package typings.pizzicato.mod.Effects

import typings.pizzicato.mod.Effect
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pizzicato.pizzicato.BaseEffect & std.Required<pizzicato.pizzicato.Effects.DelayOptions> */
trait Delay
  extends StObject
     with Effect {
  
  def connect(audioNode: AudioNode): this.type
  
  def disconnect(audioNode: AudioNode): this.type
  
  var feedback: Double
  
  var mix: Double
  
  var time: Double
}
/* Inlined pizzicato.pizzicato.Effects.Delay & {new (options : pizzicato.pizzicato.Effects.DelayOptions | undefined): pizzicato.pizzicato.Effects.Delay} */
object Delay {
  
  inline def apply(
    connect: AudioNode => Delay,
    disconnect: AudioNode => Delay,
    feedback: Double,
    mix: Double,
    time: Double
  ): Delay = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), feedback = feedback.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
  
  @JSImport("pizzicato", "Effects.Delay")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.Delay.feedback")
  @js.native
  def feedback: Double = js.native
  inline def feedback_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feedback")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.Delay.mix")
  @js.native
  def mix: Double = js.native
  inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.Delay.time")
  @js.native
  def time: Double = js.native
  inline def time_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
    
    inline def setConnect(value: AudioNode => Delay): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setDisconnect(value: AudioNode => Delay): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
    
    inline def setFeedback(value: Double): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
