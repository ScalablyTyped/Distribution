package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `728` extends StObject {
  
  var `202`: ContentApplicationjsonRecord
}
object `728` {
  
  inline def apply(`202`: ContentApplicationjsonRecord): `728` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`728`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `728`] (val x: Self) extends AnyVal {
    
    inline def set202(value: ContentApplicationjsonRecord): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
  }
}
