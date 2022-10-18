package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `199` extends StObject {
  
  /**
    * @description Denotes whether an email is publicly visible.
    * @enum {string}
    */
  var visibility: public | `private`
}
object `199` {
  
  inline def apply(visibility: public | `private`): `199` = {
    val __obj = js.Dynamic.literal(visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[`199`]
  }
  
  extension [Self <: `199`](x: Self) {
    
    inline def setVisibility(value: public | `private`): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
