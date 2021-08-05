package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Committer
import typings.octokitTypes.anon.Downloadurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCreateOrUpdateFileContentsResponse201Data extends StObject {
  
  var commit: Committer
  
  var content: Downloadurl
}
object ReposCreateOrUpdateFileContentsResponse201Data {
  
  inline def apply(commit: Committer, content: Downloadurl): ReposCreateOrUpdateFileContentsResponse201Data = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateOrUpdateFileContentsResponse201Data]
  }
  
  extension [Self <: ReposCreateOrUpdateFileContentsResponse201Data](x: Self) {
    
    inline def setCommit(value: Committer): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Downloadurl): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
