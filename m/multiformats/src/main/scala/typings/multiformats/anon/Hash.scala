package typings.multiformats.anon

import typings.multiformats.cidMod.CIDVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash extends StObject {
  
  var code: Double
  
  var hash: js.typedarray.Uint8Array
  
  var version: CIDVersion
}
object Hash {
  
  inline def apply(code: Double, hash: js.typedarray.Uint8Array, version: CIDVersion): Hash = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  extension [Self <: Hash](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setHash(value: js.typedarray.Uint8Array): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: CIDVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
