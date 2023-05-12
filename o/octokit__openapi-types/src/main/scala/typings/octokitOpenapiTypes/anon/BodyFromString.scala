package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyFromString extends StObject {
  
  var body: FromString
}
object BodyFromString {
  
  inline def apply(body: FromString): BodyFromString = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyFromString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodyFromString] (val x: Self) extends AnyVal {
    
    inline def setBody(value: FromString): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
