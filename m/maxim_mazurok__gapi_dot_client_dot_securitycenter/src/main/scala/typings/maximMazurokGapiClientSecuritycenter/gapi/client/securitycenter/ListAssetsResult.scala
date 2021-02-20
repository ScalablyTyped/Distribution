package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssetsResult extends StObject {
  
  /** Asset matching the search request. */
  var asset: js.UndefOr[Asset] = js.native
  
  /** State change of the asset between the points in time. */
  var stateChange: js.UndefOr[String] = js.native
}
object ListAssetsResult {
  
  @scala.inline
  def apply(): ListAssetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssetsResult]
  }
  
  @scala.inline
  implicit class ListAssetsResultMutableBuilder[Self <: ListAssetsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset(value: Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    @scala.inline
    def setStateChange(value: String): Self = StObject.set(x, "stateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
  }
}
