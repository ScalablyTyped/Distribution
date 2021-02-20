package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrossOriginInjection extends StObject {
  
  var crossOriginInjection: js.UndefOr[Boolean] = js.native
  
  var sameOriginInjection: js.UndefOr[Boolean] = js.native
}
object CrossOriginInjection {
  
  @scala.inline
  def apply(): CrossOriginInjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossOriginInjection]
  }
  
  @scala.inline
  implicit class CrossOriginInjectionMutableBuilder[Self <: CrossOriginInjection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossOriginInjection(value: Boolean): Self = StObject.set(x, "crossOriginInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginInjectionUndefined: Self = StObject.set(x, "crossOriginInjection", js.undefined)
    
    @scala.inline
    def setSameOriginInjection(value: Boolean): Self = StObject.set(x, "sameOriginInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSameOriginInjectionUndefined: Self = StObject.set(x, "sameOriginInjection", js.undefined)
  }
}
