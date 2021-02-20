package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceIpBlock extends StObject {
  
  /** The date this block was added to Firebase Test Lab */
  var addedDate: js.UndefOr[Date] = js.native
  
  /** An IP address block in CIDR notation eg: 34.68.194.64/29 */
  var block: js.UndefOr[String] = js.native
  
  /** Whether this block is used by physical or virtual devices */
  var form: js.UndefOr[String] = js.native
}
object DeviceIpBlock {
  
  @scala.inline
  def apply(): DeviceIpBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceIpBlock]
  }
  
  @scala.inline
  implicit class DeviceIpBlockMutableBuilder[Self <: DeviceIpBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddedDate(value: Date): Self = StObject.set(x, "addedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedDateUndefined: Self = StObject.set(x, "addedDate", js.undefined)
    
    @scala.inline
    def setBlock(value: String): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
    
    @scala.inline
    def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
  }
}
