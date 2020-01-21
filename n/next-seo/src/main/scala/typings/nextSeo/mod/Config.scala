package typings.nextSeo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var canonical: js.UndefOr[String] = js.undefined
  var dangerouslySetAllPagesToNoIndex: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var facebook: js.UndefOr[Facebook] = js.undefined
  var noindex: js.UndefOr[Boolean] = js.undefined
  var openGraph: js.UndefOr[OpenGraph] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleTemplate: js.UndefOr[String] = js.undefined
  var twitter: js.UndefOr[Twitter] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    canonical: String = null,
    dangerouslySetAllPagesToNoIndex: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    facebook: Facebook = null,
    noindex: js.UndefOr[Boolean] = js.undefined,
    openGraph: OpenGraph = null,
    title: String = null,
    titleTemplate: String = null,
    twitter: Twitter = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (canonical != null) __obj.updateDynamic("canonical")(canonical.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerouslySetAllPagesToNoIndex)) __obj.updateDynamic("dangerouslySetAllPagesToNoIndex")(dangerouslySetAllPagesToNoIndex.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (facebook != null) __obj.updateDynamic("facebook")(facebook.asInstanceOf[js.Any])
    if (!js.isUndefined(noindex)) __obj.updateDynamic("noindex")(noindex.asInstanceOf[js.Any])
    if (openGraph != null) __obj.updateDynamic("openGraph")(openGraph.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTemplate != null) __obj.updateDynamic("titleTemplate")(titleTemplate.asInstanceOf[js.Any])
    if (twitter != null) __obj.updateDynamic("twitter")(twitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

