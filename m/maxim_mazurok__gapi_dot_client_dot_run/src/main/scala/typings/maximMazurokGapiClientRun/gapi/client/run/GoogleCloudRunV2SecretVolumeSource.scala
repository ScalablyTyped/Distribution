package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2SecretVolumeSource extends StObject {
  
  /**
    * Integer representation of mode bits to use on created files by default. Must be a value between 0000 and 0777 (octal), defaulting to 0444. Directories within the path are not
    * affected by this setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer
    * value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r),
    * set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file
    * mode, like fsGroup, and the result can be other mode bits set. This might be in conflict with other options that affect the file mode, like fsGroup, and as a result, other mode bits
    * could be set.
    */
  var defaultMode: js.UndefOr[Double] = js.undefined
  
  /**
    * If unspecified, the volume will expose a file whose name is the secret, relative to VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud
    * Secret Manager and the path will be the name of the file exposed in the volume. When items are defined, they must specify a path and a version.
    */
  var items: js.UndefOr[js.Array[GoogleCloudRunV2VersionToPath]] = js.undefined
  
  /**
    * Required. The name of the secret in Cloud Secret Manager. Format: {secret} if the secret is in the same project. projects/{project}/secrets/{secret} if the secret is in a different
    * project.
    */
  var secret: js.UndefOr[String] = js.undefined
}
object GoogleCloudRunV2SecretVolumeSource {
  
  inline def apply(): GoogleCloudRunV2SecretVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2SecretVolumeSource]
  }
  
  extension [Self <: GoogleCloudRunV2SecretVolumeSource](x: Self) {
    
    inline def setDefaultMode(value: Double): Self = StObject.set(x, "defaultMode", value.asInstanceOf[js.Any])
    
    inline def setDefaultModeUndefined: Self = StObject.set(x, "defaultMode", js.undefined)
    
    inline def setItems(value: js.Array[GoogleCloudRunV2VersionToPath]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: GoogleCloudRunV2VersionToPath*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
