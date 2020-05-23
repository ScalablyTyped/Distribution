package typings.parseTorrentFile.mod

import typings.node.Buffer
import typings.std.Date
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends Object {
  var announce: js.UndefOr[js.Array[String]] = js.undefined
  var created: js.UndefOr[Date] = js.undefined
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
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    announce: js.Array[String] = null,
    created: Date = null,
    createdBy: String = null,
    files: js.Array[ParsedFile] = null,
    info: TorrentInfo = null,
    infoBuffer: Buffer = null,
    infoHash: String = null,
    infoHashBuffer: Buffer = null,
    lastPieceLength: js.UndefOr[Double] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    name: String = null,
    pieceLength: js.UndefOr[Double] = js.undefined,
    pieces: js.Array[String] = null,
    `private`: js.UndefOr[Boolean] = js.undefined,
    urlList: js.Array[String] = null
  ): Instance = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (announce != null) __obj.updateDynamic("announce")(announce.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (infoBuffer != null) __obj.updateDynamic("infoBuffer")(infoBuffer.asInstanceOf[js.Any])
    if (infoHash != null) __obj.updateDynamic("infoHash")(infoHash.asInstanceOf[js.Any])
    if (infoHashBuffer != null) __obj.updateDynamic("infoHashBuffer")(infoHashBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(lastPieceLength)) __obj.updateDynamic("lastPieceLength")(lastPieceLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(pieceLength)) __obj.updateDynamic("pieceLength")(pieceLength.get.asInstanceOf[js.Any])
    if (pieces != null) __obj.updateDynamic("pieces")(pieces.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.get.asInstanceOf[js.Any])
    if (urlList != null) __obj.updateDynamic("urlList")(urlList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

