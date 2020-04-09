package typings.pacote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageDist extends js.Object {
  /**
    * Number of files in the tarball.
    */
  var fileCount: js.UndefOr[Double] = js.undefined
  /**
    * The integrity SRI string for the artifact. This may not be present for
    * older packages on the npm registry. (Copied by Pacote to
    * `manifest._integrity`.)
    */
  var integrity: js.UndefOr[String] = js.undefined
  /**
    * A signature of the package by the
    * [`npmregistry`](https://keybase.io/npmregistry) Keybase account.
    * (Obviously only present for packages published to
    * https://registry.npmjs.org.)
    */
  var `npm-signature`: js.UndefOr[String] = js.undefined
  /**
    * Legacy integrity value. Hexadecimal-encoded sha1 hash. (Converted to an
    * SRI string and copied by Pacote to `manifest._integrity` when
    * `dist.integrity` is not present.)
    */
  var shasum: js.UndefOr[String] = js.undefined
  /**
    * The url to the associated package artifact. (Copied by Pacote to
    * `manifest._resolved`.)
    */
  var tarball: String
  /**
    * Size on disk of the package when unpacked.
    */
  var unpackedSize: js.UndefOr[Double] = js.undefined
}

object PackageDist {
  @scala.inline
  def apply(
    tarball: String,
    fileCount: Int | Double = null,
    integrity: String = null,
    `npm-signature`: String = null,
    shasum: String = null,
    unpackedSize: Int | Double = null
  ): PackageDist = {
    val __obj = js.Dynamic.literal(tarball = tarball.asInstanceOf[js.Any])
    if (fileCount != null) __obj.updateDynamic("fileCount")(fileCount.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (`npm-signature` != null) __obj.updateDynamic("npm-signature")(`npm-signature`.asInstanceOf[js.Any])
    if (shasum != null) __obj.updateDynamic("shasum")(shasum.asInstanceOf[js.Any])
    if (unpackedSize != null) __obj.updateDynamic("unpackedSize")(unpackedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageDist]
  }
}

