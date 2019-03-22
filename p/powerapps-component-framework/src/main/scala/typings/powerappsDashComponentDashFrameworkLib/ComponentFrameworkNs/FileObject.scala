package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs

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
  var fileContent: java.lang.String
  /**
  		 * Name of the file.
  		 */
  var fileName: java.lang.String
  /**
  		 * Size of the file in KB.
  		 */
  var fileSize: scala.Double
  /**
  		 * File MIME type.
  		 */
  var mimeType: java.lang.String
}

object FileObject {
  @scala.inline
  def apply(
    fileContent: java.lang.String,
    fileName: java.lang.String,
    fileSize: scala.Double,
    mimeType: java.lang.String
  ): FileObject = {
    val __obj = js.Dynamic.literal(fileContent = fileContent, fileName = fileName, fileSize = fileSize, mimeType = mimeType)
  
    __obj.asInstanceOf[FileObject]
  }
}

