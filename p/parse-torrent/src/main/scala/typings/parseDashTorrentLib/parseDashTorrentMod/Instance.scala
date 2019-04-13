package typings
package parseDashTorrentLib.parseDashTorrentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.Instance because var conflicts: announce, constructor, infoHash, infoHashBuffer, name, urlList. Inlined created, createdBy, files, info, infoBuffer, lastPieceLength, length, pieceLength, pieces, `private` */ trait Instance
  extends magnetDashUriLib.magnetDashUriMod.Instance {
  var created: js.UndefOr[stdLib.Date] = js.undefined
  var createdBy: js.UndefOr[java.lang.String] = js.undefined
  var files: js.UndefOr[js.Array[parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParsedFile]] = js.undefined
  var info: js.UndefOr[parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.TorrentInfo] = js.undefined
  var infoBuffer: js.UndefOr[nodeLib.Buffer] = js.undefined
  @JSName("infoHash")
  var infoHash_Instance: java.lang.String
  var lastPieceLength: js.UndefOr[scala.Double] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  @JSName("name")
  var name_Instance: js.UndefOr[java.lang.String] = js.undefined
  var pieceLength: js.UndefOr[scala.Double] = js.undefined
  var pieces: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
}

object Instance {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    infoHash: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    announce: js.Array[java.lang.String] = null,
    as: java.lang.String | js.Array[java.lang.String] = null,
    created: stdLib.Date = null,
    createdBy: java.lang.String = null,
    dn: java.lang.String | js.Array[java.lang.String] = null,
    files: js.Array[parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParsedFile] = null,
    info: parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.TorrentInfo = null,
    infoBuffer: nodeLib.Buffer = null,
    infoHashBuffer: nodeLib.Buffer = null,
    ix: scala.Double | js.Array[scala.Double] = null,
    keywords: java.lang.String | js.Array[java.lang.String] = null,
    kt: js.Array[java.lang.String] = null,
    lastPieceLength: scala.Int | scala.Double = null,
    length: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    pieceLength: scala.Int | scala.Double = null,
    pieces: js.Array[java.lang.String] = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    tr: java.lang.String | js.Array[java.lang.String] = null,
    urlList: js.Array[java.lang.String] = null,
    ws: java.lang.String | js.Array[java.lang.String] = null,
    xs: java.lang.String | js.Array[java.lang.String] = null,
    xt: java.lang.String | js.Array[java.lang.String] = null
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

