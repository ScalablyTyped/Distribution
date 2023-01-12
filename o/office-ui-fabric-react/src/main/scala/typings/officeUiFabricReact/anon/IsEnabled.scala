package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEnabled extends StObject {
  
  var isEnabled: Boolean
  
  var rootTagName: String
}
object IsEnabled {
  
  inline def apply(isEnabled: Boolean, rootTagName: String): IsEnabled = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], rootTagName = rootTagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEnabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsEnabled] (val x: Self) extends AnyVal {
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setRootTagName(value: String): Self = StObject.set(x, "rootTagName", value.asInstanceOf[js.Any])
  }
}
