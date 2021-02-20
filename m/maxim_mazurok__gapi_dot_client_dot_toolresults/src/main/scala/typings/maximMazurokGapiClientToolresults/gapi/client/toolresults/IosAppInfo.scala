package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosAppInfo extends StObject {
  
  /** The name of the app. Required */
  var name: js.UndefOr[String] = js.native
}
object IosAppInfo {
  
  @scala.inline
  def apply(): IosAppInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosAppInfo]
  }
  
  @scala.inline
  implicit class IosAppInfoMutableBuilder[Self <: IosAppInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
