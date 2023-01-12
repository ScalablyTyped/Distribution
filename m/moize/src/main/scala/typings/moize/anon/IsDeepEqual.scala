package typings.moize.anon

import typings.moize.moizeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDeepEqual extends StObject {
  
  var isDeepEqual: `true`
}
object IsDeepEqual {
  
  inline def apply(): IsDeepEqual = {
    val __obj = js.Dynamic.literal(isDeepEqual = true)
    __obj.asInstanceOf[IsDeepEqual]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsDeepEqual] (val x: Self) extends AnyVal {
    
    inline def setIsDeepEqual(value: `true`): Self = StObject.set(x, "isDeepEqual", value.asInstanceOf[js.Any])
  }
}
