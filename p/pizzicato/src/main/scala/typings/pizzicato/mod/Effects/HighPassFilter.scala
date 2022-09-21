package typings.pizzicato.mod.Effects

import typings.pizzicato.mod.Effect
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pizzicato.pizzicato.BaseEffect & std.Required<pizzicato.pizzicato.Effects.HighPassFilterOptions> */
trait HighPassFilter
  extends StObject
     with Effect {
  
  def connect(audioNode: AudioNode): this.type
  
  def disconnect(audioNode: AudioNode): this.type
  
  var frequency: Double
  
  var peak: Double
}
/* Inlined pizzicato.pizzicato.Effects.HighPassFilter & {new (options : pizzicato.pizzicato.Effects.HighPassFilterOptions | undefined): pizzicato.pizzicato.Effects.HighPassFilter} */
object HighPassFilter {
  
  inline def apply(
    connect: AudioNode => HighPassFilter,
    disconnect: AudioNode => HighPassFilter,
    frequency: Double,
    peak: Double
  ): HighPassFilter = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), frequency = frequency.asInstanceOf[js.Any], peak = peak.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighPassFilter]
  }
  
  @JSImport("pizzicato", "Effects.HighPassFilter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.HighPassFilter.frequency")
  @js.native
  def frequency: Double = js.native
  inline def frequency_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frequency")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.HighPassFilter.peak")
  @js.native
  def peak: Double = js.native
  inline def peak_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("peak")(x.asInstanceOf[js.Any])
  
  extension [Self <: HighPassFilter](x: Self) {
    
    inline def setConnect(value: AudioNode => HighPassFilter): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setDisconnect(value: AudioNode => HighPassFilter): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setPeak(value: Double): Self = StObject.set(x, "peak", value.asInstanceOf[js.Any])
  }
}
