package typings.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MSIVmOptions
  extends StObject
     with MSIOptions {
  
  /**
    * @prop {number} [port] - port on which the MSI service is running on the host VM. Default port is 50342
    */
  var port: js.UndefOr[Double] = js.undefined
}
object MSIVmOptions {
  
  inline def apply(): MSIVmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSIVmOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MSIVmOptions] (val x: Self) extends AnyVal {
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
