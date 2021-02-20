package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceleratorConfig extends StObject {
  
  /** Count of cores of this accelerator. */
  var coreCount: js.UndefOr[String] = js.native
  
  /** Type of this accelerator. */
  var `type`: js.UndefOr[String] = js.native
}
object AcceleratorConfig {
  
  @scala.inline
  def apply(): AcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorConfig]
  }
  
  @scala.inline
  implicit class AcceleratorConfigMutableBuilder[Self <: AcceleratorConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoreCount(value: String): Self = StObject.set(x, "coreCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreCountUndefined: Self = StObject.set(x, "coreCount", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
