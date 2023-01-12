package typings.mochawesome

import typings.mocha.Mocha.Runner
import typings.mochawesome.anon.OptionsVersion
import typings.mochawesome.anon.PartialReporterOptions
import typings.mochawesome.anon.Version
import typings.mochawesome.mochawesomeStrings.failed
import typings.mochawesome.mochawesomeStrings.fast
import typings.mochawesome.mochawesomeStrings.medium
import typings.mochawesome.mochawesomeStrings.passed
import typings.mochawesome.mochawesomeStrings.slow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This class is used to create a new Mochawesome reporter
    * instance to be used with `mochawesome-report-generator` to
    * generate visual reports based off of Mocha test data.
    */
  @JSImport("mochawesome", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Mochawesome {
    /**
      * Initialize a new reporter.
      *
      * @api public
      */
    def this(runner: Runner) = this()
    def this(runner: Runner, options: Options) = this()
    
    /**
      * The parsed configuration options for this
      * Mochawesome instance.
      */
    /* CompleteClass */
    var config: Config = js.native
    
    /* CompleteClass */
    override def done(failures: Double, exit: ExitFunction): js.Promise[Unit] = js.native
    /* CompleteClass */
    @JSName("done")
    var done_Original: Done = js.native
  }
  
  trait Config extends StObject {
    
    var code: Boolean
    
    var consoleReporter: String
    
    var quiet: Boolean
    
    var reportFilename: String
    
    var saveHtml: Boolean
    
    var saveJson: Boolean
    
    var useInlineDiffs: Boolean
  }
  object Config {
    
    inline def apply(
      code: Boolean,
      consoleReporter: String,
      quiet: Boolean,
      reportFilename: String,
      saveHtml: Boolean,
      saveJson: Boolean,
      useInlineDiffs: Boolean
    ): Config = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], consoleReporter = consoleReporter.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], reportFilename = reportFilename.asInstanceOf[js.Any], saveHtml = saveHtml.asInstanceOf[js.Any], saveJson = saveJson.asInstanceOf[js.Any], useInlineDiffs = useInlineDiffs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setConsoleReporter(value: String): Self = StObject.set(x, "consoleReporter", value.asInstanceOf[js.Any])
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setReportFilename(value: String): Self = StObject.set(x, "reportFilename", value.asInstanceOf[js.Any])
      
      inline def setSaveHtml(value: Boolean): Self = StObject.set(x, "saveHtml", value.asInstanceOf[js.Any])
      
      inline def setSaveJson(value: Boolean): Self = StObject.set(x, "saveJson", value.asInstanceOf[js.Any])
      
      inline def setUseInlineDiffs(value: Boolean): Self = StObject.set(x, "useInlineDiffs", value.asInstanceOf[js.Any])
    }
  }
  
  type Done = js.Function2[/* failures */ Double, /* exit */ ExitFunction, js.Promise[Unit]]
  
  type ExitFunction = js.Function1[/* code */ Double, Unit]
  
  /**
    * This class is used to create a new Mochawesome reporter
    * instance to be used with `mochawesome-report-generator` to
    * generate visual reports based off of Mocha test data.
    */
  trait Mochawesome extends StObject {
    
    /**
      * The parsed configuration options for this
      * Mochawesome instance.
      */
    var config: Config
    
    def done(failures: Double, exit: ExitFunction): js.Promise[Unit]
    @JSName("done")
    var done_Original: Done
    
    /**
      * Information related to the results of the test
      * suite ran by the supplied `Mocha.Runner` instance.
      * Will be populated after the suite is run.
      */
    var output: js.UndefOr[Output] = js.undefined
  }
  object Mochawesome {
    
    inline def apply(config: Config, done: (/* failures */ Double, /* exit */ ExitFunction) => js.Promise[Unit]): Mochawesome = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], done = js.Any.fromFunction2(done))
      __obj.asInstanceOf[Mochawesome]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mochawesome] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDone(value: (/* failures */ Double, /* exit */ ExitFunction) => js.Promise[Unit]): Self = StObject.set(x, "done", js.Any.fromFunction2(value))
      
      inline def setOutput(value: Output): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var inlineDiffs: js.UndefOr[Boolean] = js.undefined
    
    var reporterOptions: js.UndefOr[PartialReporterOptions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setInlineDiffs(value: Boolean): Self = StObject.set(x, "inlineDiffs", value.asInstanceOf[js.Any])
      
      inline def setInlineDiffsUndefined: Self = StObject.set(x, "inlineDiffs", js.undefined)
      
      inline def setReporterOptions(value: PartialReporterOptions): Self = StObject.set(x, "reporterOptions", value.asInstanceOf[js.Any])
      
      inline def setReporterOptionsUndefined: Self = StObject.set(x, "reporterOptions", js.undefined)
    }
  }
  
  trait Output extends StObject {
    
    var meta: OutputMeta
    
    var results: OutputResults
    
    var stats: OutputStats
  }
  object Output {
    
    inline def apply(meta: OutputMeta, results: OutputResults, stats: OutputStats): Output = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      inline def setMeta(value: OutputMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setResults(value: OutputResults): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: PlainSuite*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setStats(value: OutputStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Metadata about the versions and configuration of
    * the current `mocha`, `mochawesome` and `marge`
    * (`mochawesome-report-generator`) packages.
    */
  trait OutputMeta extends StObject {
    
    var marge: OptionsVersion
    
    var mocha: Version
    
    var mochawesome: typings.mochawesome.anon.Options
  }
  object OutputMeta {
    
    inline def apply(marge: OptionsVersion, mocha: Version, mochawesome: typings.mochawesome.anon.Options): OutputMeta = {
      val __obj = js.Dynamic.literal(marge = marge.asInstanceOf[js.Any], mocha = mocha.asInstanceOf[js.Any], mochawesome = mochawesome.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OutputMeta] (val x: Self) extends AnyVal {
      
      inline def setMarge(value: OptionsVersion): Self = StObject.set(x, "marge", value.asInstanceOf[js.Any])
      
      inline def setMocha(value: Version): Self = StObject.set(x, "mocha", value.asInstanceOf[js.Any])
      
      inline def setMochawesome(value: typings.mochawesome.anon.Options): Self = StObject.set(x, "mochawesome", value.asInstanceOf[js.Any])
    }
  }
  
  type OutputResults = js.Array[PlainSuite]
  
  /**
    * Test run statistics
    */
  trait OutputStats
    extends StObject
       with typings.mocha.Mocha.Stats
       with Stats
  object OutputStats {
    
    inline def apply(
      failures: Double,
      hasOther: Boolean,
      hasSkipped: Boolean,
      other: Double,
      passPercent: Double,
      passes: Double,
      pending: Double,
      pendingPercent: Double,
      skipped: Double,
      suites: Double,
      tests: Double,
      testsRegistered: Double
    ): OutputStats = {
      val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any], hasOther = hasOther.asInstanceOf[js.Any], hasSkipped = hasSkipped.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], passPercent = passPercent.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pendingPercent = pendingPercent.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], suites = suites.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any], testsRegistered = testsRegistered.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputStats]
    }
  }
  
  /**
    * Plain JS object representation of `Mocha.Suite`,
    * stripped of methods and circular references.
    */
  trait PlainSuite extends StObject {
    
    var _timeout: Double
    
    var afterHooks: js.Array[PlainTest]
    
    var beforeHooks: js.Array[PlainTest]
    
    var duration: Double
    
    var failures: js.Array[String]
    
    var file: String
    
    var fullFile: String
    
    var passes: js.Array[String]
    
    var pending: js.Array[String]
    
    var root: Boolean
    
    var rootEmpty: Boolean
    
    var skipped: js.Array[String]
    
    var suites: js.Array[PlainSuite]
    
    var tests: js.Array[PlainTest]
    
    var title: String
    
    var uuid: String
  }
  object PlainSuite {
    
    inline def apply(
      _timeout: Double,
      afterHooks: js.Array[PlainTest],
      beforeHooks: js.Array[PlainTest],
      duration: Double,
      failures: js.Array[String],
      file: String,
      fullFile: String,
      passes: js.Array[String],
      pending: js.Array[String],
      root: Boolean,
      rootEmpty: Boolean,
      skipped: js.Array[String],
      suites: js.Array[PlainSuite],
      tests: js.Array[PlainTest],
      title: String,
      uuid: String
    ): PlainSuite = {
      val __obj = js.Dynamic.literal(_timeout = _timeout.asInstanceOf[js.Any], afterHooks = afterHooks.asInstanceOf[js.Any], beforeHooks = beforeHooks.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fullFile = fullFile.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], rootEmpty = rootEmpty.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], suites = suites.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlainSuite]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlainSuite] (val x: Self) extends AnyVal {
      
      inline def setAfterHooks(value: js.Array[PlainTest]): Self = StObject.set(x, "afterHooks", value.asInstanceOf[js.Any])
      
      inline def setAfterHooksVarargs(value: PlainTest*): Self = StObject.set(x, "afterHooks", js.Array(value*))
      
      inline def setBeforeHooks(value: js.Array[PlainTest]): Self = StObject.set(x, "beforeHooks", value.asInstanceOf[js.Any])
      
      inline def setBeforeHooksVarargs(value: PlainTest*): Self = StObject.set(x, "beforeHooks", js.Array(value*))
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setFailures(value: js.Array[String]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
      
      inline def setFailuresVarargs(value: String*): Self = StObject.set(x, "failures", js.Array(value*))
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFullFile(value: String): Self = StObject.set(x, "fullFile", value.asInstanceOf[js.Any])
      
      inline def setPasses(value: js.Array[String]): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
      
      inline def setPassesVarargs(value: String*): Self = StObject.set(x, "passes", js.Array(value*))
      
      inline def setPending(value: js.Array[String]): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setPendingVarargs(value: String*): Self = StObject.set(x, "pending", js.Array(value*))
      
      inline def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootEmpty(value: Boolean): Self = StObject.set(x, "rootEmpty", value.asInstanceOf[js.Any])
      
      inline def setSkipped(value: js.Array[String]): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
      
      inline def setSkippedVarargs(value: String*): Self = StObject.set(x, "skipped", js.Array(value*))
      
      inline def setSuites(value: js.Array[PlainSuite]): Self = StObject.set(x, "suites", value.asInstanceOf[js.Any])
      
      inline def setSuitesVarargs(value: PlainSuite*): Self = StObject.set(x, "suites", js.Array(value*))
      
      inline def setTests(value: js.Array[PlainTest]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      inline def setTestsVarargs(value: PlainTest*): Self = StObject.set(x, "tests", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def set_timeout(value: Double): Self = StObject.set(x, "_timeout", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Plain JS object representation of `Mocha.Test`,
    * stripped of methods and circular references.
    */
  trait PlainTest extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var err: TestError | js.Object
    
    var fail: Boolean
    
    var fullTitle: String
    
    var isHook: Boolean
    
    var parentUUID: js.UndefOr[String] = js.undefined
    
    var pass: Boolean
    
    var pending: Boolean
    
    var skipped: Boolean
    
    var speed: js.UndefOr[slow | medium | fast] = js.undefined
    
    var state: js.UndefOr[failed | passed] = js.undefined
    
    var timedOut: Boolean
    
    var title: String
    
    var uuid: String
  }
  object PlainTest {
    
    inline def apply(
      err: TestError | js.Object,
      fail: Boolean,
      fullTitle: String,
      isHook: Boolean,
      pass: Boolean,
      pending: Boolean,
      skipped: Boolean,
      timedOut: Boolean,
      title: String,
      uuid: String
    ): PlainTest = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], fail = fail.asInstanceOf[js.Any], fullTitle = fullTitle.asInstanceOf[js.Any], isHook = isHook.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlainTest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PlainTest] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setErr(value: TestError | js.Object): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setFail(value: Boolean): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
      
      inline def setFullTitle(value: String): Self = StObject.set(x, "fullTitle", value.asInstanceOf[js.Any])
      
      inline def setIsHook(value: Boolean): Self = StObject.set(x, "isHook", value.asInstanceOf[js.Any])
      
      inline def setParentUUID(value: String): Self = StObject.set(x, "parentUUID", value.asInstanceOf[js.Any])
      
      inline def setParentUUIDUndefined: Self = StObject.set(x, "parentUUID", js.undefined)
      
      inline def setPass(value: Boolean): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
      
      inline def setSkipped(value: Boolean): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
      
      inline def setSpeed(value: slow | medium | fast): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setState(value: failed | passed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTimedOut(value: Boolean): Self = StObject.set(x, "timedOut", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReporterOptions extends StObject {
    
    var code: Boolean
    
    var consoleReporter: String
    
    var html: Boolean
    
    var json: Boolean
    
    var `no-code`: Boolean
    
    var quiet: Boolean
    
    var reportFilename: String
  }
  object ReporterOptions {
    
    inline def apply(
      code: Boolean,
      consoleReporter: String,
      html: Boolean,
      json: Boolean,
      `no-code`: Boolean,
      quiet: Boolean,
      reportFilename: String
    ): ReporterOptions = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], consoleReporter = consoleReporter.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], reportFilename = reportFilename.asInstanceOf[js.Any])
      __obj.updateDynamic("no-code")(`no-code`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReporterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReporterOptions] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setConsoleReporter(value: String): Self = StObject.set(x, "consoleReporter", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def `setNo-code`(value: Boolean): Self = StObject.set(x, "no-code", value.asInstanceOf[js.Any])
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setReportFilename(value: String): Self = StObject.set(x, "reportFilename", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stats extends StObject {
    
    var hasOther: Boolean
    
    var hasSkipped: Boolean
    
    var other: Double
    
    var passPercent: Double
    
    var pendingPercent: Double
    
    var skipped: Double
    
    var testsRegistered: Double
  }
  object Stats {
    
    inline def apply(
      hasOther: Boolean,
      hasSkipped: Boolean,
      other: Double,
      passPercent: Double,
      pendingPercent: Double,
      skipped: Double,
      testsRegistered: Double
    ): Stats = {
      val __obj = js.Dynamic.literal(hasOther = hasOther.asInstanceOf[js.Any], hasSkipped = hasSkipped.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], passPercent = passPercent.asInstanceOf[js.Any], pendingPercent = pendingPercent.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], testsRegistered = testsRegistered.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
      
      inline def setHasOther(value: Boolean): Self = StObject.set(x, "hasOther", value.asInstanceOf[js.Any])
      
      inline def setHasSkipped(value: Boolean): Self = StObject.set(x, "hasSkipped", value.asInstanceOf[js.Any])
      
      inline def setOther(value: Double): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setPassPercent(value: Double): Self = StObject.set(x, "passPercent", value.asInstanceOf[js.Any])
      
      inline def setPendingPercent(value: Double): Self = StObject.set(x, "pendingPercent", value.asInstanceOf[js.Any])
      
      inline def setSkipped(value: Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
      
      inline def setTestsRegistered(value: Double): Self = StObject.set(x, "testsRegistered", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestError extends StObject {
    
    var diff: String | js.Array[String]
    
    var estack: js.UndefOr[String] = js.undefined
    
    var message: String
  }
  object TestError {
    
    inline def apply(diff: String | js.Array[String], message: String): TestError = {
      val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestError] (val x: Self) extends AnyVal {
      
      inline def setDiff(value: String | js.Array[String]): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
      
      inline def setDiffVarargs(value: String*): Self = StObject.set(x, "diff", js.Array(value*))
      
      inline def setEstack(value: String): Self = StObject.set(x, "estack", value.asInstanceOf[js.Any])
      
      inline def setEstackUndefined: Self = StObject.set(x, "estack", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
