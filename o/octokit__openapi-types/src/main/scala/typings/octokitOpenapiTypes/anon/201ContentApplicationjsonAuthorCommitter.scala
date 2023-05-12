package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201ContentApplicationjsonAuthorCommitter` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonAuthorCommitter
  
  var `404`: Content36
  
  var `422`: Content346
}
object `201ContentApplicationjsonAuthorCommitter` {
  
  inline def apply(`201`: ContentApplicationjsonAuthorCommitter, `404`: Content36, `422`: Content346): `201ContentApplicationjsonAuthorCommitter` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201ContentApplicationjsonAuthorCommitter`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201ContentApplicationjsonAuthorCommitter`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonAuthorCommitter): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
