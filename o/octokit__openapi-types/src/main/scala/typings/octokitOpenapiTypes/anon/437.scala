package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `437` extends StObject {
  
  /** @description The URL of the ruleset */
  var href: js.UndefOr[String] = js.undefined
}
object `437` {
  
  inline def apply(): `437` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`437`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `437`] (val x: Self) extends AnyVal {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
  }
}
