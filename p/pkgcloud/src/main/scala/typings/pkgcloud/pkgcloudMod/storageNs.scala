package typings.pkgcloud.pkgcloudMod

import typings.node.processMod.Global.NodeJSNs.ReadStream
import typings.node.processMod.Global.NodeJSNs.WriteStream
import typings.pkgcloud.pkgcloudMod.storageNs.Client
import typings.pkgcloud.pkgcloudMod.storageNs.Container
import typings.pkgcloud.pkgcloudMod.storageNs.File
import typings.pkgcloud.pkgcloudMod.storageNs.StorageDownloadOptions
import typings.pkgcloud.pkgcloudMod.storageNs.StorageUploadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkgcloud", "storage")
@js.native
object storageNs extends js.Object {
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
  
  trait Container extends js.Object {
    // files: ?
    var client: Client
  }
  
  trait File extends js.Object {
    var client: Client
    var container: String
    var name: String
    var size: Double
  }
  
  trait StorageDownloadOptions extends js.Object {
    var container: String
    var remote: String
  }
  
  trait StorageUploadOptions extends js.Object {
    var container: String
    var remote: String
  }
  
  def createClient(options: ProviderOptions): Client = js.native
}

