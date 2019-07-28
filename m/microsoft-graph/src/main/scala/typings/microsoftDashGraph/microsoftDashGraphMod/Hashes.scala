package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hashes extends js.Object {
  // The CRC32 value of the file in little endian (if available). Read-only.
  var crc32Hash: js.UndefOr[String] = js.undefined
  /**
    * A proprietary hash of the file that can be used to determine if the contents of the file have changed (if available).
    * Read-only.
    */
  var quickXorHash: js.UndefOr[String] = js.undefined
  // SHA1 hash for the contents of the file (if available). Read-only.
  var sha1Hash: js.UndefOr[String] = js.undefined
}

object Hashes {
  @scala.inline
  def apply(crc32Hash: String = null, quickXorHash: String = null, sha1Hash: String = null): Hashes = {
    val __obj = js.Dynamic.literal()
    if (crc32Hash != null) __obj.updateDynamic("crc32Hash")(crc32Hash)
    if (quickXorHash != null) __obj.updateDynamic("quickXorHash")(quickXorHash)
    if (sha1Hash != null) __obj.updateDynamic("sha1Hash")(sha1Hash)
    __obj.asInstanceOf[Hashes]
  }
}

