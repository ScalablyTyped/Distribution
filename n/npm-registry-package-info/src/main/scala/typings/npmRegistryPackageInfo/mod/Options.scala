package typings.npmRegistryPackageInfo.mod

import typings.npmRegistryPackageInfo.npmRegistryPackageInfoStrings.http
import typings.npmRegistryPackageInfo.npmRegistryPackageInfoStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Boolean indicating whether to return only the latest package information from a registry. */
  var latest: js.UndefOr[Boolean] = js.native
  /** Array of package names (required). */
  var packages: js.Array[String] = js.native
  /** Registry port. Default: 443 (HTTPS) or 80 (HTTP). */
  var port: js.UndefOr[Double] = js.native
  /** Registry protocol. Default: 'https'. */
  var protocol: js.UndefOr[http | https] = js.native
  /** Registry. Default: 'registry.npmjs.org'. */
  var registry: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(packages: js.Array[String]): Options = {
    val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setPackagesVarargs(value: String*): Self = this.set("packages", js.Array(value :_*))
    @scala.inline
    def setPackages(value: js.Array[String]): Self = this.set("packages", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatest(value: Boolean): Self = this.set("latest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatest: Self = this.set("latest", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setProtocol(value: http | https): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setRegistry(value: String): Self = this.set("registry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistry: Self = this.set("registry", js.undefined)
  }
  
}

