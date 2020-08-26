package typings.nextServer.libUtilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.nextServer.anon.ErrorstatusCodenumberunde
import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NEXT_DATA extends js.Object {
  var assetPrefix: js.UndefOr[String] = js.native
  var buildId: String = js.native
  var dataManager: String = js.native
  var dynamicIds: js.UndefOr[js.Array[String]] = js.native
  var err: js.UndefOr[ErrorstatusCodenumberunde] = js.native
  var nextExport: js.UndefOr[Boolean] = js.native
  var page: String = js.native
  var props: js.Any = js.native
  var query: ParsedUrlQuery = js.native
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
  var skeleton: js.UndefOr[Boolean] = js.native
}

object NEXT_DATA {
  @scala.inline
  def apply(buildId: String, dataManager: String, page: String, props: js.Any, query: ParsedUrlQuery): NEXT_DATA = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], dataManager = dataManager.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEXT_DATA]
  }
  @scala.inline
  implicit class NEXT_DATAOps[Self <: NEXT_DATA] (val x: Self) extends AnyVal {
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
    def setBuildId(value: String): Self = this.set("buildId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataManager(value: String): Self = this.set("dataManager", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: String): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: js.Any): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: ParsedUrlQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssetPrefix(value: String): Self = this.set("assetPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetPrefix: Self = this.set("assetPrefix", js.undefined)
    @scala.inline
    def setDynamicIdsVarargs(value: String*): Self = this.set("dynamicIds", js.Array(value :_*))
    @scala.inline
    def setDynamicIds(value: js.Array[String]): Self = this.set("dynamicIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicIds: Self = this.set("dynamicIds", js.undefined)
    @scala.inline
    def setErr(value: ErrorstatusCodenumberunde): Self = this.set("err", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErr: Self = this.set("err", js.undefined)
    @scala.inline
    def setNextExport(value: Boolean): Self = this.set("nextExport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextExport: Self = this.set("nextExport", js.undefined)
    @scala.inline
    def setRuntimeConfig(value: StringDictionary[js.Any]): Self = this.set("runtimeConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeConfig: Self = this.set("runtimeConfig", js.undefined)
    @scala.inline
    def setSkeleton(value: Boolean): Self = this.set("skeleton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkeleton: Self = this.set("skeleton", js.undefined)
  }
  
}

