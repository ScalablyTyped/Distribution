package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsMeasured extends StObject {
  
  var isMeasured: Boolean
}
object IsMeasured {
  
  inline def apply(isMeasured: Boolean): IsMeasured = {
    val __obj = js.Dynamic.literal(isMeasured = isMeasured.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMeasured]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsMeasured] (val x: Self) extends AnyVal {
    
    inline def setIsMeasured(value: Boolean): Self = StObject.set(x, "isMeasured", value.asInstanceOf[js.Any])
  }
}
