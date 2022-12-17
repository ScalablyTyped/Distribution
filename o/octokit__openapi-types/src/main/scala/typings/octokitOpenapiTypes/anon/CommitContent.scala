package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitContent extends StObject {
  
  var commit: Verification
  
  var content: GiturlHtmlurl | Null
}
object CommitContent {
  
  inline def apply(commit: Verification): CommitContent = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], content = null)
    __obj.asInstanceOf[CommitContent]
  }
  
  extension [Self <: CommitContent](x: Self) {
    
    inline def setCommit(value: Verification): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setContent(value: GiturlHtmlurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
  }
}
