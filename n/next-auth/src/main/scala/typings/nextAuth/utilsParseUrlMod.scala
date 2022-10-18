package typings.nextAuth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsParseUrlMod {
  
  @JSImport("next-auth/utils/parse-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): InternalUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[InternalUrl]
  inline def default(url: String): InternalUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[InternalUrl]
  
  trait InternalUrl extends StObject {
    
    /** @default "http://localhost:3000/api/auth" */
    var base: String
    
    /** @default "localhost:3000" */
    var host: String
    
    /** @default "http://localhost:3000" */
    var origin: String
    
    /** @default "/api/auth" */
    var path: String
  }
  object InternalUrl {
    
    inline def apply(base: String, host: String, origin: String, path: String): InternalUrl = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalUrl]
    }
    
    extension [Self <: InternalUrl](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
