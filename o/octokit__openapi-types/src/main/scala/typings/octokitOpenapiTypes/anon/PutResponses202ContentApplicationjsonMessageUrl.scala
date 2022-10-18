package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResponses202ContentApplicationjsonMessageUrl extends StObject {
  
  /** Updates the pull request branch with the latest upstream changes by merging HEAD from the base branch into the pull request branch. */
  var put: Responses202ContentApplicationjsonMessageUrl
}
object PutResponses202ContentApplicationjsonMessageUrl {
  
  inline def apply(put: Responses202ContentApplicationjsonMessageUrl): PutResponses202ContentApplicationjsonMessageUrl = {
    val __obj = js.Dynamic.literal(put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResponses202ContentApplicationjsonMessageUrl]
  }
  
  extension [Self <: PutResponses202ContentApplicationjsonMessageUrl](x: Self) {
    
    inline def setPut(value: Responses202ContentApplicationjsonMessageUrl): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
