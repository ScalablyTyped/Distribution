package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVersionsResponse extends StObject {
  
  /** The token use to fetch the next page of records. if not exist in the response, that means no more versions to list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of versions. */
  var versions: js.UndefOr[js.Array[Version]] = js.undefined
}
object ListVersionsResponse {
  
  inline def apply(): ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVersionsResponse]
  }
  
  extension [Self <: ListVersionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setVersions(value: js.Array[Version]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: Version*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
