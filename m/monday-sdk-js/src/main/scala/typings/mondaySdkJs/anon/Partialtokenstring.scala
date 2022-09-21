package typings.mondaySdkJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  token :string}> */
trait Partialtokenstring extends StObject {
  
  var token: js.UndefOr[String] = js.undefined
}
object Partialtokenstring {
  
  inline def apply(): Partialtokenstring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialtokenstring]
  }
  
  extension [Self <: Partialtokenstring](x: Self) {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
