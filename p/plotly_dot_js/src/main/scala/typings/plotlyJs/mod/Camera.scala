package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Camera extends StObject {
  
  var center: PartialPoint = js.native
  
  var eye: PartialPoint = js.native
  
  var up: PartialPoint = js.native
}
object Camera {
  
  @scala.inline
  def apply(center: PartialPoint, eye: PartialPoint, up: PartialPoint): Camera = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], eye = eye.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  
  @scala.inline
  implicit class CameraMutableBuilder[Self <: Camera] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: PartialPoint): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEye(value: PartialPoint): Self = StObject.set(x, "eye", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUp(value: PartialPoint): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
  }
}
