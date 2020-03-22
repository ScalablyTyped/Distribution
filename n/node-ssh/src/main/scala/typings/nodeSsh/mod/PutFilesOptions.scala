package typings.nodeSsh.mod

import typings.ssh2Streams.mod.TransferOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutFilesOptions extends js.Object {
  var concurrency: js.UndefOr[Double] = js.undefined
  var sftp: js.UndefOr[SFTP] = js.undefined
  var sftpOptions: js.UndefOr[TransferOptions] = js.undefined
}

object PutFilesOptions {
  @scala.inline
  def apply(concurrency: Int | Double = null, sftp: SFTP = null, sftpOptions: TransferOptions = null): PutFilesOptions = {
    val __obj = js.Dynamic.literal()
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (sftp != null) __obj.updateDynamic("sftp")(sftp.asInstanceOf[js.Any])
    if (sftpOptions != null) __obj.updateDynamic("sftpOptions")(sftpOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFilesOptions]
  }
}

