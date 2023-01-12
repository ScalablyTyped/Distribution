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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortCapability[?], D] (val x: Self & SortCapability[D]) extends AnyVal {
    
    inline def setAttributes(value: none | single | multiple): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
  }
}
