package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyFromTo extends StObject {
  
  var body: FromTo
}
object BodyFromTo {
  
  inline def apply(body: FromTo): BodyFromTo = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyFromTo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodyFromTo] (val x: Self) extends AnyVal {
    
    inline def setBody(value: FromTo): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
