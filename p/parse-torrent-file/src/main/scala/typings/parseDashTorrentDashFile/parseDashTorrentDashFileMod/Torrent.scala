package typings.parseDashTorrentDashFile.parseDashTorrentDashFileMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Torrent extends js.Object {
  var announce: js.UndefOr[String] = js.undefined
  var `announce-list`: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  var comment: js.UndefOr[Buffer] = js.undefined
  var `created by`: js.UndefOr[String] = js.undefined
  var `creation date`: js.UndefOr[Double] = js.undefined
  var info: js.UndefOr[TorrentInfo] = js.undefined
  var `url-list`: js.UndefOr[Buffer] = js.undefined
}

object Torrent {
  @scala.inline
  def apply(
    announce: String = null,
    `announce-list`: js.Array[js.Array[String]] = null,
    comment: Buffer = null,
    `created by`: String = null,
    `creation date`: Int | Double = null,
    info: TorrentInfo = null,
    `url-list`: Buffer = null
  ): Torrent = {
    val __obj = js.Dynamic.literal()
    if (announce != null) __obj.updateDynamic("announce")(announce)
    if (`announce-list` != null) __obj.updateDynamic("announce-list")(`announce-list`)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (`created by` != null) __obj.updateDynamic("created by")(`created by`)
    if (`creation date` != null) __obj.updateDynamic("creation date")(`creation date`.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info)
    if (`url-list` != null) __obj.updateDynamic("url-list")(`url-list`)
    __obj.asInstanceOf[Torrent]
  }
}

