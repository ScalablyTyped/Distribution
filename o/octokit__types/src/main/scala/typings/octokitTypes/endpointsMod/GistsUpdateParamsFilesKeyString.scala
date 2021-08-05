package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GistsUpdateParamsFilesKeyString extends StObject {
  
  var content: String
  
  var filename: String
}
object GistsUpdateParamsFilesKeyString {
  
  inline def apply(content: String, filename: String): GistsUpdateParamsFilesKeyString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsUpdateParamsFilesKeyString]
  }
  
  extension [Self <: GistsUpdateParamsFilesKeyString](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
  }
}
