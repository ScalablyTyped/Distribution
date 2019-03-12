package typings
package parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance
  extends stdLib.Object {
  var announce: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var created: js.UndefOr[stdLib.Date] = js.undefined
  var createdBy: js.UndefOr[java.lang.String] = js.undefined
  var files: js.UndefOr[js.Array[ParsedFile]] = js.undefined
  var info: js.UndefOr[TorrentInfo] = js.undefined
  var infoBuffer: js.UndefOr[nodeLib.Buffer] = js.undefined
  var infoHash: js.UndefOr[java.lang.String] = js.undefined
  var infoHashBuffer: js.UndefOr[nodeLib.Buffer] = js.undefined
  var lastPieceLength: js.UndefOr[scala.Double] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pieceLength: js.UndefOr[scala.Double] = js.undefined
  var pieces: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  var urlList: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Instance {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    announce: js.Array[java.lang.String] = null,
    created: stdLib.Date = null,
    createdBy: java.lang.String = null,
    files: js.Array[ParsedFile] = null,
    info: TorrentInfo = null,
    infoBuffer: nodeLib.Buffer = null,
    infoHash: java.lang.String = null,
    infoHashBuffer: nodeLib.Buffer = null,
    lastPieceLength: scala.Int | scala.Double = null,
    length: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    pieceLength: scala.Int | scala.Double = null,
    pieces: js.Array[java.lang.String] = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    urlList: js.Array[java.lang.String] = null
  ): Instance = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (announce != null) __obj.updateDynamic("announce")(announce)
    if (created != null) __obj.updateDynamic("created")(created)
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (files != null) __obj.updateDynamic("files")(files)
    if (info != null) __obj.updateDynamic("info")(info)
    if (infoBuffer != null) __obj.updateDynamic("infoBuffer")(infoBuffer)
    if (infoHash != null) __obj.updateDynamic("infoHash")(infoHash)
    if (infoHashBuffer != null) __obj.updateDynamic("infoHashBuffer")(infoHashBuffer)
    if (lastPieceLength != null) __obj.updateDynamic("lastPieceLength")(lastPieceLength.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pieceLength != null) __obj.updateDynamic("pieceLength")(pieceLength.asInstanceOf[js.Any])
    if (pieces != null) __obj.updateDynamic("pieces")(pieces)
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (urlList != null) __obj.updateDynamic("urlList")(urlList)
    __obj.asInstanceOf[Instance]
  }
}

