package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issues extends StObject {
  
  var contents: String
  
  var issues: String
  
  var metadata: String
  
  var single_file: String
}
object Issues {
  
  inline def apply(contents: String, issues: String, metadata: String, single_file: String): Issues = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], single_file = single_file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issues]
  }
  
  extension [Self <: Issues](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setIssues(value: String): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSingle_file(value: String): Self = StObject.set(x, "single_file", value.asInstanceOf[js.Any])
  }
}
