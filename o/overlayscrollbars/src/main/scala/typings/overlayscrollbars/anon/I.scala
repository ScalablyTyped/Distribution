package typings.overlayscrollbars.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I extends StObject {
  
  var i: Boolean = js.native
  
  var n: Boolean = js.native
}
object I {
  
  @scala.inline
  def apply(i: Boolean, n: Boolean): I = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[I]
  }
  
  @scala.inline
  implicit class IMutableBuilder[Self <: I] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setI(value: Boolean): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Boolean): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
