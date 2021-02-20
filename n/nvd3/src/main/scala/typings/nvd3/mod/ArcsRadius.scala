package typings.nvd3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcsRadius extends StObject {
  
  var inner: Double = js.native
  
  var outer: Double = js.native
}
object ArcsRadius {
  
  @scala.inline
  def apply(inner: Double, outer: Double): ArcsRadius = {
    val __obj = js.Dynamic.literal(inner = inner.asInstanceOf[js.Any], outer = outer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcsRadius]
  }
  
  @scala.inline
  implicit class ArcsRadiusMutableBuilder[Self <: ArcsRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInner(value: Double): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuter(value: Double): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
  }
}
