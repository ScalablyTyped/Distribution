package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.dismissed
import typings.octokitTypes.octokitTypesStrings.fixed
import typings.octokitTypes.octokitTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeScanningListAlertsForRepoEndpoint extends StObject {
  
  var owner: String
  
  /**
    * Set a full Git reference to list alerts for a specific branch. The `ref` must be formatted as `refs/heads/<branch name>`.
    */
  var ref: js.UndefOr[String] = js.undefined
  
  var repo: String
  
  /**
    * Set to `open`, `fixed`, or `dismissed` to list code scanning alerts in a specific state.
    */
  var state: js.UndefOr[open | dismissed | fixed] = js.undefined
}
object CodeScanningListAlertsForRepoEndpoint {
  
  inline def apply(owner: String, repo: String): CodeScanningListAlertsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeScanningListAlertsForRepoEndpoint]
  }
  
  extension [Self <: CodeScanningListAlertsForRepoEndpoint](x: Self) {
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setState(value: open | dismissed | fixed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
