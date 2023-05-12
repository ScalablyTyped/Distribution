package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenTypeExtension
  extends StObject
     with Entity {
  
  // A unique text identifier for an open type data extension. Optional.
  var extensionName: js.UndefOr[String] = js.undefined
}
object OpenTypeExtension {
  
  inline def apply(): OpenTypeExtension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenTypeExtension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenTypeExtension] (val x: Self) extends AnyVal {
    
    inline def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    inline def setExtensionNameUndefined: Self = StObject.set(x, "extensionName", js.undefined)
  }
}
