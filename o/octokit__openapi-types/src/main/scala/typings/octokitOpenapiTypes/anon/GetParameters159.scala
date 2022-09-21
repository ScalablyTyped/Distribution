package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters159 extends StObject {
  
  /**
    * Gets a redirect URL to download an archive of log files for a specific workflow run attempt. This link expires after
    * 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to
    * the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    * GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: Parameters159
}
object GetParameters159 {
  
  inline def apply(get: Parameters159): GetParameters159 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters159]
  }
  
  extension [Self <: GetParameters159](x: Self) {
    
    inline def setGet(value: Parameters159): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
