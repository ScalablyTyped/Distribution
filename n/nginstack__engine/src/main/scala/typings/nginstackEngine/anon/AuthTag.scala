package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthTag extends StObject {
  
  var authTag: js.typedarray.Uint8Array
  
  var data: js.typedarray.Uint8Array
}
object AuthTag {
  
  inline def apply(authTag: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array): AuthTag = {
    val __obj = js.Dynamic.literal(authTag = authTag.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthTag]
  }
  
  extension [Self <: AuthTag](x: Self) {
    
    inline def setAuthTag(value: js.typedarray.Uint8Array): Self = StObject.set(x, "authTag", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
