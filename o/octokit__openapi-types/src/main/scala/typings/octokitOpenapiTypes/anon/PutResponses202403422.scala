package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResponses202403422 extends StObject {
  
  /**
    * Update a pull request branch
    * @description Updates the pull request branch with the latest upstream changes by merging HEAD from the base branch into the pull request branch.
    */
  var put: Responses202403422
}
object PutResponses202403422 {
  
  inline def apply(put: Responses202403422): PutResponses202403422 = {
    val __obj = js.Dynamic.literal(put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResponses202403422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResponses202403422] (val x: Self) extends AnyVal {
    
    inline def setPut(value: Responses202403422): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
