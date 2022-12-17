package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRequestBodyContent312 extends StObject {
  
  /** Updates the pull request branch with the latest upstream changes by merging HEAD from the base branch into the pull request branch. */
  var put: RequestBodyContent312
}
object PutRequestBodyContent312 {
  
  inline def apply(put: RequestBodyContent312): PutRequestBodyContent312 = {
    val __obj = js.Dynamic.literal(put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRequestBodyContent312]
  }
  
  extension [Self <: PutRequestBodyContent312](x: Self) {
    
    inline def setPut(value: RequestBodyContent312): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
