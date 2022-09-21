package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreadidNumber extends StObject {
  
  /** The unique identifier of the pull request thread. */
  var thread_id: Double
}
object ThreadidNumber {
  
  inline def apply(thread_id: Double): ThreadidNumber = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadidNumber]
  }
  
  extension [Self <: ThreadidNumber](x: Self) {
    
    inline def setThread_id(value: Double): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
  }
}
