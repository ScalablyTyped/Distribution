package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201202422` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonTask
  
  /** @description Merged branch response */
  var `202`: ContentApplicationjsonMessage
  
  var `422`: Content414
}
object `201202422` {
  
  inline def apply(`201`: ContentApplicationjsonTask, `202`: ContentApplicationjsonMessage, `422`: Content414): `201202422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201202422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201202422`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonTask): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set202(value: ContentApplicationjsonMessage): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
