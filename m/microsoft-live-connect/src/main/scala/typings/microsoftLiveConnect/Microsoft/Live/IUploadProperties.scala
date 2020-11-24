package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 'Properties' object passed into the WL.upload method.
  */
@js.native
trait IUploadProperties extends js.Object {
  
  /**
    * The id attribute of the <input> tag containing info about the file to
    * upload.
    */
  var element: String = js.native
  
  /**
    * Indicates whether the uploaded file should overwrite an existing
    * copy. Specify true or "true" to overwrite, false or "false" to not
    * overwrite and for the WL.upload method call to fail, or "rename" to
    * not overwrite and enable SkyDrive to assign a new name to the
    * uploaded file.
    * @default "false"
    */
  var overwrite: js.UndefOr[String] = js.native
  
  /**
    * The path to the file to upload.
    */
  var path: String = js.native
}
object IUploadProperties {
  
  @scala.inline
  def apply(element: String, path: String): IUploadProperties = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUploadProperties]
  }
  
  @scala.inline
  implicit class IUploadPropertiesOps[Self <: IUploadProperties] (val x: Self) extends AnyVal {
    
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
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwrite(value: String): Self = this.set("overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
  }
}
