package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Permanent extends StObject {
  
  var permanent: js.UndefOr[Boolean] = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
}
object Permanent {
  
  @scala.inline
  def apply(): Permanent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permanent]
  }
  
  @scala.inline
  implicit class PermanentMutableBuilder[Self <: Permanent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermanent(value: Boolean): Self = StObject.set(x, "permanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermanentUndefined: Self = StObject.set(x, "permanent", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
