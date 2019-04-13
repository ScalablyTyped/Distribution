package typings
package parseDashTorrentDashFileLib.parseDashTorrentDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Torrent extends js.Object {
  var announce: js.UndefOr[java.lang.String] = js.undefined
  var `announce-list`: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  var comment: js.UndefOr[nodeLib.Buffer] = js.undefined
  var `created by`: js.UndefOr[java.lang.String] = js.undefined
  var `creation date`: js.UndefOr[scala.Double] = js.undefined
  var info: js.UndefOr[TorrentInfo] = js.undefined
  var `url-list`: js.UndefOr[nodeLib.Buffer] = js.undefined
}

object Torrent {
  @scala.inline
  def apply(
    announce: java.lang.String = null,
    `announce-list`: js.Array[js.Array[java.lang.String]] = null,
    comment: nodeLib.Buffer = null,
    `created by`: java.lang.String = null,
    `creation date`: scala.Int | scala.Double = null,
    info: TorrentInfo = null,
    `url-list`: nodeLib.Buffer = null
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

