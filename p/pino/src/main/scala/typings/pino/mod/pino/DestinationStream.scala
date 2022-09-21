package typings.pino.mod.pino

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationStream extends StObject {
  
  def write(msg: String): Unit
}
object DestinationStream {
  
  inline def apply(write: String => Unit): DestinationStream = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[DestinationStream]
  }
  
  extension [Self <: DestinationStream](x: Self) {
    
    inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
