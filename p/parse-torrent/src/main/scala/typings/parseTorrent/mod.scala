package typings.parseTorrent

import org.scalablytyped.runtime.Shortcut
import typings.node.bufferMod.global.Buffer
import typings.parseTorrentFile.mod.ParsedFile
import typings.parseTorrentFile.mod.TorrentInfo
import typings.std.Blob
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("parse-torrent", JSImport.Namespace)
  @js.native
  val ^ : ParseTorrent = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.std.Object because Already inherited
  - typings.parseTorrentFile.mod.Instance because var conflicts: announce, constructor, infoHash, infoHashBuffer, name, urlList. Inlined pieceLength, `private`, files, pieces, info, createdBy, lastPieceLength, created, length, infoBuffer */ trait Instance
    extends StObject
       with typings.magnetUri.mod.Instance {
    
    var created: js.UndefOr[js.Date] = js.undefined
    
    var createdBy: js.UndefOr[String] = js.undefined
    
    var files: js.UndefOr[js.Array[ParsedFile]] = js.undefined
    
    var info: js.UndefOr[TorrentInfo] = js.undefined
    
    var infoBuffer: js.UndefOr[Buffer] = js.undefined
    
    var lastPieceLength: js.UndefOr[Double] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var pieceLength: js.UndefOr[Double] = js.undefined
    
    var pieces: js.UndefOr[js.Array[String]] = js.undefined
    
    var `private`: js.UndefOr[Boolean] = js.undefined
  }
  object Instance {
    
    inline def apply(
      constructor: js.Function,
      hasOwnProperty: PropertyKey => Boolean,
      propertyIsEnumerable: PropertyKey => Boolean
    ): Instance = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
      __obj.asInstanceOf[Instance]
    }
    
    extension [Self <: Instance](x: Self) {
      
      inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setFiles(value: js.Array[ParsedFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: ParsedFile*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setInfo(value: TorrentInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoBuffer(value: Buffer): Self = StObject.set(x, "infoBuffer", value.asInstanceOf[js.Any])
      
      inline def setInfoBufferUndefined: Self = StObject.set(x, "infoBuffer", js.undefined)
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setLastPieceLength(value: Double): Self = StObject.set(x, "lastPieceLength", value.asInstanceOf[js.Any])
      
      inline def setLastPieceLengthUndefined: Self = StObject.set(x, "lastPieceLength", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setPieceLength(value: Double): Self = StObject.set(x, "pieceLength", value.asInstanceOf[js.Any])
      
      inline def setPieceLengthUndefined: Self = StObject.set(x, "pieceLength", js.undefined)
      
      inline def setPieces(value: js.Array[String]): Self = StObject.set(x, "pieces", value.asInstanceOf[js.Any])
      
      inline def setPiecesUndefined: Self = StObject.set(x, "pieces", js.undefined)
      
      inline def setPiecesVarargs(value: String*): Self = StObject.set(x, "pieces", js.Array(value*))
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    }
  }
  
  @js.native
  trait ParseTorrent extends StObject {
    
    def apply(torrent: String): typings.magnetUri.mod.Instance = js.native
    def apply(torrent: typings.magnetUri.mod.Instance): Instance = js.native
    def apply(torrent: Buffer): typings.magnetUri.mod.Instance | typings.parseTorrentFile.mod.Instance = js.native
    def apply(torrent: Instance): Instance = js.native
    def apply(torrent: typings.parseTorrentFile.mod.Instance): Instance = js.native
    
    def remote(torrent: String): Unit = js.native
    def remote(torrent: String, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
    def remote(torrent: typings.magnetUri.mod.Instance): Unit = js.native
    def remote(
      torrent: typings.magnetUri.mod.Instance,
      cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]
    ): Unit = js.native
    def remote(torrent: Buffer): Unit = js.native
    def remote(torrent: Buffer, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
    def remote(torrent: Instance): Unit = js.native
    def remote(torrent: Instance, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
    def remote(torrent: typings.parseTorrentFile.mod.Instance): Unit = js.native
    def remote(
      torrent: typings.parseTorrentFile.mod.Instance,
      cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]
    ): Unit = js.native
    def remote(torrent: Blob): Unit = js.native
    def remote(torrent: Blob, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
    
    def toMagnetURI(parsed: typings.magnetUri.mod.Instance): String = js.native
    @JSName("toMagnetURI")
    var toMagnetURI_Original: js.Function1[/* parsed */ typings.magnetUri.mod.Instance, String] = js.native
    
    def toTorrentFile(parsed: typings.parseTorrentFile.mod.Instance): Buffer = js.native
    @JSName("toTorrentFile")
    var toTorrentFile_Original: js.Function1[/* parsed */ typings.parseTorrentFile.mod.Instance, Buffer] = js.native
  }
  
  type _To = ParseTorrent
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ParseTorrent = ^
}
