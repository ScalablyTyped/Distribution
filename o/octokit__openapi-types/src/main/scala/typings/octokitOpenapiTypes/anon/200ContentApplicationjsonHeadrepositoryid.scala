package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonHeadrepositoryid` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonHeadrepositoryid
}
object `200ContentApplicationjsonHeadrepositoryid` {
  
  inline def apply(`200`: ContentApplicationjsonHeadrepositoryid): `200ContentApplicationjsonHeadrepositoryid` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonHeadrepositoryid`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonHeadrepositoryid`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonHeadrepositoryid): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
