package typings.node.inspectorMod.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueToLocationParameterType extends StObject {
  
  /**
    * Location to continue to.
    */
  var location: Location
  
  var targetCallFrames: js.UndefOr[String] = js.undefined
}
object ContinueToLocationParameterType {
  
  @scala.inline
  def apply(location: Location): ContinueToLocationParameterType = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueToLocationParameterType]
  }
  
  @scala.inline
  implicit class ContinueToLocationParameterTypeMutableBuilder[Self <: ContinueToLocationParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCallFrames(value: String): Self = StObject.set(x, "targetCallFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCallFramesUndefined: Self = StObject.set(x, "targetCallFrames", js.undefined)
  }
}
