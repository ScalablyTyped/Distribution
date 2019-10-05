package typings.parseDashTorrent.parseDashTorrentMod

import typings.node.Buffer
import typings.parseDashTorrentDashFile.parseDashTorrentDashFileMod.ParsedFile
import typings.parseDashTorrentDashFile.parseDashTorrentDashFileMod.TorrentInfo
import typings.std.Date
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.std.Object because Already inherited
- typings.parseDashTorrentDashFile.parseDashTorrentDashFileMod.Instance because var conflicts: announce, constructor, infoHash, infoHashBuffer, name, urlList. Inlined created, createdBy, files, info, infoBuffer, lastPieceLength, length, pieceLength, pieces, `private` */ trait Instance
  extends typings.magnetDashUri.magnetDashUriMod.Instance {
  var created: js.UndefOr[Date] = js.undefined
  var createdBy: js.UndefOr[String] = js.undefined
  var files: js.UndefOr[js.Array[ParsedFile]] = js.undefined
  var info: js.UndefOr[TorrentInfo] = js.undefined
  var infoBuffer: js.UndefOr[Buffer] = js.undefined
  @JSName("infoHash")
  var infoHash_Instance: String
  var lastPieceLength: js.UndefOr[Double] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  @JSName("name")
  var name_Instance: js.UndefOr[String] = js.undefined
  var pieceLength: js.UndefOr[Double] = js.undefined
  var pieces: js.UndefOr[js.Array[String]] = js.undefined
  var `private`: js.UndefOr[Boolean] = js.undefined
}

object Instance {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infoHash: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    announce: js.Array[String] = null,
    as: String | js.Array[String] = null,
    created: Date = null,
    createdBy: String = null,
    dn: String | js.Array[String] = null,
    files: js.Array[ParsedFile] = null,
    info: TorrentInfo = null,
    infoBuffer: Buffer = null,
    infoHashBuffer: Buffer = null,
    ix: Double | js.Array[Double] = null,
    keywords: String | js.Array[String] = null,
    kt: js.Array[String] = null,
    lastPieceLength: Int | Double = null,
    length: Int | Double = null,
    name: String = null,
    pieceLength: Int | Double = null,
    pieces: js.Array[String] = null,
    `private`: js.UndefOr[Boolean] = js.undefined,
    tr: String | js.Array[String] = null,
    urlList: js.Array[String] = null,
    ws: String | js.Array[String] = null,
    xs: String | js.Array[String] = null,
    xt: String | js.Array[String] = null
  ): Instance = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infoHash = infoHash, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (announce != null) __obj.updateDynamic("announce")(announce)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created)
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (dn != null) __obj.updateDynamic("dn")(dn.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files)
    if (info != null) __obj.updateDynamic("info")(info)
    if (infoBuffer != null) __obj.updateDynamic("infoBuffer")(infoBuffer)
    if (infoHashBuffer != null) __obj.updateDynamic("infoHashBuffer")(infoHashBuffer)
    if (ix != null) __obj.updateDynamic("ix")(ix.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (kt != null) __obj.updateDynamic("kt")(kt)
    if (lastPieceLength != null) __obj.updateDynamic("lastPieceLength")(lastPieceLength.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pieceLength != null) __obj.updateDynamic("pieceLength")(pieceLength.asInstanceOf[js.Any])
    if (pieces != null) __obj.updateDynamic("pieces")(pieces)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (tr != null) __obj.updateDynamic("tr")(tr.asInstanceOf[js.Any])
    if (urlList != null) __obj.updateDynamic("urlList")(urlList)
    if (ws != null) __obj.updateDynamic("ws")(ws.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    if (xt != null) __obj.updateDynamic("xt")(xt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

