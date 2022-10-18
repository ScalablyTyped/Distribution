package typings.multiformatsMultiaddr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bytes extends StObject {
    
    var bytes: js.typedarray.Uint8Array
  }
  object Bytes {
    
    inline def apply(bytes: js.typedarray.Uint8Array): Bytes = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bytes]
    }
    
    extension [Self <: Bytes](x: Self) {
      
      inline def setBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    }
  }
}
