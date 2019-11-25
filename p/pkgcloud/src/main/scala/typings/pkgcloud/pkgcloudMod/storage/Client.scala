package typings.pkgcloud.pkgcloudMod.storage

import typings.node.processMod._Global_.NodeJS.ReadStream
import typings.node.processMod._Global_.NodeJS.WriteStream
import typings.pkgcloud.pkgcloudMod.ClientError
import typings.pkgcloud.pkgcloudMod.ProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var config: ProviderOptions
  var protocol: String
  var provider: String
  def createContainer(options: js.Any, callback: js.Function2[/* err */ ClientError, /* container */ Container, _]): Unit
  def destroyContainer(containerName: String, callback: js.Function1[/* err */ ClientError, _]): Unit
  def download(options: StorageDownloadOptions): ReadStream
  def getContainer(containerName: String, callback: js.Function2[/* err */ ClientError, /* container */ Container, _]): Unit
  def getContainers(callback: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], _]): Unit
  def getFile(
    containerName: String,
    file: String,
    callback: js.Function2[/* err */ ClientError, /* file */ File, _]
  ): Unit
  def getFiles(
    containerName: String,
    callback: js.Function2[/* err */ ClientError, /* files */ js.Array[File], _]
  ): Unit
  // Logs
  def on(
    eventName: String,
    callback: js.Function2[/* message */ String, /* object */ js.UndefOr[js.Any], _]
  ): Unit
  def removeFile(containerName: String, file: String, callback: js.Function1[/* err */ ClientError, _]): Unit
  def upload(options: StorageUploadOptions): WriteStream
}

object Client {
  @scala.inline
  def apply(
    config: ProviderOptions,
    createContainer: (js.Any, js.Function2[/* err */ ClientError, /* container */ Container, _]) => Unit,
    destroyContainer: (String, js.Function1[/* err */ ClientError, _]) => Unit,
    download: StorageDownloadOptions => ReadStream,
    getContainer: (String, js.Function2[/* err */ ClientError, /* container */ Container, _]) => Unit,
    getContainers: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], _] => Unit,
    getFile: (String, String, js.Function2[/* err */ ClientError, /* file */ File, _]) => Unit,
    getFiles: (String, js.Function2[/* err */ ClientError, /* files */ js.Array[File], _]) => Unit,
    on: (String, js.Function2[/* message */ String, /* object */ js.UndefOr[js.Any], _]) => Unit,
    protocol: String,
    provider: String,
    removeFile: (String, String, js.Function1[/* err */ ClientError, _]) => Unit,
    upload: StorageUploadOptions => WriteStream
  ): Client = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], createContainer = js.Any.fromFunction2(createContainer), destroyContainer = js.Any.fromFunction2(destroyContainer), download = js.Any.fromFunction1(download), getContainer = js.Any.fromFunction2(getContainer), getContainers = js.Any.fromFunction1(getContainers), getFile = js.Any.fromFunction3(getFile), getFiles = js.Any.fromFunction2(getFiles), on = js.Any.fromFunction2(on), protocol = protocol.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], removeFile = js.Any.fromFunction3(removeFile), upload = js.Any.fromFunction1(upload))
  
    __obj.asInstanceOf[Client]
  }
}

