package typings.nightwatch.mod

import typings.nightwatch.anon.Accesskey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchOptions extends StObject {
  
  /**
    * Set this to true to use the v1.x response format for commands when using ES6 async/await
    * @default false
    */
  var backwards_compatibility_mode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Location(s) where custom assertions will be loaded from.
    */
  var custom_assertions_path: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Location(s) where custom commands will be loaded from.
    */
  var custom_commands_path: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * @default junit
    */
  var default_reporter: js.UndefOr[String] = js.undefined
  
  /**
    * Controls whether or not to disable coloring of the cli output globally.
    */
  var disable_colors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set this to true to disable the global objects such as element(), browser, by(), expect()
    */
  var disable_global_apis: js.UndefOr[Boolean] = js.undefined
  
  /**
    * disable support of loading of typescript files for backwards compatibility with test suites.
    */
  var disable_typescript: js.UndefOr[Boolean] = js.undefined
  
  /**
    * configuration settings for the dotenv module - a zero-dependency module that loads environment variables from a .env file into process.env. More details on https://www.npmjs.com/package/dotenv
    */
  var dotenv: js.UndefOr[Any] = js.undefined
  
  /**
    * Interactive element commands such as "click" or "setValue" can be retried
    * if an error occurred (such as an "element not interactable" error)
    */
  var element_command_retries: js.UndefOr[Double] = js.undefined
  
  /**
    * End the session automatically when the test is being terminated, usually after a failed assertion.
    * @default true
    */
  var end_session_on_fail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of folders or file patterns to be skipped (relative to the main source folder).
    * @example
    * "exclude" : ["excluded-folder"]
    * or:
    * "exclude" : ["test-folder/ *-smoke.js"]
    */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Folder or file pattern to be used when loading the tests. Files that don't match this pattern will be ignored
    * @example
    * "filter" : "tests/ *-smoke.js"
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * An object which will be made available on the main test api, throughout the test execution.
    */
  var globals: js.UndefOr[NightwatchGlobals] = js.undefined
  
  /**
    * Location of an external globals module which will be loaded and made available to the test as a property globals on the main client instance.
    * Globals can also be defined/overwritten inside a test_settings environment.
    */
  var globals_path: js.UndefOr[String] = js.undefined
  
  /**
    * Used when running in parallel to determine if the output should be collected and displayed at the end.
    */
  var live_output: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The location where the JUnit XML report files will be saved. Set this to false if you want to disable XML reporting.
    */
  var output_folder: js.UndefOr[String] = js.undefined
  
  /**
    * Location(s) where page object files will be loaded from.
    */
  var page_objects_path: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var parallel_mode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used when running in parallel to specify the delay (in milliseconds) between starting the child processes
    */
  var parallel_process_delay: js.UndefOr[Double] = js.undefined
  
  /**
    * persist the same globals object between runs or have a (deep) copy of it per each test;
    * this can be useful when persisting data between test suites is needed, such as a cookie or session information.
    * @default false
    */
  var persist_globals: js.UndefOr[Boolean] = js.undefined
  
  // An array specifying a list of Nightwatch plugin names that should be used;
  // e.g.: plugins: ['vite-plugin-nightwatch']
  var plugins: js.Array[String]
  
  /**
    * Ignore network errors (e.g. ECONNRESET errors)
    */
  var report_network_errors: js.UndefOr[Boolean] = js.undefined
  
  var report_prefix: js.UndefOr[String] = js.undefined
  
  /**
    * An object containing Selenium Server related configuration options. See below for details.
    */
  var selenium: js.UndefOr[NightwatchSeleniumOptions] = js.undefined
  
  /**
    * Skip the remaining test cases from the current test suite, when one test case fails.
    */
  var skip_testcases_on_fail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Skip a group of tests (a subfolder); can be a list of comma-separated values (no space).
    */
  var skipgroup: js.UndefOr[String] = js.undefined
  
  /**
    * Skip tests by tag name; can be a list of comma-separated values (no space).
    */
  var skiptags: js.UndefOr[String] = js.undefined
  
  /**
    * An array of folders (excluding subfolders) where the tests are located.
    */
  var src_folders: String | js.Array[String]
  
  /**
    * Whether or not to automatically start the Selenium/WebDriver session. If running unit tests, this should be set tot false.
    * @default true
    */
  var start_process: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A name property will be added to the desiredCapabilities containing the test suite name when this is enabled. It is useful when using cloud testing services.
    */
  var sync_test_names: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies which test runner to use when running the tests. Values can be either default (built in nightwatch runner) or mocha.
    * Example: "test_runner" : {"type" : "mocha", "options" : {"ui" : "tdd"}}
    * @default 'default'
    */
  var test_runner: js.UndefOr[String | NightwatchTestRunner] = js.undefined
  
  /**
    * This object contains all the test related options. See below for details.
    */
  var test_settings: NightwatchTestSettings
  
  /**
    * Whether or not to run individual test files in parallel. If set to true, runs the tests in parallel and determines the number of workers automatically.
    * If set to an object, can specify specify the number of workers as "auto" or a number. Example: "test_workers" : {"enabled" : true, "workers" : "auto"}
    * @default false
    */
  var test_workers: js.UndefOr[Boolean | NightwatchTestWorker] = js.undefined
  
  var unit_testing_mode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use xpath as the default locator strategy.
    */
  var use_xpath: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows for webdriver config (mostly the same as selenium)
    */
  var webdriver: js.UndefOr[Accesskey] = js.undefined
  
  /**
    * Sets the initial window size: {height: number, width: number}
    */
  var window_size: js.UndefOr[WindowSize] = js.undefined
}
object NightwatchOptions {
  
  inline def apply(
    plugins: js.Array[String],
    src_folders: String | js.Array[String],
    test_settings: NightwatchTestSettings
  ): NightwatchOptions = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any], src_folders = src_folders.asInstanceOf[js.Any], test_settings = test_settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NightwatchOptions] (val x: Self) extends AnyVal {
    
    inline def setBackwards_compatibility_mode(value: Boolean): Self = StObject.set(x, "backwards_compatibility_mode", value.asInstanceOf[js.Any])
    
    inline def setBackwards_compatibility_modeUndefined: Self = StObject.set(x, "backwards_compatibility_mode", js.undefined)
    
    inline def setCustom_assertions_path(value: String | js.Array[String]): Self = StObject.set(x, "custom_assertions_path", value.asInstanceOf[js.Any])
    
    inline def setCustom_assertions_pathUndefined: Self = StObject.set(x, "custom_assertions_path", js.undefined)
    
    inline def setCustom_assertions_pathVarargs(value: String*): Self = StObject.set(x, "custom_assertions_path", js.Array(value*))
    
    inline def setCustom_commands_path(value: String | js.Array[String]): Self = StObject.set(x, "custom_commands_path", value.asInstanceOf[js.Any])
    
    inline def setCustom_commands_pathUndefined: Self = StObject.set(x, "custom_commands_path", js.undefined)
    
    inline def setCustom_commands_pathVarargs(value: String*): Self = StObject.set(x, "custom_commands_path", js.Array(value*))
    
    inline def setDefault_reporter(value: String): Self = StObject.set(x, "default_reporter", value.asInstanceOf[js.Any])
    
    inline def setDefault_reporterUndefined: Self = StObject.set(x, "default_reporter", js.undefined)
    
    inline def setDisable_colors(value: Boolean): Self = StObject.set(x, "disable_colors", value.asInstanceOf[js.Any])
    
    inline def setDisable_colorsUndefined: Self = StObject.set(x, "disable_colors", js.undefined)
    
    inline def setDisable_global_apis(value: Boolean): Self = StObject.set(x, "disable_global_apis", value.asInstanceOf[js.Any])
    
    inline def setDisable_global_apisUndefined: Self = StObject.set(x, "disable_global_apis", js.undefined)
    
    inline def setDisable_typescript(value: Boolean): Self = StObject.set(x, "disable_typescript", value.asInstanceOf[js.Any])
    
    inline def setDisable_typescriptUndefined: Self = StObject.set(x, "disable_typescript", js.undefined)
    
    inline def setDotenv(value: Any): Self = StObject.set(x, "dotenv", value.asInstanceOf[js.Any])
    
    inline def setDotenvUndefined: Self = StObject.set(x, "dotenv", js.undefined)
    
    inline def setElement_command_retries(value: Double): Self = StObject.set(x, "element_command_retries", value.asInstanceOf[js.Any])
    
    inline def setElement_command_retriesUndefined: Self = StObject.set(x, "element_command_retries", js.undefined)
    
    inline def setEnd_session_on_fail(value: Boolean): Self = StObject.set(x, "end_session_on_fail", value.asInstanceOf[js.Any])
    
    inline def setEnd_session_on_failUndefined: Self = StObject.set(x, "end_session_on_fail", js.undefined)
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGlobals(value: NightwatchGlobals): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    inline def setGlobals_path(value: String): Self = StObject.set(x, "globals_path", value.asInstanceOf[js.Any])
    
    inline def setGlobals_pathUndefined: Self = StObject.set(x, "globals_path", js.undefined)
    
    inline def setLive_output(value: Boolean): Self = StObject.set(x, "live_output", value.asInstanceOf[js.Any])
    
    inline def setLive_outputUndefined: Self = StObject.set(x, "live_output", js.undefined)
    
    inline def setOutput_folder(value: String): Self = StObject.set(x, "output_folder", value.asInstanceOf[js.Any])
    
    inline def setOutput_folderUndefined: Self = StObject.set(x, "output_folder", js.undefined)
    
    inline def setPage_objects_path(value: String | js.Array[String]): Self = StObject.set(x, "page_objects_path", value.asInstanceOf[js.Any])
    
    inline def setPage_objects_pathUndefined: Self = StObject.set(x, "page_objects_path", js.undefined)
    
    inline def setPage_objects_pathVarargs(value: String*): Self = StObject.set(x, "page_objects_path", js.Array(value*))
    
    inline def setParallel_mode(value: Boolean): Self = StObject.set(x, "parallel_mode", value.asInstanceOf[js.Any])
    
    inline def setParallel_modeUndefined: Self = StObject.set(x, "parallel_mode", js.undefined)
    
    inline def setParallel_process_delay(value: Double): Self = StObject.set(x, "parallel_process_delay", value.asInstanceOf[js.Any])
    
    inline def setParallel_process_delayUndefined: Self = StObject.set(x, "parallel_process_delay", js.undefined)
    
    inline def setPersist_globals(value: Boolean): Self = StObject.set(x, "persist_globals", value.asInstanceOf[js.Any])
    
    inline def setPersist_globalsUndefined: Self = StObject.set(x, "persist_globals", js.undefined)
    
    inline def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setReport_network_errors(value: Boolean): Self = StObject.set(x, "report_network_errors", value.asInstanceOf[js.Any])
    
    inline def setReport_network_errorsUndefined: Self = StObject.set(x, "report_network_errors", js.undefined)
    
    inline def setReport_prefix(value: String): Self = StObject.set(x, "report_prefix", value.asInstanceOf[js.Any])
    
    inline def setReport_prefixUndefined: Self = StObject.set(x, "report_prefix", js.undefined)
    
    inline def setSelenium(value: NightwatchSeleniumOptions): Self = StObject.set(x, "selenium", value.asInstanceOf[js.Any])
    
    inline def setSeleniumUndefined: Self = StObject.set(x, "selenium", js.undefined)
    
    inline def setSkip_testcases_on_fail(value: Boolean): Self = StObject.set(x, "skip_testcases_on_fail", value.asInstanceOf[js.Any])
    
    inline def setSkip_testcases_on_failUndefined: Self = StObject.set(x, "skip_testcases_on_fail", js.undefined)
    
    inline def setSkipgroup(value: String): Self = StObject.set(x, "skipgroup", value.asInstanceOf[js.Any])
    
    inline def setSkipgroupUndefined: Self = StObject.set(x, "skipgroup", js.undefined)
    
    inline def setSkiptags(value: String): Self = StObject.set(x, "skiptags", value.asInstanceOf[js.Any])
    
    inline def setSkiptagsUndefined: Self = StObject.set(x, "skiptags", js.undefined)
    
    inline def setSrc_folders(value: String | js.Array[String]): Self = StObject.set(x, "src_folders", value.asInstanceOf[js.Any])
    
    inline def setSrc_foldersVarargs(value: String*): Self = StObject.set(x, "src_folders", js.Array(value*))
    
    inline def setStart_process(value: Boolean): Self = StObject.set(x, "start_process", value.asInstanceOf[js.Any])
    
    inline def setStart_processUndefined: Self = StObject.set(x, "start_process", js.undefined)
    
    inline def setSync_test_names(value: Boolean): Self = StObject.set(x, "sync_test_names", value.asInstanceOf[js.Any])
    
    inline def setSync_test_namesUndefined: Self = StObject.set(x, "sync_test_names", js.undefined)
    
    inline def setTest_runner(value: String | NightwatchTestRunner): Self = StObject.set(x, "test_runner", value.asInstanceOf[js.Any])
    
    inline def setTest_runnerUndefined: Self = StObject.set(x, "test_runner", js.undefined)
    
    inline def setTest_settings(value: NightwatchTestSettings): Self = StObject.set(x, "test_settings", value.asInstanceOf[js.Any])
    
    inline def setTest_workers(value: Boolean | NightwatchTestWorker): Self = StObject.set(x, "test_workers", value.asInstanceOf[js.Any])
    
    inline def setTest_workersUndefined: Self = StObject.set(x, "test_workers", js.undefined)
    
    inline def setUnit_testing_mode(value: Boolean): Self = StObject.set(x, "unit_testing_mode", value.asInstanceOf[js.Any])
    
    inline def setUnit_testing_modeUndefined: Self = StObject.set(x, "unit_testing_mode", js.undefined)
    
    inline def setUse_xpath(value: Boolean): Self = StObject.set(x, "use_xpath", value.asInstanceOf[js.Any])
    
    inline def setUse_xpathUndefined: Self = StObject.set(x, "use_xpath", js.undefined)
    
    inline def setWebdriver(value: Accesskey): Self = StObject.set(x, "webdriver", value.asInstanceOf[js.Any])
    
    inline def setWebdriverUndefined: Self = StObject.set(x, "webdriver", js.undefined)
    
    inline def setWindow_size(value: WindowSize): Self = StObject.set(x, "window_size", value.asInstanceOf[js.Any])
    
    inline def setWindow_sizeUndefined: Self = StObject.set(x, "window_size", js.undefined)
  }
}
