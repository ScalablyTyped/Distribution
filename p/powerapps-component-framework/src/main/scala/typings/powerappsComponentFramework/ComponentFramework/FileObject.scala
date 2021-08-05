package typings.powerappsComponentFramework.ComponentFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of one file object
  */
trait FileObject extends StObject {
  
  /**
    * Contents of the file.
    */
  var fileContent: String
  
  /**
    * Name of the file.
    */
  var fileName: String
  
  /**
    * Size of the file in KB.
    */
  var fileSize: Double
  
  /**
    * File MIME type.
    */
  var mimeType: String
}
object FileObject {
  
  inline def apply(fileContent: String, fileName: String, fileSize: Double, mimeType: String): FileObject = {
    val __obj = js.Dynamic.literal(fileContent = fileContent.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileObject]
  }
  
  extension [Self <: FileObject](x: Self) {
    
    inline def setFileContent(value: String): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
  }
}
