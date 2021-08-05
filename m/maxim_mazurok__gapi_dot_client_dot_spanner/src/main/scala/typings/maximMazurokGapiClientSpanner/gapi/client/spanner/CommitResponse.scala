package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitResponse extends StObject {
  
  /** The Cloud Spanner timestamp at which the transaction committed. */
  var commitTimestamp: js.UndefOr[String] = js.undefined
}
object CommitResponse {
  
  inline def apply(): CommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitResponse]
  }
  
  extension [Self <: CommitResponse](x: Self) {
    
    inline def setCommitTimestamp(value: String): Self = StObject.set(x, "commitTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCommitTimestampUndefined: Self = StObject.set(x, "commitTimestamp", js.undefined)
  }
}
