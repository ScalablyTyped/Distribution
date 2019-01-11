package typings
package oraLib.oraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ora", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Elegant terminal spinner.
    *
    * @param options If a string is provided, it is treated as a shortcut for `options.text`.
    */
  def apply(): oraLib.oraMod.oraNs.Ora = js.native
  def apply(options: oraLib.oraMod.oraNs.Options | java.lang.String): oraLib.oraMod.oraNs.Ora = js.native
  /**
    * Starts a spinner for a promise. The spinner is stopped with `.succeed()` if the promise fulfills
    * or with `.fail()` if it rejects.
    *
    * @param action
    * @param options If a string is provided, it is treated as a shortcut for `options.text`.
    * @returns The spinner instance.
    */
  def promise(action: js.Thenable[_]): oraLib.oraMod.oraNs.Ora = js.native
  def promise(action: js.Thenable[_], options: java.lang.String): oraLib.oraMod.oraNs.Ora = js.native
  def promise(action: js.Thenable[_], options: oraLib.oraMod.oraNs.Options): oraLib.oraMod.oraNs.Ora = js.native
}

