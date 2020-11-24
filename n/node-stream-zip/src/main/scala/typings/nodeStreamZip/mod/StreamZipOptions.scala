package typings.nodeStreamZip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamZipOptions extends js.Object {
  
  /**
    * Filesystem read chunk size
    * @default automatic based on file size
    */
  var chunkSize: js.UndefOr[Double] = js.native
  
  /**
    * Alternatively, you can pass fd here
    * @default undefined
    */
  var fd: js.UndefOr[Double] = js.native
  
  /**
    * File to read
    * @default undefined
    */
  var file: js.UndefOr[String] = js.native
  
  /**
    * By default, entry name is checked for malicious characters, like ../ or c:\123,
    * pass this flag to disable validation error
    * @default false
    */
  var skipEntryNameValidation: js.UndefOr[Boolean] = js.native
  
  /**
    * You will be able to work with entries inside zip archive,
    * otherwise the only way to access them is entry event
    * @default true
    */
  var storeEntries: js.UndefOr[Boolean] = js.native
}
object StreamZipOptions {
  
  @scala.inline
  def apply(): StreamZipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamZipOptions]
  }
  
  @scala.inline
  implicit class StreamZipOptionsOps[Self <: StreamZipOptions] (val x: Self) extends AnyVal {
    
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
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    
    @scala.inline
    def setFd(value: Double): Self = this.set("fd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFd: Self = this.set("fd", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setSkipEntryNameValidation(value: Boolean): Self = this.set("skipEntryNameValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipEntryNameValidation: Self = this.set("skipEntryNameValidation", js.undefined)
    
    @scala.inline
    def setStoreEntries(value: Boolean): Self = this.set("storeEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreEntries: Self = this.set("storeEntries", js.undefined)
  }
}
