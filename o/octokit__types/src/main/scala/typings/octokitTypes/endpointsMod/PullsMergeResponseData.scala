package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullsMergeResponseData extends StObject {
  
  var merged: Boolean
  
  var message: String
  
  var sha: String
}
object PullsMergeResponseData {
  
  inline def apply(merged: Boolean, message: String, sha: String): PullsMergeResponseData = {
    val __obj = js.Dynamic.literal(merged = merged.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsMergeResponseData]
  }
  
  extension [Self <: PullsMergeResponseData](x: Self) {
    
    inline def setMerged(value: Boolean): Self = StObject.set(x, "merged", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
  }
}
