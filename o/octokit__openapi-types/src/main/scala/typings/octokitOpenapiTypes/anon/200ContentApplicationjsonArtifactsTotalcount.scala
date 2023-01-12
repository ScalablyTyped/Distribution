package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonArtifactsTotalcount` extends StObject {
  
  /** Response */
  var `200`: ContentApplicationjsonArtifactsTotalcount
}
object `200ContentApplicationjsonArtifactsTotalcount` {
  
  inline def apply(`200`: ContentApplicationjsonArtifactsTotalcount): `200ContentApplicationjsonArtifactsTotalcount` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonArtifactsTotalcount`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonArtifactsTotalcount`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonArtifactsTotalcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
