package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessDescriptions extends StObject {
  
  var accessDescriptions: js.UndefOr[String] = js.undefined
}
object AccessDescriptions {
  
  inline def apply(): AccessDescriptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessDescriptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessDescriptions] (val x: Self) extends AnyVal {
    
    inline def setAccessDescriptions(value: String): Self = StObject.set(x, "accessDescriptions", value.asInstanceOf[js.Any])
    
    inline def setAccessDescriptionsUndefined: Self = StObject.set(x, "accessDescriptions", js.undefined)
  }
}
