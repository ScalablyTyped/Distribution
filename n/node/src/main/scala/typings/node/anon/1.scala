package typings.node.anon

import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.pkcs8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var `type`: pkcs1 | pkcs8
}
object `1` {
  
  inline def apply(`type`: pkcs1 | pkcs8): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setType(value: pkcs1 | pkcs8): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
