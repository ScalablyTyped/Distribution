package typings.postcssReporter.mod

import typings.postcss.mod.ResultMessage
import typings.postcssReporter.AnonMessages
import typings.postcssReporter.postcssReporterStrings.any
import typings.postcssReporter.postcssReporterStrings.first
import typings.postcssReporter.postcssReporterStrings.last
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional options
  */
trait Options extends DefaultOptions {
  /**
    * If true, not pass any messages into other plugins, or the whatever runner you use, for logging.
    * @default false
    */
  var clearAllMessages: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the plugin will clear the result's messages after it logs them.
    * This prevents other plugins, or the whatever runner you use, from logging the same information again and causing confusion.
    * @default false
    */
  var clearReportedMessages: js.UndefOr[Boolean] = js.undefined
  /**
    * Provide a filter function. It receives the message object and returns a truthy or falsy value,
    * indicating whether that particular message should be reported or not.
    */
  var filter: js.UndefOr[js.Function1[/* message */ ResultMessage, Boolean]] = js.undefined
  /**
    * By default, this reporter will format the messages for human legibility in the console.
    * To use another formatter, pass a function that
    * - accepts an object containing a messages array and a source string
    * - returns the string to report
    */
  var formatter: js.UndefOr[js.Function1[/* input */ AnonMessages, String]] = js.undefined
  /**
    * If plugins is empty (as it is by default),
    * the reporter will log messages from every PostCSS plugin.
    * @default []
    */
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * By default, messages without line/column positions will be grouped at the beginning of the output.
    * To put them at the end, instead, use "last". To not bother sorting these, use "any".
    * @default 'first'
    */
  var positionless: js.UndefOr[first | last | any] = js.undefined
  /**
    * If true, after the plugin logs your messages it will throw an error if it found any warnings.
    * @default false
    */
  var throwError: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    clearAllMessages: js.UndefOr[Boolean] = js.undefined,
    clearReportedMessages: js.UndefOr[Boolean] = js.undefined,
    filter: /* message */ ResultMessage => Boolean = null,
    formatter: /* input */ AnonMessages => String = null,
    noIcon: js.UndefOr[Boolean] = js.undefined,
    noPlugin: js.UndefOr[Boolean] = js.undefined,
    plugins: js.Array[String] = null,
    positionless: first | last | any = null,
    sortByPosition: js.UndefOr[Boolean] = js.undefined,
    throwError: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearAllMessages)) __obj.updateDynamic("clearAllMessages")(clearAllMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(clearReportedMessages)) __obj.updateDynamic("clearReportedMessages")(clearReportedMessages.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (!js.isUndefined(noIcon)) __obj.updateDynamic("noIcon")(noIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(noPlugin)) __obj.updateDynamic("noPlugin")(noPlugin.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (positionless != null) __obj.updateDynamic("positionless")(positionless.asInstanceOf[js.Any])
    if (!js.isUndefined(sortByPosition)) __obj.updateDynamic("sortByPosition")(sortByPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(throwError)) __obj.updateDynamic("throwError")(throwError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

