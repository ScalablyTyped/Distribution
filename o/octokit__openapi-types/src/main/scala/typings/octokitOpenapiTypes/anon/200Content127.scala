package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content127` extends StObject {
  
  /** @description Alternative response with extra repository information */
  var `200`: Content127
}
object `200Content127` {
  
  inline def apply(`200`: Content127): `200Content127` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content127`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content127`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content127): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
