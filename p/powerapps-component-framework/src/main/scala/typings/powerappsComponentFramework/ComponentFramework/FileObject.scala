package typings.powerappsComponentFramework.ComponentFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of one file object
  */
@js.native
trait FileObject extends js.Object {
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
  implicit class FileObjectOps[Self <: FileObject] (val x: Self) extends AnyVal {
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
    def setFileContent(value: String): Self = this.set("fileContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
  }
  
}

