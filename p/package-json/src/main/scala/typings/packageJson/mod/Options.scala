package typings.packageJson.mod

import typings.node.httpMod.Agent
import typings.packageJson.packageJsonBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Overwrite the `agent` option that is passed down to [`got`](https://github.com/sindresorhus/got#agent). This might be useful to add [proxy support](https://github.com/sindresorhus/got#proxies).
  		*/
  val agent: js.UndefOr[Agent | typings.node.httpsMod.Agent | Agents | `false`] = js.undefined
  /**
  		Return the [main entry](https://registry.npmjs.org/ava) containing all versions.
  		@default false
  		*/
  val allVersions: js.UndefOr[Boolean] = js.undefined
  /**
  		By default, only an abbreviated metadata object is returned for performance reasons. [Read more.](https://github.com/npm/registry/blob/master/docs/responses/package-metadata.md)
  		@default false
  		*/
  val fullMetadata: js.UndefOr[Boolean] = js.undefined
  /**
  		The registry URL is by default inferred from the npm defaults and `.npmrc`. This is beneficial as `package-json` and any project using it will work just like npm. This option is*only** intended for internal tools. You should*not** use this option in reusable packages. Prefer just using `.npmrc` whenever possible.
  		*/
  val registryUrl: js.UndefOr[String] = js.undefined
  /**
  		Package version such as `1.0.0` or a [dist tag](https://docs.npmjs.com/cli/dist-tag) such as `latest`.
  		The version can also be in any format supported by the [semver](https://github.com/npm/node-semver) module. For example:
  		- `1` - Get the latest `1.x.x`
  		- `1.2` - Get the latest `1.2.x`
  		- `^1.2.3` - Get the latest `1.x.x` but at least `1.2.3`
  		- `~1.2.3` - Get the latest `1.2.x` but at least `1.2.3`
  		@default 'latest'
  		*/
  val version: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    agent: Agent | typings.node.httpsMod.Agent | Agents | `false` = null,
    allVersions: js.UndefOr[Boolean] = js.undefined,
    fullMetadata: js.UndefOr[Boolean] = js.undefined,
    registryUrl: String = null,
    version: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (!js.isUndefined(allVersions)) __obj.updateDynamic("allVersions")(allVersions.asInstanceOf[js.Any])
    if (!js.isUndefined(fullMetadata)) __obj.updateDynamic("fullMetadata")(fullMetadata.asInstanceOf[js.Any])
    if (registryUrl != null) __obj.updateDynamic("registryUrl")(registryUrl.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

