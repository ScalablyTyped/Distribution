package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskStatus extends StObject {
  
  /** Free disk space. */
  var freeSpaceBytes: js.UndefOr[String] = js.undefined
  
  /** Total disk space. */
  var totalSpaceBytes: js.UndefOr[String] = js.undefined
}
object DiskStatus {
  
  inline def apply(): DiskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskStatus]
  }
  
  extension [Self <: DiskStatus](x: Self) {
    
    inline def setFreeSpaceBytes(value: String): Self = StObject.set(x, "freeSpaceBytes", value.asInstanceOf[js.Any])
    
    inline def setFreeSpaceBytesUndefined: Self = StObject.set(x, "freeSpaceBytes", js.undefined)
    
    inline def setTotalSpaceBytes(value: String): Self = StObject.set(x, "totalSpaceBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalSpaceBytesUndefined: Self = StObject.set(x, "totalSpaceBytes", js.undefined)
  }
}
