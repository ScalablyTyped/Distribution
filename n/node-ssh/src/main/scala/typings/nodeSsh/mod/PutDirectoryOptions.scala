package typings.nodeSsh.mod

import typings.ssh2Streams.mod.TransferOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDirectoryOptions extends js.Object {
  var concurrency: js.UndefOr[Double] = js.native
  var recursive: js.UndefOr[Boolean] = js.native
  var sftp: js.UndefOr[SFTP] = js.native
  var sftpOptions: js.UndefOr[TransferOptions] = js.native
  var tick: js.UndefOr[
    js.Function3[
      /* localPath */ String, 
      /* remotePath */ String, 
      /* error */ js.UndefOr[Error | Null], 
      Unit
    ]
  ] = js.native
  var validate: js.UndefOr[js.Function1[/* localPath */ String, Boolean]] = js.native
}

object PutDirectoryOptions {
  @scala.inline
  def apply(): PutDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutDirectoryOptions]
  }
  @scala.inline
  implicit class PutDirectoryOptionsOps[Self <: PutDirectoryOptions] (val x: Self) extends AnyVal {
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
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    @scala.inline
    def setSftp(value: SFTP): Self = this.set("sftp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSftp: Self = this.set("sftp", js.undefined)
    @scala.inline
    def setSftpOptions(value: TransferOptions): Self = this.set("sftpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSftpOptions: Self = this.set("sftpOptions", js.undefined)
    @scala.inline
    def setTick(
      value: (/* localPath */ String, /* remotePath */ String, /* error */ js.UndefOr[Error | Null]) => Unit
    ): Self = this.set("tick", js.Any.fromFunction3(value))
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
    @scala.inline
    def setValidate(value: /* localPath */ String => Boolean): Self = this.set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

