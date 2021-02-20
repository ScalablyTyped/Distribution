package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StringDictionary
import typings.octokitTypes.anon.Committer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposDeleteFileResponseData extends StObject {
  
  var commit: Committer = js.native
  
  var content: StringDictionary[js.Any] = js.native
}
object ReposDeleteFileResponseData {
  
  @scala.inline
  def apply(commit: Committer, content: StringDictionary[js.Any]): ReposDeleteFileResponseData = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteFileResponseData]
  }
  
  @scala.inline
  implicit class ReposDeleteFileResponseDataMutableBuilder[Self <: ReposDeleteFileResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommit(value: Committer): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: StringDictionary[js.Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
