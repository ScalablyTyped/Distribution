package typings.pinoMultiStream

import typings.pino.mod.DestinationStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Level extends StObject {
    
    var level: js.UndefOr[typings.pinoMultiStream.mod.Level] = js.undefined
    
    var stream: DestinationStream | WritableStream[Any]
  }
  object Level {
    
    inline def apply(stream: DestinationStream | WritableStream[Any]): Level = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    extension [Self <: Level](x: Self) {
      
      inline def setLevel(value: typings.pinoMultiStream.mod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setStream(value: DestinationStream | WritableStream[Any]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
