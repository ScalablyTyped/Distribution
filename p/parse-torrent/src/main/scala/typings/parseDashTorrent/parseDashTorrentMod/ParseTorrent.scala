package typings.parseDashTorrent.parseDashTorrentMod

import typings.node.Buffer
import typings.std.Blob
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseTorrent extends js.Object {
  @JSName("toMagnetURI")
  var toMagnetURI_Original: js.Function1[/* parsed */ typings.magnetDashUri.magnetDashUriMod.Instance, String] = js.native
  @JSName("toTorrentFile")
  var toTorrentFile_Original: js.Function1[
    /* parsed */ typings.parseDashTorrentDashFile.parseDashTorrentDashFileMod.Instance, 
    Buffer
  ] = js.native
  def apply(torrent: String): typings.magnetDashUri.magnetDashUriMod.Instance = js.native
  def apply(torrent: typings.magnetDashUri.magnetDashUriMod.Instance): Instance = js.native
  def apply(torrent: Buffer): typings.magnetDashUri.magnetDashUriMod.Instance | typings.parseDashTorrentDashFile.parseDashTorrentDashFileMod.Instance = js.native
  def apply(torrent: Instance): Instance = js.native
  def apply(torrent: typings.parseDashTorrentDashFile.parseDashTorrentDashFileMod.Instance): Instance = js.native
  def remote(torrent: String): Unit = js.native
  def remote(torrent: String, cb: js.Function2[/* err */ Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def remote(torrent: typings.magnetDashUri.magnetDashUriMod.Instance): Unit = js.native
  def remote(
    torrent: typings.magnetDashUri.magnetDashUriMod.Instance,
    cb: js.Function2[/* err */ Error, /* torrent */ js.UndefOr[Instance], Unit]
  ): Unit = js.native
  def remote(torrent: Buffer): Unit = js.native
  def remote(torrent: Buffer, cb: js.Function2[/* err */ Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def remote(torrent: Instance): Unit = js.native
  def remote(torrent: Instance, cb: js.Function2[/* err */ Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def remote(torrent: typings.parseDashTorrentDashFile.parseDashTorrentDashFileMod.Instance): Unit = js.native
  def remote(
    torrent: typings.parseDashTorrentDashFile.parseDashTorrentDashFileMod.Instance,
    cb: js.Function2[/* err */ Error, /* torrent */ js.UndefOr[Instance], Unit]
  ): Unit = js.native
  def remote(torrent: Blob): Unit = js.native
  def remote(torrent: Blob, cb: js.Function2[/* err */ Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def toMagnetURI(parsed: typings.magnetDashUri.magnetDashUriMod.Instance): String = js.native
  def toTorrentFile(parsed: typings.parseDashTorrentDashFile.parseDashTorrentDashFileMod.Instance): Buffer = js.native
}

