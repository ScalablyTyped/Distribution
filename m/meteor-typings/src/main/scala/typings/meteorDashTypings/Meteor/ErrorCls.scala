package typings.meteorDashTypings.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor.Error")
@js.native
class ErrorCls protected () extends Error {
  def this(error: String) = this()
  def this(error: Double) = this()
  def this(error: String, reason: String) = this()
  def this(error: Double, reason: String) = this()
  def this(error: String, reason: String, details: String) = this()
  def this(error: Double, reason: String, details: String) = this()
  /* CompleteClass */
  override var error: String | Double = js.native
}

