package typings.nobleEd25519

import typings.nobleEd25519.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Head extends StObject {
    
    var head: js.typedarray.Uint8Array
    
    var point: Point
    
    var pointBytes: js.typedarray.Uint8Array
    
    var prefix: js.typedarray.Uint8Array
    
    var scalar: js.BigInt
  }
  object Head {
    
    inline def apply(
      head: js.typedarray.Uint8Array,
      point: Point,
      pointBytes: js.typedarray.Uint8Array,
      prefix: js.typedarray.Uint8Array,
      scalar: js.BigInt
    ): Head = {
      val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], pointBytes = pointBytes.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], scalar = scalar.asInstanceOf[js.Any])
      __obj.asInstanceOf[Head]
    }
    
    extension [Self <: Head](x: Self) {
      
      inline def setHead(value: js.typedarray.Uint8Array): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPointBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "pointBytes", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: js.typedarray.Uint8Array): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setScalar(value: js.BigInt): Self = StObject.set(x, "scalar", value.asInstanceOf[js.Any])
    }
  }
}
