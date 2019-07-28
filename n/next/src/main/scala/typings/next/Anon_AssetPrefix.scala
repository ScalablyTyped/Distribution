package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.nextDashServer.routerMod.DefaultQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssetPrefix[Q /* <: DefaultQuery */]
  extends /* key */ StringDictionary[js.Any] {
  var assetPrefix: js.UndefOr[String] = js.undefined
  var buildId: String
  var err: js.UndefOr[js.Any] = js.undefined
  var nextExport: js.UndefOr[Boolean] = js.undefined
  var page: String
  var pathname: String
  var props: js.Any
  var query: Q
  var runtimeConfig: js.UndefOr[js.Any] = js.undefined
}

object Anon_AssetPrefix {
  @scala.inline
  def apply[Q /* <: DefaultQuery */](
    buildId: String,
    page: String,
    pathname: String,
    props: js.Any,
    query: Q,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    assetPrefix: String = null,
    err: js.Any = null,
    nextExport: js.UndefOr[Boolean] = js.undefined,
    runtimeConfig: js.Any = null
  ): Anon_AssetPrefix[Q] = {
    val __obj = js.Dynamic.literal(buildId = buildId, page = page, pathname = pathname, props = props, query = query.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix)
    if (err != null) __obj.updateDynamic("err")(err)
    if (!js.isUndefined(nextExport)) __obj.updateDynamic("nextExport")(nextExport)
    if (runtimeConfig != null) __obj.updateDynamic("runtimeConfig")(runtimeConfig)
    __obj.asInstanceOf[Anon_AssetPrefix[Q]]
  }
}

