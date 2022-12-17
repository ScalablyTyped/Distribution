package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `359` extends StObject {
  
  /**
    * @description Denotes whether an email is publicly visible.
    * @enum {string}
    */
  var visibility: public | `private`
}
object `359` {
  
  inline def apply(visibility: public | `private`): `359` = {
    val __obj = js.Dynamic.literal(visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[`359`]
  }
  
  extension [Self <: `359`](x: Self) {
    
    inline def setVisibility(value: public | `private`): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
