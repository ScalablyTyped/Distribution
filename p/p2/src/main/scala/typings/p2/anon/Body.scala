package typings.p2.anon

import typings.p2.p2Strings.addBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var body: typings.p2.mod.Body
  
  var `type`: addBody
}
object Body {
  
  inline def apply(body: typings.p2.mod.Body): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("addBody")
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setBody(value: typings.p2.mod.Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setType(value: addBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
