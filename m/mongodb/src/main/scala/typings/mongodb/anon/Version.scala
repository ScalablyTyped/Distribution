package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version extends StObject {
  
  var version: js.BigInt
  
  var versionStr: String
}
object Version {
  
  inline def apply(version: js.BigInt, versionStr: String): Version = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any], versionStr = versionStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
  
  extension [Self <: Version](x: Self) {
    
    inline def setVersion(value: js.BigInt): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionStr(value: String): Self = StObject.set(x, "versionStr", value.asInstanceOf[js.Any])
  }
}
