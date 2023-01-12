package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content309` extends StObject {
  
  /** The list of reviews returns in chronological order. */
  var `200`: Content309
}
object `200Content309` {
  
  inline def apply(`200`: Content309): `200Content309` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content309`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content309`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content309): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
