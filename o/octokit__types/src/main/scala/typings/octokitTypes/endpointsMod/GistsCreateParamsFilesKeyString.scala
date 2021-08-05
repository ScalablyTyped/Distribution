package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GistsCreateParamsFilesKeyString extends StObject {
  
  var content: String
}
object GistsCreateParamsFilesKeyString {
  
  inline def apply(content: String): GistsCreateParamsFilesKeyString = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsCreateParamsFilesKeyString]
  }
  
  extension [Self <: GistsCreateParamsFilesKeyString](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
