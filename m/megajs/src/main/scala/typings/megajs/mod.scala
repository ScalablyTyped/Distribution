package typings.megajs

import org.scalablytyped.runtime.TopLevel
import typings.megajs.megajsBooleans.`true`
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import typings.std.Error
import typings.std.JSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("megajs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(options: StorageOptions): Storage = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Storage]
  @scala.inline
  def default(options: StorageOptions, cb: js.Any): Storage = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Storage]
  
  @JSImport("megajs", "File")
  @js.native
  class File protected () extends StObject {
    def this(options: String) = this()
    def this(options: FileOptions) = this()
    
    var attributes: js.Object = js.native
    
    var children: js.Array[File] = js.native
    
    var directory: Boolean = js.native
    
    def download(): Readable = js.native
    def download(options: Unit, cb: js.Any): Readable = js.native
    def download(options: DownloadOptions): Readable = js.native
    def download(options: DownloadOptions, cb: js.Any): Readable = js.native
    
    var downloadId: String = js.native
    
    var key: Buffer = js.native
    
    def loadAttributes(): Readable = js.native
    def loadAttributes(cb: js.Any): Readable = js.native
    
    var name: String = js.native
    
    var nodeId: String = js.native
    
    var size: Double = js.native
    
    var timestamp: Double = js.native
  }
  /* static members */
  object File {
    
    @JSImport("megajs", "File")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromURL(options: String): File = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(options.asInstanceOf[js.Any]).asInstanceOf[File]
    @scala.inline
    def fromURL(options: FileOptions): File = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(options.asInstanceOf[js.Any]).asInstanceOf[File]
    
    @scala.inline
    def unpackAttributes(at: js.Any): JSON = ^.asInstanceOf[js.Dynamic].applyDynamic("unpackAttributes")(at.asInstanceOf[js.Any]).asInstanceOf[JSON]
  }
  
  @JSImport("megajs", "MutableFile")
  @js.native
  class MutableFile protected () extends File {
    def this(options: String, storage: Storage) = this()
    def this(options: FileOptions, storage: Storage) = this()
    
    def delete(permanent: Unit, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Readable = js.native
    @JSName("delete")
    def delete_true(permanent: `true`, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Readable = js.native
    
    def importFile(file: String, cb: js.Function2[/* err */ js.UndefOr[Error], /* file */ this.type, Unit]): Readable = js.native
    def importFile(file: File, cb: js.Function2[/* err */ js.UndefOr[Error], /* file */ this.type, Unit]): Readable = js.native
    
    def link(options: Unit, cb: js.Function2[/* err */ js.UndefOr[Error], /* url */ String, Unit]): Readable = js.native
    def link(options: LinkOptions, cb: js.Function2[/* err */ js.UndefOr[Error], /* url */ String, Unit]): Readable = js.native
    
    def mkdir(options: String): Readable = js.native
    def mkdir(options: String, cb: js.Any): Readable = js.native
    def mkdir(options: MakeDirectoryOptions): Readable = js.native
    def mkdir(options: MakeDirectoryOptions, cb: js.Any): Readable = js.native
    
    def moveTo(target: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Readable = js.native
    def moveTo(target: MutableFile, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Readable = js.native
    
    def rename(newFileName: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Readable = js.native
    
    def setAttributes(attributes: js.Object, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Readable = js.native
    
    def setFavorite(isFavorite: Boolean, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Readable = js.native
    
    def setLabel(label: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Readable = js.native
    
    def shareFolder(options: Unit, cb: js.Function2[/* err */ js.UndefOr[Error], /* url */ String, Unit]): Readable = js.native
    def shareFolder(options: LinkOptions, cb: js.Function2[/* err */ js.UndefOr[Error], /* url */ String, Unit]): Readable = js.native
    
    def upload(options: String): Writable = js.native
    def upload(options: String, buffer: Unit, cb: js.Any): Writable = js.native
    def upload(options: String, buffer: Buffer): Writable = js.native
    def upload(options: String, buffer: Buffer, cb: js.Any): Writable = js.native
    def upload(options: UploadOptions): Writable = js.native
    def upload(options: UploadOptions, buffer: Unit, cb: js.Any): Writable = js.native
    def upload(options: UploadOptions, buffer: Buffer): Writable = js.native
    def upload(options: UploadOptions, buffer: Buffer, cb: js.Any): Writable = js.native
    
    def uploadAttribute(`type`: String): Readable = js.native
    def uploadAttribute(`type`: String, opt: Unit, cb: js.Any): Readable = js.native
    def uploadAttribute(`type`: String, opt: Buffer): Readable = js.native
    def uploadAttribute(`type`: String, opt: Buffer, cb: js.Any): Readable = js.native
    def uploadAttribute(`type`: String, opt: Stream): Readable = js.native
    def uploadAttribute(`type`: String, opt: Stream, cb: js.Any): Readable = js.native
    def uploadAttribute(`type`: Double): Readable = js.native
    def uploadAttribute(`type`: Double, opt: Unit, cb: js.Any): Readable = js.native
    def uploadAttribute(`type`: Double, opt: Buffer): Readable = js.native
    def uploadAttribute(`type`: Double, opt: Buffer, cb: js.Any): Readable = js.native
    def uploadAttribute(`type`: Double, opt: Stream): Readable = js.native
    def uploadAttribute(`type`: Double, opt: Stream, cb: js.Any): Readable = js.native
  }
  
  @JSImport("megajs", "Storage")
  @js.native
  class Storage protected () extends StObject {
    def this(options: StorageOptions) = this()
    def this(options: StorageOptions, callback: js.Any) = this()
    
    var files: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ id in string ]: megajs.megajs.MutableFile}
      */ typings.megajs.megajsStrings.Storage & TopLevel[js.Any] = js.native
    
    def getAccountInfo(cb: js.Any): AccountInfo = js.native
    
    var inbox: MutableFile = js.native
    
    var key: Buffer = js.native
    
    def login(cb: js.Any): Readable = js.native
    
    def mkdir(options: String, cb: js.Function2[/* err */ js.UndefOr[Error], /* file */ MutableFile, Unit]): Readable = js.native
    def mkdir(
      options: MakeDirectoryOptions,
      cb: js.Function2[/* err */ js.UndefOr[Error], /* file */ MutableFile, Unit]
    ): Readable = js.native
    
    var mounts: js.Array[File] = js.native
    
    var name: String = js.native
    
    def reload(cb: js.Any): Readable = js.native
    
    var root: MutableFile = js.native
    
    var sid: String = js.native
    
    def toJSON(): JSON = js.native
    
    var trash: MutableFile = js.native
    
    def upload(options: String): Writable = js.native
    def upload(options: String, buffer: Unit, cb: js.Any): Writable = js.native
    def upload(options: String, buffer: Buffer): Writable = js.native
    def upload(options: String, buffer: Buffer, cb: js.Any): Writable = js.native
    def upload(options: UploadOptions): Writable = js.native
    def upload(options: UploadOptions, buffer: Unit, cb: js.Any): Writable = js.native
    def upload(options: UploadOptions, buffer: Buffer): Writable = js.native
    def upload(options: UploadOptions, buffer: Buffer, cb: js.Any): Writable = js.native
  }
  /* static members */
  object Storage {
    
    @JSImport("megajs", "Storage")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fromJSON(json: JSON): Storage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Storage]
  }
  
  trait AccountInfo extends StObject {
    
    var downloadBandwidthTotal: Double
    
    var downloadBandwidthUsed: Double
    
    var sharedBandwidthLimit: Double
    
    var sharedBandwidthUsed: Double
    
    var spaceTotal: Double
    
    var spaceUsed: Double
    
    var `type`: String
  }
  object AccountInfo {
    
    @scala.inline
    def apply(
      downloadBandwidthTotal: Double,
      downloadBandwidthUsed: Double,
      sharedBandwidthLimit: Double,
      sharedBandwidthUsed: Double,
      spaceTotal: Double,
      spaceUsed: Double,
      `type`: String
    ): AccountInfo = {
      val __obj = js.Dynamic.literal(downloadBandwidthTotal = downloadBandwidthTotal.asInstanceOf[js.Any], downloadBandwidthUsed = downloadBandwidthUsed.asInstanceOf[js.Any], sharedBandwidthLimit = sharedBandwidthLimit.asInstanceOf[js.Any], sharedBandwidthUsed = sharedBandwidthUsed.asInstanceOf[js.Any], spaceTotal = spaceTotal.asInstanceOf[js.Any], spaceUsed = spaceUsed.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountInfo]
    }
    
    @scala.inline
    implicit class AccountInfoMutableBuilder[Self <: AccountInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownloadBandwidthTotal(value: Double): Self = StObject.set(x, "downloadBandwidthTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadBandwidthUsed(value: Double): Self = StObject.set(x, "downloadBandwidthUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedBandwidthLimit(value: Double): Self = StObject.set(x, "sharedBandwidthLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedBandwidthUsed(value: Double): Self = StObject.set(x, "sharedBandwidthUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceTotal(value: Double): Self = StObject.set(x, "spaceTotal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUsed(value: Double): Self = StObject.set(x, "spaceUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DownloadOptions extends StObject {
    
    var chunkSizeIncrement: js.UndefOr[Double] = js.undefined
    
    var end: js.UndefOr[js.Any] = js.undefined
    
    var initialChunkSize: js.UndefOr[Double] = js.undefined
    
    var maxChunkSize: js.UndefOr[Double] = js.undefined
    
    var maxConnections: js.UndefOr[Double] = js.undefined
    
    var returnCiphertext: js.UndefOr[Boolean] = js.undefined
    
    var start: js.UndefOr[js.Any] = js.undefined
  }
  object DownloadOptions {
    
    @scala.inline
    def apply(): DownloadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadOptions]
    }
    
    @scala.inline
    implicit class DownloadOptionsMutableBuilder[Self <: DownloadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunkSizeIncrement(value: Double): Self = StObject.set(x, "chunkSizeIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSizeIncrementUndefined: Self = StObject.set(x, "chunkSizeIncrement", js.undefined)
      
      @scala.inline
      def setEnd(value: js.Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setInitialChunkSize(value: Double): Self = StObject.set(x, "initialChunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialChunkSizeUndefined: Self = StObject.set(x, "initialChunkSize", js.undefined)
      
      @scala.inline
      def setMaxChunkSize(value: Double): Self = StObject.set(x, "maxChunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxChunkSizeUndefined: Self = StObject.set(x, "maxChunkSize", js.undefined)
      
      @scala.inline
      def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      @scala.inline
      def setReturnCiphertext(value: Boolean): Self = StObject.set(x, "returnCiphertext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnCiphertextUndefined: Self = StObject.set(x, "returnCiphertext", js.undefined)
      
      @scala.inline
      def setStart(value: js.Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait FileOptions extends StObject {
    
    var directory: js.UndefOr[Boolean] = js.undefined
    
    var downloadId: String
    
    var key: String
  }
  object FileOptions {
    
    @scala.inline
    def apply(downloadId: String, key: String): FileOptions = {
      val __obj = js.Dynamic.literal(downloadId = downloadId.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileOptions]
    }
    
    @scala.inline
    implicit class FileOptionsMutableBuilder[Self <: FileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      @scala.inline
      def setDownloadId(value: String): Self = StObject.set(x, "downloadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait LinkOptions extends StObject {
    
    var key: js.UndefOr[String | Buffer] = js.undefined
    
    var noKey: js.UndefOr[Boolean] = js.undefined
  }
  object LinkOptions {
    
    @scala.inline
    def apply(): LinkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkOptions]
    }
    
    @scala.inline
    implicit class LinkOptionsMutableBuilder[Self <: LinkOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setNoKey(value: Boolean): Self = StObject.set(x, "noKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoKeyUndefined: Self = StObject.set(x, "noKey", js.undefined)
    }
  }
  
  trait MakeDirectoryOptions extends StObject {
    
    var attributes: js.UndefOr[js.Object] = js.undefined
    
    var key: js.UndefOr[String | Buffer] = js.undefined
    
    var name: String
  }
  object MakeDirectoryOptions {
    
    @scala.inline
    def apply(name: String): MakeDirectoryOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MakeDirectoryOptions]
    }
    
    @scala.inline
    implicit class MakeDirectoryOptionsMutableBuilder[Self <: MakeDirectoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait StorageOptions extends StObject {
    
    var autoload: js.UndefOr[Boolean] = js.undefined
    
    var autologin: js.UndefOr[Boolean] = js.undefined
    
    var email: String
    
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    var password: String
  }
  object StorageOptions {
    
    @scala.inline
    def apply(email: String, password: String): StorageOptions = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageOptions]
    }
    
    @scala.inline
    implicit class StorageOptionsMutableBuilder[Self <: StorageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoload(value: Boolean): Self = StObject.set(x, "autoload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoloadUndefined: Self = StObject.set(x, "autoload", js.undefined)
      
      @scala.inline
      def setAutologin(value: Boolean): Self = StObject.set(x, "autologin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutologinUndefined: Self = StObject.set(x, "autologin", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadOptions extends StObject {
    
    var attributes: js.UndefOr[js.Object] = js.undefined
    
    var name: String
    
    var previewImage: js.UndefOr[Buffer | Readable] = js.undefined
    
    var size: js.UndefOr[js.Any] = js.undefined
    
    var thumbnailImage: js.UndefOr[Buffer | Readable] = js.undefined
  }
  object UploadOptions {
    
    @scala.inline
    def apply(name: String): UploadOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadOptions]
    }
    
    @scala.inline
    implicit class UploadOptionsMutableBuilder[Self <: UploadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewImage(value: Buffer | Readable): Self = StObject.set(x, "previewImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewImageUndefined: Self = StObject.set(x, "previewImage", js.undefined)
      
      @scala.inline
      def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setThumbnailImage(value: Buffer | Readable): Self = StObject.set(x, "thumbnailImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailImageUndefined: Self = StObject.set(x, "thumbnailImage", js.undefined)
    }
  }
}
