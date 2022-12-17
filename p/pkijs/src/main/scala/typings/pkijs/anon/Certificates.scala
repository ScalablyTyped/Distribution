package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificates extends StObject {
  
  var certificates: js.UndefOr[String] = js.undefined
}
object Certificates {
  
  inline def apply(): Certificates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificates]
  }
  
  extension [Self <: Certificates](x: Self) {
    
    inline def setCertificates(value: String): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
  }
}
