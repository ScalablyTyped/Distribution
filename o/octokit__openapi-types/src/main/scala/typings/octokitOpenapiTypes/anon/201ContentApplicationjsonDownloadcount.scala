package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonDownloadcount` extends StObject {
  
  /** Response for successful upload */
  var `201`: ContentApplicationjsonDownloadcount
  
  /** Response if you upload an asset with the same filename as another uploaded asset */
  var `422`: Any
}
object `201ContentApplicationjsonDownloadcount` {
  
  inline def apply(`201`: ContentApplicationjsonDownloadcount, `422`: Any): `201ContentApplicationjsonDownloadcount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonDownloadcount`]
  }
  
  extension [Self <: `201ContentApplicationjsonDownloadcount`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonDownloadcount): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set422(value: Any): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
