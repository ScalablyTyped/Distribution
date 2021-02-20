package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceIpBlockCatalog extends StObject {
  
  /** The device IP blocks used by Firebase Test Lab */
  var ipBlocks: js.UndefOr[js.Array[DeviceIpBlock]] = js.native
}
object DeviceIpBlockCatalog {
  
  @scala.inline
  def apply(): DeviceIpBlockCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceIpBlockCatalog]
  }
  
  @scala.inline
  implicit class DeviceIpBlockCatalogMutableBuilder[Self <: DeviceIpBlockCatalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpBlocks(value: js.Array[DeviceIpBlock]): Self = StObject.set(x, "ipBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpBlocksUndefined: Self = StObject.set(x, "ipBlocks", js.undefined)
    
    @scala.inline
    def setIpBlocksVarargs(value: DeviceIpBlock*): Self = StObject.set(x, "ipBlocks", js.Array(value :_*))
  }
}
