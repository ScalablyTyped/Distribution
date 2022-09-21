package typings.pizzicato.mod.Effects

import typings.pizzicato.mod.Effect
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pizzicato.pizzicato.BaseEffect & std.Required<pizzicato.pizzicato.Effects.QuadrafuzzOptions> */
trait Quadrafuzz
  extends StObject
     with Effect {
  
  def connect(audioNode: AudioNode): this.type
  
  def disconnect(audioNode: AudioNode): this.type
  
  var highGain: Double
  
  var lowGain: Double
  
  var midHighGain: Double
  
  var midLowGain: Double
}
/* Inlined pizzicato.pizzicato.Effects.Quadrafuzz & {new (options : pizzicato.pizzicato.Effects.QuadrafuzzOptions | undefined): pizzicato.pizzicato.Effects.Quadrafuzz} */
object Quadrafuzz {
  
  inline def apply(
    connect: AudioNode => Quadrafuzz,
    disconnect: AudioNode => Quadrafuzz,
    highGain: Double,
    lowGain: Double,
    midHighGain: Double,
    midLowGain: Double
  ): Quadrafuzz = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), highGain = highGain.asInstanceOf[js.Any], lowGain = lowGain.asInstanceOf[js.Any], midHighGain = midHighGain.asInstanceOf[js.Any], midLowGain = midLowGain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quadrafuzz]
  }
  
  @JSImport("pizzicato", "Effects.Quadrafuzz")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.Quadrafuzz.highGain")
  @js.native
  def highGain: Double = js.native
  inline def highGain_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highGain")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.Quadrafuzz.lowGain")
  @js.native
  def lowGain: Double = js.native
  inline def lowGain_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lowGain")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.Quadrafuzz.midHighGain")
  @js.native
  def midHighGain: Double = js.native
  inline def midHighGain_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("midHighGain")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.Quadrafuzz.midLowGain")
  @js.native
  def midLowGain: Double = js.native
  inline def midLowGain_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("midLowGain")(x.asInstanceOf[js.Any])
  
  extension [Self <: Quadrafuzz](x: Self) {
    
    inline def setConnect(value: AudioNode => Quadrafuzz): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setDisconnect(value: AudioNode => Quadrafuzz): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
    
    inline def setHighGain(value: Double): Self = StObject.set(x, "highGain", value.asInstanceOf[js.Any])
    
    inline def setLowGain(value: Double): Self = StObject.set(x, "lowGain", value.asInstanceOf[js.Any])
    
    inline def setMidHighGain(value: Double): Self = StObject.set(x, "midHighGain", value.asInstanceOf[js.Any])
    
    inline def setMidLowGain(value: Double): Self = StObject.set(x, "midLowGain", value.asInstanceOf[js.Any])
  }
}
