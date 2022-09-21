package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableDefaultTimestamp extends StObject {
  
  var disableDefaultTimestamp: js.UndefOr[Boolean] = js.undefined
}
object DisableDefaultTimestamp {
  
  inline def apply(): DisableDefaultTimestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableDefaultTimestamp]
  }
  
  extension [Self <: DisableDefaultTimestamp](x: Self) {
    
    inline def setDisableDefaultTimestamp(value: Boolean): Self = StObject.set(x, "disableDefaultTimestamp", value.asInstanceOf[js.Any])
    
    inline def setDisableDefaultTimestampUndefined: Self = StObject.set(x, "disableDefaultTimestamp", js.undefined)
  }
}
