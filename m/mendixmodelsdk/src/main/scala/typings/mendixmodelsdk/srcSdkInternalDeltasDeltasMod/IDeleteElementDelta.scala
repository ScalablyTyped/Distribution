package typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.DELETE_ELEMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDeleteElementDelta
  extends StObject
     with IElementDelta
     with Delta {
  
  var deltaType: DELETE_ELEMENT
}
object IDeleteElementDelta {
  
  inline def apply(elementId: String, unitId: String): IDeleteElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = "DELETE_ELEMENT", elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteElementDelta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDeleteElementDelta] (val x: Self) extends AnyVal {
    
    inline def setDeltaType(value: DELETE_ELEMENT): Self = StObject.set(x, "deltaType", value.asInstanceOf[js.Any])
  }
}
