package typings.postcssReporter.mod

import typings.postcss.mod.ResultMessage
import typings.postcssReporter.anon.Messages
import typings.postcssReporter.postcssReporterStrings.any
import typings.postcssReporter.postcssReporterStrings.first
import typings.postcssReporter.postcssReporterStrings.last
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional options
  */
@js.native
trait Options extends DefaultOptions {
  /**
    * If true, not pass any messages into other plugins, or the whatever runner you use, for logging.
    * @default false
    */
  var clearAllMessages: js.UndefOr[Boolean] = js.native
  /**
    * If true, the plugin will clear the result's messages after it logs them.
    * This prevents other plugins, or the whatever runner you use, from logging the same information again and causing confusion.
    * @default false
    */
  var clearReportedMessages: js.UndefOr[Boolean] = js.native
  /**
    * Provide a filter function. It receives the message object and returns a truthy or falsy value,
    * indicating whether that particular message should be reported or not.
    */
  var filter: js.UndefOr[js.Function1[/* message */ ResultMessage, Boolean]] = js.native
  /**
    * By default, this reporter will format the messages for human legibility in the console.
    * To use another formatter, pass a function that
    * - accepts an object containing a messages array and a source string
    * - returns the string to report
    */
  var formatter: js.UndefOr[js.Function1[/* input */ Messages, String]] = js.native
  /**
    * If plugins is empty (as it is by default),
    * the reporter will log messages from every PostCSS plugin.
    * @default []
    */
  var plugins: js.UndefOr[js.Array[String]] = js.native
  /**
    * By default, messages without line/column positions will be grouped at the beginning of the output.
    * To put them at the end, instead, use "last". To not bother sorting these, use "any".
    * @default 'first'
    */
  var positionless: js.UndefOr[first | last | any] = js.native
  /**
    * If true, after the plugin logs your messages it will throw an error if it found any warnings.
    * @default false
    */
  var throwError: js.UndefOr[Boolean] = js.native
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
    def setClearAllMessages(value: Boolean): Self = this.set("clearAllMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearAllMessages: Self = this.set("clearAllMessages", js.undefined)
    @scala.inline
    def setClearReportedMessages(value: Boolean): Self = this.set("clearReportedMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearReportedMessages: Self = this.set("clearReportedMessages", js.undefined)
    @scala.inline
    def setFilter(value: /* message */ ResultMessage => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFormatter(value: /* input */ Messages => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: String*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[String]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setPositionless(value: first | last | any): Self = this.set("positionless", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionless: Self = this.set("positionless", js.undefined)
    @scala.inline
    def setThrowError(value: Boolean): Self = this.set("throwError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowError: Self = this.set("throwError", js.undefined)
  }
  
}

