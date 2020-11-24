package typings.next.libUtilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.ErrorstatusCodenumberunde
import typings.node.querystringMod.ParsedUrlQuery
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NEXT_DATA extends js.Object {
  
  var appGip: js.UndefOr[Boolean] = js.native
  
  var assetPrefix: js.UndefOr[String] = js.native
  
  var autoExport: js.UndefOr[Boolean] = js.native
  
  var buildId: String = js.native
  
  var customServer: js.UndefOr[Boolean] = js.native
  
  var defaultLocale: js.UndefOr[String] = js.native
  
  var dynamicIds: js.UndefOr[js.Array[String]] = js.native
  
  var err: js.UndefOr[ErrorstatusCodenumberunde] = js.native
  
  var gip: js.UndefOr[Boolean] = js.native
  
  var gsp: js.UndefOr[Boolean] = js.native
  
  var gssp: js.UndefOr[Boolean] = js.native
  
  var isFallback: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var locales: js.UndefOr[js.Array[String]] = js.native
  
  var nextExport: js.UndefOr[Boolean] = js.native
  
  var page: String = js.native
  
  var props: Record[String, _] = js.native
  
  var query: ParsedUrlQuery = js.native
  
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object NEXT_DATA {
  
  @scala.inline
  def apply(buildId: String, page: String, props: Record[String, _], query: ParsedUrlQuery): NEXT_DATA = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
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
    def setPage(value: String): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: Record[String, _]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: ParsedUrlQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppGip(value: Boolean): Self = this.set("appGip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppGip: Self = this.set("appGip", js.undefined)
    
    @scala.inline
    def setAssetPrefix(value: String): Self = this.set("assetPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetPrefix: Self = this.set("assetPrefix", js.undefined)
    
    @scala.inline
    def setAutoExport(value: Boolean): Self = this.set("autoExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoExport: Self = this.set("autoExport", js.undefined)
    
    @scala.inline
    def setCustomServer(value: Boolean): Self = this.set("customServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomServer: Self = this.set("customServer", js.undefined)
    
    @scala.inline
    def setDefaultLocale(value: String): Self = this.set("defaultLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLocale: Self = this.set("defaultLocale", js.undefined)
    
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
    def setGip(value: Boolean): Self = this.set("gip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGip: Self = this.set("gip", js.undefined)
    
    @scala.inline
    def setGsp(value: Boolean): Self = this.set("gsp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGsp: Self = this.set("gsp", js.undefined)
    
    @scala.inline
    def setGssp(value: Boolean): Self = this.set("gssp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGssp: Self = this.set("gssp", js.undefined)
    
    @scala.inline
    def setIsFallback(value: Boolean): Self = this.set("isFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFallback: Self = this.set("isFallback", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocalesVarargs(value: String*): Self = this.set("locales", js.Array(value :_*))
    
    @scala.inline
    def setLocales(value: js.Array[String]): Self = this.set("locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    
    @scala.inline
    def setNextExport(value: Boolean): Self = this.set("nextExport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextExport: Self = this.set("nextExport", js.undefined)
    
    @scala.inline
    def setRuntimeConfig(value: StringDictionary[js.Any]): Self = this.set("runtimeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeConfig: Self = this.set("runtimeConfig", js.undefined)
  }
}
