package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapValue extends StObject {
  
  var snapValue: Boolean
}
object SnapValue {
  
  inline def apply(snapValue: Boolean): SnapValue = {
    val __obj = js.Dynamic.literal(snapValue = snapValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapValue] (val x: Self) extends AnyVal {
    
    inline def setSnapValue(value: Boolean): Self = StObject.set(x, "snapValue", value.asInstanceOf[js.Any])
  }
}
