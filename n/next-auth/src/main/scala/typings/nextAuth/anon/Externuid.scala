package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Externuid extends StObject {
  
  var extern_uid: String
  
  var provider: String
}
object Externuid {
  
  inline def apply(extern_uid: String, provider: String): Externuid = {
    val __obj = js.Dynamic.literal(extern_uid = extern_uid.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Externuid]
  }
  
  extension [Self <: Externuid](x: Self) {
    
    inline def setExtern_uid(value: String): Self = StObject.set(x, "extern_uid", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
