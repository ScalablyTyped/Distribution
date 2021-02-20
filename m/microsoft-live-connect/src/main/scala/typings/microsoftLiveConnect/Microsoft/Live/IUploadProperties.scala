package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 'Properties' object passed into the WL.upload method.
  */
@js.native
trait IUploadProperties extends StObject {
  
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
  implicit class IUploadPropertiesMutableBuilder[Self <: IUploadProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwrite(value: String): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
