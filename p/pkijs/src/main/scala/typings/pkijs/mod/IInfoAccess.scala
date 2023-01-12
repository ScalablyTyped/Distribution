package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInfoAccess extends StObject {
  
  var accessDescriptions: js.Array[AccessDescription]
}
object IInfoAccess {
  
  inline def apply(accessDescriptions: js.Array[AccessDescription]): IInfoAccess = {
    val __obj = js.Dynamic.literal(accessDescriptions = accessDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfoAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IInfoAccess] (val x: Self) extends AnyVal {
    
    inline def setAccessDescriptions(value: js.Array[AccessDescription]): Self = StObject.set(x, "accessDescriptions", value.asInstanceOf[js.Any])
    
    inline def setAccessDescriptionsVarargs(value: AccessDescription*): Self = StObject.set(x, "accessDescriptions", js.Array(value*))
  }
}
