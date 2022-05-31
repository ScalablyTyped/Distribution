package typings.oracleOraclejet.ojdataproviderMod

import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortCapability[D] extends StObject {
  
  var attributes: none | single | multiple
}
object SortCapability {
  
  inline def apply[D](attributes: none | single | multiple): SortCapability[D] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCapability[D]]
  }
  
  extension [Self <: SortCapability[?], D](x: Self & SortCapability[D]) {
    
    inline def setAttributes(value: none | single | multiple): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
  }
}
