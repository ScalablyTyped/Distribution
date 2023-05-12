package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202ContentApplicationjsonUrl` extends StObject {
  
  /** @description Response */
  var `202`: ContentApplicationjsonUrl
}
object `202ContentApplicationjsonUrl` {
  
  inline def apply(`202`: ContentApplicationjsonUrl): `202ContentApplicationjsonUrl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202ContentApplicationjsonUrl`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `202ContentApplicationjsonUrl`] (val x: Self) extends AnyVal {
    
    inline def set202(value: ContentApplicationjsonUrl): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
  }
}
