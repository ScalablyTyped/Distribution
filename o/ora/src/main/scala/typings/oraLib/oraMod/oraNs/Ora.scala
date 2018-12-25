package typings
package oraLib.oraMod.oraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ora extends js.Object {
  /**
           * Change the spinner color.
           */
  var color: Color = js.native
  /**
           * A boolean of whether the instance is currently spinning.
           */
  val isSpinning: scala.Boolean = js.native
  /**
           * Change the text.
           */
  var text: java.lang.String = js.native
  /**
           * Clear the spinner.
           * @returns The spinner instance.
           */
  def clear(): Ora = js.native
  /**
           * Stop the spinner, change it to a red `✖` and persist the current text, or `text` if provided.
           *
           * @param text will persist text if provided
           * @returns The spinner instance.
           */
  def fail(): Ora = js.native
  /**
           * Stop the spinner, change it to a red `✖` and persist the current text, or `text` if provided.
           *
           * @param text will persist text if provided
           * @returns The spinner instance.
           */
  def fail(text: java.lang.String): Ora = js.native
  /**
           * Get a new frame.
           * @returns The spinner instance.
           */
  def frame(): Ora = js.native
  /**
           * Stop the spinner, change it to a blue `ℹ` and persist the current text, or `text` if provided.
           *
           * @param text will persist text if provided
           * @returns The spinner instance.
           */
  def info(): Ora = js.native
  /**
           * Stop the spinner, change it to a blue `ℹ` and persist the current text, or `text` if provided.
           *
           * @param text will persist text if provided
           * @returns The spinner instance.
           */
  def info(text: java.lang.String): Ora = js.native
  /**
           * Manually render a new frame.
           * @returns The spinner instance.
           */
  def render(): Ora = js.native
  /**
           * Start the spinner.
           *
           * @param text Set the current text.
           * @returns The spinner instance.
           */
  def start(): Ora = js.native
  /**
           * Start the spinner.
           *
           * @param text Set the current text.
           * @returns The spinner instance.
           */
  def start(text: java.lang.String): Ora = js.native
  /**
           * Stop and clear the spinner.
           *
           * @returns The spinner instance.
           */
  def stop(): Ora = js.native
  /**
           * Stop the spinner and change the symbol or text.
           *
           * @param options
           * @returns The spinner instance.
           */
  def stopAndPersist(): Ora = js.native
  /**
           * Stop the spinner and change the symbol or text.
           *
           * @param options
           * @returns The spinner instance.
           */
  def stopAndPersist(options: PersistOptions): Ora = js.native
  /**
           * Stop the spinner, change it to a green `✔` and persist the current text, or `text` if provided.
           *
           * @param text will persist text if provided
           * @returns The spinner instance.
           */
  def succeed(): Ora = js.native
  /**
           * Stop the spinner, change it to a green `✔` and persist the current text, or `text` if provided.
           *
           * @param text will persist text if provided
           * @returns The spinner instance.
           */
  def succeed(text: java.lang.String): Ora = js.native
  /**
           * Stop the spinner, change it to a yellow `⚠` and persist the current text, or `text` if provided.
           *
           * @param text will persist text if provided
           * @returns The spinner instance.
           */
  def warn(): Ora = js.native
  /**
           * Stop the spinner, change it to a yellow `⚠` and persist the current text, or `text` if provided.
           *
           * @param text will persist text if provided
           * @returns The spinner instance.
           */
  def warn(text: java.lang.String): Ora = js.native
}

