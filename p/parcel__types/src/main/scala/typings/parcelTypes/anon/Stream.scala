package typings.parcelTypes.anon

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stream extends StObject {
  
  var stream: Readable
  
  var `type`: js.UndefOr[String] = js.undefined
}
object Stream {
  
  inline def apply(stream: Readable): Stream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
  
  extension [Self <: Stream](x: Self) {
    
    inline def setStream(value: Readable): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
