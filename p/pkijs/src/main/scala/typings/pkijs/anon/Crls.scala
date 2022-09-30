package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Crls extends StObject {
  
  var certs: js.UndefOr[String] = js.undefined
  
  var crls: js.UndefOr[String] = js.undefined
}
object Crls {
  
  inline def apply(): Crls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crls]
  }
  
  extension [Self <: Crls](x: Self) {
    
    inline def setCerts(value: String): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setCertsUndefined: Self = StObject.set(x, "certs", js.undefined)
    
    inline def setCrls(value: String): Self = StObject.set(x, "crls", value.asInstanceOf[js.Any])
    
    inline def setCrlsUndefined: Self = StObject.set(x, "crls", js.undefined)
  }
}
