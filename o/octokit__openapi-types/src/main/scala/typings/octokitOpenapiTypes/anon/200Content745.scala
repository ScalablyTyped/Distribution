package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content745` extends StObject {
  
  /** @description The list of reviews returns in chronological order. */
  var `200`: Content745
}
object `200Content745` {
  
  inline def apply(`200`: Content745): `200Content745` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content745`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content745`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content745): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
