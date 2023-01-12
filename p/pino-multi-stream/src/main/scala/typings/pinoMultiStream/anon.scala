package typings.pinoMultiStream

import typings.node.NodeJS.WritableStream
import typings.pino.mod.DestinationStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Level extends StObject {
    
    var level: js.UndefOr[typings.pinoMultiStream.mod.Level] = js.undefined
    
    var stream: DestinationStream | WritableStream
  }
  object Level {
    
    inline def apply(stream: DestinationStream | WritableStream): Level = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: typings.pinoMultiStream.mod.Level): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setStream(value: DestinationStream | WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
