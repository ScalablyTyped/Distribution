package typings.maximMazurokGapiClientTpu.gapi.client.tpu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceleratorType extends StObject {
  
  /** The resource name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** the accelerator type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object AcceleratorType {
  
  @scala.inline
  def apply(): AcceleratorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorType]
  }
  
  @scala.inline
  implicit class AcceleratorTypeMutableBuilder[Self <: AcceleratorType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
