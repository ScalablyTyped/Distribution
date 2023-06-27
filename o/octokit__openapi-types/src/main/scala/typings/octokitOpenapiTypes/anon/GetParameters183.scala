package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters183 extends StObject {
  
  /**
    * Download workflow run attempt logs
    * @description Gets a redirect URL to download an archive of log files for a specific workflow run attempt. This link expires after
    * 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to
    * the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    * GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: Parameters183
}
object GetParameters183 {
  
  inline def apply(get: Parameters183): GetParameters183 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters183]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters183] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters183): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
