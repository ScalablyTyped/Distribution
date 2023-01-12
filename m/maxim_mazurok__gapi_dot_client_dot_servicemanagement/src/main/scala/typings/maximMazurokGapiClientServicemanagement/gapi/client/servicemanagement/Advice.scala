package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Advice extends StObject {
  
  /** Useful description for why this advice was applied and what actions should be taken to mitigate any implied risks. */
  var description: js.UndefOr[String] = js.undefined
}
object Advice {
  
  inline def apply(): Advice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Advice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Advice] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
