package typings.pizzicato.mod.Effects

import typings.pizzicato.mod.Effect
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pizzicato.pizzicato.BaseEffect & std.Required<pizzicato.pizzicato.Effects.CompressorOptions> */
trait Compressor
  extends StObject
     with Effect {
  
  var attack: Double
  
  def connect(audioNode: AudioNode): this.type
  
  def disconnect(audioNode: AudioNode): this.type
  
  var knee: Double
  
  var mix: Double
  
  var ratio: Double
  
  var release: Double
  
  var threshold: Double
}
/* Inlined pizzicato.pizzicato.Effects.Compressor & {new (options : pizzicato.pizzicato.Effects.CompressorOptions | undefined): pizzicato.pizzicato.Effects.Compressor} */
object Compressor {
  
  inline def apply(
    attack: Double,
    connect: AudioNode => Compressor,
    disconnect: AudioNode => Compressor,
    knee: Double,
    mix: Double,
    ratio: Double,
    release: Double,
    threshold: Double
  ): Compressor = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any], connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), knee = knee.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compressor]
  }
  
  @JSImport("pizzicato", "Effects.Compressor")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pizzicato", "Effects.Compressor.attack")
  @js.native
  def attack: Double = js.native
  inline def attack_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attack")(x.asInstanceOf[js.Any])
  
  inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.Compressor.knee")
  @js.native
  def knee: Double = js.native
  inline def knee_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("knee")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.Compressor.mix")
  @js.native
  def mix: Double = js.native
  inline def mix_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mix")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.Compressor.ratio")
  @js.native
  def ratio: Double = js.native
  inline def ratio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ratio")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.Compressor.release")
  @js.native
  def release: Double = js.native
  inline def release_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("release")(x.asInstanceOf[js.Any])
  
  @JSImport("pizzicato", "Effects.Compressor.threshold")
  @js.native
  def threshold: Double = js.native
  inline def threshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("threshold")(x.asInstanceOf[js.Any])
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Compressor] (val x: Self) extends AnyVal {
    
    inline def setAttack(value: Double): Self = StObject.set(x, "attack", value.asInstanceOf[js.Any])
    
    inline def setConnect(value: AudioNode => Compressor): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setDisconnect(value: AudioNode => Compressor): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
    
    inline def setKnee(value: Double): Self = StObject.set(x, "knee", value.asInstanceOf[js.Any])
    
    inline def setMix(value: Double): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: Double): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
  }
}
