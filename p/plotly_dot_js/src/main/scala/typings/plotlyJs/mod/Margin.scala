package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Margin extends StObject {
  
  var b: Double = js.native
  
  var l: Double = js.native
  
  var pad: Double = js.native
  
  var r: Double = js.native
  
  var t: Double = js.native
}
object Margin {
  
  @scala.inline
  def apply(b: Double, l: Double, pad: Double, r: Double, t: Double): Margin = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Margin]
  }
  
  @scala.inline
  implicit class MarginMutableBuilder[Self <: Margin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPad(value: Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
