package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileHash extends js.Object {
  // File hash type. Possible values are: unknown, sha1, sha256, md5, authenticodeHash256, lsHash, ctph, peSha1, peSha256.
  var hashType: js.UndefOr[FileHashType] = js.undefined
  // Value of the file hash.
  var hashValue: js.UndefOr[String] = js.undefined
}

object FileHash {
  @scala.inline
  def apply(hashType: FileHashType = null, hashValue: String = null): FileHash = {
    val __obj = js.Dynamic.literal()
    if (hashType != null) __obj.updateDynamic("hashType")(hashType.asInstanceOf[js.Any])
    if (hashValue != null) __obj.updateDynamic("hashValue")(hashValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileHash]
  }
}

