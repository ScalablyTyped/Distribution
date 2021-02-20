package typings.opentypeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point extends StObject {
  
  var lastPointOfContour: js.UndefOr[Boolean] = js.native
}
object Point {
  
  @scala.inline
  def apply(): Point = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastPointOfContour(value: Boolean): Self = StObject.set(x, "lastPointOfContour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPointOfContourUndefined: Self = StObject.set(x, "lastPointOfContour", js.undefined)
  }
}
