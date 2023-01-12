package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Architecture extends StObject {
  
  var architecture: String
  
  var download_url: String
  
  var filename: String
  
  var os: String
  
  var sha256_checksum: js.UndefOr[String] = js.undefined
  
  /** @description A short lived bearer token used to download the runner, if needed. */
  var temp_download_token: js.UndefOr[String] = js.undefined
}
object Architecture {
  
  inline def apply(architecture: String, download_url: String, filename: String, os: String): Architecture = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], download_url = download_url.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[Architecture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Architecture] (val x: Self) extends AnyVal {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setDownload_url(value: String): Self = StObject.set(x, "download_url", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    
    inline def setSha256_checksum(value: String): Self = StObject.set(x, "sha256_checksum", value.asInstanceOf[js.Any])
    
    inline def setSha256_checksumUndefined: Self = StObject.set(x, "sha256_checksum", js.undefined)
    
    inline def setTemp_download_token(value: String): Self = StObject.set(x, "temp_download_token", value.asInstanceOf[js.Any])
    
    inline def setTemp_download_tokenUndefined: Self = StObject.set(x, "temp_download_token", js.undefined)
  }
}
