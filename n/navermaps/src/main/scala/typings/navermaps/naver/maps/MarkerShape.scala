package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerShape extends StObject {
  
  var coords: js.Array[_] = js.native
  
  var `type`: String = js.native
}
object MarkerShape {
  
  @scala.inline
  def apply(coords: js.Array[_], `type`: String): MarkerShape = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerShape]
  }
  
  @scala.inline
  implicit class MarkerShapeMutableBuilder[Self <: MarkerShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoords(value: js.Array[_]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordsVarargs(value: js.Any*): Self = StObject.set(x, "coords", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
