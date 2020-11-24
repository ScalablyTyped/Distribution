package typings.parseTorrent.mod

import typings.node.Buffer
import typings.std.Blob
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseTorrent extends js.Object {
  
  def apply(torrent: String): typings.magnetUri.mod.Instance = js.native
  def apply(torrent: typings.magnetUri.mod.Instance): Instance = js.native
  def apply(torrent: Buffer): typings.magnetUri.mod.Instance | typings.parseTorrentFile.mod.Instance = js.native
  def apply(torrent: Instance): Instance = js.native
  def apply(torrent: typings.parseTorrentFile.mod.Instance): Instance = js.native
  
  def remote(torrent: String): Unit = js.native
  def remote(torrent: String, cb: js.Function2[/* err */ Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def remote(torrent: typings.magnetUri.mod.Instance): Unit = js.native
  def remote(
    torrent: typings.magnetUri.mod.Instance,
    cb: js.Function2[/* err */ Error, /* torrent */ js.UndefOr[Instance], Unit]
  ): Unit = js.native
  def remote(torrent: Buffer): Unit = js.native
  def remote(torrent: Buffer, cb: js.Function2[/* err */ Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def remote(torrent: Instance): Unit = js.native
  def remote(torrent: Instance, cb: js.Function2[/* err */ Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def remote(torrent: typings.parseTorrentFile.mod.Instance): Unit = js.native
  def remote(
    torrent: typings.parseTorrentFile.mod.Instance,
    cb: js.Function2[/* err */ Error, /* torrent */ js.UndefOr[Instance], Unit]
  ): Unit = js.native
  def remote(torrent: Blob): Unit = js.native
  def remote(torrent: Blob, cb: js.Function2[/* err */ Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  
  def toMagnetURI(parsed: typings.magnetUri.mod.Instance): String = js.native
  @JSName("toMagnetURI")
  var toMagnetURI_Original: js.Function1[/* parsed */ typings.magnetUri.mod.Instance, String] = js.native
  
  def toTorrentFile(parsed: typings.parseTorrentFile.mod.Instance): Buffer = js.native
  @JSName("toTorrentFile")
  var toTorrentFile_Original: js.Function1[/* parsed */ typings.parseTorrentFile.mod.Instance, Buffer] = js.native
}
