package typings
package parseDashTorrentLib.parseDashTorrentMod.ParseTorrentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs.Instance because var conflicts: announce, constructor, infoHash, infoHashBuffer, name, urlList. Inlined created, createdBy, files, info, infoBuffer, lastPieceLength, length, pieceLength, pieces, `private` */ trait Instance
  extends magnetDashUriLib.magnetDashUriMod.MagnetUriNs.Instance {
  var created: js.UndefOr[stdLib.Date] = js.undefined
  var createdBy: js.UndefOr[java.lang.String] = js.undefined
  var files: js.UndefOr[
    js.Array[
      parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs.ParsedFile
    ]
  ] = js.undefined
  var info: js.UndefOr[
    parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs.TorrentInfo
  ] = js.undefined
  var infoBuffer: js.UndefOr[nodeLib.Buffer] = js.undefined
  @JSName("infoHash")
  var infoHash_Instance: java.lang.String
  var lastPieceLength: js.UndefOr[scala.Double] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  @JSName("name")
  var name_Instance: js.UndefOr[java.lang.String] = js.undefined
  var pieceLength: js.UndefOr[scala.Double] = js.undefined
  var pieces: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
}

