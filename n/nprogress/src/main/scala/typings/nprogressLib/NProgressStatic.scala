package typings
package nprogressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NProgressStatic extends js.Object {
  /**
       * Gets the status. If started, it will be the last progress number set.
       */
  var status: js.Any = js.native
  /**
       * Gets the NProgress version.
       */
  var version: java.lang.String = js.native
  /**
       * Configures the progress indicator.
       * @param {NProgressConfigureOptions} options An object containing the configuration options.
       * @returns {NProgressConfigureOptions} The current NProgress object, useful for chaining.
       */
  def configure(options: NProgressConfigureOptions): NProgressStatic = js.native
  /**
       * Finishes loading by transitioning it to 100%, then fading out.
       * @param {boolean} forceShow Forces the progress bar to show, even if it's not being shown. (The default behavior is that .done() will not do anything if .start() isn't called.)
       * @returns {NProgressConfigureOptions} The current NProgress object, useful for chaining.
       */
  def done(): NProgressStatic = js.native
  /**
       * Finishes loading by transitioning it to 100%, then fading out.
       * @param {boolean} forceShow Forces the progress bar to show, even if it's not being shown. (The default behavior is that .done() will not do anything if .start() isn't called.)
       * @returns {NProgressConfigureOptions} The current NProgress object, useful for chaining.
       */
  def done(forceShow: scala.Boolean): NProgressStatic = js.native
  /**
       * Increments the progress bar with a random amount. This will never get to 100%: use it for every image load (or similar).
       * @returns {NProgressConfigureOptions} The current NProgress object, useful for chaining.
       */
  def inc(): NProgressStatic = js.native
  /**
       * Increments the progress bar with a set amount.
       * @param {number} amount This will get the current status value and adds the value until status is max 0.994
       * @returns {NProgressConfigureOptions} The current NProgress object, useful for chaining.
       */
  def inc(amount: scala.Double): NProgressStatic = js.native
  /**
       * Gets whether progress has been started.
       * @returns {boolean} Whether the progress has started.
       */
  def isStarted(): scala.Boolean = js.native
  /**
       * Removes the progress indicator.
       */
  def remove(): scala.Unit = js.native
  /**
       * Sets the progress percentage.
       * @param {number} progressPercent A number between 0.0 and 1.0 that represents the progress percentage.
       * @returns {NProgressConfigureOptions} The current NProgress object, useful for chaining.
       */
  def set(progressPercent: scala.Double): NProgressStatic = js.native
  /**
       * Shows the progress bar and begins trickling progress.
       * @returns {NProgressConfigureOptions} The current NProgress object, useful for chaining.
       */
  def start(): NProgressStatic = js.native
}

