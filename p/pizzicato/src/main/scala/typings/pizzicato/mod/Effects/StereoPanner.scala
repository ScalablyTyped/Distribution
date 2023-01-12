package typings.pizzicato.mod.Effects

import typings.pizzicato.mod.Effect
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pizzicato.pizzicato.BaseEffect & std.Required<pizzicato.pizzicato.Effects.StereoPannerOptions> */
trait StereoPanner
  extends StObject
     with Effect {
  
  def connect(audioNode: AudioNode): this.type
  
  def disconnect(audioNode: AudioNode): this.type
  
  var pan: Double
}
/* Inlined pizzicato.pizzicato.Effects.StereoPanner & {new (options : pizzicato.pizzicato.Effects.StereoPannerOptions | undefined): pizzicato.pizzicato.Effects.StereoPanner} */
object StereoPanner {
  
  inline def apply(connect: AudioNode => StereoPanner, disconnect: AudioNode => StereoPanner, pan: Double): StereoPanner = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), pan = pan.asInstanceOf[js.Any])
    __obj.asInstanceOf[StereoPanner]
  }
  
  @JSImport("pizzicato", "Effects.StereoPanner")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  inline def disconnect(audioNode: AudioNode): this.type = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")(audioNode.asInstanceOf[js.Any]).asInstanceOf[this.type]
  
  @JSImport("pizzicato", "Effects.StereoPanner.pan")
  @js.native
  def pan: Double = js.native
  inline def pan_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pan")(x.asInstanceOf[js.Any])
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StereoPanner] (val x: Self) extends AnyVal {
    
    inline def setConnect(value: AudioNode => StereoPanner): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setDisconnect(value: AudioNode => StereoPanner): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
    
    inline def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
  }
}
