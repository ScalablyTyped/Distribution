package typings.moize.anon

import typings.moize.moizeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsShallowEqual extends StObject {
  
  var isShallowEqual: `true`
}
object IsShallowEqual {
  
  inline def apply(): IsShallowEqual = {
    val __obj = js.Dynamic.literal(isShallowEqual = true)
    __obj.asInstanceOf[IsShallowEqual]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsShallowEqual] (val x: Self) extends AnyVal {
    
    inline def setIsShallowEqual(value: `true`): Self = StObject.set(x, "isShallowEqual", value.asInstanceOf[js.Any])
  }
}
