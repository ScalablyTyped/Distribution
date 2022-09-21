package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202409422` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonStatusesurl
  
  /** Merged branch response */
  var `202`: ContentApplicationjsonMessage
  
  /** Conflict when there is a merge conflict or the commit's status checks failed */
  var `409`: Any
  
  var `422`: Content421
}
object `202409422` {
  
  inline def apply(
    `201`: ContentApplicationjsonStatusesurl,
    `202`: ContentApplicationjsonMessage,
    `409`: Any,
    `422`: Content421
  ): `202409422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202409422`]
  }
  
  extension [Self <: `202409422`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonStatusesurl): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set202(value: ContentApplicationjsonMessage): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set409(value: Any): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content421): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
