package typings.nightwatch.mod

import typings.nightwatch.anon.Cliargs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchOptions extends StObject {
  
  /**
    * Location(s) where custom assertions will be loaded from.
    */
  var custom_assertions_path: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Location(s) where custom commands will be loaded from.
    */
  var custom_commands_path: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Controls whether or not to disable coloring of the cli output globally.
    */
  var disable_color: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Location of an external globals module which will be loaded and made available to the test as a property globals on the main client instance.
    * Globals can also be defined/overwritten inside a test_settings environment.
    */
  var globals_path: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not to buffer the output in case of parallel running. See below for details.
    */
  var live_output: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The location where the JUnit XML report files will be saved.
    */
  var output_folder: js.UndefOr[String] = js.undefined
  
  /**
    * Location(s) where page object files will be loaded from.
    */
  var page_objects_path: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Specifies the delay(in milliseconds) between starting the child processes when running in parallel mode.
    */
  var parallel_process_delay: js.UndefOr[Double] = js.undefined
  
  /**
    * An object containing Selenium Server related configuration options. See below for details.
    */
  var selenium: js.UndefOr[NightwatchSeleniumOptions] = js.undefined
  
  /**
    * An array of folders (excluding subfolders) where the tests are located.
    */
  var src_folders: String | js.Array[String]
  
  /**
    * Specifies which test runner to use when running the tests. Values can be either default (built in nightwatch runner) or mocha.
    * Example: "test_runner" : {"type" : "mocha", "options" : {"ui" : "tdd"}}
    */
  var test_runner: js.UndefOr[String | NightwatchTestRunner] = js.undefined
  
  /**
    * This object contains all the test related options. See below for details.
    */
  var test_settings: NightwatchTestSettings
  
  /**
    * Whether or not to run individual test files in parallel. If set to true, runs the tests in parallel and determines the number of workers automatically.
    * If set to an object, can specify specify the number of workers as "auto" or a number. Example: "test_workers" : {"enabled" : true, "workers" : "auto"}
    */
  var test_workers: js.UndefOr[Boolean | NightwatchTestWorker] = js.undefined
  
  /**
    * Allows for webdriver config (mostly the same as selenium)
    */
  var webdriver: js.UndefOr[Cliargs] = js.undefined
}
object NightwatchOptions {
  
  @scala.inline
  def apply(src_folders: String | js.Array[String], test_settings: NightwatchTestSettings): NightwatchOptions = {
    val __obj = js.Dynamic.literal(src_folders = src_folders.asInstanceOf[js.Any], test_settings = test_settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchOptions]
  }
  
  @scala.inline
  implicit class NightwatchOptionsMutableBuilder[Self <: NightwatchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom_assertions_path(value: String | js.Array[String]): Self = StObject.set(x, "custom_assertions_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_assertions_pathUndefined: Self = StObject.set(x, "custom_assertions_path", js.undefined)
    
    @scala.inline
    def setCustom_assertions_pathVarargs(value: String*): Self = StObject.set(x, "custom_assertions_path", js.Array(value :_*))
    
    @scala.inline
    def setCustom_commands_path(value: String | js.Array[String]): Self = StObject.set(x, "custom_commands_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_commands_pathUndefined: Self = StObject.set(x, "custom_commands_path", js.undefined)
    
    @scala.inline
    def setCustom_commands_pathVarargs(value: String*): Self = StObject.set(x, "custom_commands_path", js.Array(value :_*))
    
    @scala.inline
    def setDisable_color(value: Boolean): Self = StObject.set(x, "disable_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_colorUndefined: Self = StObject.set(x, "disable_color", js.undefined)
    
    @scala.inline
    def setGlobals_path(value: String): Self = StObject.set(x, "globals_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobals_pathUndefined: Self = StObject.set(x, "globals_path", js.undefined)
    
    @scala.inline
    def setLive_output(value: Boolean): Self = StObject.set(x, "live_output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLive_outputUndefined: Self = StObject.set(x, "live_output", js.undefined)
    
    @scala.inline
    def setOutput_folder(value: String): Self = StObject.set(x, "output_folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput_folderUndefined: Self = StObject.set(x, "output_folder", js.undefined)
    
    @scala.inline
    def setPage_objects_path(value: String | js.Array[String]): Self = StObject.set(x, "page_objects_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_objects_pathUndefined: Self = StObject.set(x, "page_objects_path", js.undefined)
    
    @scala.inline
    def setPage_objects_pathVarargs(value: String*): Self = StObject.set(x, "page_objects_path", js.Array(value :_*))
    
    @scala.inline
    def setParallel_process_delay(value: Double): Self = StObject.set(x, "parallel_process_delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallel_process_delayUndefined: Self = StObject.set(x, "parallel_process_delay", js.undefined)
    
    @scala.inline
    def setSelenium(value: NightwatchSeleniumOptions): Self = StObject.set(x, "selenium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeleniumUndefined: Self = StObject.set(x, "selenium", js.undefined)
    
    @scala.inline
    def setSrc_folders(value: String | js.Array[String]): Self = StObject.set(x, "src_folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc_foldersVarargs(value: String*): Self = StObject.set(x, "src_folders", js.Array(value :_*))
    
    @scala.inline
    def setTest_runner(value: String | NightwatchTestRunner): Self = StObject.set(x, "test_runner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest_runnerUndefined: Self = StObject.set(x, "test_runner", js.undefined)
    
    @scala.inline
    def setTest_settings(value: NightwatchTestSettings): Self = StObject.set(x, "test_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest_workers(value: Boolean | NightwatchTestWorker): Self = StObject.set(x, "test_workers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest_workersUndefined: Self = StObject.set(x, "test_workers", js.undefined)
    
    @scala.inline
    def setWebdriver(value: Cliargs): Self = StObject.set(x, "webdriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebdriverUndefined: Self = StObject.set(x, "webdriver", js.undefined)
  }
}
