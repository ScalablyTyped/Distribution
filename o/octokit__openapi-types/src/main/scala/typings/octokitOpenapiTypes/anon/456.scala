package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `456` extends StObject {
  
  /**
    * @description Denotes whether an email is publicly visible.
    * @enum {string}
    */
  var visibility: public | `private`
}
object `456` {
  
  inline def apply(visibility: public | `private`): `456` = {
    val __obj = js.Dynamic.literal(visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[`456`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `456`] (val x: Self) extends AnyVal {
    
    inline def setVisibility(value: public | `private`): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
