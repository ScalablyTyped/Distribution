package typings.parseDashTorrentDashFile.parseDashTorrentDashFileMod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentInfo extends js.Object {
  var files: js.UndefOr[js.Array[File]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `name.utf-8`: js.UndefOr[String] = js.undefined
  var `piece length`: js.UndefOr[Double] = js.undefined
  var pieces: js.UndefOr[Double] = js.undefined
  var `private`: js.UndefOr[Boolean] = js.undefined
}

object TorrentInfo {
  @scala.inline
  def apply(
    files: js.Array[File] = null,
    name: String = null,
    `name.utf-8`: String = null,
    `piece length`: Int | Double = null,
    pieces: Int | Double = null,
    `private`: js.UndefOr[Boolean] = js.undefined
  ): TorrentInfo = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`name.utf-8` != null) __obj.updateDynamic("name.utf-8")(`name.utf-8`.asInstanceOf[js.Any])
    if (`piece length` != null) __obj.updateDynamic("piece length")(`piece length`.asInstanceOf[js.Any])
    if (pieces != null) __obj.updateDynamic("pieces")(pieces.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TorrentInfo]
  }
}

