package typings.node.anon

import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.pkcs8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: pkcs1 | pkcs8
}
object Type {
  
  inline def apply(`type`: pkcs1 | pkcs8): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: pkcs1 | pkcs8): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
