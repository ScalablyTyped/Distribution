package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathFileshaOwner extends StObject {
  
  /**
    * The `content` in the response will always be Base64 encoded.
    *
    * _Note_: This API supports blobs up to 100 megabytes in size.
    */
  var get: ParametersPathFileshaOwner
}
object GetParametersPathFileshaOwner {
  
  inline def apply(get: ParametersPathFileshaOwner): GetParametersPathFileshaOwner = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathFileshaOwner]
  }
  
  extension [Self <: GetParametersPathFileshaOwner](x: Self) {
    
    inline def setGet(value: ParametersPathFileshaOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
