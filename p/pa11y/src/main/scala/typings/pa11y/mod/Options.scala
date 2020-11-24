package typings.pa11y.mod

import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var actions: js.UndefOr[js.Array[String]] = js.native
  
  var browser: js.UndefOr[Browser] = js.native
  
  var chromeLaunchConfig: js.UndefOr[LaunchConfig] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  var hideElements: js.UndefOr[String] = js.native
  
  var ignore: js.UndefOr[js.Array[String]] = js.native
  
  var ignoreUrl: js.UndefOr[Boolean] = js.native
  
  var includeNotices: js.UndefOr[Boolean] = js.native
  
  var includeWarnings: js.UndefOr[Boolean] = js.native
  
  var level: js.UndefOr[String] = js.native
  
  var log: js.UndefOr[LogConfig] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var page: js.UndefOr[Page] = js.native
  
  var pages: js.UndefOr[js.Array[Page]] = js.native
  
  var postData: js.UndefOr[String] = js.native
  
  var reporter: js.UndefOr[String] = js.native
  
  var rootElement: js.UndefOr[String] = js.native
  
  var rules: js.UndefOr[js.Array[String]] = js.native
  
  var runners: js.UndefOr[js.Array[String]] = js.native
  
  var screenCapture: js.UndefOr[String] = js.native
  
  var standard: js.UndefOr[AccessibilityStandard] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var userAgent: js.UndefOr[String] = js.native
  
  var viewport: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Viewport */ js.Any
  ] = js.native
  
  @JSName("wait")
  var wait_FOptions: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: String*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[String]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setBrowser(value: Browser): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    
    @scala.inline
    def setChromeLaunchConfig(value: LaunchConfig): Self = this.set("chromeLaunchConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChromeLaunchConfig: Self = this.set("chromeLaunchConfig", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHideElements(value: String): Self = this.set("hideElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideElements: Self = this.set("hideElements", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setIgnoreUrl(value: Boolean): Self = this.set("ignoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUrl: Self = this.set("ignoreUrl", js.undefined)
    
    @scala.inline
    def setIncludeNotices(value: Boolean): Self = this.set("includeNotices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNotices: Self = this.set("includeNotices", js.undefined)
    
    @scala.inline
    def setIncludeWarnings(value: Boolean): Self = this.set("includeWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeWarnings: Self = this.set("includeWarnings", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLog(value: LogConfig): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPage(value: Page): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPagesVarargs(value: Page*): Self = this.set("pages", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[Page]): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    
    @scala.inline
    def setPostData(value: String): Self = this.set("postData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostData: Self = this.set("postData", js.undefined)
    
    @scala.inline
    def setReporter(value: String): Self = this.set("reporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    
    @scala.inline
    def setRootElement(value: String): Self = this.set("rootElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootElement: Self = this.set("rootElement", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: String*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[String]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setRunnersVarargs(value: String*): Self = this.set("runners", js.Array(value :_*))
    
    @scala.inline
    def setRunners(value: js.Array[String]): Self = this.set("runners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunners: Self = this.set("runners", js.undefined)
    
    @scala.inline
    def setScreenCapture(value: String): Self = this.set("screenCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenCapture: Self = this.set("screenCapture", js.undefined)
    
    @scala.inline
    def setStandard(value: AccessibilityStandard): Self = this.set("standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandard: Self = this.set("standard", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
    
    @scala.inline
    def setViewport(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Viewport */ js.Any
    ): Self = this.set("viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
    
    @scala.inline
    def setWait(value: Double): Self = this.set("wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
}
