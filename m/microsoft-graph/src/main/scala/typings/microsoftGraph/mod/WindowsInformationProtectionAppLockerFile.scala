package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsInformationProtectionAppLockerFile extends Entity {
  
  // The friendly name
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // File as a byte array
  var file: js.UndefOr[NullableOption[Double]] = js.native
  
  // SHA256 hash of the file
  var fileHash: js.UndefOr[NullableOption[String]] = js.native
  
  // Version of the entity.
  var version: js.UndefOr[NullableOption[String]] = js.native
}
object WindowsInformationProtectionAppLockerFile {
  
  @scala.inline
  def apply(): WindowsInformationProtectionAppLockerFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionAppLockerFile]
  }
  
  @scala.inline
  implicit class WindowsInformationProtectionAppLockerFileMutableBuilder[Self <: WindowsInformationProtectionAppLockerFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFile(value: NullableOption[Double]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileHash(value: NullableOption[String]): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileHashNull: Self = StObject.set(x, "fileHash", null)
    
    @scala.inline
    def setFileHashUndefined: Self = StObject.set(x, "fileHash", js.undefined)
    
    @scala.inline
    def setFileNull: Self = StObject.set(x, "file", null)
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setVersion(value: NullableOption[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = StObject.set(x, "version", null)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
