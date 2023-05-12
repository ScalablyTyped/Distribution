package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Integrationid extends StObject {
  
  /** @description The ID of the custom app that will be enabled on the environment. */
  var integration_id: js.UndefOr[Double] = js.undefined
}
object Integrationid {
  
  inline def apply(): Integrationid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Integrationid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Integrationid] (val x: Self) extends AnyVal {
    
    inline def setIntegration_id(value: Double): Self = StObject.set(x, "integration_id", value.asInstanceOf[js.Any])
    
    inline def setIntegration_idUndefined: Self = StObject.set(x, "integration_id", js.undefined)
  }
}
