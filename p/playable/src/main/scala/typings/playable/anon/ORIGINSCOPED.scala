package typings.playable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ORIGINSCOPED extends StObject {
  
  var ORIGIN_SCOPED: Boolean
}
object ORIGINSCOPED {
  
  inline def apply(ORIGIN_SCOPED: Boolean): ORIGINSCOPED = {
    val __obj = js.Dynamic.literal(ORIGIN_SCOPED = ORIGIN_SCOPED.asInstanceOf[js.Any])
    __obj.asInstanceOf[ORIGINSCOPED]
  }
  
  extension [Self <: ORIGINSCOPED](x: Self) {
    
    inline def setORIGIN_SCOPED(value: Boolean): Self = StObject.set(x, "ORIGIN_SCOPED", value.asInstanceOf[js.Any])
  }
}
