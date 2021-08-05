package typings.maximMazurokGapiClientPoly.gapi.client.poly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAsset extends StObject {
  
  /** An Asset. */
  var asset: js.UndefOr[Asset] = js.undefined
}
object UserAsset {
  
  inline def apply(): UserAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAsset]
  }
  
  extension [Self <: UserAsset](x: Self) {
    
    inline def setAsset(value: Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
  }
}
