package typings.ngCordova.ngCordova

import typings.cordovaPluginFileTransfer.FileDownloadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileDownloadOptions extends FileDownloadOptions {
  
  var encodeURI: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object IFileDownloadOptions {
  
  @scala.inline
  def apply(): IFileDownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileDownloadOptions]
  }
  
  @scala.inline
  implicit class IFileDownloadOptionsOps[Self <: IFileDownloadOptions] (val x: Self) extends AnyVal {
    
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
    def setEncodeURI(value: Boolean): Self = this.set("encodeURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodeURI: Self = this.set("encodeURI", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
