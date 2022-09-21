package typings.pizzicato.mod.Effects

import typings.pizzicato.mod.Effect
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pizzicato.pizzicato.BaseEffect & std.Required<pizzicato.pizzicato.Effects.TremoloOptions> */
trait Tremolo
  extends StObject
     with Effect {
  
  def connect(audioNode: AudioNode): this.type
  
  var depth: Double
  
  def disconnect(audioNode: AudioNode): this.type
  
  var mix: Double
  
  var speed: Double
}
/* Inlined pizzicato.pizzicato.Effects.Tremolo & {new (options : pizzicato.pizzicato.Effects.TremoloOptions | undefined): pizzicato.pizzicato.Effects.Tremolo} */
object Tremolo {
  
  inline def apply(
    connect: AudioNode => Tremolo,
    depth: Double,
    disconnect: AudioNode => Tremolo,
    mix: Double,
    speed: Double
  ): Tremolo = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), depth = depth.asInstanceOf[js.Any], disconnect = js.Any.fromFunction1(disconnect), mix = mix.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tremolo]
  }
  
  @JSImport("pizzicato", "Effects.Tremolo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.Tremolo.depth")
  @js.native
  def depth: Double = js.native
  inline def depth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("depth")(x.asInstanceOf[js.Any])
  
  inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.Tremolo.mix")
  @js.native
  def mix: Double = js.native
  inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.Tremolo.speed")
  @js.native
  def speed: Double = js.native
  inline def speed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("speed")(x.asInstanceOf[js.Any])
  
  extension [Self <: Tremolo](x: Self) {
    
    inline def setConnect(value: AudioNode => Tremolo): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDisconnect(value: AudioNode => Tremolo): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
  }
}
