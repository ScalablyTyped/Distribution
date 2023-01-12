package typings.nivoBullet.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerWithPosition
  extends StObject
     with ComputedMarkersDatum {
  
  var position: Position
}
object MarkerWithPosition {
  
  inline def apply(color: String, index: Double, position: Position, value: Double): MarkerWithPosition = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerWithPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkerWithPosition] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
