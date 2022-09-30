package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneralNames extends StObject {
  
  var generalNames: js.UndefOr[String] = js.undefined
}
object GeneralNames {
  
  inline def apply(): GeneralNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneralNames]
  }
  
  extension [Self <: GeneralNames](x: Self) {
    
    inline def setGeneralNames(value: String): Self = StObject.set(x, "generalNames", value.asInstanceOf[js.Any])
    
    inline def setGeneralNamesUndefined: Self = StObject.set(x, "generalNames", js.undefined)
  }
}
