package typings.pkgcloud.mod

import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storage {
  
  @JSImport("pkgcloud", "storage")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClient(options: ProviderOptions): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  trait Client extends StObject {
    
    var config: ProviderOptions
    
    def createContainer(options: Any, callback: js.Function2[/* err */ ClientError, /* container */ Container, Any]): Unit
    
    def destroyContainer(containerName: String, callback: js.Function1[/* err */ ClientError, Any]): Unit
    
    def download(options: StorageDownloadOptions): ReadStream
    
    def getContainer(
      containerName: String,
      callback: js.Function2[/* err */ ClientError, /* container */ Container, Any]
    ): Unit
    
    def getContainers(callback: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], Any]): Unit
    
    def getFile(
      containerName: String,
      file: String,
      callback: js.Function2[/* err */ ClientError, /* file */ File, Any]
    ): Unit
    
    def getFiles(
      containerName: String,
      callback: js.Function2[/* err */ ClientError, /* files */ js.Array[File], Any]
    ): Unit
    
    // Logs
    def on(eventName: String, callback: js.Function2[/* message */ String, /* object */ js.UndefOr[Any], Any]): Unit
    
    var protocol: String
    
    var provider: String
    
    def removeFile(containerName: String, file: String, callback: js.Function1[/* err */ ClientError, Any]): Unit
    
    def upload(options: StorageUploadOptions): WriteStream
  }
  object Client {
    
    inline def apply(
      config: ProviderOptions,
      createContainer: (Any, js.Function2[/* err */ ClientError, /* container */ Container, Any]) => Unit,
      destroyContainer: (String, js.Function1[/* err */ ClientError, Any]) => Unit,
      download: StorageDownloadOptions => ReadStream,
      getContainer: (String, js.Function2[/* err */ ClientError, /* container */ Container, Any]) => Unit,
      getContainers: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], Any] => Unit,
      getFile: (String, String, js.Function2[/* err */ ClientError, /* file */ File, Any]) => Unit,
      getFiles: (String, js.Function2[/* err */ ClientError, /* files */ js.Array[File], Any]) => Unit,
      on: (String, js.Function2[/* message */ String, /* object */ js.UndefOr[Any], Any]) => Unit,
      protocol: String,
      provider: String,
      removeFile: (String, String, js.Function1[/* err */ ClientError, Any]) => Unit,
      upload: StorageUploadOptions => WriteStream
    ): Client = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], createContainer = js.Any.fromFunction2(createContainer), destroyContainer = js.Any.fromFunction2(destroyContainer), download = js.Any.fromFunction1(download), getContainer = js.Any.fromFunction2(getContainer), getContainers = js.Any.fromFunction1(getContainers), getFile = js.Any.fromFunction3(getFile), getFiles = js.Any.fromFunction2(getFiles), on = js.Any.fromFunction2(on), protocol = protocol.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], removeFile = js.Any.fromFunction3(removeFile), upload = js.Any.fromFunction1(upload))
      __obj.asInstanceOf[Client]
    }
    
    extension [Self <: Client](x: Self) {
      
      inline def setConfig(value: ProviderOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setCreateContainer(value: (Any, js.Function2[/* err */ ClientError, /* container */ Container, Any]) => Unit): Self = StObject.set(x, "createContainer", js.Any.fromFunction2(value))
      
      inline def setDestroyContainer(value: (String, js.Function1[/* err */ ClientError, Any]) => Unit): Self = StObject.set(x, "destroyContainer", js.Any.fromFunction2(value))
      
      inline def setDownload(value: StorageDownloadOptions => ReadStream): Self = StObject.set(x, "download", js.Any.fromFunction1(value))
      
      inline def setGetContainer(value: (String, js.Function2[/* err */ ClientError, /* container */ Container, Any]) => Unit): Self = StObject.set(x, "getContainer", js.Any.fromFunction2(value))
      
      inline def setGetContainers(value: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], Any] => Unit): Self = StObject.set(x, "getContainers", js.Any.fromFunction1(value))
      
      inline def setGetFile(value: (String, String, js.Function2[/* err */ ClientError, /* file */ File, Any]) => Unit): Self = StObject.set(x, "getFile", js.Any.fromFunction3(value))
      
      inline def setGetFiles(value: (String, js.Function2[/* err */ ClientError, /* files */ js.Array[File], Any]) => Unit): Self = StObject.set(x, "getFiles", js.Any.fromFunction2(value))
      
      inline def setOn(value: (String, js.Function2[/* message */ String, /* object */ js.UndefOr[Any], Any]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setRemoveFile(value: (String, String, js.Function1[/* err */ ClientError, Any]) => Unit): Self = StObject.set(x, "removeFile", js.Any.fromFunction3(value))
      
      inline def setUpload(value: StorageUploadOptions => WriteStream): Self = StObject.set(x, "upload", js.Any.fromFunction1(value))
    }
  }
  
  trait Container extends StObject {
    
    // files: ?
    var client: Client
  }
  object Container {
    
    inline def apply(client: Client): Container = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[Container]
    }
    
    extension [Self <: Container](x: Self) {
      
      inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  trait File extends StObject {
    
    var client: Client
    
    var container: String
    
    var name: String
    
    var size: Double
  }
  object File {
    
    inline def apply(client: Client, container: String, name: String, size: Double): File = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait StorageDownloadOptions extends StObject {
    
    var container: String
    
    var remote: String
  }
  object StorageDownloadOptions {
    
    inline def apply(container: String, remote: String): StorageDownloadOptions = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageDownloadOptions]
    }
    
    extension [Self <: StorageDownloadOptions](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    }
  }
  
  trait StorageUploadOptions extends StObject {
    
    var container: String
    
    var remote: String
  }
  object StorageUploadOptions {
    
    inline def apply(container: String, remote: String): StorageUploadOptions = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageUploadOptions]
    }
    
    extension [Self <: StorageUploadOptions](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    }
  }
}
