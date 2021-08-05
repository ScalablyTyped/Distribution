package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 'Properties' object passed into the WL.upload method.
  */
trait IUploadProperties extends StObject {
  
  /**
    * The id attribute of the <input> tag containing info about the file to
    * upload.
    */
  var element: String
  
  /**
    * Indicates whether the uploaded file should overwrite an existing
    * copy. Specify true or "true" to overwrite, false or "false" to not
    * overwrite and for the WL.upload method call to fail, or "rename" to
    * not overwrite and enable SkyDrive to assign a new name to the
    * uploaded file.
    * @default "false"
    */
  var overwrite: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the file to upload.
    */
  var path: String
}
object IUploadProperties {
  
  inline def apply(element: String, path: String): IUploadProperties = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUploadProperties]
  }
  
  extension [Self <: IUploadProperties](x: Self) {
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setOverwrite(value: String): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
