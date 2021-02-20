package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contents extends StObject {
  
  var contents: String = js.native
  
  var issues: String = js.native
}
object Contents {
  
  @scala.inline
  def apply(contents: String, issues: String): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
  
  @scala.inline
  implicit class ContentsMutableBuilder[Self <: Contents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssues(value: String): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
  }
}
