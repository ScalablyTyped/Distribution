package typings.next.distNextDashServerLibUtilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.next.Anon_StatusCode
import typings.node.querystringMod.ParsedUrlQuery
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NEXT_DATA extends js.Object {
  var assetPrefix: js.UndefOr[String] = js.undefined
  var autoExport: js.UndefOr[Boolean] = js.undefined
  var buildId: String
  var dataManager: String
  var dynamicIds: js.UndefOr[js.Array[String]] = js.undefined
  var err: js.UndefOr[Error with Anon_StatusCode] = js.undefined
  var nextExport: js.UndefOr[Boolean] = js.undefined
  var page: String
  var props: js.Any
  var query: ParsedUrlQuery
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var skeleton: js.UndefOr[Boolean] = js.undefined
}

object NEXT_DATA {
  @scala.inline
  def apply(
    buildId: String,
    dataManager: String,
    page: String,
    props: js.Any,
    query: ParsedUrlQuery,
    assetPrefix: String = null,
    autoExport: js.UndefOr[Boolean] = js.undefined,
    dynamicIds: js.Array[String] = null,
    err: Error with Anon_StatusCode = null,
    nextExport: js.UndefOr[Boolean] = js.undefined,
    runtimeConfig: StringDictionary[js.Any] = null,
    skeleton: js.UndefOr[Boolean] = js.undefined
  ): NEXT_DATA = {
    val __obj = js.Dynamic.literal(buildId = buildId, dataManager = dataManager, page = page, props = props, query = query)
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix)
    if (!js.isUndefined(autoExport)) __obj.updateDynamic("autoExport")(autoExport)
    if (dynamicIds != null) __obj.updateDynamic("dynamicIds")(dynamicIds)
    if (err != null) __obj.updateDynamic("err")(err)
    if (!js.isUndefined(nextExport)) __obj.updateDynamic("nextExport")(nextExport)
    if (runtimeConfig != null) __obj.updateDynamic("runtimeConfig")(runtimeConfig)
    if (!js.isUndefined(skeleton)) __obj.updateDynamic("skeleton")(skeleton)
    __obj.asInstanceOf[NEXT_DATA]
  }
}

