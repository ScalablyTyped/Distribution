package typings.naverWhale.whale.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformInfo extends StObject {
  
  /**
    * The machine's processor architecture.
    */
  var arch: typings.chrome.chrome.runtime.PlatformArch
  
  /**
    * The native client architecture. This may be different from arch on some platforms.
    */
  var nacl_arch: typings.chrome.chrome.runtime.PlatformNaclArch
  
  /**
    * The operating system chrome is running on.
    */
  var os: typings.chrome.chrome.runtime.PlatformOs
}
object PlatformInfo {
  
  inline def apply(
    arch: typings.chrome.chrome.runtime.PlatformArch,
    nacl_arch: typings.chrome.chrome.runtime.PlatformNaclArch,
    os: typings.chrome.chrome.runtime.PlatformOs
  ): PlatformInfo = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], nacl_arch = nacl_arch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlatformInfo] (val x: Self) extends AnyVal {
    
    inline def setArch(value: typings.chrome.chrome.runtime.PlatformArch): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setNacl_arch(value: typings.chrome.chrome.runtime.PlatformNaclArch): Self = StObject.set(x, "nacl_arch", value.asInstanceOf[js.Any])
    
    inline def setOs(value: typings.chrome.chrome.runtime.PlatformOs): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
  }
}
