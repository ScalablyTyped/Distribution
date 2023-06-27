package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `28` extends StObject {
  
  /** @example <https://api.github.com/users?since=135>; rel="next" */
  var Link: js.UndefOr[String] = js.undefined
}
object `28` {
  
  inline def apply(): `28` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`28`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `28`] (val x: Self) extends AnyVal {
    
    inline def setLink(value: String): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "Link", js.undefined)
  }
}
