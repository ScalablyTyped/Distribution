package typings.multihashes

import typings.multihashes.mod.HashCode
import typings.multihashes.mod.HashName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: HashCode
    
    var digest: js.typedarray.Uint8Array
    
    var length: Double
    
    var name: HashName
  }
  object Code {
    
    inline def apply(code: HashCode, digest: js.typedarray.Uint8Array, length: Double, name: HashName): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: HashCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDigest(value: js.typedarray.Uint8Array): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setName(value: HashName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
