package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigFile extends StObject {
  
  /** The bytes that constitute the file. */
  var fileContents: js.UndefOr[String] = js.native
  
  /** The file name of the configuration file (full or relative path). */
  var filePath: js.UndefOr[String] = js.native
  
  /** The type of configuration file this represents. */
  var fileType: js.UndefOr[String] = js.native
}
object ConfigFile {
  
  @scala.inline
  def apply(): ConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigFile]
  }
  
  @scala.inline
  implicit class ConfigFileMutableBuilder[Self <: ConfigFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileContents(value: String): Self = StObject.set(x, "fileContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileContentsUndefined: Self = StObject.set(x, "fileContents", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    @scala.inline
    def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
  }
}
