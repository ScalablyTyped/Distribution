package typings.parseTorrent.mod

import typings.node.Buffer
import typings.parseTorrentFile.mod.ParsedFile
import typings.parseTorrentFile.mod.TorrentInfo
import typings.std.Date
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.Object because Already inherited
- typings.parseTorrentFile.mod.Instance because var conflicts: announce, constructor, infoHash, infoHashBuffer, name, urlList. Inlined created, createdBy, files, info, infoBuffer, lastPieceLength, length, pieceLength, pieces, `private` */ @js.native
trait Instance
  extends typings.magnetUri.mod.Instance {
  var created: js.UndefOr[Date] = js.native
  var createdBy: js.UndefOr[String] = js.native
  var files: js.UndefOr[js.Array[ParsedFile]] = js.native
  var info: js.UndefOr[TorrentInfo] = js.native
  var infoBuffer: js.UndefOr[Buffer] = js.native
  var lastPieceLength: js.UndefOr[Double] = js.native
  var length: js.UndefOr[Double] = js.native
  var pieceLength: js.UndefOr[Double] = js.native
  var pieces: js.UndefOr[js.Array[String]] = js.native
  var `private`: js.UndefOr[Boolean] = js.native
}

object Instance {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): Instance = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
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
    def setCreated(value: Date): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setCreatedBy(value: String): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    @scala.inline
    def setFilesVarargs(value: ParsedFile*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[ParsedFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setInfo(value: TorrentInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setInfoBuffer(value: Buffer): Self = this.set("infoBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoBuffer: Self = this.set("infoBuffer", js.undefined)
    @scala.inline
    def setLastPieceLength(value: Double): Self = this.set("lastPieceLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPieceLength: Self = this.set("lastPieceLength", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setPieceLength(value: Double): Self = this.set("pieceLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePieceLength: Self = this.set("pieceLength", js.undefined)
    @scala.inline
    def setPiecesVarargs(value: String*): Self = this.set("pieces", js.Array(value :_*))
    @scala.inline
    def setPieces(value: js.Array[String]): Self = this.set("pieces", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePieces: Self = this.set("pieces", js.undefined)
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
  }
  
}

