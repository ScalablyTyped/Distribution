package typings.nextAuth.anon

import typings.nextAuth.coreMod.RequestInternal
import typings.nextAuth.coreTypesMod.NextAuthOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: NextAuthOptions
  
  var req: RequestInternal
}
object Options {
  
  inline def apply(options: NextAuthOptions, req: RequestInternal): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setOptions(value: NextAuthOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setReq(value: RequestInternal): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
  }
}
