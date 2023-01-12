package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssetsResult extends StObject {
  
  /** Asset matching the search request. */
  var asset: js.UndefOr[Asset] = js.undefined
  
  /** State change of the asset between the points in time. */
  var stateChange: js.UndefOr[String] = js.undefined
}
object ListAssetsResult {
  
  inline def apply(): ListAssetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssetsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssetsResult] (val x: Self) extends AnyVal {
    
    inline def setAsset(value: Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setStateChange(value: String): Self = StObject.set(x, "stateChange", value.asInstanceOf[js.Any])
    
    inline def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
  }
}
