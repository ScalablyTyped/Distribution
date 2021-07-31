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
  
  @scala.inline
  def createClient(options: ProviderOptions): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  trait Client extends StObject {
    
    var config: ProviderOptions
    
    def createContainer(options: js.Any, callback: js.Function2[/* err */ ClientError, /* container */ Container, js.Any]): Unit
    
    def destroyContainer(containerName: String, callback: js.Function1[/* err */ ClientError, js.Any]): Unit
    
    def download(options: StorageDownloadOptions): ReadStream
    
    def getContainer(
      containerName: String,
      callback: js.Function2[/* err */ ClientError, /* container */ Container, js.Any]
    ): Unit
    
    def getContainers(callback: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], js.Any]): Unit
    
    def getFile(
      containerName: String,
      file: String,
      callback: js.Function2[/* err */ ClientError, /* file */ File, js.Any]
    ): Unit
    
    def getFiles(
      containerName: String,
      callback: js.Function2[/* err */ ClientError, /* files */ js.Array[File], js.Any]
    ): Unit
    
    // Logs
    def on(
      eventName: String,
      callback: js.Function2[/* message */ String, /* object */ js.UndefOr[js.Any], js.Any]
    ): Unit
    
    var protocol: String
    
    var provider: String
    
    def removeFile(containerName: String, file: String, callback: js.Function1[/* err */ ClientError, js.Any]): Unit
    
    def upload(options: StorageUploadOptions): WriteStream
  }
  object Client {
    
    @scala.inline
    def apply(
      config: ProviderOptions,
      createContainer: (js.Any, js.Function2[/* err */ ClientError, /* container */ Container, js.Any]) => Unit,
      destroyContainer: (String, js.Function1[/* err */ ClientError, js.Any]) => Unit,
      download: StorageDownloadOptions => ReadStream,
      getContainer: (String, js.Function2[/* err */ ClientError, /* container */ Container, js.Any]) => Unit,
      getContainers: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], js.Any] => Unit,
      getFile: (String, String, js.Function2[/* err */ ClientError, /* file */ File, js.Any]) => Unit,
      getFiles: (String, js.Function2[/* err */ ClientError, /* files */ js.Array[File], js.Any]) => Unit,
      on: (String, js.Function2[/* message */ String, /* object */ js.UndefOr[js.Any], js.Any]) => Unit,
      protocol: String,
      provider: String,
      removeFile: (String, String, js.Function1[/* err */ ClientError, js.Any]) => Unit,
      upload: StorageUploadOptions => WriteStream
    ): Client = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], createContainer = js.Any.fromFunction2(createContainer), destroyContainer = js.Any.fromFunction2(destroyContainer), download = js.Any.fromFunction1(download), getContainer = js.Any.fromFunction2(getContainer), getContainers = js.Any.fromFunction1(getContainers), getFile = js.Any.fromFunction3(getFile), getFiles = js.Any.fromFunction2(getFiles), on = js.Any.fromFunction2(on), protocol = protocol.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], removeFile = js.Any.fromFunction3(removeFile), upload = js.Any.fromFunction1(upload))
      __obj.asInstanceOf[Client]
    }
    
    @scala.inline
    implicit class ClientMutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: ProviderOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateContainer(value: (js.Any, js.Function2[/* err */ ClientError, /* container */ Container, js.Any]) => Unit): Self = StObject.set(x, "createContainer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDestroyContainer(value: (String, js.Function1[/* err */ ClientError, js.Any]) => Unit): Self = StObject.set(x, "destroyContainer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDownload(value: StorageDownloadOptions => ReadStream): Self = StObject.set(x, "download", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetContainer(value: (String, js.Function2[/* err */ ClientError, /* container */ Container, js.Any]) => Unit): Self = StObject.set(x, "getContainer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetContainers(value: js.Function2[/* err */ ClientError, /* containers */ js.Array[Container], js.Any] => Unit): Self = StObject.set(x, "getContainers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFile(value: (String, String, js.Function2[/* err */ ClientError, /* file */ File, js.Any]) => Unit): Self = StObject.set(x, "getFile", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetFiles(value: (String, js.Function2[/* err */ ClientError, /* files */ js.Array[File], js.Any]) => Unit): Self = StObject.set(x, "getFiles", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOn(
        value: (String, js.Function2[/* message */ String, /* object */ js.UndefOr[js.Any], js.Any]) => Unit
      ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveFile(value: (String, String, js.Function1[/* err */ ClientError, js.Any]) => Unit): Self = StObject.set(x, "removeFile", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUpload(value: StorageUploadOptions => WriteStream): Self = StObject.set(x, "upload", js.Any.fromFunction1(value))
    }
  }
  
  trait Container extends StObject {
    
    // files: ?
    var client: Client
  }
  object Container {
    
    @scala.inline
    def apply(client: Client): Container = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[Container]
    }
    
    @scala.inline
    implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  trait File extends StObject {
    
    var client: Client
    
    var container: String
    
    var name: String
    
    var size: Double
  }
  object File {
    
    @scala.inline
    def apply(client: Client, container: String, name: String, size: Double): File = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait StorageDownloadOptions extends StObject {
    
    var container: String
    
    var remote: String
  }
  object StorageDownloadOptions {
    
    @scala.inline
    def apply(container: String, remote: String): StorageDownloadOptions = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageDownloadOptions]
    }
    
    @scala.inline
    implicit class StorageDownloadOptionsMutableBuilder[Self <: StorageDownloadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    }
  }
  
  trait StorageUploadOptions extends StObject {
    
    var container: String
    
    var remote: String
  }
  object StorageUploadOptions {
    
    @scala.inline
    def apply(container: String, remote: String): StorageUploadOptions = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageUploadOptions]
    }
    
    @scala.inline
    implicit class StorageUploadOptionsMutableBuilder[Self <: StorageUploadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
    }
  }
}
