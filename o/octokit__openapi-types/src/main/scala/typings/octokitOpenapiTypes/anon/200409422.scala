package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200409422` extends StObject {
  
  /** The branch has been successfully synced with the upstream repository */
  var `200`: Content285
  
  /** The branch could not be synced because of a merge conflict */
  var `409`: Any
  
  /** The branch could not be synced for some other reason */
  var `422`: Any
}
object `200409422` {
  
  inline def apply(`200`: Content285, `409`: Any, `422`: Any): `200409422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("409")(`409`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200409422`]
  }
  
  extension [Self <: `200409422`](x: Self) {
    
    inline def set200(value: Content285): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set409(value: Any): Self = StObject.set(x, "409", value.asInstanceOf[js.Any])
    
    inline def set422(value: Any): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
