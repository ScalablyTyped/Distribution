package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `202400422` extends StObject {
  
  var `202`: ContentApplicationjsonRecord
  
  var `400`: ContentApplicationjsonApplicationscimjson
  
  var `422`: Content346
}
object `202400422` {
  
  inline def apply(
    `202`: ContentApplicationjsonRecord,
    `400`: ContentApplicationjsonApplicationscimjson,
    `422`: Content346
  ): `202400422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`202400422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `202400422`] (val x: Self) extends AnyVal {
    
    inline def set202(value: ContentApplicationjsonRecord): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set400(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
