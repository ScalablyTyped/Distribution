package typings
package pkgcloudLib.pkgcloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkgcloud", "storage")
@js.native
object storageNs extends js.Object {
  trait Client extends js.Object {
    var config: pkgcloudLib.pkgcloudMod.ProviderOptions
    var protocol: java.lang.String
    var provider: java.lang.String
    def createContainer(
      options: js.Any,
      callback: js.Function2[/* err */ pkgcloudLib.pkgcloudMod.ClientError, /* container */ Container, _]
    ): scala.Unit
    def destroyContainer(
      containerName: java.lang.String,
      callback: js.Function1[/* err */ pkgcloudLib.pkgcloudMod.ClientError, _]
    ): scala.Unit
    def download(options: StorageDownloadOptions): nodeLib.NodeJSNs.ReadStream
    def getContainer(
      containerName: java.lang.String,
      callback: js.Function2[/* err */ pkgcloudLib.pkgcloudMod.ClientError, /* container */ Container, _]
    ): scala.Unit
    def getContainers(
      callback: js.Function2[
          /* err */ pkgcloudLib.pkgcloudMod.ClientError, 
          /* containers */ js.Array[Container], 
          _
        ]
    ): scala.Unit
    def getFile(
      containerName: java.lang.String,
      file: java.lang.String,
      callback: js.Function2[/* err */ pkgcloudLib.pkgcloudMod.ClientError, /* file */ File, _]
    ): scala.Unit
    def getFiles(
      containerName: java.lang.String,
      callback: js.Function2[/* err */ pkgcloudLib.pkgcloudMod.ClientError, /* files */ js.Array[File], _]
    ): scala.Unit
    // Logs
    def on(
      eventName: java.lang.String,
      callback: js.Function2[/* message */ java.lang.String, /* object */ js.UndefOr[js.Any], _]
    ): scala.Unit
    def removeFile(
      containerName: java.lang.String,
      file: java.lang.String,
      callback: js.Function1[/* err */ pkgcloudLib.pkgcloudMod.ClientError, _]
    ): scala.Unit
    def upload(options: StorageUploadOptions): nodeLib.NodeJSNs.WriteStream
  }
  
  trait Container extends js.Object {
    // files: ?
    var client: Client
  }
  
  trait File extends js.Object {
    var client: Client
    var container: java.lang.String
    var name: java.lang.String
    var size: scala.Double
  }
  
  trait StorageDownloadOptions extends js.Object {
    var container: java.lang.String
    var remote: java.lang.String
  }
  
  trait StorageUploadOptions extends js.Object {
    var container: java.lang.String
    var remote: java.lang.String
  }
  
  def createClient(options: pkgcloudLib.pkgcloudMod.ProviderOptions): Client = js.native
}

