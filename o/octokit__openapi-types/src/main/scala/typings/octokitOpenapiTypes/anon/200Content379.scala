package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content379` extends StObject {
  
  /** @description The list of reviews returns in chronological order. */
  var `200`: Content379
}
object `200Content379` {
  
  inline def apply(`200`: Content379): `200Content379` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content379`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content379`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content379): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
  }
}
