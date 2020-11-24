package typings.nodeSsh.mod

import typings.ssh2Streams.mod.TransferOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutFilesOptions extends js.Object {
  
  var concurrency: js.UndefOr[Double] = js.native
  
  var sftp: js.UndefOr[SFTP] = js.native
  
  var sftpOptions: js.UndefOr[TransferOptions] = js.native
}
object PutFilesOptions {
  
  @scala.inline
  def apply(): PutFilesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutFilesOptions]
  }
  
  @scala.inline
  implicit class PutFilesOptionsOps[Self <: PutFilesOptions] (val x: Self) extends AnyVal {
    
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
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrency: Self = this.set("concurrency", js.undefined)
    
    @scala.inline
    def setSftp(value: SFTP): Self = this.set("sftp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSftp: Self = this.set("sftp", js.undefined)
    
    @scala.inline
    def setSftpOptions(value: TransferOptions): Self = this.set("sftpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSftpOptions: Self = this.set("sftpOptions", js.undefined)
  }
}
