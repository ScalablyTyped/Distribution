package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomBiddingScriptRef extends StObject {
  
  /**
    * A resource name to be used in media.download to Download the script files. Or media.upload to Upload the script files. Resource names have the format
    * `customBiddingAlgorithms/{custom_bidding_algorithm_id}/scriptRef/{ref_id}`.
    */
  var resourceName: js.UndefOr[String] = js.undefined
}
object CustomBiddingScriptRef {
  
  inline def apply(): CustomBiddingScriptRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomBiddingScriptRef]
  }
  
  extension [Self <: CustomBiddingScriptRef](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
