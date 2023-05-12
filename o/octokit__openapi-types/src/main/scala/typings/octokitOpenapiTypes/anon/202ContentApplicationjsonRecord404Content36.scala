package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202ContentApplicationjsonRecord404Content36` extends StObject {
  
  /** @description User is getting converted asynchronously */
  var `202`: ContentApplicationjsonRecord
  
  var `404`: Content36
}
object `202ContentApplicationjsonRecord404Content36` {
  
  inline def apply(`202`: ContentApplicationjsonRecord, `404`: Content36): `202ContentApplicationjsonRecord404Content36` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202ContentApplicationjsonRecord404Content36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `202ContentApplicationjsonRecord404Content36`] (val x: Self) extends AnyVal {
    
    inline def set202(value: ContentApplicationjsonRecord): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
