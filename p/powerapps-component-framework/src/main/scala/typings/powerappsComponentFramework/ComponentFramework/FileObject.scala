package typings.powerappsComponentFramework.ComponentFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of one file object
  */
@js.native
trait FileObject extends StObject {
  
  /**
    * Contents of the file.
    */
  var fileContent: String = js.native
  
  /**
    * Name of the file.
    */
  var fileName: String = js.native
  
  /**
    * Size of the file in KB.
    */
  var fileSize: Double = js.native
  
  /**
    * File MIME type.
    */
  var mimeType: String = js.native
}
object FileObject {
  
  @scala.inline
  def apply(fileContent: String, fileName: String, fileSize: Double, mimeType: String): FileObject = {
    val __obj = js.Dynamic.literal(fileContent = fileContent.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileObject]
  }
  
  @scala.inline
  implicit class FileObjectMutableBuilder[Self <: FileObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileContent(value: String): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
  }
}
