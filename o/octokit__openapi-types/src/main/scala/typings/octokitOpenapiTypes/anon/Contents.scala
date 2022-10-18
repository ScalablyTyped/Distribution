package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contents extends StObject {
  
  var contents: js.UndefOr[String] = js.undefined
  
  var issues: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var single_file: js.UndefOr[String] = js.undefined
}
object Contents {
  
  inline def apply(): Contents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contents]
  }
  
  extension [Self <: Contents](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    inline def setIssues(value: String): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSingle_file(value: String): Self = StObject.set(x, "single_file", value.asInstanceOf[js.Any])
    
    inline def setSingle_fileUndefined: Self = StObject.set(x, "single_file", js.undefined)
  }
}
