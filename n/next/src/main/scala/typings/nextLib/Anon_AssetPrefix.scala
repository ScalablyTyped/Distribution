package typings
package nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssetPrefix[Q /* <: nextDashServerLib.routerMod.DefaultQuery */]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var assetPrefix: js.UndefOr[java.lang.String] = js.undefined
  var buildId: java.lang.String
  var err: js.UndefOr[js.Any] = js.undefined
  var nextExport: js.UndefOr[scala.Boolean] = js.undefined
  var page: java.lang.String
  var pathname: java.lang.String
  var props: js.Any
  var query: Q
  var runtimeConfig: js.UndefOr[js.Any] = js.undefined
}

object Anon_AssetPrefix {
  @scala.inline
  def apply[Q /* <: nextDashServerLib.routerMod.DefaultQuery */](
    buildId: java.lang.String,
    page: java.lang.String,
    pathname: java.lang.String,
    props: js.Any,
    query: Q,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    assetPrefix: java.lang.String = null,
    err: js.Any = null,
    nextExport: js.UndefOr[scala.Boolean] = js.undefined,
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

