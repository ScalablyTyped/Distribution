package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditGuaranteedOrderReadAccessorsResponse extends StObject {
  
  /** Whether all advertisers of read_write_partner_id have read access to the guaranteed order. */
  var readAccessInherited: js.UndefOr[Boolean] = js.undefined
  
  /** The IDs of advertisers with read access to the guaranteed order. */
  var readAdvertiserIds: js.UndefOr[js.Array[String]] = js.undefined
}
object EditGuaranteedOrderReadAccessorsResponse {
  
  inline def apply(): EditGuaranteedOrderReadAccessorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditGuaranteedOrderReadAccessorsResponse]
  }
  
  extension [Self <: EditGuaranteedOrderReadAccessorsResponse](x: Self) {
    
    inline def setReadAccessInherited(value: Boolean): Self = StObject.set(x, "readAccessInherited", value.asInstanceOf[js.Any])
    
    inline def setReadAccessInheritedUndefined: Self = StObject.set(x, "readAccessInherited", js.undefined)
    
    inline def setReadAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "readAdvertiserIds", value.asInstanceOf[js.Any])
    
    inline def setReadAdvertiserIdsUndefined: Self = StObject.set(x, "readAdvertiserIds", js.undefined)
    
    inline def setReadAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "readAdvertiserIds", js.Array(value*))
  }
}
