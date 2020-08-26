package typings.packageJson.mod

import typings.node.httpMod.Agent
import typings.packageJson.packageJsonBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Overwrite the `agent` option that is passed down to [`got`](https://github.com/sindresorhus/got#agent). This might be useful to add [proxy support](https://github.com/sindresorhus/got#proxies).
  		*/
  val agent: js.UndefOr[Agent | typings.node.httpsMod.Agent | Agents | `false`] = js.native
  /**
  		Return the [main entry](https://registry.npmjs.org/ava) containing all versions.
  		@default false
  		*/
  val allVersions: js.UndefOr[Boolean] = js.native
  /**
  		By default, only an abbreviated metadata object is returned for performance reasons. [Read more.](https://github.com/npm/registry/blob/master/docs/responses/package-metadata.md)
  		@default false
  		*/
  val fullMetadata: js.UndefOr[Boolean] = js.native
  /**
  		The registry URL is by default inferred from the npm defaults and `.npmrc`. This is beneficial as `package-json` and any project using it will work just like npm. This option is*only** intended for internal tools. You should*not** use this option in reusable packages. Prefer just using `.npmrc` whenever possible.
  		*/
  val registryUrl: js.UndefOr[String] = js.native
  /**
  		Package version such as `1.0.0` or a [dist tag](https://docs.npmjs.com/cli/dist-tag) such as `latest`.
  		The version can also be in any format supported by the [semver](https://github.com/npm/node-semver) module. For example:
  		- `1` - Get the latest `1.x.x`
  		- `1.2` - Get the latest `1.2.x`
  		- `^1.2.3` - Get the latest `1.x.x` but at least `1.2.3`
  		- `~1.2.3` - Get the latest `1.2.x` but at least `1.2.3`
  		@default 'latest'
  		*/
  val version: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setAgent(value: Agent | typings.node.httpsMod.Agent | Agents | `false`): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setAllVersions(value: Boolean): Self = this.set("allVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllVersions: Self = this.set("allVersions", js.undefined)
    @scala.inline
    def setFullMetadata(value: Boolean): Self = this.set("fullMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullMetadata: Self = this.set("fullMetadata", js.undefined)
    @scala.inline
    def setRegistryUrl(value: String): Self = this.set("registryUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistryUrl: Self = this.set("registryUrl", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

