package typings.pizzicato.mod.Effects

import typings.pizzicato.mod.Effect
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pizzicato.pizzicato.BaseEffect & std.Required<pizzicato.pizzicato.Effects.LowPassFilterOptions> */
trait LowPassFilter
  extends StObject
     with Effect {
  
  def connect(audioNode: AudioNode): this.type
  
  def disconnect(audioNode: AudioNode): this.type
  
  var frequency: Double
  
  var peak: Double
}
/* Inlined pizzicato.pizzicato.Effects.LowPassFilter & {new (options : pizzicato.pizzicato.Effects.LowPassFilterOptions | undefined): pizzicato.pizzicato.Effects.LowPassFilter} */
object LowPassFilter {
  
  inline def apply(
    connect: AudioNode => LowPassFilter,
    disconnect: AudioNode => LowPassFilter,
    frequency: Double,
    peak: Double
  ): LowPassFilter = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), frequency = frequency.asInstanceOf[js.Any], peak = peak.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowPassFilter]
  }
  
  @JSImport("pizzicato", "Effects.LowPassFilter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.LowPassFilter.frequency")
  @js.native
  def frequency: Double = js.native
  inline def frequency_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frequency")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.LowPassFilter.peak")
  @js.native
  def peak: Double = js.native
  inline def peak_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("peak")(x.asInstanceOf[js.Any])
  
  extension [Self <: LowPassFilter](x: Self) {
    
    inline def setConnect(value: AudioNode => LowPassFilter): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setDisconnect(value: AudioNode => LowPassFilter): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setPeak(value: Double): Self = StObject.set(x, "peak", value.asInstanceOf[js.Any])
  }
}
