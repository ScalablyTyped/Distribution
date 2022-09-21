package typings.pizzicato.mod.Effects

import typings.pizzicato.mod.Effect
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pizzicato.pizzicato.BaseEffect & std.Required<pizzicato.pizzicato.Effects.DistortionOptions> */
trait Distortion
  extends StObject
     with Effect {
  
  def connect(audioNode: AudioNode): this.type
  
  def disconnect(audioNode: AudioNode): this.type
  
  var gain: Double
}
/* Inlined pizzicato.pizzicato.Effects.Distortion & {new (options : pizzicato.pizzicato.Effects.DistortionOptions | undefined): pizzicato.pizzicato.Effects.Distortion} */
object Distortion {
  
  inline def apply(connect: AudioNode => Distortion, disconnect: AudioNode => Distortion, gain: Double): Distortion = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), gain = gain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distortion]
  }
  
  @JSImport("pizzicato", "Effects.Distortion")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.Distortion.gain")
  @js.native
  def gain: Double = js.native
  inline def gain_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gain")(x.asInstanceOf[js.Any])
  
  extension [Self <: Distortion](x: Self) {
    
    inline def setConnect(value: AudioNode => Distortion): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setDisconnect(value: AudioNode => Distortion): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
    
    inline def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
  }
}
