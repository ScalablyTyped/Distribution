package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCommitCreatedat` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonCommitCreatedat
}
object `200ContentApplicationjsonCommitCreatedat` {
  
  inline def apply(`200`: ContentApplicationjsonCommitCreatedat): `200ContentApplicationjsonCommitCreatedat` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCommitCreatedat`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonCommitCreatedat`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonCommitCreatedat): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
