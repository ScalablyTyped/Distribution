package typings.pkgcloud.mod.storage

import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import typings.pkgcloud.mod.ClientError
import typings.pkgcloud.mod.ProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends js.Object {
  
  var config: ProviderOptions = js.native
  
  def createContainer(options: js.Any, callback: js.Function2[/* err */ ClientError, /* container */ Container, _]): Unit = js.native
  
  def destroyContainer(containerName: String, callback: js.Function1[/* err */ ClientError, _]): Unit = js.native
  
  def download(options: StorageDownloadOptions): ReadStream = js.native
  
  def getContainer(containerName: String, callback: js.Function2[/* err */ ClientError, /* container */ Container, _]): Unit = js.native
  
  def getContainers(callback: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], _]): Unit = js.native
  
  def getFile(
    containerName: String,
    file: String,
    callback: js.Function2[/* err */ ClientError, /* file */ File, _]
  ): Unit = js.native
  
  def getFiles(
    containerName: String,
    callback: js.Function2[/* err */ ClientError, /* files */ js.Array[File], _]
  ): Unit = js.native
  
  // Logs
  def on(
    eventName: String,
    callback: js.Function2[/* message */ String, /* object */ js.UndefOr[js.Any], _]
  ): Unit = js.native
  
  var protocol: String = js.native
  
  var provider: String = js.native
  
  def removeFile(containerName: String, file: String, callback: js.Function1[/* err */ ClientError, _]): Unit = js.native
  
  def upload(options: StorageUploadOptions): WriteStream = js.native
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
  
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: ProviderOptions): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateContainer(value: (js.Any, js.Function2[/* err */ ClientError, /* container */ Container, _]) => Unit): Self = this.set("createContainer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDestroyContainer(value: (String, js.Function1[/* err */ ClientError, _]) => Unit): Self = this.set("destroyContainer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDownload(value: StorageDownloadOptions => ReadStream): Self = this.set("download", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContainer(value: (String, js.Function2[/* err */ ClientError, /* container */ Container, _]) => Unit): Self = this.set("getContainer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetContainers(value: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], _] => Unit): Self = this.set("getContainers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFile(value: (String, String, js.Function2[/* err */ ClientError, /* file */ File, _]) => Unit): Self = this.set("getFile", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetFiles(value: (String, js.Function2[/* err */ ClientError, /* files */ js.Array[File], _]) => Unit): Self = this.set("getFiles", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (String, js.Function2[/* message */ String, /* object */ js.UndefOr[js.Any], _]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveFile(value: (String, String, js.Function1[/* err */ ClientError, _]) => Unit): Self = this.set("removeFile", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpload(value: StorageUploadOptions => WriteStream): Self = this.set("upload", js.Any.fromFunction1(value))
  }
}
