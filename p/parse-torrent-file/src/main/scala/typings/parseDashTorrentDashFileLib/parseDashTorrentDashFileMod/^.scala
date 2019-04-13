package typings
package parseDashTorrentDashFileLib.parseDashTorrentDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse-torrent-file", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(torrent: nodeLib.Buffer | Torrent): Instance = js.native
  def decode(torrent: nodeLib.Buffer): Instance = js.native
  def decode(torrent: Torrent): Instance = js.native
  def encode(parsed: Instance): nodeLib.Buffer = js.native
}

