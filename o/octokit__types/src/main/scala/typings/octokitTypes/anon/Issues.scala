package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Issues extends StObject {
  
  var contents: String = js.native
  
  var issues: String = js.native
  
  var metadata: String = js.native
  
  var single_file: String = js.native
}
object Issues {
  
  @scala.inline
  def apply(contents: String, issues: String, metadata: String, single_file: String): Issues = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], single_file = single_file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issues]
  }
  
  @scala.inline
  implicit class IssuesMutableBuilder[Self <: Issues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssues(value: String): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingle_file(value: String): Self = StObject.set(x, "single_file", value.asInstanceOf[js.Any])
  }
}
