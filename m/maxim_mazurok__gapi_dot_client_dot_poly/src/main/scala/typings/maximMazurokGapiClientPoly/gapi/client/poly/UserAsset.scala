package typings.maximMazurokGapiClientPoly.gapi.client.poly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAsset extends StObject {
  
  /** An Asset. */
  var asset: js.UndefOr[Asset] = js.native
}
object UserAsset {
  
  @scala.inline
  def apply(): UserAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAsset]
  }
  
  @scala.inline
  implicit class UserAssetMutableBuilder[Self <: UserAsset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset(value: Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
  }
}
