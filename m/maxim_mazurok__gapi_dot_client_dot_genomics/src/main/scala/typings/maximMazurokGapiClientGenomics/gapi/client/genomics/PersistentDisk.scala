package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistentDisk extends StObject {
  
  /**
    * The size, in GB, of the disk to attach. If the size is not specified, a default is chosen to ensure reasonable I/O performance. If the disk type is specified as `local-ssd`,
    * multiple local drives are automatically combined to provide the requested size. Note, however, that each physical SSD is 375GB in size, and no more than 8 drives can be attached to
    * a single instance.
    */
  var sizeGb: js.UndefOr[Double] = js.undefined
  
  /** An image to put on the disk before attaching it to the VM. */
  var sourceImage: js.UndefOr[String] = js.undefined
  
  /** The Compute Engine disk type. If unspecified, `pd-standard` is used. */
  var `type`: js.UndefOr[String] = js.undefined
}
object PersistentDisk {
  
  inline def apply(): PersistentDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentDisk]
  }
  
  extension [Self <: PersistentDisk](x: Self) {
    
    inline def setSizeGb(value: Double): Self = StObject.set(x, "sizeGb", value.asInstanceOf[js.Any])
    
    inline def setSizeGbUndefined: Self = StObject.set(x, "sizeGb", js.undefined)
    
    inline def setSourceImage(value: String): Self = StObject.set(x, "sourceImage", value.asInstanceOf[js.Any])
    
    inline def setSourceImageUndefined: Self = StObject.set(x, "sourceImage", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
