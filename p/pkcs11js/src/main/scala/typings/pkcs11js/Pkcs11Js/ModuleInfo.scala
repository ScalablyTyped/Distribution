package typings.pkcs11js.Pkcs11Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleInfo extends StObject {
  
  var cryptokiVersion: Version = js.native
  
  var flags: Double = js.native
  
  var libraryDescription: String = js.native
  
  var libraryVersion: Version = js.native
  
  var manufacturerID: String = js.native
}
object ModuleInfo {
  
  @scala.inline
  def apply(
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
  implicit class ModuleInfoMutableBuilder[Self <: ModuleInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCryptokiVersion(value: Version): Self = StObject.set(x, "cryptokiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibraryDescription(value: String): Self = StObject.set(x, "libraryDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibraryVersion(value: Version): Self = StObject.set(x, "libraryVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerID(value: String): Self = StObject.set(x, "manufacturerID", value.asInstanceOf[js.Any])
  }
}
