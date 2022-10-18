package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Crls extends StObject {
  
  var crls: js.UndefOr[String] = js.undefined
}
object Crls {
  
  inline def apply(): Crls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crls]
  }
  
  extension [Self <: Crls](x: Self) {
    
    inline def setCrls(value: String): Self = StObject.set(x, "crls", value.asInstanceOf[js.Any])
    
    inline def setCrlsUndefined: Self = StObject.set(x, "crls", js.undefined)
  }
}
