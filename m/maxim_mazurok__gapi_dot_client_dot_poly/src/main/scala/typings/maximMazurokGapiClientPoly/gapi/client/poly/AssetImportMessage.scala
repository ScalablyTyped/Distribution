package typings.maximMazurokGapiClientPoly.gapi.client.poly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetImportMessage extends StObject {
  
  /** The code associated with this message. */
  var code: js.UndefOr[String] = js.native
  
  /** An optional file path. Only present for those error codes that specify it. */
  var filePath: js.UndefOr[String] = js.native
  
  /** An optional image error. Only present for INVALID_IMAGE_FILE. */
  var imageError: js.UndefOr[ImageError] = js.native
  
  /** An optional OBJ parse error. Only present for OBJ_PARSE_ERROR. */
  var objParseError: js.UndefOr[ObjParseError] = js.native
}
object AssetImportMessage {
  
  @scala.inline
  def apply(): AssetImportMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetImportMessage]
  }
  
  @scala.inline
  implicit class AssetImportMessageMutableBuilder[Self <: AssetImportMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    @scala.inline
    def setImageError(value: ImageError): Self = StObject.set(x, "imageError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageErrorUndefined: Self = StObject.set(x, "imageError", js.undefined)
    
    @scala.inline
    def setObjParseError(value: ObjParseError): Self = StObject.set(x, "objParseError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjParseErrorUndefined: Self = StObject.set(x, "objParseError", js.undefined)
  }
}
