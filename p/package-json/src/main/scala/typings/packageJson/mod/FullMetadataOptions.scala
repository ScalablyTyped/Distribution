package typings.packageJson.mod

import typings.node.httpMod.Agent
import typings.packageJson.packageJsonBooleans.`false`
import typings.packageJson.packageJsonBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullMetadataOptions extends Options {
  /**
  		By default, only an abbreviated metadata object is returned for performance reasons. [Read more.](https://github.com/npm/registry/blob/master/docs/responses/package-metadata.md)
  		@default false
  		*/
  @JSName("fullMetadata")
  val fullMetadata_FullMetadataOptions: `true`
}

object FullMetadataOptions {
  @scala.inline
  def apply(
    fullMetadata: `true`,
    agent: Agent | typings.node.httpsMod.Agent | Agents | `false` = null,
    allVersions: js.UndefOr[Boolean] = js.undefined,
    registryUrl: String = null,
    version: String = null
  ): FullMetadataOptions = {
    val __obj = js.Dynamic.literal(fullMetadata = fullMetadata.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (!js.isUndefined(allVersions)) __obj.updateDynamic("allVersions")(allVersions.get.asInstanceOf[js.Any])
    if (registryUrl != null) __obj.updateDynamic("registryUrl")(registryUrl.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullMetadataOptions]
  }
}

