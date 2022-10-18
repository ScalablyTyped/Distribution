package typings.next.anon

import typings.next.nextStrings.enabled
import typings.next.nextStrings.failed
import typings.next.nextStrings.fallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arch extends StObject {
  
  var arch: String
  
  var glibcVersion: js.UndefOr[String] = js.undefined
  
  var installedSwcPackages: js.UndefOr[String] = js.undefined
  
  var nextVersion: String
  
  var nodeVersion: String
  
  var platform: String
  
  var wasm: js.UndefOr[enabled | fallback | failed] = js.undefined
}
object Arch {
  
  inline def apply(arch: String, nextVersion: String, nodeVersion: String, platform: String): Arch = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], nextVersion = nextVersion.asInstanceOf[js.Any], nodeVersion = nodeVersion.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arch]
  }
  
  extension [Self <: Arch](x: Self) {
    
    inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setGlibcVersion(value: String): Self = StObject.set(x, "glibcVersion", value.asInstanceOf[js.Any])
    
    inline def setGlibcVersionUndefined: Self = StObject.set(x, "glibcVersion", js.undefined)
    
    inline def setInstalledSwcPackages(value: String): Self = StObject.set(x, "installedSwcPackages", value.asInstanceOf[js.Any])
    
    inline def setInstalledSwcPackagesUndefined: Self = StObject.set(x, "installedSwcPackages", js.undefined)
    
    inline def setNextVersion(value: String): Self = StObject.set(x, "nextVersion", value.asInstanceOf[js.Any])
    
    inline def setNodeVersion(value: String): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setWasm(value: enabled | fallback | failed): Self = StObject.set(x, "wasm", value.asInstanceOf[js.Any])
    
    inline def setWasmUndefined: Self = StObject.set(x, "wasm", js.undefined)
  }
}
