package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRequestBodyContent317 extends StObject {
  
  /** Updates the pull request branch with the latest upstream changes by merging HEAD from the base branch into the pull request branch. */
  var put: RequestBodyContent317
}
object PutRequestBodyContent317 {
  
  inline def apply(put: RequestBodyContent317): PutRequestBodyContent317 = {
    val __obj = js.Dynamic.literal(put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRequestBodyContent317]
  }
  
  extension [Self <: PutRequestBodyContent317](x: Self) {
    
    inline def setPut(value: RequestBodyContent317): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
