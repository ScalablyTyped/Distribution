package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonDownloadcount` extends StObject {
  
  /** @description Response for successful upload */
  var `201`: ContentApplicationjsonDownloadcount
}
object `201ContentApplicationjsonDownloadcount` {
  
  inline def apply(`201`: ContentApplicationjsonDownloadcount): `201ContentApplicationjsonDownloadcount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonDownloadcount`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonDownloadcount`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonDownloadcount): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
  }
}
