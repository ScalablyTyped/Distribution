package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuccessDetail extends StObject {
  
  /** If a native process other than the app crashed. */
  var otherNativeCrash: js.UndefOr[Boolean] = js.native
}
object SuccessDetail {
  
  @scala.inline
  def apply(): SuccessDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessDetail]
  }
  
  @scala.inline
  implicit class SuccessDetailMutableBuilder[Self <: SuccessDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOtherNativeCrash(value: Boolean): Self = StObject.set(x, "otherNativeCrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherNativeCrashUndefined: Self = StObject.set(x, "otherNativeCrash", js.undefined)
  }
}
