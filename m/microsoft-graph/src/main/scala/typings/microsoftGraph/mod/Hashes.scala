package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hashes extends js.Object {
  // The CRC32 value of the file in little endian (if available). Read-only.
  var crc32Hash: js.UndefOr[String] = js.native
  /**
    * A proprietary hash of the file that can be used to determine if the contents of the file have changed (if available).
    * Read-only.
    */
  var quickXorHash: js.UndefOr[String] = js.native
  // SHA1 hash for the contents of the file (if available). Read-only.
  var sha1Hash: js.UndefOr[String] = js.native
  // SHA256 hash for the contents of the file (if available). Read-only.
  var sha256Hash: js.UndefOr[String] = js.native
}

object Hashes {
  @scala.inline
  def apply(): Hashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hashes]
  }
  @scala.inline
  implicit class HashesOps[Self <: Hashes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCrc32Hash(value: String): Self = this.set("crc32Hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrc32Hash: Self = this.set("crc32Hash", js.undefined)
    @scala.inline
    def setQuickXorHash(value: String): Self = this.set("quickXorHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuickXorHash: Self = this.set("quickXorHash", js.undefined)
    @scala.inline
    def setSha1Hash(value: String): Self = this.set("sha1Hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha1Hash: Self = this.set("sha1Hash", js.undefined)
    @scala.inline
    def setSha256Hash(value: String): Self = this.set("sha256Hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSha256Hash: Self = this.set("sha256Hash", js.undefined)
  }
  
}

