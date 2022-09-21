package typings.parseTorrentFile

import typings.node.bufferMod.global.Buffer
import typings.std.File
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(torrent: Buffer): Instance = ^.asInstanceOf[js.Dynamic].apply(torrent.asInstanceOf[js.Any]).asInstanceOf[Instance]
  inline def apply(torrent: Torrent): Instance = ^.asInstanceOf[js.Dynamic].apply(torrent.asInstanceOf[js.Any]).asInstanceOf[Instance]
  
  @JSImport("parse-torrent-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(torrent: Buffer): Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(torrent.asInstanceOf[js.Any]).asInstanceOf[Instance]
  inline def decode(torrent: Torrent): Instance = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(torrent.asInstanceOf[js.Any]).asInstanceOf[Instance]
  
  inline def encode(parsed: Instance): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(parsed.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  trait Instance
    extends StObject
       with Object {
    
    var announce: js.UndefOr[js.Array[String]] = js.undefined
    
    var created: js.UndefOr[js.Date] = js.undefined
    
    var createdBy: js.UndefOr[String] = js.undefined
    
    var files: js.UndefOr[js.Array[ParsedFile]] = js.undefined
    
    var info: js.UndefOr[TorrentInfo] = js.undefined
    
    var infoBuffer: js.UndefOr[Buffer] = js.undefined
    
    var infoHash: js.UndefOr[String] = js.undefined
    
    var infoHashBuffer: js.UndefOr[Buffer] = js.undefined
    
    var lastPieceLength: js.UndefOr[Double] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var pieceLength: js.UndefOr[Double] = js.undefined
    
    var pieces: js.UndefOr[js.Array[String]] = js.undefined
    
    var `private`: js.UndefOr[Boolean] = js.undefined
    
    var urlList: js.UndefOr[js.Array[String]] = js.undefined
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
      
      inline def setAnnounce(value: js.Array[String]): Self = StObject.set(x, "announce", value.asInstanceOf[js.Any])
      
      inline def setAnnounceUndefined: Self = StObject.set(x, "announce", js.undefined)
      
      inline def setAnnounceVarargs(value: String*): Self = StObject.set(x, "announce", js.Array(value*))
      
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
      
      inline def setInfoHash(value: String): Self = StObject.set(x, "infoHash", value.asInstanceOf[js.Any])
      
      inline def setInfoHashBuffer(value: Buffer): Self = StObject.set(x, "infoHashBuffer", value.asInstanceOf[js.Any])
      
      inline def setInfoHashBufferUndefined: Self = StObject.set(x, "infoHashBuffer", js.undefined)
      
      inline def setInfoHashUndefined: Self = StObject.set(x, "infoHash", js.undefined)
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setLastPieceLength(value: Double): Self = StObject.set(x, "lastPieceLength", value.asInstanceOf[js.Any])
      
      inline def setLastPieceLengthUndefined: Self = StObject.set(x, "lastPieceLength", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPieceLength(value: Double): Self = StObject.set(x, "pieceLength", value.asInstanceOf[js.Any])
      
      inline def setPieceLengthUndefined: Self = StObject.set(x, "pieceLength", js.undefined)
      
      inline def setPieces(value: js.Array[String]): Self = StObject.set(x, "pieces", value.asInstanceOf[js.Any])
      
      inline def setPiecesUndefined: Self = StObject.set(x, "pieces", js.undefined)
      
      inline def setPiecesVarargs(value: String*): Self = StObject.set(x, "pieces", js.Array(value*))
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      inline def setUrlList(value: js.Array[String]): Self = StObject.set(x, "urlList", value.asInstanceOf[js.Any])
      
      inline def setUrlListUndefined: Self = StObject.set(x, "urlList", js.undefined)
      
      inline def setUrlListVarargs(value: String*): Self = StObject.set(x, "urlList", js.Array(value*))
    }
  }
  
  trait ParsedFile extends StObject {
    
    var length: Double
    
    var name: String
    
    var offset: Double
    
    var path: String
  }
  object ParsedFile {
    
    inline def apply(length: Double, name: String, offset: Double, path: String): ParsedFile = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedFile]
    }
    
    extension [Self <: ParsedFile](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Torrent extends StObject {
    
    var announce: js.UndefOr[String] = js.undefined
    
    var `announce-list`: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
    
    var comment: js.UndefOr[Buffer] = js.undefined
    
    var `created by`: js.UndefOr[String] = js.undefined
    
    var `creation date`: js.UndefOr[Double] = js.undefined
    
    var info: js.UndefOr[TorrentInfo] = js.undefined
    
    var `url-list`: js.UndefOr[Buffer] = js.undefined
  }
  object Torrent {
    
    inline def apply(): Torrent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Torrent]
    }
    
    extension [Self <: Torrent](x: Self) {
      
      inline def setAnnounce(value: String): Self = StObject.set(x, "announce", value.asInstanceOf[js.Any])
      
      inline def `setAnnounce-list`(value: js.Array[js.Array[String]]): Self = StObject.set(x, "announce-list", value.asInstanceOf[js.Any])
      
      inline def `setAnnounce-listUndefined`: Self = StObject.set(x, "announce-list", js.undefined)
      
      inline def `setAnnounce-listVarargs`(value: js.Array[String]*): Self = StObject.set(x, "announce-list", js.Array(value*))
      
      inline def setAnnounceUndefined: Self = StObject.set(x, "announce", js.undefined)
      
      inline def setComment(value: Buffer): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def `setCreated by`(value: String): Self = StObject.set(x, "created by", value.asInstanceOf[js.Any])
      
      inline def `setCreated byUndefined`: Self = StObject.set(x, "created by", js.undefined)
      
      inline def `setCreation date`(value: Double): Self = StObject.set(x, "creation date", value.asInstanceOf[js.Any])
      
      inline def `setCreation dateUndefined`: Self = StObject.set(x, "creation date", js.undefined)
      
      inline def setInfo(value: TorrentInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def `setUrl-list`(value: Buffer): Self = StObject.set(x, "url-list", value.asInstanceOf[js.Any])
      
      inline def `setUrl-listUndefined`: Self = StObject.set(x, "url-list", js.undefined)
    }
  }
  
  trait TorrentInfo extends StObject {
    
    var files: js.UndefOr[js.Array[File]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    @JSName("name.utf-8")
    var `nameDotutf-8`: js.UndefOr[String] = js.undefined
    
    var `piece length`: js.UndefOr[Double] = js.undefined
    
    var pieces: js.UndefOr[Double] = js.undefined
    
    var `private`: js.UndefOr[Boolean] = js.undefined
  }
  object TorrentInfo {
    
    inline def apply(): TorrentInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TorrentInfo]
    }
    
    extension [Self <: TorrentInfo](x: Self) {
      
      inline def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def `setNameDotutf-8`(value: String): Self = StObject.set(x, "name.utf-8", value.asInstanceOf[js.Any])
      
      inline def `setNameDotutf-8Undefined`: Self = StObject.set(x, "name.utf-8", js.undefined)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def `setPiece length`(value: Double): Self = StObject.set(x, "piece length", value.asInstanceOf[js.Any])
      
      inline def `setPiece lengthUndefined`: Self = StObject.set(x, "piece length", js.undefined)
      
      inline def setPieces(value: Double): Self = StObject.set(x, "pieces", value.asInstanceOf[js.Any])
      
      inline def setPiecesUndefined: Self = StObject.set(x, "pieces", js.undefined)
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    }
  }
}
