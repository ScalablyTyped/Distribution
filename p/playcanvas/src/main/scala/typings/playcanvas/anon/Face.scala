package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Face extends StObject {
  
  var face: js.UndefOr[Double] = js.undefined
  
  var level: js.UndefOr[Double] = js.undefined
}
object Face {
  
  @scala.inline
  def apply(): Face = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Face]
  }
  
  @scala.inline
  implicit class FaceMutableBuilder[Self <: Face] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFace(value: Double): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceUndefined: Self = StObject.set(x, "face", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
