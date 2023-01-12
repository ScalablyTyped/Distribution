package typings.obsStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleInfo extends StObject {
  
  var visible: Boolean
}
object VisibleInfo {
  
  inline def apply(visible: Boolean): VisibleInfo = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibleInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisibleInfo] (val x: Self) extends AnyVal {
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
