package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRequestBodyContentApplicationjsonEvent extends StObject {
  
  /** **Note:** To dismiss a pull request review on a [protected branch](https://docs.github.com/rest/reference/repos#branches), you must be a repository administrator or be included in the list of people or teams who can dismiss pull request reviews. */
  var put: RequestBodyContentApplicationjsonEvent
}
object PutRequestBodyContentApplicationjsonEvent {
  
  inline def apply(put: RequestBodyContentApplicationjsonEvent): PutRequestBodyContentApplicationjsonEvent = {
    val __obj = js.Dynamic.literal(put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRequestBodyContentApplicationjsonEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRequestBodyContentApplicationjsonEvent] (val x: Self) extends AnyVal {
    
    inline def setPut(value: RequestBodyContentApplicationjsonEvent): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
