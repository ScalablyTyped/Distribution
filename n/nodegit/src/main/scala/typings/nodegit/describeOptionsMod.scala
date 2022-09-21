package typings.nodegit

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeOptionsMod {
  
  @JSImport("nodegit/describe-options", "DescribeOptions")
  @js.native
  open class DescribeOptions ()
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var describeStrategy: js.UndefOr[Double] = js.native
    
    var maxCandidatesTags: js.UndefOr[Double] = js.native
    
    var onlyFollowFirstParent: js.UndefOr[Double] = js.native
    
    var pattern: js.UndefOr[String] = js.native
    
    var showCommitOidAsFallback: js.UndefOr[Double] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
}
