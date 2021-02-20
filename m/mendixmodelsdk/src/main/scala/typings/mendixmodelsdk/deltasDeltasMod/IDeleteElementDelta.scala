package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.DELETE_ELEMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeleteElementDelta
  extends IElementDelta
     with Delta {
  
  var deltaType: DELETE_ELEMENT = js.native
}
object IDeleteElementDelta {
  
  @scala.inline
  def apply(deltaType: DELETE_ELEMENT, elementId: String, unitId: String): IDeleteElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteElementDelta]
  }
  
  @scala.inline
  implicit class IDeleteElementDeltaMutableBuilder[Self <: IDeleteElementDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeltaType(value: DELETE_ELEMENT): Self = StObject.set(x, "deltaType", value.asInstanceOf[js.Any])
  }
}
