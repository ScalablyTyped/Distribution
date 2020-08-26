package typings.pacote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageDist extends js.Object {
  /**
    * Number of files in the tarball.
    */
  var fileCount: js.UndefOr[Double] = js.native
  /**
    * The integrity SRI string for the artifact. This may not be present for
    * older packages on the npm registry. (Copied by Pacote to
    * `manifest._integrity`.)
    */
  var integrity: js.UndefOr[String] = js.native
  /**
    * A signature of the package by the
    * [`npmregistry`](https://keybase.io/npmregistry) Keybase account.
    * (Obviously only present for packages published to
    * https://registry.npmjs.org.)
    */
  var `npm-signature`: js.UndefOr[String] = js.native
  /**
    * Legacy integrity value. Hexadecimal-encoded sha1 hash. (Converted to an
    * SRI string and copied by Pacote to `manifest._integrity` when
    * `dist.integrity` is not present.)
    */
  var shasum: js.UndefOr[String] = js.native
  /**
    * The url to the associated package artifact. (Copied by Pacote to
    * `manifest._resolved`.)
    */
  var tarball: String = js.native
  /**
    * Size on disk of the package when unpacked.
    */
  var unpackedSize: js.UndefOr[Double] = js.native
}

object PackageDist {
  @scala.inline
  def apply(tarball: String): PackageDist = {
    val __obj = js.Dynamic.literal(tarball = tarball.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageDist]
  }
  @scala.inline
  implicit class PackageDistOps[Self <: PackageDist] (val x: Self) extends AnyVal {
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
    def setTarball(value: String): Self = this.set("tarball", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileCount(value: Double): Self = this.set("fileCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileCount: Self = this.set("fileCount", js.undefined)
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
    @scala.inline
    def `setNpm-signature`(value: String): Self = this.set("npm-signature", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteNpm-signature`: Self = this.set("npm-signature", js.undefined)
    @scala.inline
    def setShasum(value: String): Self = this.set("shasum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShasum: Self = this.set("shasum", js.undefined)
    @scala.inline
    def setUnpackedSize(value: Double): Self = this.set("unpackedSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnpackedSize: Self = this.set("unpackedSize", js.undefined)
  }
  
}

