package typings.nodeStreamZip

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.nodeStreamZip.nodeStreamZipStrings.entry
import typings.nodeStreamZip.nodeStreamZipStrings.error
import typings.nodeStreamZip.nodeStreamZipStrings.extract
import typings.nodeStreamZip.nodeStreamZipStrings.ready
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-stream-zip", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with StreamZip {
    def this(config: StreamZipOptions) = this()
  }
  @JSImport("node-stream-zip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-stream-zip", "StreamZipAsync")
  @js.native
  open class StreamZipAsync protected () extends StObject {
    def this(config: StreamZipOptions) = this()
    
    def close(): js.Promise[Unit] = js.native
    
    var comment: js.Promise[String] = js.native
    
    def entries(): js.Promise[StringDictionary[ZipEntry]] = js.native
    
    var entriesCount: js.Promise[Double] = js.native
    
    def entry(name: String): js.Promise[js.UndefOr[ZipEntry]] = js.native
    
    def entryData(entry: String): js.Promise[Buffer] = js.native
    def entryData(entry: ZipEntry): js.Promise[Buffer] = js.native
    
    def extract(entry: String, outPath: String): js.Promise[js.UndefOr[Double]] = js.native
    def extract(entry: Null, outPath: String): js.Promise[js.UndefOr[Double]] = js.native
    def extract(entry: ZipEntry, outPath: String): js.Promise[js.UndefOr[Double]] = js.native
    
    @JSName("on")
    def on_entry(event: entry, handler: js.Function1[/* entry */ ZipEntry, Unit]): Unit = js.native
    @JSName("on")
    def on_extract(event: extract, handler: js.Function2[/* entry */ ZipEntry, /* outPath */ String, Unit]): Unit = js.native
    
    def stream(entry: String): js.Promise[ReadableStream[Any]] = js.native
    def stream(entry: ZipEntry): js.Promise[ReadableStream[Any]] = js.native
  }
  
  /* static member */
  @JSImport("node-stream-zip", "async")
  @js.native
  def async: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StreamZip.StreamZipAsync */ Any = js.native
  inline def async_=(
    x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof StreamZip.StreamZipAsync */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("async")(x.asInstanceOf[js.Any])
  
  @js.native
  trait StreamZip extends StObject {
    
    def close(): Unit = js.native
    def close(callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Unit = js.native
    
    /**
      * archive comment
      */
    var comment: String = js.native
    
    def entries(): StringDictionary[ZipEntry] = js.native
    
    /**
      * number of entries in the archive
      */
    var entriesCount: Double = js.native
    
    def entry(name: String): js.UndefOr[ZipEntry] = js.native
    
    def entryDataSync(entry: String): Buffer = js.native
    def entryDataSync(entry: ZipEntry): Buffer = js.native
    
    def extract(
      entry: String,
      outPath: String,
      callback: js.Function2[/* err */ js.UndefOr[Any], /* res */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def extract(
      entry: Null,
      outPath: String,
      callback: js.Function2[/* err */ js.UndefOr[Any], /* res */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    def extract(
      entry: ZipEntry,
      outPath: String,
      callback: js.Function2[/* err */ js.UndefOr[Any], /* res */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    
    @JSName("on")
    def on_entry(event: entry, handler: js.Function1[/* entry */ ZipEntry, Unit]): Unit = js.native
    @JSName("on")
    def on_error(event: error, handler: js.Function1[/* error */ Any, Unit]): Unit = js.native
    @JSName("on")
    def on_extract(event: extract, handler: js.Function2[/* entry */ ZipEntry, /* outPath */ String, Unit]): Unit = js.native
    @JSName("on")
    def on_ready(event: ready, handler: js.Function0[Unit]): Unit = js.native
    
    def openEntry(
      entry: String,
      callback: js.Function2[/* err */ Any | Null, /* entry */ js.UndefOr[ZipEntry], Unit],
      sync: Boolean
    ): Unit = js.native
    def openEntry(
      entry: ZipEntry,
      callback: js.Function2[/* err */ Any | Null, /* entry */ js.UndefOr[ZipEntry], Unit],
      sync: Boolean
    ): Unit = js.native
    
    def stream(
      entry: String,
      callback: js.Function2[/* err */ Any | Null, /* stream */ js.UndefOr[ReadableStream[Any]], Unit]
    ): Unit = js.native
    def stream(
      entry: ZipEntry,
      callback: js.Function2[/* err */ Any | Null, /* stream */ js.UndefOr[ReadableStream[Any]], Unit]
    ): Unit = js.native
  }
  
  trait StreamZipOptions extends StObject {
    
    /**
      * Filesystem read chunk size
      * @default automatic based on file size
      */
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Alternatively, you can pass fd here
      * @default undefined
      */
    var fd: js.UndefOr[Double] = js.undefined
    
    /**
      * File to read
      * @default undefined
      */
    var file: js.UndefOr[String] = js.undefined
    
    /**
      * Encoding used to decode file names
      * @default UTF8
      */
    var nameEncoding: js.UndefOr[String] = js.undefined
    
    /**
      * By default, entry name is checked for malicious characters, like ../ or c:\123,
      * pass this flag to disable validation error
      * @default false
      */
    var skipEntryNameValidation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * You will be able to work with entries inside zip archive,
      * otherwise the only way to access them is entry event
      * @default true
      */
    var storeEntries: js.UndefOr[Boolean] = js.undefined
  }
  object StreamZipOptions {
    
    inline def apply(): StreamZipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamZipOptions]
    }
    
    extension [Self <: StreamZipOptions](x: Self) {
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setNameEncoding(value: String): Self = StObject.set(x, "nameEncoding", value.asInstanceOf[js.Any])
      
      inline def setNameEncodingUndefined: Self = StObject.set(x, "nameEncoding", js.undefined)
      
      inline def setSkipEntryNameValidation(value: Boolean): Self = StObject.set(x, "skipEntryNameValidation", value.asInstanceOf[js.Any])
      
      inline def setSkipEntryNameValidationUndefined: Self = StObject.set(x, "skipEntryNameValidation", js.undefined)
      
      inline def setStoreEntries(value: Boolean): Self = StObject.set(x, "storeEntries", value.asInstanceOf[js.Any])
      
      inline def setStoreEntriesUndefined: Self = StObject.set(x, "storeEntries", js.undefined)
    }
  }
  
  trait ZipEntry extends StObject {
    
    /**
      * external file attributes
      */
    var attr: Double
    
    /**
      * file comment
      */
    var comment: String
    
    /**
      * compressed size
      */
    var compressedSize: Double
    
    /**
      * uncompressed file crc-32 value
      */
    var crc: Double
    
    /**
      * volume number start
      */
    var diskStart: Double
    
    /**
      * if the file is encrypted
      */
    var encrypted: Boolean
    
    /**
      * encrypt, decrypt flags
      */
    var flags: Double
    
    /**
      * internal file attributes
      */
    var inattr: Double
    
    /**
      * true if it's a directory entry
      */
    var isDirectory: Boolean
    
    /**
      * true if it's a file entry, see also isDirectory
      */
    var isFile: Boolean
    
    /**
      * compression method
      */
    var method: Double
    
    /**
      * file name
      */
    var name: String
    
    /**
      * LOC header offset
      */
    var offset: Double
    
    /**
      * uncompressed size
      */
    var size: Double
    
    /**
      * modification time
      */
    var time: Double
    
    /**
      * version made by
      */
    var verMade: Double
    
    /**
      * version needed to extract
      */
    var version: Double
  }
  object ZipEntry {
    
    inline def apply(
      attr: Double,
      comment: String,
      compressedSize: Double,
      crc: Double,
      diskStart: Double,
      encrypted: Boolean,
      flags: Double,
      inattr: Double,
      isDirectory: Boolean,
      isFile: Boolean,
      method: Double,
      name: String,
      offset: Double,
      size: Double,
      time: Double,
      verMade: Double,
      version: Double
    ): ZipEntry = {
      val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], compressedSize = compressedSize.asInstanceOf[js.Any], crc = crc.asInstanceOf[js.Any], diskStart = diskStart.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], inattr = inattr.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], verMade = verMade.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZipEntry]
    }
    
    extension [Self <: ZipEntry](x: Self) {
      
      inline def setAttr(value: Double): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCompressedSize(value: Double): Self = StObject.set(x, "compressedSize", value.asInstanceOf[js.Any])
      
      inline def setCrc(value: Double): Self = StObject.set(x, "crc", value.asInstanceOf[js.Any])
      
      inline def setDiskStart(value: Double): Self = StObject.set(x, "diskStart", value.asInstanceOf[js.Any])
      
      inline def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setInattr(value: Double): Self = StObject.set(x, "inattr", value.asInstanceOf[js.Any])
      
      inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: Double): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setVerMade(value: Double): Self = StObject.set(x, "verMade", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
