package typings
package parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs

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

