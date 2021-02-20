package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.dismissed
import typings.octokitTypes.octokitTypesStrings.fixed
import typings.octokitTypes.octokitTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeScanningListAlertsForRepoEndpoint extends StObject {
  
  var owner: String = js.native
  
  /**
    * Set a full Git reference to list alerts for a specific branch. The `ref` must be formatted as `refs/heads/<branch name>`.
    */
  var ref: js.UndefOr[String] = js.native
  
  var repo: String = js.native
  
  /**
    * Set to `open`, `fixed`, or `dismissed` to list code scanning alerts in a specific state.
    */
  var state: js.UndefOr[open | dismissed | fixed] = js.native
}
object CodeScanningListAlertsForRepoEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): CodeScanningListAlertsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeScanningListAlertsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class CodeScanningListAlertsForRepoEndpointMutableBuilder[Self <: CodeScanningListAlertsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: open | dismissed | fixed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
