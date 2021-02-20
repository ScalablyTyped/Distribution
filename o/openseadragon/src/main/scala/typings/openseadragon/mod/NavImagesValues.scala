package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavImagesValues extends StObject {
  
  var DOWN: String = js.native
  
  var GROUP: String = js.native
  
  var HOVER: String = js.native
  
  var REST: String = js.native
}
object NavImagesValues {
  
  @scala.inline
  def apply(DOWN: String, GROUP: String, HOVER: String, REST: String): NavImagesValues = {
    val __obj = js.Dynamic.literal(DOWN = DOWN.asInstanceOf[js.Any], GROUP = GROUP.asInstanceOf[js.Any], HOVER = HOVER.asInstanceOf[js.Any], REST = REST.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavImagesValues]
  }
  
  @scala.inline
  implicit class NavImagesValuesMutableBuilder[Self <: NavImagesValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDOWN(value: String): Self = StObject.set(x, "DOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGROUP(value: String): Self = StObject.set(x, "GROUP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHOVER(value: String): Self = StObject.set(x, "HOVER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREST(value: String): Self = StObject.set(x, "REST", value.asInstanceOf[js.Any])
  }
}
