package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202400422` extends StObject {
  
  var `202`: Content40
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `422`: Content397
}
object `202400422` {
  
  inline def apply(`202`: Content40, `400`: ContentApplicationjsonApplicationscimjson, `422`: Content397): `202400422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202400422`]
  }
  
  extension [Self <: `202400422`](x: Self) {
    
    inline def set202(value: Content40): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content397): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
