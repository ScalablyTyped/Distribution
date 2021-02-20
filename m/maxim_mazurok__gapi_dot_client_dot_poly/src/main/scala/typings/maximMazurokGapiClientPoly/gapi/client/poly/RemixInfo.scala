package typings.maximMazurokGapiClientPoly.gapi.client.poly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemixInfo extends StObject {
  
  /** Resource ids for the sources of this remix, of the form: `assets/{ASSET_ID}` */
  var sourceAsset: js.UndefOr[js.Array[String]] = js.native
}
object RemixInfo {
  
  @scala.inline
  def apply(): RemixInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemixInfo]
  }
  
  @scala.inline
  implicit class RemixInfoMutableBuilder[Self <: RemixInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceAsset(value: js.Array[String]): Self = StObject.set(x, "sourceAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAssetUndefined: Self = StObject.set(x, "sourceAsset", js.undefined)
    
    @scala.inline
    def setSourceAssetVarargs(value: String*): Self = StObject.set(x, "sourceAsset", js.Array(value :_*))
  }
}
