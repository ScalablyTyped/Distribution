package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsInformationProtectionAppLockerFile
  extends StObject
     with Entity {
  
  // The friendly name
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // File as a byte array
  var file: js.UndefOr[NullableOption[String]] = js.undefined
  
  // SHA256 hash of the file
  var fileHash: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Version of the entity.
  var version: js.UndefOr[NullableOption[String]] = js.undefined
}
object WindowsInformationProtectionAppLockerFile {
  
  inline def apply(): WindowsInformationProtectionAppLockerFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionAppLockerFile]
  }
  
  extension [Self <: WindowsInformationProtectionAppLockerFile](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFile(value: NullableOption[String]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileHash(value: NullableOption[String]): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
    
    inline def setFileHashNull: Self = StObject.set(x, "fileHash", null)
    
    inline def setFileHashUndefined: Self = StObject.set(x, "fileHash", js.undefined)
    
    inline def setFileNull: Self = StObject.set(x, "file", null)
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
