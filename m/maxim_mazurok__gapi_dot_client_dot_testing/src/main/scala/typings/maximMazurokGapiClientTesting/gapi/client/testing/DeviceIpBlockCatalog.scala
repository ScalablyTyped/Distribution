package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceIpBlockCatalog extends StObject {
  
  /** The device IP blocks used by Firebase Test Lab */
  var ipBlocks: js.UndefOr[js.Array[DeviceIpBlock]] = js.undefined
}
object DeviceIpBlockCatalog {
  
  inline def apply(): DeviceIpBlockCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceIpBlockCatalog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceIpBlockCatalog] (val x: Self) extends AnyVal {
    
    inline def setIpBlocks(value: js.Array[DeviceIpBlock]): Self = StObject.set(x, "ipBlocks", value.asInstanceOf[js.Any])
    
    inline def setIpBlocksUndefined: Self = StObject.set(x, "ipBlocks", js.undefined)
    
    inline def setIpBlocksVarargs(value: DeviceIpBlock*): Self = StObject.set(x, "ipBlocks", js.Array(value*))
  }
}
