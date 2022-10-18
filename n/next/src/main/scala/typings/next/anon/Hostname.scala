package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hostname extends StObject {
  
  var hostname: js.UndefOr[String | Null] = js.undefined
}
object Hostname {
  
  inline def apply(): Hostname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hostname]
  }
  
  extension [Self <: Hostname](x: Self) {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
  }
}
