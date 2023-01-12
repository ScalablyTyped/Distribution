package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerStatus extends StObject {
  
  /** Status of attached disks. */
  var attachedDisks: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.genomics.gapi.client.genomics.DiskStatus} */ js.Any
  ] = js.undefined
  
  /** Status of the boot disk. */
  var bootDisk: js.UndefOr[DiskStatus] = js.undefined
  
  /** Free RAM. */
  var freeRamBytes: js.UndefOr[String] = js.undefined
  
  /** Total RAM. */
  var totalRamBytes: js.UndefOr[String] = js.undefined
  
  /** System uptime. */
  var uptimeSeconds: js.UndefOr[String] = js.undefined
}
object WorkerStatus {
  
  inline def apply(): WorkerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerStatus] (val x: Self) extends AnyVal {
    
    inline def setAttachedDisks(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.genomics.gapi.client.genomics.DiskStatus} */ js.Any
    ): Self = StObject.set(x, "attachedDisks", value.asInstanceOf[js.Any])
    
    inline def setAttachedDisksUndefined: Self = StObject.set(x, "attachedDisks", js.undefined)
    
    inline def setBootDisk(value: DiskStatus): Self = StObject.set(x, "bootDisk", value.asInstanceOf[js.Any])
    
    inline def setBootDiskUndefined: Self = StObject.set(x, "bootDisk", js.undefined)
    
    inline def setFreeRamBytes(value: String): Self = StObject.set(x, "freeRamBytes", value.asInstanceOf[js.Any])
    
    inline def setFreeRamBytesUndefined: Self = StObject.set(x, "freeRamBytes", js.undefined)
    
    inline def setTotalRamBytes(value: String): Self = StObject.set(x, "totalRamBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalRamBytesUndefined: Self = StObject.set(x, "totalRamBytes", js.undefined)
    
    inline def setUptimeSeconds(value: String): Self = StObject.set(x, "uptimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setUptimeSecondsUndefined: Self = StObject.set(x, "uptimeSeconds", js.undefined)
  }
}
