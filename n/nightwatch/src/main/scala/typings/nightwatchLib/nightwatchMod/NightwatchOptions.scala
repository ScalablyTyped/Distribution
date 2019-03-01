package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchOptions extends js.Object {
  /**
    * Location(s) where custom assertions will be loaded from.
    */
  var custom_assertions_path: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Location(s) where custom commands will be loaded from.
    */
  var custom_commands_path: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Controls whether or not to disable coloring of the cli output globally.
    */
  var disable_color: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Location of an external globals module which will be loaded and made available to the test as a property globals on the main client instance.
    * Globals can also be defined/overwritten inside a test_settings environment.
    */
  var globals_path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not to buffer the output in case of parallel running. See below for details.
    */
  var live_output: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The location where the JUnit XML report files will be saved.
    */
  var output_folder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Location(s) where page object files will be loaded from.
    */
  var page_object_path: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Specifies the delay(in milliseconds) between starting the child processes when running in parallel mode.
    */
  var parallel_process_delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * An object containing Selenium Server related configuration options. See below for details.
    */
  var selenium: js.UndefOr[NightwatchSeleniumOptions] = js.undefined
  /**
    * An array of folders (excluding subfolders) where the tests are located.
    */
  var src_folders: java.lang.String | js.Array[java.lang.String]
  /**
    * Specifies which test runner to use when running the tests. Values can be either default (built in nightwatch runner) or mocha.
    * Example: "test_runner" : {"type" : "mocha", "options" : {"ui" : "tdd"}}
    */
  var test_runner: js.UndefOr[java.lang.String | NightwatchTestRunner] = js.undefined
  /**
    * This object contains all the test related options. See below for details.
    */
  var test_settings: NightwatchTestSettings
  /**
    * Whether or not to run individual test files in parallel. If set to true, runs the tests in parallel and determines the number of workers automatically.
    * If set to an object, can specify specify the number of workers as "auto" or a number. Example: "test_workers" : {"enabled" : true, "workers" : "auto"}
    */
  var test_workers: js.UndefOr[scala.Boolean | NightwatchTestWorker] = js.undefined
}

object NightwatchOptions {
  @scala.inline
  def apply(
    src_folders: java.lang.String | js.Array[java.lang.String],
    test_settings: NightwatchTestSettings,
    custom_assertions_path: java.lang.String | js.Array[java.lang.String] = null,
    custom_commands_path: java.lang.String | js.Array[java.lang.String] = null,
    disable_color: js.UndefOr[scala.Boolean] = js.undefined,
    globals_path: java.lang.String = null,
    live_output: js.UndefOr[scala.Boolean] = js.undefined,
    output_folder: java.lang.String = null,
    page_object_path: java.lang.String | js.Array[java.lang.String] = null,
    parallel_process_delay: scala.Int | scala.Double = null,
    selenium: NightwatchSeleniumOptions = null,
    test_runner: java.lang.String | NightwatchTestRunner = null,
    test_workers: scala.Boolean | NightwatchTestWorker = null
  ): NightwatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("src_folders")(src_folders.asInstanceOf[js.Any])
    __obj.updateDynamic("test_settings")(test_settings)
    if (custom_assertions_path != null) __obj.updateDynamic("custom_assertions_path")(custom_assertions_path.asInstanceOf[js.Any])
    if (custom_commands_path != null) __obj.updateDynamic("custom_commands_path")(custom_commands_path.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_color)) __obj.updateDynamic("disable_color")(disable_color)
    if (globals_path != null) __obj.updateDynamic("globals_path")(globals_path)
    if (!js.isUndefined(live_output)) __obj.updateDynamic("live_output")(live_output)
    if (output_folder != null) __obj.updateDynamic("output_folder")(output_folder)
    if (page_object_path != null) __obj.updateDynamic("page_object_path")(page_object_path.asInstanceOf[js.Any])
    if (parallel_process_delay != null) __obj.updateDynamic("parallel_process_delay")(parallel_process_delay.asInstanceOf[js.Any])
    if (selenium != null) __obj.updateDynamic("selenium")(selenium)
    if (test_runner != null) __obj.updateDynamic("test_runner")(test_runner.asInstanceOf[js.Any])
    if (test_workers != null) __obj.updateDynamic("test_workers")(test_workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchOptions]
  }
}

