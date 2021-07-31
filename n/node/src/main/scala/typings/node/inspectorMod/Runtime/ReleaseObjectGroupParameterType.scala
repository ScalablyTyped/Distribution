package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseObjectGroupParameterType extends StObject {
  
  /**
    * Symbolic object group name.
    */
  var objectGroup: String
}
object ReleaseObjectGroupParameterType {
  
  @scala.inline
  def apply(objectGroup: String): ReleaseObjectGroupParameterType = {
    val __obj = js.Dynamic.literal(objectGroup = objectGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseObjectGroupParameterType]
  }
  
  @scala.inline
  implicit class ReleaseObjectGroupParameterTypeMutableBuilder[Self <: ReleaseObjectGroupParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectGroup(value: String): Self = StObject.set(x, "objectGroup", value.asInstanceOf[js.Any])
  }
}
