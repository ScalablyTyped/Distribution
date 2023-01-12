package typings.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NfsExportOptions extends StObject {
  
  /** Either READ_ONLY, for allowing only read requests on the exported directory, or READ_WRITE, for allowing both read and write requests. The default is READ_WRITE. */
  var accessMode: js.UndefOr[String] = js.undefined
  
  /**
    * An integer representing the anonymous group id with a default value of 65534. Anon_gid may only be set with squash_mode of ROOT_SQUASH. An error will be returned if this field is
    * specified for other squash_mode settings.
    */
  var anonGid: js.UndefOr[String] = js.undefined
  
  /**
    * An integer representing the anonymous user id with a default value of 65534. Anon_uid may only be set with squash_mode of ROOT_SQUASH. An error will be returned if this field is
    * specified for other squash_mode settings.
    */
  var anonUid: js.UndefOr[String] = js.undefined
  
  /**
    * List of either an IPv4 addresses in the format `{octet1}.{octet2}.{octet3}.{octet4}` or CIDR ranges in the format `{octet1}.{octet2}.{octet3}.{octet4}/{mask size}` which may mount
    * the file share. Overlapping IP ranges are not allowed, both within and across NfsExportOptions. An error will be returned. The limit is 64 IP ranges/addresses for each
    * FileShareConfig among all NfsExportOptions.
    */
  var ipRanges: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Either NO_ROOT_SQUASH, for allowing root access on the exported directory, or ROOT_SQUASH, for not allowing root access. The default is NO_ROOT_SQUASH. */
  var squashMode: js.UndefOr[String] = js.undefined
}
object NfsExportOptions {
  
  inline def apply(): NfsExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NfsExportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NfsExportOptions] (val x: Self) extends AnyVal {
    
    inline def setAccessMode(value: String): Self = StObject.set(x, "accessMode", value.asInstanceOf[js.Any])
    
    inline def setAccessModeUndefined: Self = StObject.set(x, "accessMode", js.undefined)
    
    inline def setAnonGid(value: String): Self = StObject.set(x, "anonGid", value.asInstanceOf[js.Any])
    
    inline def setAnonGidUndefined: Self = StObject.set(x, "anonGid", js.undefined)
    
    inline def setAnonUid(value: String): Self = StObject.set(x, "anonUid", value.asInstanceOf[js.Any])
    
    inline def setAnonUidUndefined: Self = StObject.set(x, "anonUid", js.undefined)
    
    inline def setIpRanges(value: js.Array[String]): Self = StObject.set(x, "ipRanges", value.asInstanceOf[js.Any])
    
    inline def setIpRangesUndefined: Self = StObject.set(x, "ipRanges", js.undefined)
    
    inline def setIpRangesVarargs(value: String*): Self = StObject.set(x, "ipRanges", js.Array(value*))
    
    inline def setSquashMode(value: String): Self = StObject.set(x, "squashMode", value.asInstanceOf[js.Any])
    
    inline def setSquashModeUndefined: Self = StObject.set(x, "squashMode", js.undefined)
  }
}
