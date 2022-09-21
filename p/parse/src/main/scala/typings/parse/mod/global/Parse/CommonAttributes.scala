package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonAttributes extends StObject {
  
  var ACL: typings.parse.mod.global.Parse.ACL
}
object CommonAttributes {
  
  inline def apply(ACL: ACL): CommonAttributes = {
    val __obj = js.Dynamic.literal(ACL = ACL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonAttributes]
  }
  
  extension [Self <: CommonAttributes](x: Self) {
    
    inline def setACL(value: ACL): Self = StObject.set(x, "ACL", value.asInstanceOf[js.Any])
  }
}
