package typings.powerappsDashComponentDashFramework.ComponentFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Interface of one file object
	 */
trait FileObject extends js.Object {
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
  @scala.inline
  def apply(fileContent: String, fileName: String, fileSize: Double, mimeType: String): FileObject = {
    val __obj = js.Dynamic.literal(fileContent = fileContent, fileName = fileName, fileSize = fileSize, mimeType = mimeType)
  
    __obj.asInstanceOf[FileObject]
  }
}

