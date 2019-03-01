package typings
package parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentInfo extends js.Object {
  var files: js.UndefOr[js.Array[stdLib.File]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `name.utf-8`: js.UndefOr[java.lang.String] = js.undefined
  var `piece length`: js.UndefOr[scala.Double] = js.undefined
  var pieces: js.UndefOr[scala.Double] = js.undefined
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
}

object TorrentInfo {
  @scala.inline
  def apply(
    files: js.Array[stdLib.File] = null,
    name: java.lang.String = null,
    `name.utf-8`: java.lang.String = null,
    `piece length`: scala.Int | scala.Double = null,
    pieces: scala.Int | scala.Double = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined
  ): TorrentInfo = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`name.utf-8` != null) __obj.updateDynamic("name.utf-8")(`name.utf-8`)
    if (`piece length` != null) __obj.updateDynamic("piece length")(`piece length`.asInstanceOf[js.Any])
    if (pieces != null) __obj.updateDynamic("pieces")(pieces.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[TorrentInfo]
  }
}

