package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryInfo extends StObject {
  
  /** Maximum memory that can be allocated to the process in KiB */
  var memoryCapInKibibyte: js.UndefOr[String] = js.native
  
  /** Total memory available on the device in KiB */
  var memoryTotalInKibibyte: js.UndefOr[String] = js.native
}
object MemoryInfo {
  
  @scala.inline
  def apply(): MemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryInfo]
  }
  
  @scala.inline
  implicit class MemoryInfoMutableBuilder[Self <: MemoryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemoryCapInKibibyte(value: String): Self = StObject.set(x, "memoryCapInKibibyte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryCapInKibibyteUndefined: Self = StObject.set(x, "memoryCapInKibibyte", js.undefined)
    
    @scala.inline
    def setMemoryTotalInKibibyte(value: String): Self = StObject.set(x, "memoryTotalInKibibyte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryTotalInKibibyteUndefined: Self = StObject.set(x, "memoryTotalInKibibyte", js.undefined)
  }
}
