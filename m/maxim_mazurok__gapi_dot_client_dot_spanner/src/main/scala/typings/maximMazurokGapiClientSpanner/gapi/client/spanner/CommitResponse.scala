package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitResponse extends StObject {
  
  /** The Cloud Spanner timestamp at which the transaction committed. */
  var commitTimestamp: js.UndefOr[String] = js.native
}
object CommitResponse {
  
  @scala.inline
  def apply(): CommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitResponse]
  }
  
  @scala.inline
  implicit class CommitResponseMutableBuilder[Self <: CommitResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitTimestamp(value: String): Self = StObject.set(x, "commitTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitTimestampUndefined: Self = StObject.set(x, "commitTimestamp", js.undefined)
  }
}
