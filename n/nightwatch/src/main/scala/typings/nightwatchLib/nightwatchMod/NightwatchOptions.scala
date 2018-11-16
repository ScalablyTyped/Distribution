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

