package typings.overlayscrollbars.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xs extends StObject {
  
  var x: Boolean = js.native
  
  var xs: Boolean = js.native
  
  var y: Boolean = js.native
  
  var ys: Boolean = js.native
}
object Xs {
  
  @scala.inline
  def apply(x: Boolean, xs: Boolean, y: Boolean, ys: Boolean): Xs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], ys = ys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xs]
  }
  
  @scala.inline
  implicit class XsMutableBuilder[Self <: Xs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXs(value: Boolean): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYs(value: Boolean): Self = StObject.set(x, "ys", value.asInstanceOf[js.Any])
  }
}
