package typings
package parseDashTorrentDashFileLib.parseDashTorrentDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse-torrent-file", JSImport.Namespace)
@js.native
object parseDashTorrentDashFileModMembers extends js.Object {
  def apply(
    torrent: nodeLib.Buffer | parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs.Torrent
  ): parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs.Instance = js.native
  def decode(torrent: nodeLib.Buffer): parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs.Instance = js.native
  def decode(torrent: parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs.Torrent): parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs.Instance = js.native
  def encode(parsed: parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs.Instance): nodeLib.Buffer = js.native
}

