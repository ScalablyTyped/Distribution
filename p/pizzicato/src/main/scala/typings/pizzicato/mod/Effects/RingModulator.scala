package typings.pizzicato.mod.Effects

import typings.pizzicato.mod.Effect
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pizzicato.pizzicato.BaseEffect & std.Required<pizzicato.pizzicato.Effects.RingModulatorOptions> */
trait RingModulator
  extends StObject
     with Effect {
  
  def connect(audioNode: AudioNode): this.type
  
  def disconnect(audioNode: AudioNode): this.type
  
  var distortion: Double
  
  var mix: Double
  
  var speed: Double
}
/* Inlined pizzicato.pizzicato.Effects.RingModulator & {new (options : pizzicato.pizzicato.Effects.RingModulatorOptions | undefined): pizzicato.pizzicato.Effects.RingModulator} */
object RingModulator {
  
  inline def apply(
    connect: AudioNode => RingModulator,
    disconnect: AudioNode => RingModulator,
    distortion: Double,
    mix: Double,
    speed: Double
  ): RingModulator = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), distortion = distortion.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RingModulator]
  }
  
  @JSImport("pizzicato", "Effects.RingModulator")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.RingModulator.distortion")
  @js.native
  def distortion: Double = js.native
  inline def distortion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("distortion")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.RingModulator.mix")
  @js.native
  def mix: Double = js.native
  inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.RingModulator.speed")
  @js.native
  def speed: Double = js.native
  inline def speed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("speed")(x.asInstanceOf[js.Any])
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RingModulator] (val x: Self) extends AnyVal {
    
    inline def setConnect(value: AudioNode => RingModulator): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setDisconnect(value: AudioNode => RingModulator): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
    
    inline def setDistortion(value: Double): Self = StObject.set(x, "distortion", value.asInstanceOf[js.Any])
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
  }
}
