package typings.pizzicato.mod.Effects

import typings.pizzicato.mod.Effect
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pizzicato.pizzicato.BaseEffect & std.Required<pizzicato.pizzicato.Effects.ConvolverOptions> */
trait Convolver
  extends StObject
     with Effect {
  
  def connect(audioNode: AudioNode): this.type
  
  def disconnect(audioNode: AudioNode): this.type
  
  var impulse: String
  
  var mix: Double
}
/* Inlined pizzicato.pizzicato.Effects.Convolver & {new (options : pizzicato.pizzicato.Effects.ConvolverOptions): pizzicato.pizzicato.Effects.Convolver} */
object Convolver {
  
  inline def apply(connect: AudioNode => Convolver, disconnect: AudioNode => Convolver, impulse: String, mix: Double): Convolver = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), impulse = impulse.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Convolver]
  }
  
  @JSImport("pizzicato", "Effects.Convolver")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.Convolver.impulse")
  @js.native
  def impulse: String = js.native
  inline def impulse_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("impulse")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.Convolver.mix")
  @js.native
  def mix: Double = js.native
  inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Convolver] (val x: Self) extends AnyVal {
    
    inline def setConnect(value: AudioNode => Convolver): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setDisconnect(value: AudioNode => Convolver): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
    
    inline def setImpulse(value: String): Self = StObject.set(x, "impulse", value.asInstanceOf[js.Any])
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
  }
}
