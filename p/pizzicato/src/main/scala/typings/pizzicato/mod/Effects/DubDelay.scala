package typings.pizzicato.mod.Effects

import typings.pizzicato.mod.Effect
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pizzicato.pizzicato.BaseEffect & std.Required<pizzicato.pizzicato.Effects.DubDelayOptions> */
trait DubDelay
  extends StObject
     with Effect {
  
  def connect(audioNode: AudioNode): this.type
  
  var cutoff: Double
  
  def disconnect(audioNode: AudioNode): this.type
  
  var feedback: Double
  
  var mix: Double
  
  var time: Double
}
/* Inlined pizzicato.pizzicato.Effects.DubDelay & {new (options : pizzicato.pizzicato.Effects.DubDelayOptions | undefined): pizzicato.pizzicato.Effects.DubDelay} */
object DubDelay {
  
  inline def apply(
    connect: AudioNode => DubDelay,
    cutoff: Double,
    disconnect: AudioNode => DubDelay,
    feedback: Double,
    mix: Double,
    time: Double
  ): DubDelay = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), cutoff = cutoff.asInstanceOf[js.Any], disconnect = js.Any.fromFunction1(disconnect), feedback = feedback.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[DubDelay]
  }
  
  @JSImport("pizzicato", "Effects.DubDelay")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.DubDelay.cutoff")
  @js.native
  def cutoff: Double = js.native
  inline def cutoff_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cutoff")(x.asInstanceOf[js.Any])
  
  inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.DubDelay.feedback")
  @js.native
  def feedback: Double = js.native
  inline def feedback_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feedback")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.DubDelay.mix")
  @js.native
  def mix: Double = js.native
  inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.DubDelay.time")
  @js.native
  def time: Double = js.native
  inline def time_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DubDelay] (val x: Self) extends AnyVal {
    
    inline def setConnect(value: AudioNode => DubDelay): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setCutoff(value: Double): Self = StObject.set(x, "cutoff", value.asInstanceOf[js.Any])
    
    inline def setDisconnect(value: AudioNode => DubDelay): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
    
    inline def setFeedback(value: Double): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
