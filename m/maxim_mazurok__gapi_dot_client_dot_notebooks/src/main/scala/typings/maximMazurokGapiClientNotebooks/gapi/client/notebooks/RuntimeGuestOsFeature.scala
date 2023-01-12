package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeGuestOsFeature extends StObject {
  
  /**
    * The ID of a supported feature. Read [Enabling guest operating system features](https://cloud.google.com/compute/docs/images/create-delete-deprecate-private-images#guest-os-features)
    * to see a list of available options. Valid values: * FEATURE_TYPE_UNSPECIFIED * MULTI_IP_SUBNET * SECURE_BOOT * UEFI_COMPATIBLE * VIRTIO_SCSI_MULTIQUEUE * WINDOWS
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object RuntimeGuestOsFeature {
  
  inline def apply(): RuntimeGuestOsFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeGuestOsFeature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuntimeGuestOsFeature] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
