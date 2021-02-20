package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapsuleOptions extends SharedShapeOptions {
  
  var length: js.UndefOr[Double] = js.native
  
  var radius: js.UndefOr[Double] = js.native
}
object CapsuleOptions {
  
  @scala.inline
  def apply(): CapsuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapsuleOptions]
  }
  
  @scala.inline
  implicit class CapsuleOptionsMutableBuilder[Self <: CapsuleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
