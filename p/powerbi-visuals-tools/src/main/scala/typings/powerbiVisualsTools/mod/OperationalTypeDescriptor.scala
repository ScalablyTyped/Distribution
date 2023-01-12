package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationalTypeDescriptor extends StObject {
  
  val searchEnabled: js.UndefOr[Boolean] = js.undefined
}
object OperationalTypeDescriptor {
  
  inline def apply(): OperationalTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationalTypeDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationalTypeDescriptor] (val x: Self) extends AnyVal {
    
    inline def setSearchEnabled(value: Boolean): Self = StObject.set(x, "searchEnabled", value.asInstanceOf[js.Any])
    
    inline def setSearchEnabledUndefined: Self = StObject.set(x, "searchEnabled", js.undefined)
  }
}
