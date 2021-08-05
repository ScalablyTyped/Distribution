package typings.pkcs11js.Pkcs11Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleInfo extends StObject {
  
  var cryptokiVersion: Version
  
  var flags: Double
  
  var libraryDescription: String
  
  var libraryVersion: Version
  
  var manufacturerID: String
}
object ModuleInfo {
  
  inline def apply(
    cryptokiVersion: Version,
    flags: Double,
    libraryDescription: String,
    libraryVersion: Version,
    manufacturerID: String
  ): ModuleInfo = {
    val __obj = js.Dynamic.literal(cryptokiVersion = cryptokiVersion.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], libraryDescription = libraryDescription.asInstanceOf[js.Any], libraryVersion = libraryVersion.asInstanceOf[js.Any], manufacturerID = manufacturerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleInfo]
  }
  
  extension [Self <: ModuleInfo](x: Self) {
    
    inline def setCryptokiVersion(value: Version): Self = StObject.set(x, "cryptokiVersion", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setLibraryDescription(value: String): Self = StObject.set(x, "libraryDescription", value.asInstanceOf[js.Any])
    
    inline def setLibraryVersion(value: Version): Self = StObject.set(x, "libraryVersion", value.asInstanceOf[js.Any])
    
    inline def setManufacturerID(value: String): Self = StObject.set(x, "manufacturerID", value.asInstanceOf[js.Any])
  }
}
