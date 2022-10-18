package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostnamePathname extends StObject {
  
  var hostname: js.UndefOr[String | Null] = js.undefined
  
  var pathname: String
}
object HostnamePathname {
  
  inline def apply(pathname: String): HostnamePathname = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostnamePathname]
  }
  
  extension [Self <: HostnamePathname](x: Self) {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
  }
}
