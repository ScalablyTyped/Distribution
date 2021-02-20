package typings.oracleOraclejet.ojdataproviderMod

import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortCapability[D] extends StObject {
  
  var attributes: none | single | multiple = js.native
}
object SortCapability {
  
  @scala.inline
  def apply[D](attributes: none | single | multiple): SortCapability[D] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCapability[D]]
  }
  
  @scala.inline
  implicit class SortCapabilityMutableBuilder[Self <: SortCapability[_], D] (val x: Self with SortCapability[D]) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: none | single | multiple): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
  }
}
