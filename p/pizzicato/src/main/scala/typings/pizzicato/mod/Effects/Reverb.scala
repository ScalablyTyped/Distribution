package typings.pizzicato.mod.Effects

import typings.pizzicato.mod.Effect
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pizzicato.pizzicato.BaseEffect & std.Required<pizzicato.pizzicato.Effects.ReverbOptions> */
trait Reverb
  extends StObject
     with Effect {
  
  def connect(audioNode: AudioNode): this.type
  
  var decay: Double
  
  def disconnect(audioNode: AudioNode): this.type
  
  var mix: Double
  
  var reverse: Boolean
  
  var time: Double
}
/* Inlined pizzicato.pizzicato.Effects.Reverb & {new (options : pizzicato.pizzicato.Effects.ReverbOptions | undefined): pizzicato.pizzicato.Effects.Reverb} */
object Reverb {
  
  inline def apply(
    connect: AudioNode => Reverb,
    decay: Double,
    disconnect: AudioNode => Reverb,
    mix: Double,
    reverse: Boolean,
    time: Double
  ): Reverb = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), decay = decay.asInstanceOf[js.Any], disconnect = js.Any.fromFunction1(disconnect), mix = mix.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reverb]
  }
  
  @JSImport("pizzicato", "Effects.Reverb")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.Reverb.decay")
  @js.native
  def decay: Double = js.native
  inline def decay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decay")(x.asInstanceOf[js.Any])
  
  inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.Reverb.mix")
  @js.native
  def mix: Double = js.native
  inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.Reverb.reverse")
  @js.native
  def reverse: Boolean = js.native
  inline def reverse_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reverse")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.Reverb.time")
  @js.native
  def time: Double = js.native
  inline def time_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reverb] (val x: Self) extends AnyVal {
    
    inline def setConnect(value: AudioNode => Reverb): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setDecay(value: Double): Self = StObject.set(x, "decay", value.asInstanceOf[js.Any])
    
    inline def setDisconnect(value: AudioNode => Reverb): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
