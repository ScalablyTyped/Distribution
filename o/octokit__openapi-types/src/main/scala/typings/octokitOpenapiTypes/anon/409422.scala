package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `409422` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonCommitContent
  
  /** Response */
  var `201`: ContentApplicationjsonCommitContent
  
  var `404`: Content6
  
  var `409`: Content6
  
  var `422`: Content8
}
object `409422` {
  
  inline def apply(
    `200`: ContentApplicationjsonCommitContent,
    `201`: ContentApplicationjsonCommitContent,
    `404`: Content6,
    `409`: Content6,
    `422`: Content8
  ): `409422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`409422`]
  }
  
  extension [Self <: `409422`](x: Self) {
    
    inline def set200(value: ContentApplicationjsonCommitContent): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set201(value: ContentApplicationjsonCommitContent): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content6): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set409(value: Content6): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
