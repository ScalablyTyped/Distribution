package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var items: enabled | disabled
}
object `14` {
  
  inline def apply(items: enabled | disabled): `14` = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setItems(value: enabled | disabled): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
  }
}
