package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonArtifacts` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonArtifacts
}
object `200ContentApplicationjsonArtifacts` {
  
  inline def apply(`200`: ContentApplicationjsonArtifacts): `200ContentApplicationjsonArtifacts` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonArtifacts`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonArtifacts`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonArtifacts): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
