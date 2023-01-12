package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasChanged extends StObject {
  
  var hasChanged: Boolean
}
object HasChanged {
  
  inline def apply(hasChanged: Boolean): HasChanged = {
    val __obj = js.Dynamic.literal(hasChanged = hasChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasChanged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasChanged] (val x: Self) extends AnyVal {
    
    inline def setHasChanged(value: Boolean): Self = StObject.set(x, "hasChanged", value.asInstanceOf[js.Any])
  }
}
