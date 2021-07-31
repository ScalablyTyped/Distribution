package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectRequestedEventDataType extends StObject {
  
  var `object`: RemoteObject
}
object InspectRequestedEventDataType {
  
  @scala.inline
  def apply(`object`: RemoteObject): InspectRequestedEventDataType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectRequestedEventDataType]
  }
  
  @scala.inline
  implicit class InspectRequestedEventDataTypeMutableBuilder[Self <: InspectRequestedEventDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: RemoteObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
