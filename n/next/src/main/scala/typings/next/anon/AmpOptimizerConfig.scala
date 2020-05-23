package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import typings.next.apiUtilsMod.ApiPreviewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmpOptimizerConfig extends js.Object {
  var ampOptimizerConfig: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var assetPrefix: js.UndefOr[String] = js.undefined
  var basePath: String
  var buildId: String
  var canonicalBase: String
  var customServer: js.UndefOr[Boolean] = js.undefined
  var dev: js.UndefOr[Boolean] = js.undefined
  var generateEtags: Boolean
  var poweredByHeader: Boolean
  var previewProps: ApiPreviewProps
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var staticMarkup: Boolean
}

object AmpOptimizerConfig {
  @scala.inline
  def apply(
    basePath: String,
    buildId: String,
    canonicalBase: String,
    generateEtags: Boolean,
    poweredByHeader: Boolean,
    previewProps: ApiPreviewProps,
    staticMarkup: Boolean,
    ampOptimizerConfig: StringDictionary[js.Any] = null,
    assetPrefix: String = null,
    customServer: js.UndefOr[Boolean] = js.undefined,
    dev: js.UndefOr[Boolean] = js.undefined,
    runtimeConfig: StringDictionary[js.Any] = null
  ): AmpOptimizerConfig = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], generateEtags = generateEtags.asInstanceOf[js.Any], poweredByHeader = poweredByHeader.asInstanceOf[js.Any], previewProps = previewProps.asInstanceOf[js.Any], staticMarkup = staticMarkup.asInstanceOf[js.Any])
    if (ampOptimizerConfig != null) __obj.updateDynamic("ampOptimizerConfig")(ampOptimizerConfig.asInstanceOf[js.Any])
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(customServer)) __obj.updateDynamic("customServer")(customServer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.get.asInstanceOf[js.Any])
    if (runtimeConfig != null) __obj.updateDynamic("runtimeConfig")(runtimeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmpOptimizerConfig]
  }
}

