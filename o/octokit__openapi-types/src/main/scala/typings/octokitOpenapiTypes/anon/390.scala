package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `390` extends StObject {
  
  var identifier: js.UndefOr[String] = js.undefined
}
object `390` {
  
  inline def apply(): `390` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`390`]
  }
  
  extension [Self <: `390`](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
  }
}
