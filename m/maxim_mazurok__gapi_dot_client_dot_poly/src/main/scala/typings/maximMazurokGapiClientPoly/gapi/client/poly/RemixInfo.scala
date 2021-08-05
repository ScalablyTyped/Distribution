package typings.maximMazurokGapiClientPoly.gapi.client.poly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemixInfo extends StObject {
  
  /** Resource ids for the sources of this remix, of the form: `assets/{ASSET_ID}` */
  var sourceAsset: js.UndefOr[js.Array[String]] = js.undefined
}
object RemixInfo {
  
  inline def apply(): RemixInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemixInfo]
  }
  
  extension [Self <: RemixInfo](x: Self) {
    
    inline def setSourceAsset(value: js.Array[String]): Self = StObject.set(x, "sourceAsset", value.asInstanceOf[js.Any])
    
    inline def setSourceAssetUndefined: Self = StObject.set(x, "sourceAsset", js.undefined)
    
    inline def setSourceAssetVarargs(value: String*): Self = StObject.set(x, "sourceAsset", js.Array(value :_*))
  }
}
