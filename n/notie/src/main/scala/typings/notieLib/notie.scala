package typings
package notieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("notie")
@js.native
object notie extends js.Object {
  def alert(`type`: scala.Double, message: java.lang.String, seconds: scala.Double): scala.Unit = js.native
  def confirm(
    title: java.lang.String,
    yes_text: java.lang.String,
    no_text: java.lang.String,
    yes_callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def input(
    title: java.lang.String,
    submit_text: java.lang.String,
    cancel_text: java.lang.String,
    `type`: java.lang.String,
    placeholder: java.lang.String,
    submit_callback: js.Function1[/* value_entered */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def input(
    title: java.lang.String,
    submit_text: java.lang.String,
    cancel_text: java.lang.String,
    `type`: java.lang.String,
    placeholder: java.lang.String,
    submit_callback: js.Function1[/* value_entered */ java.lang.String, scala.Unit],
    prefilled_value_optional: java.lang.String
  ): scala.Unit = js.native
}

