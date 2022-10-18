package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201202409` extends StObject {
  
  /** Response */
  var `201`: ContentApplicationjsonProductionenvironment
  
  /** Merged branch response */
  var `202`: ContentApplicationjson34
  
  /** Conflict when there is a merge conflict or the commit's status checks failed */
  var `409`: Any
  
  var `422`: Content8
}
object `201202409` {
  
  inline def apply(
    `201`: ContentApplicationjsonProductionenvironment,
    `202`: ContentApplicationjson34,
    `409`: Any,
    `422`: Content8
  ): `201202409` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201202409`]
  }
  
  extension [Self <: `201202409`](x: Self) {
    
    inline def set201(value: ContentApplicationjsonProductionenvironment): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set202(value: ContentApplicationjson34): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set409(value: Any): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content8): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
