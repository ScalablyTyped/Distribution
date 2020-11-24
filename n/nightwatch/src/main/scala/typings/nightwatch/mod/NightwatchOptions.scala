package typings.nightwatch.mod

import typings.nightwatch.anon.Cliargs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchOptions extends js.Object {
  
  /**
    * Location(s) where custom assertions will be loaded from.
    */
  var custom_assertions_path: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Location(s) where custom commands will be loaded from.
    */
  var custom_commands_path: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Controls whether or not to disable coloring of the cli output globally.
    */
  var disable_color: js.UndefOr[Boolean] = js.native
  
  /**
    * Location of an external globals module which will be loaded and made available to the test as a property globals on the main client instance.
    * Globals can also be defined/overwritten inside a test_settings environment.
    */
  var globals_path: js.UndefOr[String] = js.native
  
  /**
    * Whether or not to buffer the output in case of parallel running. See below for details.
    */
  var live_output: js.UndefOr[Boolean] = js.native
  
  /**
    * The location where the JUnit XML report files will be saved.
    */
  var output_folder: js.UndefOr[String] = js.native
  
  /**
    * Location(s) where page object files will be loaded from.
    */
  var page_objects_path: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Specifies the delay(in milliseconds) between starting the child processes when running in parallel mode.
    */
  var parallel_process_delay: js.UndefOr[Double] = js.native
  
  /**
    * An object containing Selenium Server related configuration options. See below for details.
    */
  var selenium: js.UndefOr[NightwatchSeleniumOptions] = js.native
  
  /**
    * An array of folders (excluding subfolders) where the tests are located.
    */
  var src_folders: String | js.Array[String] = js.native
  
  /**
    * Specifies which test runner to use when running the tests. Values can be either default (built in nightwatch runner) or mocha.
    * Example: "test_runner" : {"type" : "mocha", "options" : {"ui" : "tdd"}}
    */
  var test_runner: js.UndefOr[String | NightwatchTestRunner] = js.native
  
  /**
    * This object contains all the test related options. See below for details.
    */
  var test_settings: NightwatchTestSettings = js.native
  
  /**
    * Whether or not to run individual test files in parallel. If set to true, runs the tests in parallel and determines the number of workers automatically.
    * If set to an object, can specify specify the number of workers as "auto" or a number. Example: "test_workers" : {"enabled" : true, "workers" : "auto"}
    */
  var test_workers: js.UndefOr[Boolean | NightwatchTestWorker] = js.native
  
  /**
    * Allows for webdriver config (mostly the same as selenium)
    */
  var webdriver: js.UndefOr[Cliargs] = js.native
}
object NightwatchOptions {
  
  @scala.inline
  def apply(src_folders: String | js.Array[String], test_settings: NightwatchTestSettings): NightwatchOptions = {
    val __obj = js.Dynamic.literal(src_folders = src_folders.asInstanceOf[js.Any], test_settings = test_settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchOptions]
  }
  
  @scala.inline
  implicit class NightwatchOptionsOps[Self <: NightwatchOptions] (val x: Self) extends AnyVal {
    
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
    def setSrc_foldersVarargs(value: String*): Self = this.set("src_folders", js.Array(value :_*))
    
    @scala.inline
    def setSrc_folders(value: String | js.Array[String]): Self = this.set("src_folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest_settings(value: NightwatchTestSettings): Self = this.set("test_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_assertions_pathVarargs(value: String*): Self = this.set("custom_assertions_path", js.Array(value :_*))
    
    @scala.inline
    def setCustom_assertions_path(value: String | js.Array[String]): Self = this.set("custom_assertions_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_assertions_path: Self = this.set("custom_assertions_path", js.undefined)
    
    @scala.inline
    def setCustom_commands_pathVarargs(value: String*): Self = this.set("custom_commands_path", js.Array(value :_*))
    
    @scala.inline
    def setCustom_commands_path(value: String | js.Array[String]): Self = this.set("custom_commands_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_commands_path: Self = this.set("custom_commands_path", js.undefined)
    
    @scala.inline
    def setDisable_color(value: Boolean): Self = this.set("disable_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable_color: Self = this.set("disable_color", js.undefined)
    
    @scala.inline
    def setGlobals_path(value: String): Self = this.set("globals_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobals_path: Self = this.set("globals_path", js.undefined)
    
    @scala.inline
    def setLive_output(value: Boolean): Self = this.set("live_output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLive_output: Self = this.set("live_output", js.undefined)
    
    @scala.inline
    def setOutput_folder(value: String): Self = this.set("output_folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput_folder: Self = this.set("output_folder", js.undefined)
    
    @scala.inline
    def setPage_objects_pathVarargs(value: String*): Self = this.set("page_objects_path", js.Array(value :_*))
    
    @scala.inline
    def setPage_objects_path(value: String | js.Array[String]): Self = this.set("page_objects_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage_objects_path: Self = this.set("page_objects_path", js.undefined)
    
    @scala.inline
    def setParallel_process_delay(value: Double): Self = this.set("parallel_process_delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallel_process_delay: Self = this.set("parallel_process_delay", js.undefined)
    
    @scala.inline
    def setSelenium(value: NightwatchSeleniumOptions): Self = this.set("selenium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelenium: Self = this.set("selenium", js.undefined)
    
    @scala.inline
    def setTest_runner(value: String | NightwatchTestRunner): Self = this.set("test_runner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest_runner: Self = this.set("test_runner", js.undefined)
    
    @scala.inline
    def setTest_workers(value: Boolean | NightwatchTestWorker): Self = this.set("test_workers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest_workers: Self = this.set("test_workers", js.undefined)
    
    @scala.inline
    def setWebdriver(value: Cliargs): Self = this.set("webdriver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebdriver: Self = this.set("webdriver", js.undefined)
  }
}
