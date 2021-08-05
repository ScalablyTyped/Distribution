package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StringDictionary
import typings.octokitTypes.anon.Committer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposDeleteFileResponseData extends StObject {
  
  var commit: Committer
  
  var content: StringDictionary[js.Any]
}
object ReposDeleteFileResponseData {
  
  inline def apply(commit: Committer, content: StringDictionary[js.Any]): ReposDeleteFileResponseData = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteFileResponseData]
  }
  
  extension [Self <: ReposDeleteFileResponseData](x: Self) {
    
    inline def setCommit(value: Committer): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setContent(value: StringDictionary[js.Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
