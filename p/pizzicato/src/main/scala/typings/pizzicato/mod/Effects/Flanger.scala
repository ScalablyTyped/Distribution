package typings.pizzicato.mod.Effects

import typings.pizzicato.mod.Effect
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pizzicato.pizzicato.BaseEffect & std.Required<pizzicato.pizzicato.Effects.FlangerOptions> */
trait Flanger
  extends StObject
     with Effect {
  
  def connect(audioNode: AudioNode): this.type
  
  var depth: Double
  
  def disconnect(audioNode: AudioNode): this.type
  
  var feedback: Double
  
  var mix: Double
  
  var speed: Double
  
  var time: Double
}
/* Inlined pizzicato.pizzicato.Effects.Flanger & {new (options : pizzicato.pizzicato.Effects.FlangerOptions | undefined): pizzicato.pizzicato.Effects.Flanger} */
object Flanger {
  
  inline def apply(
    connect: AudioNode => Flanger,
    depth: Double,
    disconnect: AudioNode => Flanger,
    feedback: Double,
    mix: Double,
    speed: Double,
    time: Double
  ): Flanger = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), depth = depth.asInstanceOf[js.Any], disconnect = js.Any.fromFunction1(disconnect), feedback = feedback.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flanger]
  }
  
  @JSImport("pizzicato", "Effects.Flanger")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.Flanger.depth")
  @js.native
  def depth: Double = js.native
  inline def depth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("depth")(x.asInstanceOf[js.Any])
  
  inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.Flanger.feedback")
  @js.native
  def feedback: Double = js.native
  inline def feedback_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("feedback")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.Flanger.mix")
  @js.native
  def mix: Double = js.native
  inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.Flanger.speed")
  @js.native
  def speed: Double = js.native
  inline def speed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("speed")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.Flanger.time")
  @js.native
  def time: Double = js.native
  inline def time_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
  
  extension [Self <: Flanger](x: Self) {
    
    inline def setConnect(value: AudioNode => Flanger): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDisconnect(value: AudioNode => Flanger): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
    
    inline def setFeedback(value: Double): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
