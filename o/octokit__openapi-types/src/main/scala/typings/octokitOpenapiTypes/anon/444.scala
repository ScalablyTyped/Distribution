package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `444` extends StObject {
  
  var content: ApplicationjsonDeliveriesurl
}
object `444` {
  
  inline def apply(content: ApplicationjsonDeliveriesurl): `444` = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[`444`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `444`] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ApplicationjsonDeliveriesurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
