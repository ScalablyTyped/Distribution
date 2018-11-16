package typings
package parseDashTorrentLib.parseDashTorrentMod.ParseTorrentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseTorrent extends js.Object {
  var toMagnetURI: js.Any = js.native
  @JSName("toTorrentFile")
  var toTorrentFile_Original: js.Function1[
    /* parsed */ parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs.Instance, 
    nodeLib.Buffer
  ] = js.native
  def apply(
    torrent: magnetDashUriLib.magnetDashUriMod.MagnetUriNs.Instance | parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs.Instance | Instance
  ): Instance = js.native
  def apply(torrent: java.lang.String): magnetDashUriLib.magnetDashUriMod.MagnetUriNs.Instance = js.native
  def apply(torrent: nodeLib.Buffer): magnetDashUriLib.magnetDashUriMod.MagnetUriNs.Instance | parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs.Instance = js.native
  def remote(
    torrent: magnetDashUriLib.magnetDashUriMod.MagnetUriNs.Instance | parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs.Instance | Instance
  ): scala.Unit = js.native
  def remote(
    torrent: magnetDashUriLib.magnetDashUriMod.MagnetUriNs.Instance | parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs.Instance | Instance,
    cb: js.Function2[/* err */ nodeLib.Error, /* torrent */ js.UndefOr[Instance], scala.Unit]
  ): scala.Unit = js.native
  def remote(torrent: java.lang.String): scala.Unit = js.native
  def remote(
    torrent: java.lang.String,
    cb: js.Function2[/* err */ nodeLib.Error, /* torrent */ js.UndefOr[Instance], scala.Unit]
  ): scala.Unit = js.native
  def remote(torrent: nodeLib.Buffer): scala.Unit = js.native
  def remote(
    torrent: nodeLib.Buffer,
    cb: js.Function2[/* err */ nodeLib.Error, /* torrent */ js.UndefOr[Instance], scala.Unit]
  ): scala.Unit = js.native
  def remote(torrent: stdLib.Blob): scala.Unit = js.native
  def remote(
    torrent: stdLib.Blob,
    cb: js.Function2[/* err */ nodeLib.Error, /* torrent */ js.UndefOr[Instance], scala.Unit]
  ): scala.Unit = js.native
  def toTorrentFile(parsed: parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs.Instance): nodeLib.Buffer = js.native
}

