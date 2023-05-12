package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromString extends StObject {
  
  /** @description The previous version of the team's notification setting if the action was `edited`. */
  var from: String
}
object FromString {
  
  inline def apply(from: String): FromString = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromString] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
  }
}
