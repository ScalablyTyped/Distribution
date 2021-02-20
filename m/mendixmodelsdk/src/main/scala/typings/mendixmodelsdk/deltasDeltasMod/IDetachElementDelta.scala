package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.DETACH_ELEMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDetachElementDelta
  extends IElementDelta
     with Delta {
  
  var deltaType: DETACH_ELEMENT = js.native
}
object IDetachElementDelta {
  
  @scala.inline
  def apply(deltaType: DETACH_ELEMENT, elementId: String, unitId: String): IDetachElementDelta = {
    val __obj = js.Dynamic.literal(deltaType = deltaType.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetachElementDelta]
  }
  
  @scala.inline
  implicit class IDetachElementDeltaMutableBuilder[Self <: IDetachElementDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeltaType(value: DETACH_ELEMENT): Self = StObject.set(x, "deltaType", value.asInstanceOf[js.Any])
  }
}
