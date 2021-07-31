package typings.pa11y

import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(url: String): js.Promise[Results] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Results]]
  @scala.inline
  def apply(url: String, options: Options): js.Promise[Results] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Results]]
  
  @JSImport("pa11y", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isValidAction(action: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidAction")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.pa11y.pa11yStrings.Section508
    - typings.pa11y.pa11yStrings.WCAG2A
    - typings.pa11y.pa11yStrings.WCAG2AA
    - typings.pa11y.pa11yStrings.WCAG2AAA
  */
  trait AccessibilityStandard extends StObject
  object AccessibilityStandard {
    
    @scala.inline
    def Section508: typings.pa11y.pa11yStrings.Section508 = "Section508".asInstanceOf[typings.pa11y.pa11yStrings.Section508]
    
    @scala.inline
    def WCAG2A: typings.pa11y.pa11yStrings.WCAG2A = "WCAG2A".asInstanceOf[typings.pa11y.pa11yStrings.WCAG2A]
    
    @scala.inline
    def WCAG2AA: typings.pa11y.pa11yStrings.WCAG2AA = "WCAG2AA".asInstanceOf[typings.pa11y.pa11yStrings.WCAG2AA]
    
    @scala.inline
    def WCAG2AAA: typings.pa11y.pa11yStrings.WCAG2AAA = "WCAG2AAA".asInstanceOf[typings.pa11y.pa11yStrings.WCAG2AAA]
  }
  
  trait LaunchConfig extends StObject {
    
    var executablePath: String
    
    var ignoreHTTPSErrors: Boolean
  }
  object LaunchConfig {
    
    @scala.inline
    def apply(executablePath: String, ignoreHTTPSErrors: Boolean): LaunchConfig = {
      val __obj = js.Dynamic.literal(executablePath = executablePath.asInstanceOf[js.Any], ignoreHTTPSErrors = ignoreHTTPSErrors.asInstanceOf[js.Any])
      __obj.asInstanceOf[LaunchConfig]
    }
    
    @scala.inline
    implicit class LaunchConfigMutableBuilder[Self <: LaunchConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreHTTPSErrors(value: Boolean): Self = StObject.set(x, "ignoreHTTPSErrors", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogConfig extends StObject {
    
    var debug: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var info: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object LogConfig {
    
    @scala.inline
    def apply(): LogConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogConfig]
    }
    
    @scala.inline
    implicit class LogConfigMutableBuilder[Self <: LogConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: () => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setError(value: () => Unit): Self = StObject.set(x, "error", js.Any.fromFunction0(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInfo(value: () => Unit): Self = StObject.set(x, "info", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var actions: js.UndefOr[js.Array[String]] = js.undefined
    
    var browser: js.UndefOr[Browser] = js.undefined
    
    var chromeLaunchConfig: js.UndefOr[LaunchConfig] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var hideElements: js.UndefOr[String] = js.undefined
    
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreUrl: js.UndefOr[Boolean] = js.undefined
    
    var includeNotices: js.UndefOr[Boolean] = js.undefined
    
    var includeWarnings: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var log: js.UndefOr[LogConfig] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var page: js.UndefOr[Page] = js.undefined
    
    var pages: js.UndefOr[js.Array[Page]] = js.undefined
    
    var postData: js.UndefOr[String] = js.undefined
    
    var reporter: js.UndefOr[String] = js.undefined
    
    var rootElement: js.UndefOr[String] = js.undefined
    
    var rules: js.UndefOr[js.Array[String]] = js.undefined
    
    var runners: js.UndefOr[js.Array[String]] = js.undefined
    
    var screenCapture: js.UndefOr[String] = js.undefined
    
    var standard: js.UndefOr[AccessibilityStandard] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
    
    var viewport: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Viewport */ js.Any
      ] = js.undefined
    
    @JSName("wait")
    var wait_FOptions: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setBrowser(value: Browser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      @scala.inline
      def setChromeLaunchConfig(value: LaunchConfig): Self = StObject.set(x, "chromeLaunchConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromeLaunchConfigUndefined: Self = StObject.set(x, "chromeLaunchConfig", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHideElements(value: String): Self = StObject.set(x, "hideElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideElementsUndefined: Self = StObject.set(x, "hideElements", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreUrl(value: Boolean): Self = StObject.set(x, "ignoreUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUrlUndefined: Self = StObject.set(x, "ignoreUrl", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setIncludeNotices(value: Boolean): Self = StObject.set(x, "includeNotices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeNoticesUndefined: Self = StObject.set(x, "includeNotices", js.undefined)
      
      @scala.inline
      def setIncludeWarnings(value: Boolean): Self = StObject.set(x, "includeWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeWarningsUndefined: Self = StObject.set(x, "includeWarnings", js.undefined)
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setLog(value: LogConfig): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPage(value: Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setPages(value: js.Array[Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      @scala.inline
      def setPagesVarargs(value: Page*): Self = StObject.set(x, "pages", js.Array(value :_*))
      
      @scala.inline
      def setPostData(value: String): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
      
      @scala.inline
      def setReporter(value: String): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      @scala.inline
      def setRootElement(value: String): Self = StObject.set(x, "rootElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootElementUndefined: Self = StObject.set(x, "rootElement", js.undefined)
      
      @scala.inline
      def setRules(value: js.Array[String]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setRulesVarargs(value: String*): Self = StObject.set(x, "rules", js.Array(value :_*))
      
      @scala.inline
      def setRunners(value: js.Array[String]): Self = StObject.set(x, "runners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunnersUndefined: Self = StObject.set(x, "runners", js.undefined)
      
      @scala.inline
      def setRunnersVarargs(value: String*): Self = StObject.set(x, "runners", js.Array(value :_*))
      
      @scala.inline
      def setScreenCapture(value: String): Self = StObject.set(x, "screenCapture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenCaptureUndefined: Self = StObject.set(x, "screenCapture", js.undefined)
      
      @scala.inline
      def setStandard(value: AccessibilityStandard): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandardUndefined: Self = StObject.set(x, "standard", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      @scala.inline
      def setViewport(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Viewport */ js.Any
      ): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
      
      @scala.inline
      def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  trait ResultIssue extends StObject {
    
    var code: String
    
    var context: String
    
    var message: String
    
    var selector: String
    
    var `type`: String
    
    var typeCode: Double
  }
  object ResultIssue {
    
    @scala.inline
    def apply(code: String, context: String, message: String, selector: String, `type`: String, typeCode: Double): ResultIssue = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], typeCode = typeCode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultIssue]
    }
    
    @scala.inline
    implicit class ResultIssueMutableBuilder[Self <: ResultIssue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeCode(value: Double): Self = StObject.set(x, "typeCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Results extends StObject {
    
    var documentTitle: String
    
    var issues: js.Array[ResultIssue]
    
    var pageUrl: String
  }
  object Results {
    
    @scala.inline
    def apply(documentTitle: String, issues: js.Array[ResultIssue], pageUrl: String): Results = {
      val __obj = js.Dynamic.literal(documentTitle = documentTitle.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], pageUrl = pageUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    @scala.inline
    implicit class ResultsMutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocumentTitle(value: String): Self = StObject.set(x, "documentTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssues(value: js.Array[ResultIssue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuesVarargs(value: ResultIssue*): Self = StObject.set(x, "issues", js.Array(value :_*))
      
      @scala.inline
      def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
    }
  }
}
