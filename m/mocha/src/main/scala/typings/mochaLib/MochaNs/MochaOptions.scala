package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to Mocha.
  */
trait MochaOptions extends js.Object {
  var allowUncaught: js.UndefOr[scala.Boolean] = js.undefined
  var asyncOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** bail on the first test failure. */
  var bail: js.UndefOr[scala.Boolean] = js.undefined
  var delay: js.UndefOr[scala.Boolean] = js.undefined
  var enableTimeouts: js.UndefOr[scala.Boolean] = js.undefined
  var forbidOnly: js.UndefOr[scala.Boolean] = js.undefined
  var forbidPending: js.UndefOr[scala.Boolean] = js.undefined
  /** display the full stack trace on failure. */
  var fullStackTrace: js.UndefOr[scala.Boolean] = js.undefined
  /** Array of accepted globals. */
  var globals: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** string or regexp to filter tests with. */
  var grep: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  /** Enable growl support. */
  var growl: js.UndefOr[scala.Boolean] = js.undefined
  /** Do not show diffs at all. */
  var hideDiff: js.UndefOr[scala.Boolean] = js.undefined
  /** ignore global leaks. */
  var ignoreLeaks: js.UndefOr[scala.Boolean] = js.undefined
  /** Use inline diffs rather than +/-. */
  var inlineDiffs: js.UndefOr[scala.Boolean] = js.undefined
  var noHighlighting: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Reporter constructor, built-in reporter name, or reporter module path. Defaults to
    * `"spec"`.
    */
  var reporter: js.UndefOr[java.lang.String | ReporterConstructor] = js.undefined
  /** Options to pass to the reporter. */
  var reporterOptions: js.UndefOr[js.Any] = js.undefined
  /** number of times to retry failed tests. */
  var retries: js.UndefOr[scala.Double] = js.undefined
  /** milliseconds to wait before considering a test slow. */
  var slow: js.UndefOr[scala.Double] = js.undefined
  /** timeout in milliseconds. */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** Test interfaces ("bdd", "tdd", "exports", etc.). */
  var ui: js.UndefOr[Interface] = js.undefined
  /** Emit color output. */
  var useColors: js.UndefOr[scala.Boolean] = js.undefined
}

