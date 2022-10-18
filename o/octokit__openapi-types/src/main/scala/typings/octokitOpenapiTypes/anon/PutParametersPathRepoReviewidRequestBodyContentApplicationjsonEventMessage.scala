package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutParametersPathRepoReviewidRequestBodyContentApplicationjsonEventMessage extends StObject {
  
  /** **Note:** To dismiss a pull request review on a [protected branch](https://docs.github.com/rest/reference/repos#branches), you must be a repository administrator or be included in the list of people or teams who can dismiss pull request reviews. */
  var put: ParametersPathRepoReviewidRequestBodyContentApplicationjsonEventMessage
}
object PutParametersPathRepoReviewidRequestBodyContentApplicationjsonEventMessage {
  
  inline def apply(put: ParametersPathRepoReviewidRequestBodyContentApplicationjsonEventMessage): PutParametersPathRepoReviewidRequestBodyContentApplicationjsonEventMessage = {
    val __obj = js.Dynamic.literal(put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutParametersPathRepoReviewidRequestBodyContentApplicationjsonEventMessage]
  }
  
  extension [Self <: PutParametersPathRepoReviewidRequestBodyContentApplicationjsonEventMessage](x: Self) {
    
    inline def setPut(value: ParametersPathRepoReviewidRequestBodyContentApplicationjsonEventMessage): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
