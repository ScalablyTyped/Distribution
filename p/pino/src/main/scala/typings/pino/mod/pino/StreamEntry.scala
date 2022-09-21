package typings.pino.mod.pino

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamEntry extends StObject {
  
  var level: js.UndefOr[Level] = js.undefined
  
  var stream: DestinationStream
}
object StreamEntry {
  
  inline def apply(stream: DestinationStream): StreamEntry = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamEntry]
  }
  
  extension [Self <: StreamEntry](x: Self) {
    
    inline def setLevel(value: Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setStream(value: DestinationStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
