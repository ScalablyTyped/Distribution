package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonGittagsurl` extends StObject {
  
  /** @description Alternative response with extra repository information */
  var `200`: ContentApplicationjsonGittagsurl
}
object `200ContentApplicationjsonGittagsurl` {
  
  inline def apply(`200`: ContentApplicationjsonGittagsurl): `200ContentApplicationjsonGittagsurl` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonGittagsurl`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonGittagsurl`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonGittagsurl): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
