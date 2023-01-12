package typings.pizzicato.mod

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseEffect extends StObject {
  
  def connect(audioNode: AudioNode): this.type
  
  def disconnect(audioNode: AudioNode): this.type
}
object BaseEffect {
  
  inline def apply(connect: AudioNode => BaseEffect, disconnect: AudioNode => BaseEffect): BaseEffect = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect))
    __obj.asInstanceOf[BaseEffect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseEffect] (val x: Self) extends AnyVal {
    
    inline def setConnect(value: AudioNode => BaseEffect): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setDisconnect(value: AudioNode => BaseEffect): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
  }
}
