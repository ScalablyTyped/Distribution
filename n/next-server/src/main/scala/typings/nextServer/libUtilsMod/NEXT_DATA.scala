package typings.nextServer.libUtilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.nextServer.AnonStatusCode
import typings.node.querystringMod.ParsedUrlQuery
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NEXT_DATA extends js.Object {
  var assetPrefix: js.UndefOr[String] = js.undefined
  var buildId: String
  var dataManager: String
  var dynamicIds: js.UndefOr[js.Array[String]] = js.undefined
  var err: js.UndefOr[Error with AnonStatusCode] = js.undefined
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
    dynamicIds: js.Array[String] = null,
    err: Error with AnonStatusCode = null,
    nextExport: js.UndefOr[Boolean] = js.undefined,
    runtimeConfig: StringDictionary[js.Any] = null,
    skeleton: js.UndefOr[Boolean] = js.undefined
  ): NEXT_DATA = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], dataManager = dataManager.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix.asInstanceOf[js.Any])
    if (dynamicIds != null) __obj.updateDynamic("dynamicIds")(dynamicIds.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    if (!js.isUndefined(nextExport)) __obj.updateDynamic("nextExport")(nextExport.asInstanceOf[js.Any])
    if (runtimeConfig != null) __obj.updateDynamic("runtimeConfig")(runtimeConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(skeleton)) __obj.updateDynamic("skeleton")(skeleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEXT_DATA]
  }
}

