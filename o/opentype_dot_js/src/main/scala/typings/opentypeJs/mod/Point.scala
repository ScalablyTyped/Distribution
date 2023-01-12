package typings.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Point extends StObject {
  
  var lastPointOfContour: js.UndefOr[Boolean] = js.undefined
}
object Point {
  
  inline def apply(): Point = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
    
    inline def setLastPointOfContour(value: Boolean): Self = StObject.set(x, "lastPointOfContour", value.asInstanceOf[js.Any])
    
    inline def setLastPointOfContourUndefined: Self = StObject.set(x, "lastPointOfContour", js.undefined)
  }
}
