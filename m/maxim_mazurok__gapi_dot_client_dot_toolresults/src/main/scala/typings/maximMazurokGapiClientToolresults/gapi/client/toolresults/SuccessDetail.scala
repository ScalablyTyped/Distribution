package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessDetail extends StObject {
  
  /** If a native process other than the app crashed. */
  var otherNativeCrash: js.UndefOr[Boolean] = js.undefined
}
object SuccessDetail {
  
  inline def apply(): SuccessDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuccessDetail] (val x: Self) extends AnyVal {
    
    inline def setOtherNativeCrash(value: Boolean): Self = StObject.set(x, "otherNativeCrash", value.asInstanceOf[js.Any])
    
    inline def setOtherNativeCrashUndefined: Self = StObject.set(x, "otherNativeCrash", js.undefined)
  }
}
