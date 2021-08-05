package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`off-topic`
import typings.octokitTypes.octokitTypesStrings.`too heated`
import typings.octokitTypes.octokitTypesStrings.resolved
import typings.octokitTypes.octokitTypesStrings.spam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuesLockEndpoint extends StObject {
  
  var issue_number: Double
  
  /**
    * The reason for locking the issue or pull request conversation. Lock will fail if you don't use one of these reasons:
    * \* `off-topic`
    * \* `too heated`
    * \* `resolved`
    * \* `spam`
    */
  var lock_reason: js.UndefOr[`off-topic` | (`too heated`) | resolved | spam] = js.undefined
  
  var owner: String
  
  var repo: String
}
object IssuesLockEndpoint {
  
  inline def apply(issue_number: Double, owner: String, repo: String): IssuesLockEndpoint = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesLockEndpoint]
  }
  
  extension [Self <: IssuesLockEndpoint](x: Self) {
    
    inline def setIssue_number(value: Double): Self = StObject.set(x, "issue_number", value.asInstanceOf[js.Any])
    
    inline def setLock_reason(value: `off-topic` | (`too heated`) | resolved | spam): Self = StObject.set(x, "lock_reason", value.asInstanceOf[js.Any])
    
    inline def setLock_reasonUndefined: Self = StObject.set(x, "lock_reason", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
