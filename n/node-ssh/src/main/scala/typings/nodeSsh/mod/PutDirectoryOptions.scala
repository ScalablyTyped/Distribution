package typings.nodeSsh.mod

import typings.ssh2Streams.mod.TransferOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutDirectoryOptions extends js.Object {
  var concurrency: js.UndefOr[Double] = js.undefined
  var recursive: js.UndefOr[Boolean] = js.undefined
  var sftp: js.UndefOr[SFTP] = js.undefined
  var sftpOptions: js.UndefOr[TransferOptions] = js.undefined
  var tick: js.UndefOr[
    js.Function3[
      /* localPath */ String, 
      /* remotePath */ String, 
      /* error */ js.UndefOr[Error | Null], 
      Unit
    ]
  ] = js.undefined
  var validate: js.UndefOr[js.Function1[/* localPath */ String, Boolean]] = js.undefined
}

object PutDirectoryOptions {
  @scala.inline
  def apply(
    concurrency: js.UndefOr[Double] = js.undefined,
    recursive: js.UndefOr[Boolean] = js.undefined,
    sftp: SFTP = null,
    sftpOptions: TransferOptions = null,
    tick: (/* localPath */ String, /* remotePath */ String, /* error */ js.UndefOr[Error | Null]) => Unit = null,
    validate: /* localPath */ String => Boolean = null
  ): PutDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrency)) __obj.updateDynamic("concurrency")(concurrency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.get.asInstanceOf[js.Any])
    if (sftp != null) __obj.updateDynamic("sftp")(sftp.asInstanceOf[js.Any])
    if (sftpOptions != null) __obj.updateDynamic("sftpOptions")(sftpOptions.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(js.Any.fromFunction3(tick))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    __obj.asInstanceOf[PutDirectoryOptions]
  }
}

