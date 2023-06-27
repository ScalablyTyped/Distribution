package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `515` extends StObject {
  
  /** @description The html URL of the ruleset */
  var href: js.UndefOr[String] = js.undefined
}
object `515` {
  
  inline def apply(): `515` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`515`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `515`] (val x: Self) extends AnyVal {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
  }
}
