package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExistingDisk extends StObject {
  
  /**
    * If `disk` contains slashes, the Cloud Life Sciences API assumes that it is a complete URL for the disk. If `disk` does not contain slashes, the Cloud Life Sciences API assumes that
    * the disk is a zonal disk and a URL will be generated of the form `zones//disks/`, where `` is the zone in which the instance is allocated. The disk must be ext4 formatted. If all
    * `Mount` references to this disk have the `read_only` flag set to true, the disk will be attached in `read-only` mode and can be shared with other instances. Otherwise, the disk will
    * be available for writing but cannot be shared.
    */
  var disk: js.UndefOr[String] = js.undefined
}
object ExistingDisk {
  
  inline def apply(): ExistingDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExistingDisk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExistingDisk] (val x: Self) extends AnyVal {
    
    inline def setDisk(value: String): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
    
    inline def setDiskUndefined: Self = StObject.set(x, "disk", js.undefined)
  }
}
