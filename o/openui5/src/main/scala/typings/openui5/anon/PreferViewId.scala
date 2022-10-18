package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreferViewId extends StObject {
  
  /**
    * true if selectors with view ID should have higher priority than selectors with global ID. Default value
    * is false. If one selector is requested, and there are two valid selectors - with view ID and global ID,
    * the one with view ID should be returned.
    */
  var preferViewId: Boolean
}
object PreferViewId {
  
  inline def apply(preferViewId: Boolean): PreferViewId = {
    val __obj = js.Dynamic.literal(preferViewId = preferViewId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreferViewId]
  }
  
  extension [Self <: PreferViewId](x: Self) {
    
    inline def setPreferViewId(value: Boolean): Self = StObject.set(x, "preferViewId", value.asInstanceOf[js.Any])
  }
}
