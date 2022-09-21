package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signed extends StObject {
  
  var signed: js.UndefOr[Boolean] = js.undefined
}
object Signed {
  
  inline def apply(): Signed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Signed]
  }
  
  extension [Self <: Signed](x: Self) {
    
    inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
    
    inline def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
  }
}
