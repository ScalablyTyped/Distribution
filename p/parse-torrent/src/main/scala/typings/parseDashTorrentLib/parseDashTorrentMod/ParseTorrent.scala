package typings
package parseDashTorrentLib.parseDashTorrentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseTorrent extends js.Object {
  @JSName("toMagnetURI")
  var toMagnetURI_Original: js.Function1[/* parsed */ magnetDashUriLib.magnetDashUriMod.Instance, java.lang.String] = js.native
  @JSName("toTorrentFile")
  var toTorrentFile_Original: js.Function1[
    /* parsed */ parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.Instance, 
    nodeLib.Buffer
  ] = js.native
  def apply(torrent: java.lang.String): magnetDashUriLib.magnetDashUriMod.Instance = js.native
  def apply(torrent: magnetDashUriLib.magnetDashUriMod.Instance): Instance = js.native
  def apply(torrent: nodeLib.Buffer): magnetDashUriLib.magnetDashUriMod.Instance | parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.Instance = js.native
  def apply(torrent: parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.Instance): Instance = js.native
  def apply(torrent: Instance): Instance = js.native
  def remote(torrent: java.lang.String): scala.Unit = js.native
  def remote(
    torrent: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* torrent */ js.UndefOr[Instance], scala.Unit]
  ): scala.Unit = js.native
  def remote(torrent: magnetDashUriLib.magnetDashUriMod.Instance): scala.Unit = js.native
  def remote(
    torrent: magnetDashUriLib.magnetDashUriMod.Instance,
    cb: js.Function2[/* err */ stdLib.Error, /* torrent */ js.UndefOr[Instance], scala.Unit]
  ): scala.Unit = js.native
  def remote(torrent: nodeLib.Buffer): scala.Unit = js.native
  def remote(
    torrent: nodeLib.Buffer,
    cb: js.Function2[/* err */ stdLib.Error, /* torrent */ js.UndefOr[Instance], scala.Unit]
  ): scala.Unit = js.native
  def remote(torrent: parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.Instance): scala.Unit = js.native
  def remote(
    torrent: parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.Instance,
    cb: js.Function2[/* err */ stdLib.Error, /* torrent */ js.UndefOr[Instance], scala.Unit]
  ): scala.Unit = js.native
  def remote(torrent: Instance): scala.Unit = js.native
  def remote(
    torrent: Instance,
    cb: js.Function2[/* err */ stdLib.Error, /* torrent */ js.UndefOr[Instance], scala.Unit]
  ): scala.Unit = js.native
  def remote(torrent: stdLib.Blob): scala.Unit = js.native
  def remote(
    torrent: stdLib.Blob,
    cb: js.Function2[/* err */ stdLib.Error, /* torrent */ js.UndefOr[Instance], scala.Unit]
  ): scala.Unit = js.native
  def toMagnetURI(parsed: magnetDashUriLib.magnetDashUriMod.Instance): java.lang.String = js.native
  def toTorrentFile(parsed: parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.Instance): nodeLib.Buffer = js.native
}

