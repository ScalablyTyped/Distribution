package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientRequestOptions
  extends StObject
     with RequestOptions {
  
  var jar: js.UndefOr[Boolean] = js.undefined
}
object ClientRequestOptions {
  
  inline def apply(): ClientRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientRequestOptions]
  }
  
  extension [Self <: ClientRequestOptions](x: Self) {
    
    inline def setJar(value: Boolean): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
    
    inline def setJarUndefined: Self = StObject.set(x, "jar", js.undefined)
  }
}
