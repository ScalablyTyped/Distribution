package typings.maximMazurokGapiClientPoly.gapi.client.poly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetImportMessage extends js.Object {
  
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
  implicit class AssetImportMessageOps[Self <: AssetImportMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
    
    @scala.inline
    def setImageError(value: ImageError): Self = this.set("imageError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageError: Self = this.set("imageError", js.undefined)
    
    @scala.inline
    def setObjParseError(value: ObjParseError): Self = this.set("objParseError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjParseError: Self = this.set("objParseError", js.undefined)
  }
}
