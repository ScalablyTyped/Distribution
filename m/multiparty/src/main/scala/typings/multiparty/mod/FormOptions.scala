package typings.multiparty.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormOptions extends js.Object {
  
  /**
    * Enables field events and disables part events for fields.
    * This is automatically set to true if you add a field listener.
    */
  var autoFields: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables file events and disables part events for files.
    * This is automatically set to true if you add a file listener.
    */
  var autoFiles: js.UndefOr[Boolean] = js.native
  
  /**
    * sets encoding for the incoming form fields. Defaults to utf8.
    */
  var encoding: js.UndefOr[String] = js.native
  
  /**
    * Limits the number of fields that will be parsed before emitting an error event.
    * A file counts as a field in this case. Defaults to 1000.
    */
  var maxFields: js.UndefOr[Double] = js.native
  
  /**
    * Limits the amount of memory all fields (not files) can allocate in bytes.
    * If this value is exceeded, an error event is emitted. The default size is 2MB.
    */
  var maxFieldsSize: js.UndefOr[Double] = js.native
  
  /**
    * Only relevant when autoFiles is true.
    * Limits the total bytes accepted for all files combined.
    * If this value is exceeded, an error event is emitted.
    * The default is Infinity.
    */
  var maxFilesSize: js.UndefOr[Double] = js.native
  
  /**
    * Only relevant when autoFiles is true.
    * The directory for placing file uploads in.
    * You can move them later using fs.rename(). Defaults to os.tmpDir().
    */
  var uploadDir: js.UndefOr[String] = js.native
}
object FormOptions {
  
  @scala.inline
  def apply(): FormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormOptions]
  }
  
  @scala.inline
  implicit class FormOptionsOps[Self <: FormOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoFields(value: Boolean): Self = this.set("autoFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFields: Self = this.set("autoFields", js.undefined)
    
    @scala.inline
    def setAutoFiles(value: Boolean): Self = this.set("autoFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFiles: Self = this.set("autoFiles", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setMaxFields(value: Double): Self = this.set("maxFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFields: Self = this.set("maxFields", js.undefined)
    
    @scala.inline
    def setMaxFieldsSize(value: Double): Self = this.set("maxFieldsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFieldsSize: Self = this.set("maxFieldsSize", js.undefined)
    
    @scala.inline
    def setMaxFilesSize(value: Double): Self = this.set("maxFilesSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFilesSize: Self = this.set("maxFilesSize", js.undefined)
    
    @scala.inline
    def setUploadDir(value: String): Self = this.set("uploadDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadDir: Self = this.set("uploadDir", js.undefined)
  }
}
