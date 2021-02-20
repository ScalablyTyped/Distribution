package typings.miniprogram

import typings.miniprogram.anon.Accuracy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocationArgs extends AsyncCallback[Accuracy] {
  
  /**
    * longitude and latitude location cache expiry time in seconds.
    * Default is 30s. Use of cache can speed up location process. Re-location is done upon cache expiry.
    */
  var catchTimeout: js.UndefOr[Double] = js.native
  
  /**
    * 0: default, get the longitude and latitude.
    */
  var `type`: js.UndefOr[Double] = js.native
}
object GetLocationArgs {
  
  @scala.inline
  def apply(): GetLocationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLocationArgs]
  }
  
  @scala.inline
  implicit class GetLocationArgsMutableBuilder[Self <: GetLocationArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatchTimeout(value: Double): Self = StObject.set(x, "catchTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatchTimeoutUndefined: Self = StObject.set(x, "catchTimeout", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
