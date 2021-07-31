package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeOptions
  extends StObject
     with SharedShapeOptions {
  
  var `type`: js.UndefOr[Double] = js.undefined
}
object ShapeOptions {
  
  @scala.inline
  def apply(): ShapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeOptions]
  }
  
  @scala.inline
  implicit class ShapeOptionsMutableBuilder[Self <: ShapeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
