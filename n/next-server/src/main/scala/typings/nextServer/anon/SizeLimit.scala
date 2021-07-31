package typings.nextServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeLimit extends StObject {
  
  var sizeLimit: js.UndefOr[Double | String] = js.undefined
}
object SizeLimit {
  
  @scala.inline
  def apply(): SizeLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeLimit]
  }
  
  @scala.inline
  implicit class SizeLimitMutableBuilder[Self <: SizeLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSizeLimit(value: Double | String): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeLimitUndefined: Self = StObject.set(x, "sizeLimit", js.undefined)
  }
}
