package typings.pkcs11js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides general information about Cryptoki
  */
trait ModuleInfo extends StObject {
  
  /**
    * Cryptoki interface version number, for compatibility with future revisions of this interface
    */
  var cryptokiVersion: Version
  
  /**
    * Bit flags reserved for future versions. Must be zero for this version
    */
  var flags: Double
  
  /**
    * Character-string description of the library.
    * Must be padded with the blank character (' ')
    */
  var libraryDescription: String
  
  /**
    * Cryptoki library version number
    */
  var libraryVersion: Version
  
  /**
    * ID of the Cryptoki library manufacturer.
    * Must be padded with the blank character (' ').
    */
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleInfo] (val x: Self) extends AnyVal {
    
    inline def setCryptokiVersion(value: Version): Self = StObject.set(x, "cryptokiVersion", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setLibraryDescription(value: String): Self = StObject.set(x, "libraryDescription", value.asInstanceOf[js.Any])
    
    inline def setLibraryVersion(value: Version): Self = StObject.set(x, "libraryVersion", value.asInstanceOf[js.Any])
    
    inline def setManufacturerID(value: String): Self = StObject.set(x, "manufacturerID", value.asInstanceOf[js.Any])
  }
}
